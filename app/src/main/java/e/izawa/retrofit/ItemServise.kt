package e.izawa.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface ItemService {

    // 特に RxJava 等は使わず Retrofit 標準のコールバックで結果を受け取る
    @GET("events")
    fun items(
//            @Query("page") page: Int,
//            @Query("par_page") perPage: Int
    ): retrofit2.Call<List<ItemEntity>>
}