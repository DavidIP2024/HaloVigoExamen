package org.example

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class HaloTest {

    @BeforeEach
    fun reiniciarMaquina() {
        Halo.nivel_actual = 0
        Halo.estado_actual = EstadoHalo.Idle
    }

    @Test
    fun `la maquina empieza en Idle y nivel 0`() {
        assertEquals(EstadoHalo.Idle, Halo.estado_actual)
        assertEquals(0, Halo.nivel_actual)
    }

}