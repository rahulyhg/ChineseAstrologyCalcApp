package com.alexis.chineseastrology.lib.animalsigns

import com.alexis.chineseastrology.lib.general.Gender
import com.alexis.chineseastrology.lib.elements.IElement
import com.alexis.chineseastrology.lib.elements.WoodElement

/**
 * Created by alzayon on 3/26/2018.
 */
data class Tiger(public override val element: IElement = WoodElement()): IAnimalSign {
    override val gender: Gender
        get() = Gender.MALE
    override val baseElement: IElement
        get() = WoodElement()
    override val position: Int
        get() = 3
    override val name: String
        get() = "Tiger"

    override fun copyWithElement(element: IElement): IAnimalSign {
        return this.copy(element = element)
    }
}