##Exercicio 01

Variável é uma região de memória reservada para armazenar valores de modo temporário.
Carregamos para a memórias as informações que estamos trabalhando em determinado momento porém, sem remove-las do local de origem.

Em Java, todas as variáveis possuiram um tipo e este será definido ainda na declaração. Podemos alterar o valor armazenado numa variável a qualquer momento, porém, o tipo declarado não poderá ser alterado durante o tempo de execução.
Mais precisamente, as variáveis são carregadas para a memória RAM (Random Access Memory) devido a alta velocidade na leitura e gravação dessa mídia.
Como já dito, variáveis armazenam valores temporários, no caso, os valores que está sendo manipulando em determinado momento.
A memória RAM possui alto desempenho na leitura e gravação, por isso definimos as variáveis ali, no entanto, quando o computador for desligado ou então, houver interrupção no fornecimento de energia, todo valor alocado na memória RAM é perdido de maneira irreversível.

Não há limites na declaração de variáveis, logo, somos livres para definirmos a quantidade necessário, no entanto, devemos ser cautelosos, até porque, cada variável declarada irá consumir recursos do dispositivo e pode
prejudicar o desempenho de outras aplicações.

O Java reservará espaço a cada variável individualmente e, associa a esta região de memória o nome que definido, ou seja, a referência.
Temos assim que, a localização do espaço de memória será feito por intermédio da referência (nome da variável) definida em nossos códigos. A partir do momento em que não fizermos mais uso de determinada variável,
a JVM desalocará o espaço utilizado pela variável devolvendo-o ao sistema operacional.

##Exercicio 02
Syntax (ou Sintaxe) representa toda a estrutura de linguagem aplicada incluindo todos os elementos utilizáveis.

um bom exemplo de Sintaxe, são as diferenças presentes nos idiomas onde a sintaxe representa o modo correto de escrita
para que se faça entender de modo correto e preciso,o mesmo raciocínio se aplica a Syntax na programação.


##Exercicio 03
import java.util.Scanner;

class Main {

        public static void main(String[] args){
                System.out.println("Digite um numero e eu direi se é Par ou Impar!");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o numero: ");

                Integer numero = scanner.nextInt();

                if (numero %2==0){

                        System.out.println("O número "+numero+" é par");

                }

                else{

                        System.out.println("O número "+ numero +" é impar");

                }

        }

}

##Exercicio 04

import java.util.Scanner;

class Main {

        public static void main(String[] args){
                System.out.println("Função Para validação de Numeros Inteiros");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o Número: ");
                float valor = scanner.nextFloat();
                int aux=1;




            if (aux == valor){
                System.out.println("O numero digitado é inteiro");
            } else {
                System.out.println("O numero digitado nao é inteiro");
            }


        }


        }
        
        ##Exercicio 05
        
        
import java.util.Scanner;

class Main {

    public static void main(String[] args){
        System.out.println("Digite um numero e eu direi se é positivo ou negativo!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");

        Integer numero = scanner.nextInt();

        if (numero >=0){

            System.out.println("O número " + numero +" é positivo");

        }

        else{

            System.out.println("O número "+ numero +"  é negativo");

        }

    }

}

##Exercicio 06

import java.util.Scanner;

class Main {

        public static void main(String[] args){
                System.out.println("De qual Região procede o produto:");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o Código de Origem: ");
                Integer origem = scanner.nextInt();
                switch (origem){
                    case 1:
                        System.out.println("Origem Sul!");
                        break;
                    case 2:
                        System.out.println("Origem Norte!");
                        break;
                    case 3:
                        System.out.println("Origem Leste!");
                        break;
                    case 4:
                        System.out.println("Origem Oeste!");
                        break;
                    case 5:
                    case 6:
                        System.out.println("Origem Nordeste!");
                        break;
                    case 7:
                    case 8:
                    case 9:
                        System.out.println("Origem Sudeste!");
                        break;
                    case 10:
                        System.out.println("Origem Centro-Oeste!");
                        break;
                    case 11:
                        System.out.println("Origem Noroeste!");
                        break;
                    default:
                        System.out.println("Seu Produto é Importado");
                        break;
                }



        }

}

##Exercicio 07

import java.util.Scanner;

class Main {
    public static void main(String[] args){
        System.out.println("Bem vindo ao OutFit do Torinha!");
        Integer saldo=1500;
        String categoria1="Roupas";
        String categoria2="Sapatos";
        String categoria3="armas";
        String categoria4="bombas";
        String categoria5="Acessorios";


        System.out.println("Ola seu saldo é: "+saldo);
        System.out.println("Categorias:");
        System.out.println("1 - "+categoria1);
        System.out.println("2 - "+categoria2);
        System.out.println("3 - "+categoria3);
        System.out.println("4 - "+categoria4);
        System.out.println("5 - "+categoria5);
        System.out.println("Escolha Sua Categoria:");
        Scanner scanner = new Scanner(System.in);
        Integer entradaCategoria = scanner.nextInt();
        System.out.println("Produtos\n"+getCategoria1(entradaCategoria));
        Integer entradaProduto= scanner.nextInt();
        saldo= getSubtotal(entradaProduto,saldo);



        while (saldo >= 0){

            if (saldo <=0)
            {
                System.out.println("saldo Insufuciente!");
                break;
            }
            System.out.println("Seu Saldo: "+saldo);
            System.out.println("Categorias:");
            System.out.println("1 - "+categoria1);
            System.out.println("2 - "+categoria2);
            System.out.println("3 - "+categoria3);
            System.out.println("4 - "+categoria4);
            System.out.println("5 - "+categoria5);
            System.out.println("Escolha Sua Categoria:");
            Integer entradaCategoriaLoop = scanner.nextInt();
            System.out.println("Produtos\n"+getCategoria1(entradaCategoriaLoop));

            Integer entradaProdutoLoop= scanner.nextInt();
            saldo=getSubtotal(entradaProdutoLoop,saldo);
        }
    }

    public static Integer getPrecoProduto(int codigo) {
        Integer preco=0 ;
        switch (codigo) {
            case 1:
                preco = 500;
                break;
            case 2:
                preco = 200;
                break;
            case 3:
                preco = 300;
                break;
            case 4:
                preco = 50;
                break;
            case 5:
                preco = 228;
                break;
            case 6:
                preco = 255;
                break;
            case 7:
                preco = 253;
                break;
            case 8:
                preco = 483;
                break;
            case 9:
                preco = 28;
                break;
            case 10:
                preco = 39;
                break;
            case 11:
                preco = 983;
                break;
            case 12:
                preco = 274;
                break;
            case 13:
                preco = 463;
                break;
            case 14:
                preco = 952;
                break;
            case 15:
                preco = 753;
                break;
            case 16:
                preco = 297;
                break;
            case 17:
                preco = 964;
                break;
            case 18:
                preco = 872;
                break;
            case 19:
                preco = 365;
                break;
            case 20:
                preco = 147;
                break;
            case 21:
                preco = 589;
                break;
            case 22:
                preco = 658;
                break;
            case 23:
                preco = 671;
                break;
            case 24:
                preco = 584;
                break;
            case 25:
                preco = 944;
                break;



        }
        return preco;
    }

    public static Integer getSubtotal(int escolhaproduto, Integer Saldo) {
        Integer preco = getPrecoProduto(escolhaproduto);
        Integer resultado = Saldo - preco;
        return resultado;
    }


    public static String getCategoria1 ( int produto){
        Integer produto1 = 500;
        Integer produto2 = 200;
        Integer produto3 = 300;
        Integer produto4 = 50;
        Integer produto5 = 228;
        Integer produto6 = 255;
        Integer produto7 = 253;
        Integer produto8 = 483;
        Integer produto9 = 28;
        Integer produto10 = 39;
        Integer produto11 = 983;
        Integer produto12 = 274;
        Integer produto13 = 463;
        Integer produto14 = 952;
        Integer produto15 = 753;
        Integer produto16 = 297;
        Integer produto17 = 964;
        Integer produto18 = 872;
        Integer produto19 = 365;
        Integer produto20 = 147;
        Integer produto21 = 589;
        Integer produto22 = 658;
        Integer produto23 = 671;
        Integer produto24 = 584;
        Integer produto25 = 944;

        switch (produto) {
            case 1:
                return "1 - Calça " + produto1 + "\n2 - Camisa " + produto2 + "\n3 - Blusa " + produto3 + "\n4 - Shorts " + produto4 + "\n5 - Moletom " + produto5;
            case 2:
                return "6 - Tenis " + produto6 + "\n7 - Sapato Social " + produto7 + "\n8 - Bota " + produto8 + "\n9 - Tamanco " + produto9 + "\n10 - Chuteira " + produto10;
            case 3:
                return "11 - Faca " + produto11 + "\n12 - Pistola " + produto12 + "\n13 - Submetrlhadora " + produto13 + "\n14 - Fusil " + produto14 + "\n15 - Revolver " + produto15;
            case 4:
                return "16 - Granada de mão " + produto16 + "\n17 - Granada de fumaça " + produto17 + "\n18 - Granada de efeito moral " + produto18 + "\n19 - Molotov " + produto19 + "\n20 - Bomba Atomica " + produto20;
            case 5:
                return "21 - Helm +13 " + produto21 + "\n22 - Armor+13 " + produto22 + "\n23 - Gloves +13 " + produto23 + "\n24 - Pantes +13 " + produto24 + "\n25 - Boots +13 " + produto25;
        }

        return "Categoria Invalida!";
    }
}
