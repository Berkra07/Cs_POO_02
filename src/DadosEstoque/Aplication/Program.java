package DadosEstoque.Aplication;

import DadosEstoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Leitor de nome e price
        System.out.println("===== Enter product data=====");
        System.out.print("Name: ");
        String name=sc.nextLine();
        System.out.print("Price: ");
        double price=sc.nextDouble();
        Product product = new Product(name, price);


        //getters e setters sendo usado para exemplo
        // onde mostra as informaçoes dadas no leitor
        System.out.println();
        System.out.println("Product data: " + product);

        //Adicionar produtos ao stock
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        //mostrador atualizado com o que foi add no estoque
        System.out.println();
        System.out.println("Product data: " + product);

        //remover intens do estoque
        System.out.println();
        System.out.print("Enter the number of products to be remove from stock: ");
         quantity = sc.nextInt();
         product.removeProducts(quantity);

         //mostrador final atualizado
        System.out.println();
        System.out.println("Product data: " + product);

        
        sc.close();
    }
}
