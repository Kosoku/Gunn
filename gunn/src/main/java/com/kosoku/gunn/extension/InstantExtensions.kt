package com.kosoku.gunn.extension

import java.time.Instant
import kotlin.random.Random

fun instantRandom(): Instant = Instant.ofEpochMilli(Random.nextLong())

fun Instant.secondsSince(instant: Instant): Double {
    val receiver = this.toEpochMilli().toDouble()
    val anotherDate = instant.toEpochMilli().toDouble()
    return (receiver - anotherDate) / 1000.0
}

