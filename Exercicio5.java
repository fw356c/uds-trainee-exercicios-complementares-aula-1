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