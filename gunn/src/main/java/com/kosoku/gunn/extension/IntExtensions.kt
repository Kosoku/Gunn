package com.kosoku.gunn.extension

import kotlin.random.Random

fun intRandom(bound: Int = Int.MAX_VALUE): Int = Random.nextInt(bound)

fun Int.toHexadecimalString(): String = this.toString(16)

