package com.example.test.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


public class event {

    @SerializedName("events")
    @Expose
    var events:  List<Event>? = null
    @SerializedName("location")
    @Expose
    var location: Location? = null

}



public class Address {

    @SerializedName("address_1")
    @Expose
    var address1: String? = null
//    @SerializedName("address_2")
//    @Expose
//    var address2: String? = null
    @SerializedName("city")
    @Expose
    var city: String? = null
//    @SerializedName("region")
//    @Expose
//    public String region
//    @SerializedName("postal_code")
//    @Expose
//    public String postalCode
//    @SerializedName("country")
//    @Expose
//    public String country
//    @SerializedName("latitude")
//    @Expose
//    public String latitude
//    @SerializedName("longitude")
//    @Expose
//    public String longitude
//    @SerializedName("localized_address_display")
//    @Expose
//    public String localizedAddressDisplay
//    @SerializedName("localized_area_display")
//    @Expose
//    public String localizedAreaDisplay
//    @SerializedName("localized_multi_line_address_display")
//    @Expose
//    public List<String> localizedMultiLineAddressDisplay = null

}

public class AugmentedLocation {

    @SerializedName("city")
    @Expose
    var city: String? = null
    @SerializedName("region")
    @Expose
    var region: String? = null
    @SerializedName("country")
    @Expose
    var country: String? = null

}

class Location {

    @SerializedName("latitude")
    @Expose
    var latitude: Double? = null
    @SerializedName("augmented_location")
    @Expose
    var augmentedLocation: AugmentedLocation? = null
    @SerializedName("within")
    @Expose
    var within: Double? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Double? = null
    @SerializedName("address")
    @Expose
    var address: String? = null

}

public class Description {

    @SerializedName("text")
    @Expose
    var text: String? = null

}

public class End {

    @SerializedName("timezone")
    @Expose
    var timezone: String? = null
    @SerializedName("local")
    @Expose
    var local:  String? = null
    @SerializedName("utc")
    @Expose
    var utc:  String? = null

}


public class Event {

    @SerializedName("name")
    @Expose
    var name: Name? = null
    @SerializedName("description")
    @Expose
    var description: Description? = null
//    @SerializedName("id")
//    @Expose
//    public String id

//    @SerializedName("url")
//    @Expose
//    public String url

    @SerializedName("start")
    @Expose
    var start: Start? = null
    @SerializedName("end")
    @Expose
    var end: End? = null
//    @SerializedName("organization_id")
//    @Expose
//    public String organizationId
//    @SerializedName("created")
//    @Expose
//    public String created
//    @SerializedName("changed")
//    @Expose
//    public String changed
//    @SerializedName("published")
//    @Expose
//    public String published
    @SerializedName("capacity")
    @Expose
    var capacity: Int? = null
//    @SerializedName("capacity_is_custom")
//    @Expose
//    public Object capacityIsCustom
    @SerializedName("status")
    @Expose
    var status: String? = null
//    @SerializedName("currency")
//    @Expose
//    public String currency
//    @SerializedName("listed")
//    @Expose
//    public Boolean listed
//    @SerializedName("shareable")
//    @Expose
//    public Boolean shareable
//    @SerializedName("online_event")
//    @Expose
//    public Boolean onlineEvent
//    @SerializedName("tx_time_limit")
//    @Expose
//    public Integer txTimeLimit
//    @SerializedName("hide_start_date")
//    @Expose
//    public Boolean hideStartDate
//    @SerializedName("hide_end_date")
//    @Expose
//    public Boolean hideEndDate
//    @SerializedName("locale")
//    @Expose
//    public String locale
//    @SerializedName("is_locked")
//    @Expose
//    public Boolean isLocked
//    @SerializedName("privacy_setting")
//    @Expose
//    public String privacySetting
//    @SerializedName("is_series")
//    @Expose
//    public Boolean isSeries
//    @SerializedName("is_series_parent")
//    @Expose
//    public Boolean isSeriesParent
//    @SerializedName("inventory_type")
//    @Expose
//    public String inventoryType
//    @SerializedName("is_reserved_seating")
//    @Expose
//    public Boolean isReservedSeating
//    @SerializedName("show_pick_a_seat")
//    @Expose
//    public Boolean showPickASeat
//    @SerializedName("show_seatmap_thumbnail")
//    @Expose
//    public Boolean showSeatmapThumbnail
//    @SerializedName("show_colors_in_seatmap_thumbnail")
//    @Expose
//    public Boolean showColorsInSeatmapThumbnail
//    @SerializedName("source")
//    @Expose
//    public String source
//    @SerializedName("is_free")
//    @Expose
//    public Boolean isFree
//    @SerializedName("version")
//    @Expose
//    public String version
//    @SerializedName("summary")
//    @Expose
//    public String summary
//    @SerializedName("logo_id")
//    @Expose
//    public String logoId
    @SerializedName("organizer_id")
    @Expose
    var organizerId: Long? = null
    @SerializedName("venue_id")
    @Expose
    var venueId: Long? = null
//    @SerializedName("category_id")
//    @Expose
//    public String categoryId
//    @SerializedName("subcategory_id")
//    @Expose
//    public Object subcategoryId
//    @SerializedName("format_id")
//    @Expose
//    public String formatId
//    @SerializedName("resource_uri")
//    @Expose
//    public String resourceUri
//    @SerializedName("is_externally_ticketed")
//    @Expose
//    public Boolean isExternallyTicketed
    @SerializedName("venue")
    @Expose
    var venue: Venue? = null
    @SerializedName("logo")
    @Expose
    var logo: Logo? = null

}


public class Logo {

    @SerializedName("original")
    @Expose
    var original: Original? = null
//    @SerializedName("id")
//    @Expose
//    public String id
    @SerializedName("url")
    @Expose
    var url: String? = null
//    @SerializedName("aspect_ratio")
//    @Expose
//    public String aspectRatio
//    @SerializedName("edge_color")
//    @Expose
//    public String edgeColor
//    @SerializedName("edge_color_set")
//    @Expose
//    public Boolean edgeColorSet

}


public class Name {

    @SerializedName("text")
    @Expose
    var text: String? = null

}


public class Original {

    @SerializedName("url")
    @Expose
    var url: String? = null
//    @SerializedName("width")
//    @Expose
//    public Integer width
//    @SerializedName("height")
//    @Expose
//    public Integer height

}


//public class Pagination {
//
//    @SerializedName("object_count")
//    @Expose
//    public Integer objectCount
//    @SerializedName("page_number")
//    @Expose
//    public Integer pageNumber
//    @SerializedName("page_size")
//    @Expose
//    public Integer pageSize
//    @SerializedName("page_count")
//    @Expose
//    public Integer pageCount
//    @SerializedName("has_more_items")
//    @Expose
//    public Boolean hasMoreItems
//
//}


class Start {

    @SerializedName("timezone")
    @Expose
    var timezone: String? = null
    @SerializedName("local")
    @Expose
    var local: String? = null
    @SerializedName("utc")
    @Expose
    var utc: String? = null

}


class Venue {

    @SerializedName("address")
    @Expose
    var address: Address? = null
//    @SerializedName("resource_uri")
//    @Expose
//    public String resourceUri
    @SerializedName("id")
    @Expose
    var id: Long? = null
//    @SerializedName("age_restriction")
//    @Expose
//    public Object ageRestriction
//    @SerializedName("capacity")
//    @Expose
//    public Object capacity
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("latitude")
    @Expose
    var latitude: Double? = null
    @SerializedName("longitude")
    @Expose
    var longitude: Double? = null

}