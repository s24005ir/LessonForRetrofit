package e.izawa.retrofit

import com.squareup.moshi.Json

data class Event(
        @Json(name = "id")
        val id: Int,
        @Json(name = "title")
        val title: String
)