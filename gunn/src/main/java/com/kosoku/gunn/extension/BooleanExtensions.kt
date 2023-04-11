package com.kosoku.gunn.extension

import android.view.View
import kotlin.random.Random

fun randomBoolean(): Boolean = Random.nextBoolean()

val Boolean.inverted: Boolean
    get() = !this

val Boolean.visibility: Int
    get() = if (this) View.VISIBLE else View.GONE