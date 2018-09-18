package e.izawa.retrofit

import com.squareup.moshi.Json

data class ItemEntity(
        @Json(name = "id") // 記事ID
        val id: Int,
//        @Json(name = "title") // タイトル
//        val title: String,
//        @Json(name = "body") // 記事の中身
//        val body: String
//@Json(name="user_id")
//val user_id: Int,
//@Json(name="user_name")
//val user_name: String,
//@Json(name="events")
//val events: String
@Json(name="type")
val type:String
)