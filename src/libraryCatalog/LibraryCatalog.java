package libraryCatalog;

public class LibraryCatalog {
    public static void main(String[] args) {
        Book[] booksList = new Book[3];

        Book book1 = new Book();
        book1.title = "\"Przygody kanoniera Dolasa, czyli jak rozpętałem II Wojnę Światową\"";
        book1.author = "Sławiński Kazimierz";
        book1.pageNumber = 376;
        book1.publishedIn = 2012;
        book1.category = "beletrystyka";
        book1.numberISBN = "1050-2560-1875-2012";
        book1.status = 'D';
        book1.reader = "Grażyna Nowak";

        booksList[0] = book1;

        Book book2 = new Book();
        book2.title = "\"Czterej pancerni i pies\"";
        book2.author = "Przymanowski Janusz";
        book2.pageNumber = 402;
        book2.publishedIn = 1964;
        book2.category = "beletrystyka";
        book2.numberISBN = "1040-2570-1874-1964";
        book2.status = 'W';
        book2.reader = "Kazimierz Wielki";

        booksList[1] = book2;

        Book book3 = new Book();
        book3.title = "\"Stawka większa niż życie\"";
        book3.author = "Zbych Andrzej";
        book3.pageNumber = 296;
        book3.publishedIn = 1969;
        book3.category = "beletrystyka";
        book3.numberISBN = "1040-2570-1879-1964";
        book3.status = 'W';
        book3.reader = "Królowa Bona";

        booksList[2] = book3;


        for(Book book: booksList){
            if(book.status == 'W'){
                System.out.println(book.title + " jest wypożyczona przez " + book.reader);
            }
        }
    }
}
