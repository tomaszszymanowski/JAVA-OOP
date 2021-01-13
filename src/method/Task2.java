package method;

class OperationsOnNumbers{
    int a,b,c,d,e;



    //dodawania
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    //odejmowanie
    int sub(int a, int b){
        return a-b;
    }

    int sub(int a, int b, int c, int d, int e){
        return a-b-c-d-e;
    }

}

public class Task2 {
    public static void main(String[] args) {

        OperationsOnNumbers twoNumberOperation = new OperationsOnNumbers();
        OperationsOnNumbers fiveNumberOperation = new OperationsOnNumbers();

        System.out.println(twoNumberOperation.sum(44, 11));
        System.out.println(twoNumberOperation.sub(66, 22));
        System.out.println("------");
        System.out.println(fiveNumberOperation.sum(10, 20, 30, 40, 50));
        System.out.println(fiveNumberOperation.sub(320, 10, 40, 20, 30));


    }
}
