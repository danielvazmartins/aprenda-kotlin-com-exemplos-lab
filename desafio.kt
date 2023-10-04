// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String, var idade: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)listOf
    }
}

fun printFormacaoEInscritos(formacao: Formacao) {
    println("Formação ${formacao.nome}")
    
    formacao.conteudos.forEach() {
        conteudo -> println("- Curso: ${conteudo.nome} - Duração: ${conteudo.duracao} - Nível: ${conteudo.nivel}")
    }
    
    println("Alunos matriculados:")
    
    formacao.inscritos.forEach{ 
        usuario -> println("- ${usuario.nome} de ${usuario.idade} anos")
    }
    
    println("")
}

fun main() {
    var conteudoNode = listOf(
        ConteudoEducacional("Node básico", 4, Nivel.BASICO),
        ConteudoEducacional("Express.js", 8, Nivel.INTERMEDIARIO),
        ConteudoEducacional("NestJs", 16, Nivel.DIFICIL)
    )
    val formacaoNode = Formacao("NodeJs", conteudoNode)
    
    var conteudoJava = listOf(
        ConteudoEducacional("Java básico", 4, Nivel.BASICO),
        ConteudoEducacional("Java OOP", 8, Nivel.INTERMEDIARIO),
        ConteudoEducacional("Spring Boot", 16, Nivel.DIFICIL)
    )
    val formacaoJava = Formacao("Java", conteudoJava)
    
    val joao = Usuario("João", 27)
    val maria = Usuario("Maria", 32)
    val fabricio = Usuario("Fabricio", 19)
    val mario = Usuario("Mario", 23)
    
    formacaoNode.matricular(joao)
    formacaoNode.matricular(fabricio)
    formacaoJava.matricular(maria)
    formacaoJava.matricular(mario)
    
    printFormacaoEInscritos(formacaoNode)
    printFormacaoEInscritos(formacaoJava)
}