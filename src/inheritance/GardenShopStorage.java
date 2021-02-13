package inheritance;

public class GardenShopStorage {
    private Flower[] flowers = new Flower[10];
    private int flowerIndex = 0;

    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;


    public void addFlower(Flower flower) {
        if(flowerIndex < flowers.length) {
            flowers[flowerIndex++] = flower;
        }
    }

    public void addFertilizer(Fertilizer fertilizer) {
        if(fertilizerIndex < fertilizers.length){
            fertilizers[fertilizerIndex++] = fertilizer;
        }
    }

    public void displayAll() {
        for (int i = 0; i < flowerIndex; i++) {
            Flower flower = flowers[i];
            System.out.println("Nazwa: " + flower.getName());
            System.out.println("Cena: " + flower.getPrice());
            System.out.println("Typ: " + flower.getType());

        }
        for (int j = 0; j < fertilizerIndex; j++) {
            Fertilizer fertilizer = fertilizers[j];
            System.out.println("Nazwa: " + fertilizer.getName());
            System.out.println("Cena: " + fertilizer.getPrice());
            System.out.println("Przeznaczenie: " + fertilizer.getPurpose());
        }
    }

}
