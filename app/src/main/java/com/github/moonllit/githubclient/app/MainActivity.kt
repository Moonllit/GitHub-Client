package com.github.moonllit.githubclient.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.github.moonllit.githubclient.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
    }

    private fun initComponents() {
        val host = supportFragmentManager
            .findFragmentById(R.id.fragment_main_navigation) as NavHostFragment? ?: return
        navController = host.navController
    }
}
