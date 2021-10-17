package com.bootcampInter.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//este é o main
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = buttonCalcular
        val resultado = textViewResultado

        btCalcular.setOnClickListener {
            //botao que calcula
            val nota1 = Integer.parseInt(edTextnota1.text.toString())
            val nota2 = Integer.parseInt(edTextNota2.text.toString())
            val media = (nota1+nota2)/2
            val faltas = Integer.parseInt(edTextFaltas.text.toString())
            var resultado = textViewResultado

            if (media >= 6 && faltas <= 10){
                resultado.setText("Aluno Aprovado a media foi: \n" + media + "\n" + "faltas:"+faltas)
                resultado.setTextColor(Color.GREEN)
            }else {
                resultado.setText("Aluno Reprovado a media foi: \n" + media + "\n" + "faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }
        }


    }
}