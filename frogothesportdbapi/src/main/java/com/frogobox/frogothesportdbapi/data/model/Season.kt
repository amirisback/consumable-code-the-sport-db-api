package com.frogobox.frogothesportdbapi.data.model

import com.frogobox.frogothesportdbapi.util.SportData.Season.STR_SEASON
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 26/01/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothesportdbapi.model.data
 *
 */
data class Season(

    @SerializedName(STR_SEASON)
    var strSeason: String? = null

)