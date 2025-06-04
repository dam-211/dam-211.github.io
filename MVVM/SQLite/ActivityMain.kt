package ar.edu.ifts18.sqlite2.view

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import ar.edu.ifts18.sqlite2.R
import ar.edu.ifts18.sqlite2.model.Student
import ar.edu.ifts18.sqlite2.viewmodel.StudentViewModel


class MainActivity : AppCompatActivity() {


    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var updateButton: Button
    private lateinit var deleteButton: Button
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>

    private val studentViewModel: StudentViewModel by viewModels()
    private var students = listOf<Student>()

    private var selectedStudent: Student? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        nameEditText = findViewById(R.id.etName)
        ageEditText = findViewById(R.id.etAge)
        saveButton = findViewById(R.id.btnSave)
        updateButton = findViewById(R.id.btnUpdate)
        deleteButton = findViewById(R.id.btnDelete)
        listView = findViewById(R.id.listView)

        studentViewModel.students.observe(this) {

            students = it
            val displayList = it.map { m -> "Nombre: ${m.name}, Edad: ${m.age}" }
            adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, displayList)
            listView.adapter = adapter

        }

        saveButton.setOnClickListener {

            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toIntOrNull()

            if(name.isNotBlank() && age != null) {
                studentViewModel.addStudent(name, age)
            } else {
                Toast.makeText(this, "Datos inválidos por alguna razon", Toast.LENGTH_SHORT).show()
            }


        }

        updateButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val age = ageEditText.text.toString().toIntOrNull()

            selectedStudent?.let {

                if(name.isNotBlank() && age != null) {
                    val updated  = it.copy(name = name, age= age)
                    studentViewModel.updateStudent(updated)
                    clearFields()
                }
            } ?: Toast.makeText(this, "Falló. Fin.", Toast.LENGTH_SHORT).show()
        }

        deleteButton.setOnClickListener {

            selectedStudent?.let {
                studentViewModel.deleteStudent(it.id)
                clearFields()
            } ?: Toast.makeText(this, "Falló. Fin.", Toast.LENGTH_SHORT).show()

        }


        //Captura los clicks hechos en el listener
        //_, _, position, _ -> El lambda posee parámetros opcionales como View (la vista especifica del item clickeado
        //el "_" es una forma de ignorar los parámetros adicionales
        //Basicamente nos permite acceder al elemento de la lista que se selecciono
        //Es similar a setOnClickListener, pero para items individuales dentro de una lista
        //TODO: Utilizar RecyclerView en lugar de listView!
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

        studentViewModel.loadStudents()
    }


    private fun clearFields() {
        nameEditText.text.clear()
        ageEditText.text.clear()
        selectedStudent = null
    }
}
