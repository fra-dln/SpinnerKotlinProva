package it.dalena.spinner

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import it.dalena.spinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var options = arrayOf("cacca","pupù","pipì","ciotto")

        binding.spinner.adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1,options)

        binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                binding.textView.text=options.get(position)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                binding.textView.text = "seleziona qualcosa"
            }
        }
    }
}