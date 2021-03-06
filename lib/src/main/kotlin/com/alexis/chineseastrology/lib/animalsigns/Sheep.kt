package com.alexis.chineseastrology.lib.animalsigns

import com.alexis.chineseastrology.lib.general.Gender
import com.alexis.chineseastrology.lib.elements.FireElement
import com.alexis.chineseastrology.lib.elements.IElement

/**
 * Created by alzayon on 3/27/2018.
 */
data class Sheep(public override val element: IElement = FireElement()): IAnimalSign {
    override val gender: Gender
        get() = Gender.FEMALE
    override val baseElement: IElement
        get() = FireElement()
    override val position: Int
        get() = 8
    override val name: String
        get() = "Sheep"

    override fun copyWithElement(element: IElement): IAnimalSign {
        return this.copy(element = element)
    }
}