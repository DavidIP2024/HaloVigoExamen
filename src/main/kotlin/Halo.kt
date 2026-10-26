package org.example

enum class EstadoHalo {
    Idle,
    MovingUP,
    MovingDOWN,
    Error
}

object Halo {

    var nivel_actual: Int = 0
    var estado_actual: EstadoHalo = EstadoHalo.Idle


    fun nivel_0() {
        if (estado_actual == EstadoHalo.Idle && nivel_actual == 1) {
            estado_actual = EstadoHalo.MovingDOWN
            nivel_actual = 2
        }
    }

    fun nivel_1() {
        if (estado_actual == EstadoHalo.Idle && nivel_actual == 0) {
            estado_actual = EstadoHalo.MovingUP
            nivel_actual = 2
        }
    }

    fun gestionarEstado() {
        when (estado_actual) {
            EstadoHalo.Idle -> {
            }

            EstadoHalo.MovingUP -> {
                nivel_actual = 1
                estado_actual = EstadoHalo.Idle
            }

            EstadoHalo.MovingDOWN -> {
                nivel_actual = 0
                estado_actual = EstadoHalo.Idle
            }

            EstadoHalo.Error -> {
                nivel_actual = -1
            }
        }
    }
    fun activarError() {
        estado_actual = EstadoHalo.Error
        nivel_actual = -1
    }
}