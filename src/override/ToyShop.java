package override;

public class ToyShop {
    Bear[] bears = new Bear[10];
    int bearIndex = 0;

    public void addBear(Bear bear) {
        bears[bearIndex++] = bear;
    }

    public void displayAll(){
        for(int i = 0; i < bearIndex; i++){
            bears[i].display();
        }
    }



}
