package TypeStringBuilder;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("http://kurczaki.pl/blog");

        int startToDelete = sb1.indexOf("/") + 2;
        System.out.println(sb1.indexOf("/"));
        int endToDelete = sb1.indexOf(".");
        System.out.println(sb1.indexOf("."));
        sb1.delete(startToDelete,endToDelete);
        System.out.println(sb1);
        String str =  "naukajavy";
        sb1.insert(7,str);
        System.out.println(sb1);
    }
}
