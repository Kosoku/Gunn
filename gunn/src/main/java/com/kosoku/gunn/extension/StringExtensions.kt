package com.kosoku.gunn.extension

import android.view.View
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.*

val String?.takeUnlessNullOrEmpty: String?
    get() = this.takeUnless { it.isNullOrEmpty() }

val String?.visibilityForNullOrBlank: Int
    get() = if (isNullOrBlank()) View.GONE else View.VISIBLE

fun emDash(): String = "—"

fun uuidString(): String = UUID.randomUUID().toString()

fun String?.toJSONObject(): JSONObject? = this?.let {
    try {
        JSONObject(it)
    } catch (e: JSONException) {
        null
    }
}

fun String?.toJSONArray(): JSONArray? = this?.let {
    try {
        JSONArray(it)
    } catch (e: JSONException) {
        null
    }
}

fun String.flagEmoji(): String {
    val offset = 0x1F1A5
    var retval = ""
    for (index in this.indices) {
        retval += String(Character.toChars(offset + this.codePointAt(index)))
    }

    return retval
}