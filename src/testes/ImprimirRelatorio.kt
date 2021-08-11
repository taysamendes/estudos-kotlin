package testes

import Funcionario

class ImprimirRelatorio {
    companion object {
        fun imprimir(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}