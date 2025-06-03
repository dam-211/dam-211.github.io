package ar.edu.ifts18.sqlite2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var dbHelper: SQLiteHelper
    private lateinit var nameEditText: EditText
    private lateinit var ageEditText: EditText
    private lateinit var saveButton: Button
    private lateinit var listView: ListView
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = SQLiteHelper(this)

        nameEditText = findViewById(R.id.etName)
        ageEditText = findViewById(R.id.etAge)
        saveButton = findViewById(R.id.btnSave)
        listView = findViewById(R.id.listView)

        saveButton.setOnClickListener {

            val nameDelMV = nameEditText.text.toString()
            val ageDelMV = ageEditText.text.toString().toIntOrNull()

            if(nameDelMV.isNotEmpty() && ageDelMV != null) {

                dbHelper.insertStudent(Student(name = nameDelMV, age = ageDelMV))
                showStudents()


            }

        }
    }

    override fun onStart() {
        super.onStart()
        showStudents()
    }

    private fun showStudents() {

        val student = dbHelper.getAllStudents()
        val namesAndAges = student.map { "Nombre: ${it.name}, Edad: ${it.age}" }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namesAndAges)
        listView.adapter = adapter

    }
}
