package com.example.bottomnavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView=findViewById(R.id.bottomnav)






            //button = findViewById(R.id.bu)


//        button.setOnClickListener {
//            val intent = Intent(this, Alertdialog::class.java)
//            startActivity(intent)
//        }


            bottomNavigationView.setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        val intent = Intent(this, MainActivity2::class.java)
                        startActivity(intent)
                        true
                    }
                    R.id.profile -> {

                        val intent=Intent(this,MainActivity2::class.java)
                        startActivity(intent)
                        true
                    }

                    R.id.setting -> {
                        val intent = Intent(this,MainActivity2::class.java)
                        startActivity(intent)
                        true
                    }
                    else -> false

                }
            }
        }


//fun setContentView(activityBottomNav: Int) {
//
//}

//
//       }
//        Log.e("onCreate>>>","onCreate")
//    }
//
//    override fun onStart() {
//        super.onStart()
//
//        Log.e("onstar>>>","onstart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("onResume>>>","onResume")
//    }
//
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("onPause>>>","onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("onStop>>>","onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("onDestroy>>>","onDestroy")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.e("onRestart>>>","onRestart")
//        Toast.makeText(this,"Back",Toast.LENGTH_LONG).show()
//
//    }
//}
    }
