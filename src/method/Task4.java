package method;
// metody obliczają średnią dla tablicy jedno i dwu wymiarowej
public class Task4 {
    public static void main(String[] args) {
        AvgOfArray someArray = new AvgOfArray();
        AvgOfArray otherArray = new AvgOfArray();

        System.out.println("1D array avg = " + someArray.annyArrayAVG1Dimension(new int[]{2, 2, 2,2,3}));
        System.out.println("---");
        System.out.println("2d array avg = " + otherArray.anny2DimensionArrayAVG(new int[][]{{2,2},{2,2,3}}));




    }
}
