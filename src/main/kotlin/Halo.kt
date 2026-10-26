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
