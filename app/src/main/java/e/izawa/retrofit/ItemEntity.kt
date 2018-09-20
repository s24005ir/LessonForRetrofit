package e.izawa.retrofit

import com.squareup.moshi.Json

data class ItemEntity(
        @Json(name = "id")
        val id: Int,
        @Json(name="name")
        val name:String,
        @Json(name = "eventList")
        val eventList: MutableList<Event>
)