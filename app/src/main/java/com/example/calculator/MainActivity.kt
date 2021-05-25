package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNum1=findViewById<EditText>(R.id.tvNum1)
        var etNum2=findViewById<EditText>(R.id.tvNum2)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSub=findViewById<Button>(R.id.btnSub)
        var btnMod=findViewById<Button>(R.id.btnMod)
        var btnDiv=findViewById<Button>(R.id.btnDiv)
        var btnMult=findViewById<Button>(R.id.btnMult)
        var tvResult=findViewById<TextView>(R.id.tvResult)


        btnAdd.setOnClickListener{
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            var sum=num1+num2
            tvResult.setText("The sum is " +  sum.toString())

        }
       btnDiv.setOnClickListener{
           var num1=etNum1.text.toString().toInt()
           var num2=etNum2.text.toString().toInt()
           var div=num1/num2
           tvResult.setText("Division is  " + div.toString())
       }
   btnMod.setOnClickListener{
       var num1=etNum1.text.toString().toInt()
       var num2=etNum2.text.toString().toInt()
       var mod=num1%num2
       tvResult.setText("Modulus is " + mod.toString())
   }
        btnMult.setOnClickListener{
            var num1=etNum1.text.toString().toInt()
            var num2=etNum2.text.toString().toInt()
            var mut=num1*num2
            tvResult.setText("Mutiplication is " + mut.toString())
        }
  btnSub.setOnClickListener{
      var num1=etNum1.text.toString().toInt()
      var num2=etNum2.text.toString().toInt()
      var sub=num1-num2
      tvResult.setText("Substraction is " + sub.toString())
  }
    }
}