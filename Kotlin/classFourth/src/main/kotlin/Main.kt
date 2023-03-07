
/*      1-Acessando propriedades de variáveis
*       2-Formatando textos
*
*
*
* */

fun main() {

    //Quando declaro uma variável eu tenho acesso à uma série de métodos e propriedades dela
    val name = "Julio Cesar"
    //Posso ver a quantidade de caracteres em uma string, por exemplo.
    name.length
    //NOTA: Isso pode ser aplicado para validar o número mínimo de uma senha, por exemplo.

    //ex:
    val password = "admin123" //Objeto = tipo explicar que objeto é igual ao tipo

    if (password.length >= 8){
        println("Password created")
    }else{
        println("Minimum number of letters not reached")
    }

    //Exemplos de funções da classe que mudam o comportamento do objeto

    val numberTwo = "Julio Cesar"
    numberTwo.uppercase()
    //NOTA: Muito cuidado, aqui ele não tá alterando a propriedade do objeto, só manipulando o dado e dando um retorno
    println(numberTwo)

    // #FORMATAÇÃO DE TEXTOS

    //Aspas triplas (trimIndent())

    val welcome = """ 
       Hello, Julio.
       Your product has arrived!
    """.trimIndent()
    //NOTA: O INTELIJ JÁ COLOCA O trimIndent() pra ajudar, mas sem ele o espaço a mais não é enxugado. "Trim" é enxugar


    println(welcome)


    //Separando textos que estão identados
    val welcomeTwo = """ 
       Hello, Julio.
       Your product has arrived!
    """.replaceIndent(";")

    println(welcomeTwo)

    //Substituindo um caracter por outro
    val replaceTest = "Hello, Julio. Your product has arrived!"
    val newReplace = replaceTest.replace("o", "?")
    println(newReplace)

    // #Formas de concatenação
    val userName = "Julio"
    val userAge = 26
    //NOTA: Importante, quando usamos o operador + em um int junto a uma string, ele é tratado como string.

    println("Hello, " +  userName + " you are " + userAge + " years old")

    //Segundo modo e mais indicado
    println("Hello, $userName you are $userAge years old")

    //Posso fazer expressões criando um bloco de código
    println("Hello, $userName you are ${userAge + 10} years old")

}