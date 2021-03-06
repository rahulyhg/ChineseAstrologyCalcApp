package com.alexis.chineseastrology.lib.flyingstars.stars

import com.alexis.chineseastrology.lib.general.Charge
import com.alexis.chineseastrology.lib.elements.IElement
import com.alexis.chineseastrology.lib.elements.MetalElement

data class HeavenStar(public override val element: IElement = MetalElement(),
                      public override val number: Int = 6,
                      public override val charge: Charge = Charge.POSITIVE): IFlyingStar {
    override fun next(): IFlyingStar {
        return BurglaryStar()
    }

    override fun previous(): IFlyingStar {
        return MisfortuneStar()
    }
}