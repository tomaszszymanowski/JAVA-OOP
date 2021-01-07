package carService;

public class CarServiceProgram {
    public static void main(String[] args) {
        Car car1 = new Car("Renault", "Clio", 2019,"słabe hamulce");
        Car car2 = new Car("KIA", "Rio", 2020, "sprzęgło do wymiany");
        Car car3 = new Car("Skoda", "Fabia", 2015, "stukanie w silniku");
        Car car4 = new Car("VolksWagen", "Tiguan", 2015,"nie odpala");
        Car car5 = new Car("VolksWagen", "Polo", 2015, "awaria skrzyni biegów");
        Car car6 = new Car("Honda", "Civic", 2015, "nie odpala");

        Car[] carsArray = new Car[6];
        carsArray[0] = car1;
        carsArray[1] = car2;
        carsArray[2] = car3;
        carsArray[3] = car4;
        carsArray[4] = car5;
        carsArray[5] = car6;

        System.out.println("Lista samochodów z starszych niż rok 2020");
        for(Car car : carsArray){
            if(car.productionDate < 2020){
                System.out.println(car.mark);
                System.out.println(car.model);
                System.out.println(car.faultDescription);
                System.out.println("--------------");
            }
        }
    }

}
