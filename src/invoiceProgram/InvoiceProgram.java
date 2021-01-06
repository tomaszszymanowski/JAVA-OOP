package invoiceProgram;

public class InvoiceProgram {
    public static void main(String[] args) {
        // tablica przechowująca obiekty invoice
        Invoice[] listOfInvoices = new Invoice[2];

        //invoice1 utworzenie pierwszego obiektu
        Invoice invoice1 = new Invoice();
        invoice1.invNumber = 100;
        char[] description1 = {'c', 'z', 'a', 'j', 'n', 'i', 'k', 'i'};
        invoice1.description = description1;
        invoice1.price = 150;
        invoice1.vatRate = 23;
        invoice1.quantity = 900;
        char[] buyer = {'Z', 'U', 'S'};
        invoice1.Buyer = buyer;
        invoice1.buyerNIP = 666000000;
        char[] seller = {'C', 'H', 'R', 'L'};
        invoice1.Seller = seller;
        invoice1.sellerNIP = 152030;

        listOfInvoices[0] = invoice1;

        //invoice2 drugi obiekt
        Invoice invoice2 = new Invoice();
        invoice2.invNumber = 101;
        char[] description2 = {'r', 'e', 's', 'p', 'i', 'r', 'a', 't', 'o', 'r', 'y'};
        invoice2.description = description2;
        invoice2.price = 1500000;
        invoice2.vatRate = 23;
        invoice2.quantity = 150;
        char[] buyer2 = {'N', 'F', 'Z'};
        invoice2.Buyer = buyer2;
        invoice2.buyerNIP = 999000000;
        char[] seller2 = {'M', 'r', '.', 'N', 'o', 'b', 'o', 'd', 'y'};
        invoice2.Seller = seller2;
        invoice2.sellerNIP = 202020;

        listOfInvoices[1] = invoice2;

        // wyświetlanie danych

        for (Invoice invoice : listOfInvoices) {
            System.out.println("numer faktury: " + invoice.invNumber);
            System.out.print("opis: ");
            for (char c : description1) {
                System.out.print(c);
            }
            System.out.println("\ncena: " + invoice.price);
            System.out.println("stawka podatku: " + invoice.vatRate);
            System.out.println("ilość: " + invoice.quantity);
            System.out.print("nabywca: ");
            for(char b : invoice.Buyer){
                System.out.print(b);
            }
            System.out.println("\nNIP nabywcy: " + invoice.buyerNIP);
            System.out.print("sprzedawca: ");
            for(char n : invoice.Seller){
                System.out.print(n);
            }
            System.out.println("\nNIP sprzedawcy: " + invoice.sellerNIP);
            System.out.println("-------------------------------------");


        }

    }
}
