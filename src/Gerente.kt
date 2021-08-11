class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String)
    : Funcionario(nome, cpf, salario),Logavel {

    override fun calcAuxilio(): Double = salario + (salario * 1.5)

    override fun login(): Boolean = "senha123" == senha

}