package controlflow

private class ForLoop<T> {
    companion object {
        inline fun <reified T> run(arg: List<T>) {
            for(t in arg) {
                println(t)
            }
        }
    }
}

fun main() {
    // for loop normal
    val listaSimples = listOf<String>("Bolo de cenoura", "Bolo de chocolate", "Red velvet", "Bolo de morango")
    ForLoop.run(listaSimples)
}