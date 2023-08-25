package com.lcompany.lcim.api.liquid.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "TB_LIQUID")
data class Liquid(
        @Id
        @Column(name = "PRODUCT_ID")
        var PRODUCT_ID: Int = 0,

        @Column(name = "COMPANY_NAME")
        var COMPANY_NAME: String = "",
        @Column(name = "SERIES_NAME")
        var SERIES_NAME: String = "",
        @Column(name = "PRODUCT_NAME")
        var PRODUCT_NAME: String = "",
        @Column(name = "NICOTINE_HIGH")
        var NICOTINE_HIGH: Int = 0,
        @Column(name = "CATEGORY")
        var CATEGORY: String = "",
        @Column(name = "LOCATION")
        var LOCATION: String = "",
        @Column(name = "NICOTINE_MG")
        var NICOTINE_MG: Double = 0.0,
        @Column(name = "ACCEPT_ONLINE")
        var ACCEPT_ONLINE: Int = 0,
        @Column(name = "QUANTITY")
        var QUANTITY: Int = 0,
        @Column(name = "SPECIAL_NOTE")
        var SPECIAL_NOTE: String = "",
        @Column(name = "ONLINE_NAME")
        var ONLINE_NAME: String = "",
        @Column(name = "ONLINE_TAG")
        var ONLINE_TAG: String = "",
        @Column(name = "OFFLINE_PRICE")
        var OFFLINE_PRICE: Int = 0,
        @Column(name = "ONLINE_PRICE")
        var ONLINE_PRICE: Int = 0,
        @Column(name = "MAIN_IMAGE")
        var MAIN_IMAGE: String = "",
        @Column(name = "DETAIL_IMAGE")
        var DETAIL_IMAGE: String = ""
)
