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
