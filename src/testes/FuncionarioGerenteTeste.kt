package testes

import Gerente

fun main() {
    val Andreza = Gerente("Andreza","87548477", salario = 1000.00, senha="senhaaa123")
    ImprimirRelatorio.imprimir(Andreza)
    TesteAutenticacao().autentica(Andreza)
}