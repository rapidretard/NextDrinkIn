package com.shiveenpandita.nextdrinin.nextdrinkin

import java.math.BigDecimal

class Drink {
    var drinkType: String? = null
    var drinkSize: BigDecimal? = null
    var drinkStrength: BigDecimal? = null

    constructor() {}

    constructor(drinkType: String, drinkSize: BigDecimal, drinkStrength: BigDecimal) {
        this.drinkType = drinkType
        this.drinkSize = drinkSize
        this.drinkStrength = drinkStrength
    }
}
