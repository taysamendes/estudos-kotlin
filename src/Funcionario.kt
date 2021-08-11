import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
):Pessoa(nome, cpf){
    protected abstract fun calcAuxilio():Double;

    override fun toString(): String {
        return "Nome do funcionário: $nome\nAuxílio: ${calcAuxilio()}"
    }
}