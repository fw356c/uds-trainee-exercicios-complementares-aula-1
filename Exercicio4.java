import java.util.Scanner;

class Main {

        public static void main(String[] args){
                System.out.println("Fun��o Para valida��o de Numeros Inteiros");
                Scanner scanner = new Scanner(System.in);
                System.out.print("Digite o N�mero: ");
                float valor = scanner.nextFloat();
                int aux=1;




            if (aux == valor){
                System.out.println("O numero digitado � inteiro");
            } else {
                System.out.println("O numero digitado nao � inteiro");
            }


        }


        }
