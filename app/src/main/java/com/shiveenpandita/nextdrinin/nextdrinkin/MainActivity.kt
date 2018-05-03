package com.shiveenpandita.nextdrinin.nextdrinkin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private var drivingPlatesSpinner: Spinner? = null
    private var typeOfDrinkSpinner: Spinner? = null
    private var drinkSpinner: Spinner? = null
    private val drinkCalculatorService: DrinkCalculatorService? = null
    private val drink: Drink? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drinkSpinner = findViewById(R.id.spinner_drink)

        drinkSpinner!!.visibility = View.INVISIBLE

        val beerArrayAdapter = ArrayAdapter.createFromResource(this,
                R.array.beer_type_list, R.layout.support_simple_spinner_dropdown_item)
        beerArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)

        drivingPlatesSpinner = findViewById(R.id.driving_plate_spinner)
        val arrayAdapterDrivingPlates = ArrayAdapter.createFromResource(this,
                R.array.driving_plates_array, R.layout.support_simple_spinner_dropdown_item)
        arrayAdapterDrivingPlates.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        drivingPlatesSpinner!!.adapter = arrayAdapterDrivingPlates

        typeOfDrinkSpinner = findViewById(R.id.spinner_types_of_drinks)
        val arrayAdapterDrinkTypes = ArrayAdapter.createFromResource(this,
                R.array.drink_types_array, R.layout.support_simple_spinner_dropdown_item)
        arrayAdapterDrinkTypes.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        typeOfDrinkSpinner!!.adapter = arrayAdapterDrinkTypes
        //        next step is to determine when a spinner item is selected and load another spinner with drinks in
        typeOfDrinkSpinner!!.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                when(typeOfDrinkSpinner!!.selectedItem) {
                    "Wine" -> {
                        drinkSpinner!!.adapter = beerArrayAdapter
                        drinkSpinner!!.visibility = View.VISIBLE
                    }
                }
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        }
    }

    fun startCountDown(view: View) {
        val intent = Intent(this, DisplayCountDownTimer::class.java)
        startActivity(intent)
    }

}
