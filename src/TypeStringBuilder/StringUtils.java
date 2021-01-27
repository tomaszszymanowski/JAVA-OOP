package TypeStringBuilder;

public class StringUtils {

    void toEditSBuilder(StringBuilder sb, String newStr) {
        int startToDelete = sb.indexOf("/") + 2; // początek wycięcia tekstu
        int endToDelete = sb.indexOf(".");       // koniec
        sb.delete(startToDelete, endToDelete);
        sb.insert(7, newStr);               // wstawia nowy String od tego miejsca
        System.out.println(sb);

    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("http://kurczaki.pl/blog");
        System.out.println("przed zmianą \n" + sb1.toString());

        System.out.println("\npo zmianie");
        StringUtils stringUtils = new StringUtils();
        stringUtils.toEditSBuilder(sb1, "naukajavy");


    }
}
