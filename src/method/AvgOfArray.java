package method;

public class AvgOfArray {

    double annyArrayAVG1Dimension(int[] arr){
        double avg = 0;
        for(int x : arr){
            avg += x;
        }
        return avg/arr.length;
    }

    double anny2DimensionArrayAVG(int[][] arr){
        double avg2d = 0;
        int divider = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
             avg2d += arr[i][j];
             divider++;
            }
        }
        return avg2d/divider;
    }
}
