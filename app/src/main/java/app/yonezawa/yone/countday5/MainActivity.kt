package app.yonezawa.yone.countday5

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number: Int = 0

        numberTextView.text = "0"

        plussButton.setOnClickListener {

            number = number + 1
            numberTextView.text = number. toString()

            if (number % 3 == 0) {
                numberTextView.setTextColor(Color.GREEN)
            }else {
                numberTextView.setTextColor(Color.BLACK)
            }
        }
       numberTextView.text = "0"

        minusButton.setOnClickListener {

            number = number - 1
            numberTextView.text = number.toString()

        }


    }
}