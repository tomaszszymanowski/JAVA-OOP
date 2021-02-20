package objectRepo;

import java.util.Arrays;

public class RealEstateInfo {
    private RealEstate[] realEstates = new RealEstate[10];
    private int index = 0;

    public void add (RealEstate realEstate){
        if(index < realEstates.length){
            realEstates[index++] = realEstate;

        }

    }



    public void display() {
        for (int i = 0; i < index; i++) {
            System.out.println(realEstates[i]);
        }
    }
}
