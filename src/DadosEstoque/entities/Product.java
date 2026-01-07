package DadosEstoque.entities;

public class Product {

    //Atributos da classe

    public String name;
    public double price;
    public int quantity;


   //Construtores

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product (String name, double price){
        this.name = name;
        this.price = price;
        quantity = 1;
    }
    //Getters e setters

    

    //Metodos
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){

        this.quantity += quantity;
    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f",price)
                +", "
                +quantity
                + " units, Total: $ "
                +totalValueInStock();
    }


}
