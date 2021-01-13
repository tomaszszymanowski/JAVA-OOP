package method;

public class Draw {

    void drawCharacters(int number, char character){

        for(int i = 0; i < number; i++){
            for(int j = 0; j<number; j++){
                System.out.print(character);
            }
            System.out.println("");
        }

    }



}
