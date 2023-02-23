
/*
*    Mental map : https://coggle.it/diagram/Y_atAZQtDmLlzBl8/t/-
*
*   1 - guardar números
*   2- O que são comentários
*   3- A execução do programa é sempre de cima para baixo
*   4- O computador não se importa com o tipo na hora de armazenar no espaço que você reservou na memória,
*   mas para nós programadores é importante saber.
*   5- O que são "tipos"  a linguagem é  "tipada" (evitar cometer erros)
*   6- usar ::class para saber o tipo daquela variável
*   7 - O Kotlin sabe o tipo do dado mas nós podemos especificar o tipo se quisermos
*   8- O kotlin infere o tipo ou seja, ele mesmo já verifica qual o tipo do dado
*   9 - Os tipos mais comuns nós chamamos de TIPOS PRIMITIVOS, eles vieram junto com a linguaguem
* */




fun main(){

//Posso guardar um número em uma variável
    val age = 31
    val product = "iMac"
    val price = 31.90

    //exemplo de variável com tipo declarado

    /*O tipo fica cinza porque o Intelij avisa que o kotlin já sabe o tipo sem
    * que a gente declare
    * */
    val name: String = "Julio"

    println(age::class)
    println(product::class)
    println(price::class)

    /*  Tipos primitivos e espaço de memória
    *  Byte
    *  Int
    *
    * Nota: Raramente nós vamos fazer o uso dessa manipulação de memória mais precisa, geralmente usamos
    * um int e não um byte para números, por exemplo. Você vai usar isso se tiver fazendo algum jogo ou algorítmo
    * que tenha que ser extremamente preciso.
    * */


    //      #TIPOS PRIMITIVOS DE INTEIROS SEM CASAS DECIMAIS
    val byte: Byte = 8 //Ocupa um espaço de memória de 8-bit
    val short: Short = 16 //Ocupa 16 bytes
    val int: Int = 31 //Ocupa um espaço de memória de 32-bit (usado 99% do tempo)
    val long: Long = 21231231223 //64-bit é usado ex para CPF ou CNPJ
    //Um modo de reservar um espaço de long com um número menor mas a gente não faz isso
    val longTwo = 192L

    //NOTA: O Kotlin SEMPRE sabe qual a melhor opção para usar, a gente passa o número e ele vai saber qual o melhor tipo de espaço de memória para reservar

    //      #TIPOS PRIMITIVOS DE INTEIROS COM CASAS DECIMAIS

    val desconto : Float = 31.90f //32-bit
    val descontoTwo : Double = 31.90
    //NOTA: Se não colocarmos o f para declarar um float, por padrão o Kotlin declara como Double

    //      #TIPOS PRIMITIVOS BOOLEANOS

    val boolean = true //1 byte (8bites)
    val booleanTwo = false
    //NOTA: Por baixo dos panos, quando declaramos true na memória é armazenado 1 e quando declaramos false na memória é armazenado 0



    //      #CONVERSÃO DE TIPOS PRIMITIVOS


    //  Ex conversão de int para double
    val mediaDePreco = 22
    val mediaDePrecoConvertido = mediaDePreco.toDouble()
    println(mediaDePrecoConvertido)

    // Ex double para int
    val mediaDePrecoDois = 22.4
    val mediaDePrecoDoisConvertido = mediaDePrecoDois.toInt()
    println(mediaDePrecoDois)
    //NOTA: Ele descarta as casas decimais porque o inteiro não armazena casas decimais




    //  #EXERCISES





}