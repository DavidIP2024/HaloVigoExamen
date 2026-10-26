package org.example

fun main() {
    println("Estado inicial: ${Halo.estado_actual}")
    println("Nivel inicial: ${Halo.nivel_actual}")

    Halo.nivel_1()
    println("Subiendo: ${Halo.estado_actual}")
    println("Nivel: ${Halo.nivel_actual}")

    Halo.gestionarEstado()
    println("Estado final: ${Halo.estado_actual}")
    println("Nivel final: ${Halo.nivel_actual}")
}