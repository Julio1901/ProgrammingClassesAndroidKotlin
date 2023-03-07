/*  1-Condições lógicas
*   2-Comparar Strings
*   3-Nullable & Elvis Operator
*
*
* */


fun main() {

    // #Condições (Controle de fluxo)
    val product = "iPhone"

    //se, senão  = if, else e else if -> Sempre deve ser uma expressão booleana
    //(<. <=, >, >=, !, ==, !=)
    if (product.length < 3){
        println("You cannot register a product with a small name")
    }else{
        println("Register successful")
    }
    //Nota: fazer o exemplo com um segurança de balada verificando a idade

    print("Enter your name: ")
    val test = readLine()
    print("input test $test")

    print("Enter your age: ")
    val ageTest : Int = readLine()?.toInt() ?: 0

    if (ageTest > 20){
        println("Test age")
    }

    // #Condições compostas  && ||
    val price = 10
    val productTwo = "keyboard"


    //NOTA: NÃO LANÇOU UM ERRO PORQUE A PRIMEIRA NÃO ERA VERDADEIRA ENTÃO ELE NEM VERIFICA A SEGUNDA
    if(productTwo == "" && price / 0 == 1){
        print("test")
    }else{
       print("Test two")
    }
    //NOTA: Exemplo de ir comprar um refrigerante para explicar diferença de && e ||

    val productExample = "iMac"
    val productExampleTwo = "iMac"
    print(productExample == productExampleTwo)



    //#############################################//
    //         # 3 - NULLABLE AND ELVIS OPERATOR
    //#############################################//


    //Podemos declarar uma variável de três maneiras: Colocando um conteúdo, colocando algo vazio, ou reservando o espaço de memória e deixando ele sem nada (null)

    val someRandomString = "Random text here"
    val someEmptyString = ""
    val someNullString : String? = null


    //Primeira forma de tratar: Colocando um question mark ele só vai executar quando não for nullo

    println( someNullString?.length)
    //NOTA: NESSE CASO ELE NÃO VAI TENTAR ACESSAR A PROPRIEDADE LENGTH ELE VAI IMPRIMIR NULL DIRETO

    //Segunda forma. Fazendo um if else com valor padrão
    var numberOfCharacters = if (someNullString != null) someRandomString.length else 0

    //Terceira forma: Com elvis oparator
    numberOfCharacters = someNullString?.length ?: 0



}