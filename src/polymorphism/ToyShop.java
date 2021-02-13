package polymorphism;

public class ToyShop {
    Bear[] bears = new Bear[10];
    int bearIndex = 0;

    Car[] cars = new Car[10];
    int carIndex = 0;

    Puzzle[] puzzles = new Puzzle[10];
    int puzzleIndex = 0;

    Book[] books = new Book[10];
    int bookIndex = 0;


    //add methods
    public void addBear(Bear bear) {
        bears[bearIndex++] = bear;
    }

    public void addCar(Car car) {
        cars[carIndex++] = car;
    }

    public void addPuzzle(Puzzle puzzle) {
        puzzles[puzzleIndex++] = puzzle;
    }

    public void addBook(Book book) {
        books[bookIndex++] = book;
    }

    public void displayAll(){
        for(int i = 0; i < bearIndex; i++){
            bears[i].display();
        }

        for (int i = 0; i < carIndex; i++) {
            cars[i].display();
        }

        for (int i = 0; i < puzzleIndex; i++) {
            puzzles[i].display();
        }

        for (int i = 0; i < bookIndex; i++) {
            books[i].display();
        }
    }



}
