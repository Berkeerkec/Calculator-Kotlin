package com.berkesoft.hesapmakinesikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.berkesoft.hesapmakinesikotlin.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding
class MainActivity : AppCompatActivity() {
    var number1 : Double? = null
    var number2 : Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }


    fun toplama(view : View){

        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error"
            Toast.makeText(this,"Enter Number", Toast.LENGTH_LONG).show()
        }else{

            var result = number1!! + number2!!
            binding.resultText.text = "Result: ${result}"
        }



    }
    fun cıkarma(view : View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error"
            Toast.makeText(this,"Enter Number", Toast.LENGTH_LONG).show()
        }else{

            var result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"
        }


    }
    fun carpma(view : View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error"
            Toast.makeText(this,"Enter Number", Toast.LENGTH_LONG).show()
        }else{

            var result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"
        }


    }
    fun bolme(view : View){
        number1 = binding.numberText.text.toString().toDoubleOrNull()
        number2 = binding.numberText2.text.toString().toDoubleOrNull()

        if (number1 == null || number2 == null){
            binding.resultText.text = "Error"
            Toast.makeText(this,"Enter Number", Toast.LENGTH_LONG).show()
        }else{

            var result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"
        }


    }






}