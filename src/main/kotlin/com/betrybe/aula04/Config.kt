package com.betrybe.aula04

object Config {
    private const val LANGUAGE = "pt-br"
    private const val THEME = "dark"
    fun getEnvs() = this.THEME + this.LANGUAGE
}