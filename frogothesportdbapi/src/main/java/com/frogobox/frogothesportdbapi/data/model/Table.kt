package com.frogobox.frogothesportdbapi.data.model

import com.frogobox.frogothesportdbapi.util.SportData.Table.DRAW
import com.frogobox.frogothesportdbapi.util.SportData.Table.GOALS_AGAINST
import com.frogobox.frogothesportdbapi.util.SportData.Table.GOALS_DIFFERENCE
import com.frogobox.frogothesportdbapi.util.SportData.Table.GOALS_FOR
import com.frogobox.frogothesportdbapi.util.SportData.Table.LOSS
import com.frogobox.frogothesportdbapi.util.SportData.Table.NAME
import com.frogobox.frogothesportdbapi.util.SportData.Table.PLAYED
import com.frogobox.frogothesportdbapi.util.SportData.Table.TEAM_ID
import com.frogobox.frogothesportdbapi.util.SportData.Table.TOTAL
import com.frogobox.frogothesportdbapi.util.SportData.Table.WIN
import com.google.gson.annotations.SerializedName

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * TheSportDBApi
 * Copyright (C) 09/03/2020.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.frogothesportdbapi.data.model
 *
 */
data class Table(

    @SerializedName(NAME)
    var name: String? = null,

    @SerializedName(TEAM_ID)
    var teamid: String? = null,

    @SerializedName(PLAYED)
    var played: String? = null,

    @SerializedName(GOALS_FOR)
    var goalsfor: String? = null,

    @SerializedName(GOALS_AGAINST)
    var goalsagainst: String? = null,

    @SerializedName(GOALS_DIFFERENCE)
    var goalsdifference: String? = null,

    @SerializedName(WIN)
    var win: String? = null,

    @SerializedName(DRAW)
    var draw: String? = null,

    @SerializedName(LOSS)
    var loss: String? = null,

    @SerializedName(TOTAL)
    var total: String? = null

)