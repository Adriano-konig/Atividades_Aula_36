package br.com.zup.exericio_02_aula_36

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoMensagem = findViewById<Button>(R.id.button)

//        botaoMensagem.setOnClickListener{
//            Toast.makeText(this, "Oi meu nome é caramelo", Toast.LENGTH_LONG).show()
//
//        }
        botaoMensagem.setOnClickListener{
            Toast.makeText(this, "Oi meu nome é caramelo", Toast.LENGTH_LONG).show()
        }
    }
}