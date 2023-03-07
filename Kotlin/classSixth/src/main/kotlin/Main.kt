/*  1-Funções e reutilização de código
*   2-Tipos de retorno
*   3-Escopo de funções
*   4-Declaração e corpo da função & funções inline
*   5-Recebendo parâmetro nas funções
*   6-Dicas do InteliJ
*   7-Parâmetros nomeados em funções
* */

//NOTA: A função main é do tipo Unit porque é chamada pelo sistema operacional, e o sistema não precisa saber o tipo de retorno
fun main() {
    //Funções são blocos reutilizáveis & organização

    //TERMO: Aqui estamos chamando a função (call)
    helloWorld()

    val result = sum()
    println(result)
    //NOTA: Se eu chamar a função dentro do print também funciona

    //Example why we can use functions
    val mockEmail = "Julio@test.com.br"
    println(checkIfEmailIsValid(mockEmail))

    //TERMO: AQUI ESTAMOS PASSANDO OS ARGUMENTOS QUE A FUNÇÃO ESPERA COMO PARÂMETRO
    verify(age = 26, name = "Julio", isAdmin = true)
    //NOTE: QUANDO DECLARAMOS OS ARGUMENTOS COM OS PARÂMETROS, PODEMOS REORDENAR ELES NA FUNÇÃO NA HORA DE CHAMAR

}

        //####################   1-Funções e reutilização de código ############################
        //######################################################################################

//Vamos criar funções para não ficar duplicando código desnecessariamente
//TERMO: Aqui estamos declarando uma função
fun helloWorld() {
    println("Hello, World")
    //println(2 + 3)
    //TERMO: O "fun helloWorld()" é a declaração da função e o que está entre chaves é o body
}

    //####################    2-Tipos de retorno ###########################################
    //######################################################################################

    /*Quando declaramos uma função, nós podemos definir o tipo de dado que ela irá nos retornar. Caso isso não seja definido,
    ela será marcada como Unit*/

    fun sum() : Int {
        return 2 + 5
    }

    //####################    3-Escopo de funções ###########################################
    //######################################################################################

    //Eu posso criar uma função dentro de outra função. Ela irá existir apenas no escopo dessa função.
    fun sayHelloAndSumSomething(){
        println("Hello")

        //NOTA: ESSA FUNÇÃO SÓ EXISTE DENTRO DESSE ESCOPO DE CÓDIGO
        fun sum(){
            5 + 3
        }
        //NOTA: Essas funções internas, que são funções de escopo são muito raras de serem usadas

        sum()
        //Faço várias coisas aqui, login, algo com banco de dados etc.,

        sum()
        //Chamei a função novamente
    }


    //####################    4-Declaração e corpo da função ###########################################
    //######################################################################################

    //É possível fazer uma função inline
    fun helloWordTwo() = println("Hello Wordl")
    //NOTA: NÃO PODEMOS TER DUAS FUNÇÕES COM O MESMO NOME PORQUE ELA É ALOCADA EM UM ESPAÇO DE MEMÓRIA IGUAL UMA VARIÁVEL


//####################    5-Recebendo parâmetro nas funções ###########################################
//######################################################################################

    fun checkIfEmailIsValid(email: String) : Boolean {
        return (email.contains("@") && email.contains(".com"))
    }

    fun checkAge(age: Int) : Boolean {
        return age >= 18
    }

//####################    6-Dicas do InteliJ ###########################################
//######################################################################################

/*    1-Note que quando você faz a chamada de uma função que foi declarada e espera um parâmetro, o inteliJ dá
*       a dica do nome do parâmetro para você.
*
* */

//####################    7-Parâmetros nomeados em funções ###########################################
//######################################################################################


    //TERMO: AQUI A FUNÇÃO ESTÁ ESPERANDO OS PARÂMETROS
    fun verify(age: Int, name: String, isAdmin: Boolean){
        //Code here
    }
