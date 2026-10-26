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

    @Test
    fun `pulsar nivel 1 desde nivel 0 inicia la subida`() {
        Halo.nivel_1()

        assertEquals(EstadoHalo.MovingUP, Halo.estado_actual)
        assertEquals(2, Halo.nivel_actual)
    }

    @Test
    fun `terminar la subida deja la maquina en nivel 1`() {
        Halo.nivel_1()
        Halo.gestionarEstado()

        assertEquals(EstadoHalo.Idle, Halo.estado_actual)
        assertEquals(1, Halo.nivel_actual)
    }

    @Test
    fun `pulsar nivel 0 desde nivel 1 inicia la bajada`() {
        Halo.nivel_actual = 1

        Halo.nivel_0()

        assertEquals(EstadoHalo.MovingDOWN, Halo.estado_actual)
        assertEquals(2, Halo.nivel_actual)
    }

    @Test
    fun `terminar la bajada deja la maquina en nivel 0`() {
        Halo.nivel_actual = 1
        Halo.nivel_0()
        Halo.gestionarEstado()

        assertEquals(EstadoHalo.Idle, Halo.estado_actual)
        assertEquals(0, Halo.nivel_actual)
    }
}

