package com.example.sapper

import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.sapper.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding
  private lateinit var navController: NavController
  //var  backPressedTime: Long =0

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    navController = findNavController(R.id.navHostFragment)
    NavigationUI.setupActionBarWithNavController(this, navController)

  }/*override fun onbackPressed() {
        if (backPressedTime +3000 >System.currentTimeMillis()){
            super.onbackPressed()
            finish()
        }
        else{
            Toast.makeText(this,"Нажмите повторно, чтобы выйти",Toast.LENGTH_LONG).show()
        }
        backPressedTime=System.currentTimeMillis()
    }*/
  override fun onSupportNavigateUp(): Boolean {
    return navController.navigateUp()
  }

}

