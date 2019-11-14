package com.example.pbl_ndb

/*
class Item {
    var item_id : Int? =0
    var item_name : String? = null
    var item_price : Int? = 0
    var item_image: Int? =null
    var item_ex: String? = null
}
*/

data class ItemDAO (
    var id : Int? =0,
    var name : String? = null,
    var price : Int? = 0,
    var description: String? = null
)