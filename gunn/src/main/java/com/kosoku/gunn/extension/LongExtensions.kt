package com.kosoku.gunn.extension

import kotlin.random.Random

fun longRandom(from: Long = Long.MIN_VALUE, until: Long = Long.MAX_VALUE): Long = Random.nextLong(from, until)