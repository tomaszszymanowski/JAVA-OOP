package inheritance;

public class GardenShopStorage {
    private Flower[] flowers = new Flower[10];
    private int flowerIndex = 0;

    private Fertilizer[] fertilizers = new Fertilizer[10];
    private int fertilizerIndex = 0;




    public void addFlower(Flower flower){
        flowers[flowerIndex++] = flower;

    }

    public void displayAll() {
        for(int i = 0; i< flowerIndex; i++){
            flowers[i].display();
        }
        for (int j = 0; j< fertilizerIndex; j++){
            fertilizers[j].display();
        }

    }

    public void addFertilizer(Fertilizer fertilizer) {
        fertilizers[fertilizerIndex++] = fertilizer;
    }

}
