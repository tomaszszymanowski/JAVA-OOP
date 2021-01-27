package TypeStringBuilder;

import java.time.LocalTime;

public class DomainEditProgram {
    public static void main(String[] args) {

        StringBuilder[] domainsNames = new StringBuilder[5000001];

        for (int i = 0; i< domainsNames.length; i++ ){
            StringBuilder domain = new StringBuilder("http://wp.pl/alkjvaad/aksdlfa");
            domain.append(i);
            domainsNames[i] = domain;
        }

        long millisActualTime = System.currentTimeMillis(); // początkowy czas w milisekundach.
        for(StringBuilder sb : domainsNames) {
            sb.replace(7,9,"wirtualnapolska");
            //System.out.println(sb);
        }

        // wykonanie programu
        long executionTime = System.currentTimeMillis() - millisActualTime; // czas wykonania programu w milisekundach.
        System.out.println(executionTime);








    }
}
