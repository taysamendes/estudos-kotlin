class Cliente(
    nome: String,
    cpf: String,
    val tipoCliente: TipoCliente,
    val senha: String
    ): Pessoa(nome, cpf), Logavel {

    override fun toString(): String {
        return "Nome do cliente: $nome"
    }
    override fun login(): Boolean = "cliente123" == senha
}