package testes

import Funcionario
import java.math.BigDecimal

fun main() {
    val p1 = Funcionario(nome = "Tuesy Tuesy", cpf = "23323232", salario = BigDecimal(44))
    print(p1.nome + " - " + p1.cpf)
}
