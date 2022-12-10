package com.sereginav.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi{
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=fe5e860e44daf54b8686824a51185cce" +
                "&format=json"+
                "&nojsoncallback=1"+
                "&extras=url_s"
    )
    fun fetchPhotos(): Call<FlickrResponse>
}