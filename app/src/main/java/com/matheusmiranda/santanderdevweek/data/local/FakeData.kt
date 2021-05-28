package com.matheusmiranda.santanderdevweek.data.local

import com.matheusmiranda.santanderdevweek.data.Cartao
import com.matheusmiranda.santanderdevweek.data.Cliente
import com.matheusmiranda.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Igor")
        val cartao = Cartao("4111111")
        return Conta(
            "445543-94",
            "3345-2",
            "R$ 2.234,34",
            "R$ 4.000",
            cliente,
            cartao
        )
    }
}