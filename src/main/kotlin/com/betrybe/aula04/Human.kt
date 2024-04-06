package com.betrybe.aula04

abstract class Human: Animal {
    override val scientificName: String
        get() = "Homo sapiens"
    internal abstract val name: String
    internal abstract var height: Double
    internal abstract var weight: Double
    internal abstract var ageYear: Int

    open fun eat() {
        print("om nom nom")
    }
}
