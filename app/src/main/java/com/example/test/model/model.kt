package com.example.test.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class model {

    @SerializedName("id")
    @Expose
    var id: String? = null

    @SerializedName("location")
    var location: location? = null

    @SerializedName("pagination")
    var pagination: pagination? = null

}

class pagination {
    @SerializedName("object_count")
    var object_count = 0
}


class location {
    @SerializedName("latitude")
    @Expose
    var latitude = ""

    @SerializedName("within")
    @Expose
    var within = "";
    @SerializedName("longitude")
    @Expose
    var longitude = "";
    @SerializedName("address")
    @Expose
    var address = "";
}

