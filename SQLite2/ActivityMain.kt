class MainActivity : AppCompatActivity() {

    private lateinit var dbHelper: SQLiteHelper
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var updateButton: Button
    private lateinit var deleteButton: Button
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>

    private var selectedStudent: Student? = null
    private var students = mutableListOf<Student>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = SQLiteHelper(this)

        nameEditText = findViewById(R.id.etName)
        ageEditText = findViewById(R.id.etAge)
        saveButton = findViewById(R.id.btnSave)
        updateButton = findViewById(R.id.btnUpdate)
        deleteButton = findViewById(R.id.btnDelete)
        listView = findViewById(R.id.listView)

        saveButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toIntOrNull()

            if (name.isNotBlank() && age != null) {
                dbHelper.insertStudent(Student(name = name, age = age))
                Toast.makeText(this, "Estudiante guardado", Toast.LENGTH_SHORT).show()
                clearFields()
                showStudents()
            } else {
                Toast.makeText(this, "Datos inválidos", Toast.LENGTH_SHORT).show()
            }
        }

        updateButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toIntOrNull()

            selectedStudent?.let {
                if (name.isNotBlank() && age != null) {
                    val updatedStudent = it.copy(name = name, age = age)
                    dbHelper.updateStudent(updatedStudent)
                    Toast.makeText(this, "Estudiante actualizado", Toast.LENGTH_SHORT).show()
                    clearFields()
                    showStudents()
                }
            } ?: Toast.makeText(this, "Seleccioná un estudiante", Toast.LENGTH_SHORT).show()
        }

        deleteButton.setOnClickListener {
            selectedStudent?.let {
                dbHelper.deleteStudent(it.id)
                Toast.makeText(this, "Estudiante eliminado", Toast.LENGTH_SHORT).show()
                clearFields()
                showStudents()
            } ?: Toast.makeText(this, "Seleccioná un estudiante", Toast.LENGTH_SHORT).show()
        }

        listView.setOnItemClickListener { _, _, position, _ ->
            if (position in students.indices) {
                selectedStudent = students[position]
                nameEditText.setText(selectedStudent?.name)
                ageEditText.setText(selectedStudent?.age.toString())
                Toast.makeText(this, "Seleccionado: ${selectedStudent?.name}", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Índice inválido", Toast.LENGTH_SHORT).show()
            }
        }

        showStudents()
    }

    private fun showStudents() {
        students = dbHelper.getAllStudents().toMutableList()
        val namesAndAges = students.map { "Nombre: ${it.name}, Edad: ${it.age}" }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namesAndAges)
        listView.adapter = adapter
    }

    private fun clearFields() {
        nameEditText.text.clear()
        ageEditText.text.clear()
        selectedStudent = null
    }
}

