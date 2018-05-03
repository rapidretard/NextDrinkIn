package com.shiveenpandita.nextdrinin.nextdrinkin

import java.math.BigDecimal

class DrinkCalculatorService {

    private fun amountOfDrinksHad(drink: Drink): BigDecimal {
        return drink.drinkSize!!.multiply(drink.drinkStrength).multiply(DRINK_MULTIPLIER)
    }

    fun timeTillNextDrink(drink: Drink): Long {
        if (amountOfDrinksHad(drink).compareTo(BigDecimal.valueOf(2)) > 0) {
            val drinksOverOneHourLimit = amountOfDrinksHad(drink).subtract(BigDecimal.valueOf(2))
            return 0L
        } else {
            return 0L
        }
    }

    companion object {
        private val DRINK_MULTIPLIER = BigDecimal.valueOf(0.789)
    }
}
