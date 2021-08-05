
fun main() {
    TipoSolucao.values().forEach { e ->
        println(e.name +" ~> "+ e.descricao)
    }

    val solTb = TipoSolucao.TBL
    println(solTb.name + "-" + solTb.descricao)
}