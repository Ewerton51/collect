package atividadesbootcamp141123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class collectionLIST {

    public static void main(String[] args) {
        
        ArrayList<String> coresArrayList = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma cor: ");
            String cor = leia.nextLine();
            coresArrayList.add(cor);
        }
 
        System.out.println("\nListar todas as cores:");
        for (String cor : coresArrayList) {
            System.out.println(cor);
        }

        Collections.sort(coresArrayList);

        System.out.println("\nOrdenar as cores:");
        for (String cor : coresArrayList) {
            System.out.println(cor);
        }

        leia.close();
    }
}
