package testes

import Cliente

fun main() {
    val Zelhinha = Cliente(
        "Marizelia",
        "5465654",
        tipoCliente = TipoCliente.PF,
        "cliente123")

    println(Zelhinha)
    TesteAutenticacao().autentica(Zelhinha)

}