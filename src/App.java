import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);
        System.out.println("Digite suas notas ou clique Enter para ver médias");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-");

        int med = 0;
        int not = 0;

        for (; ;) {

            System.out.print("Digite a nota ou clique Enter para sair: ");
            String info = scanner.nextLine();
            if (info.isEmpty()){

                break;
            }
            int nota = (int) Double.parseDouble(info);
            if(nota > 10 || nota < 0){
                System.out.println("essa nota não existe, favor desconsiderar !!");
            }else{
                med += 1;
                not += nota;


            }


        }
        if (med != 0){
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-");
            System.out.println("Quantidades de atividades: "+ med);
            System.out.println("Sua média é de: "+ not / med + "!");
        }
        System.out.println("Até logo! :)");


    }
}
