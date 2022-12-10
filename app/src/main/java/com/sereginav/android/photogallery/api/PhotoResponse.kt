package com.sereginav.android.photogallery.api

import com.google.gson.annotations.SerializedName
import com.sereginav.android.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems:List<GalleryItem>
}