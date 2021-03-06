package com.alexis.chineseastrology.viewmodel

import android.databinding.ObservableField
import android.databinding.ObservableInt
import com.alexis.chineseastrology.lib.flyingstars.time.IFlyingStarGroup
import com.alexis.chineseastrology.lib.flyingstars.time.YearlyFlyingStarGroup

interface IShowYearlyFlyingStarsViewModel {
    var yearToCalculate: ObservableInt
    var yearlyFlyingStarGroup: ObservableField<YearlyFlyingStarGroup?>
    fun setup()
    fun reset()
    fun moveYearToCalculate(direction: Int)

    //TODO
    //Determine why Databinding causes a StackOverflow exception if the return type is void/Unit
    //fun calculateYearlyFlyingStarGroup(): IFlyingStarGroup?
}