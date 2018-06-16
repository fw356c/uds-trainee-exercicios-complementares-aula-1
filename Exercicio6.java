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