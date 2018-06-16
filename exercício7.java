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

