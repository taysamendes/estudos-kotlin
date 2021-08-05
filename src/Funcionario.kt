import java.math.BigDecimal

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
):Pessoa(nome, cpf){
    protected abstract fun calcAuxilio();
}