package atividadesbootcamp141123;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class collectionSET {

    public static void main(String[] args) {
        
        Set<Integer> integerSet = new HashSet<>();

        
        Scanner var = new Scanner(System.in);

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número inteiro: ");
            int numero = var.nextInt();
            integerSet.add(numero);
        }

        
        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        
        var.close();
    }
}