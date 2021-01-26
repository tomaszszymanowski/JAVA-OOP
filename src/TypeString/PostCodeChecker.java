package TypeString;

public class PostCodeChecker {

    void isPostCode(String zipCode){

                if(zipCode.charAt(2) == '-' && zipCode.length()==6){
                    System.out.println("To jest poprawny kod pocztowy");
                }else {
                    System.out.println("Ten kod pocztowy jest błędny");
                }
        // kod musi mieć 6 znaków
        // trzeci znak(indeks 2)  to musi być myślnik

    }
}
