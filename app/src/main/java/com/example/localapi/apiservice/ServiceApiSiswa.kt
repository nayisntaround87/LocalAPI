package com.example.localapi.apiservice

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa):retrofit2.Response<Void>
}

//    @GET("baca1Teman.php/{id}")
//    suspend fun getStasusSiswa(@Query("id") id: Int): DataSiswa

//    @PUT("editTM.php/{id}")
//    suspend fun editStatusSiswa(@Qyery("id") id: Int): DataSiswa