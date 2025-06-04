package ar.edu.ifts18.sqlite2.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import ar.edu.ifts18.sqlite2.model.SQLiteHelper
import ar.edu.ifts18.sqlite2.model.Student

class StudentViewModel(application: Application) : AndroidViewModel(application) {

    private val dbHelper = SQLiteHelper(application)

    private val _students = MutableLiveData<List<Student>>()
    val students: LiveData<List<Student>> get() = _students

    fun loadStudents() {

        _students.value = dbHelper.getAllStudents()
    }

    fun addStudent(name: String, age: Int) {
        dbHelper.insertStudent(Student(name = name, age = age))
        loadStudents()
    }

    fun updateStudent(student: Student) {
        dbHelper.updateStudent(student)
        loadStudents()
    }

    fun deleteStudent(id: Int) {
        dbHelper.deleteStudent(id)
        loadStudents()
    }


}