package ar.edu.ifts18.sqlite2.model

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SQLiteHelper(context: Context) : SQLiteOpenHelper (context, "students.db", null, 1 ) {

    companion object {

        private const val TABLE_NAME = "Student"
        private const val COL_ID = "id"
        private const val COL_NAME = "name"
        private const val COL_AGE = "age"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val createTable = """
            CREATE TABLE $TABLE_NAME (
                    $COL_ID INTEGER PRIMARY KEY AUTOINCREMENT,
                    $COL_NAME TEXT,
                    $COL_AGE INTEGER
                    );
        """
        db?.execSQL(createTable)
    }

   override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
       db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
       onCreate(db)
   }


   fun  insertStudent(student: Student): Long {
       val db = writableDatabase
       val values = ContentValues().apply {
           put(COL_NAME, student.name)
           put(COL_AGE, student.age)
       }
       return db.insert(TABLE_NAME, null, values)
   }

    fun getAllStudents(): List<Student> {

        val list = mutableListOf<Student>()
        val db = readableDatabase
        val cursor = db.rawQuery("SELECT * FROM $TABLE_NAME", null)

        if(cursor.moveToFirst()) {
            do {
                list.add (
                    Student(
                        id = cursor.getInt(0),
                        name = cursor.getString(1),
                        age = cursor.getInt(2)
                    )
                )
            } while (cursor.moveToNext())
        }
        cursor.close()
        return list
    }

    fun deleteStudent(id: Int): Int {

        val db = writableDatabase
        return db.delete(TABLE_NAME, "$COL_ID = ?", arrayOf(id.toString()))

    }

    fun updateStudent(student: Student): Int {

        val db = writableDatabase

        val values = ContentValues().apply {
            put(COL_NAME, student.name)
            put(COL_AGE, student.age)
        }
        return db.update(TABLE_NAME, values, "$COL_ID = ?", arrayOf(student.id.toString()))

    }
}


