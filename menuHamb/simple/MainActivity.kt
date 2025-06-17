package com.example.menu

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    //declaro las variables de los elementos del layout
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navView: NavigationView
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var contentText: TextView

    //OnCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //cargo la vista prinicipal
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()

        //Asigno las vistas XML a variables de kotlin
        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.navigation_view)
        contentText = findViewById(R.id.content_text)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        //uso el toolbar como actionBar de la activity
        setSupportActionBar(toolbar)

        //Crea el botón hamburguesa y lo sincroniza con el estado del drawer
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        navView.setNavigationItemSelectedListener { menuItem ->

            when (menuItem.itemId) {

                R.id.nav_home -> contentText.text = "Inicio seleccionado"
                R.id.nav_perfil -> contentText.text = "Perfil seleccionado"
                R.id.nav_config -> contentText.text = "Configuración seleccionada"
            }

            drawerLayout.closeDrawers()
            true
        }
    }
}
