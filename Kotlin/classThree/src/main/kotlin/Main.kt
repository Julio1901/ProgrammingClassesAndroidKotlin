/*  1-Diferença entre números e outros tipos
*   2-Como ler melhor números grandes
*   3-Operadores lógicos
*   4-Tipo char
*   5- Tipo String
*   6- Caracteres especiais
*
*
* */


fun main() {

    //Exemplo quando juntamos dois caractéres que é diferente de somar dois números
    val result = "1" + "1"
    println(result)


    //Exemplo de erro quanto tentamos converter algo que não é um número
    val number = "10a"
    val numberConverted = number.toInt()

    //Para efeito de visualização, quando trabalhamos com números muito grandes podemos usar o _ para separar
    val oneMillion = 1_000_000 //Não muda nada para o computador, é apenas para o programador poder ler melhor

    val productPrice = 1_200


    //Operadores lógicos com números


    //Soma
    var age = 31
    age =  age + 10
    println(age)
    //NOTA: USAR ESSE EXEMPLO PARA -, * E /

    //Operadores com texto


    //Exemplo de concatenação
    var ageText = "31"
    println("I'm " + ageText  + " years old")
    //NOTA: ELE PEGA O CONTEÚDO DOS DOIS ESPAÇOS DE MEMÓRIA, JUNTA E ALOCA EM UM NOVO ESPAÇO DE MEMÓRIA

    //Exemplo de operador com booleano para inverter  !
    val boolean = false
    println(!boolean)

    //Tipo char - caractér  é declarado com aspas simples.
    val letra = 'J' //16 bits

    //Tipo String - Uma sequência direta de caracteres (chars)

    //Caracteres especiais

    // \n pode ser usado para pular a linha
    // \t pode ser usado para fazer um tab (espaço no começo)




}