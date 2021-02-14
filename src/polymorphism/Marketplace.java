package polymorphism;

public class Marketplace {
    private Product[] products = new Product[20];
    private  int productIndex = 0;

    public void add(Product product){
        if(productIndex < products.length){
            products[productIndex++] = product;
        }
    }

    public void displayAll(){
        for (int i = 0; i < productIndex; i++) {
            System.out.println("*************");
            products[i].display();
        }
    }

}
