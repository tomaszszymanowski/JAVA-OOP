package override;

public class ToyShop {
    Bear[] bears = new Bear[10];
    int bearIndex = 0;

    Car[] cars = new Car[10];
    int carIndex = 0;


    public void addBear(Bear bear) {
        bears[bearIndex++] = bear;
    }

    public void addCar(Car car) {
        cars[carIndex++] = car;
    }



    public void displayAll(){
        for(int i = 0; i < bearIndex; i++){
            bears[i].display();
        }

        for (int i = 0; i < carIndex; i++) {
            cars[i].display();
        }
    }

}
