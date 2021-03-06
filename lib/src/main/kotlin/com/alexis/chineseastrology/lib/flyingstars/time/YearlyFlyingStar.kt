package com.alexis.chineseastrology.lib.flyingstars.time

import com.alexis.chineseastrology.lib.flyingstars.StarPosition

data class YearlyFlyingStar(val year: Int,
                            val starPosition: StarPosition): ITimeFlyingStar {
    override fun giveStarPosition(): StarPosition {
        return starPosition
    }
}