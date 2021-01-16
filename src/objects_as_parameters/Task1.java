package objects_as_parameters;

public class Task1 {

    public static void main(String[] args) {
        int n = 2;
        CompanyArray companyArray = new CompanyArray(n);

        Address address = new Address("Poznańska", 15,7);
        Address address1 = new Address("Winogrady", 10, 3);

        Company co1 = new Company("CD Projekt",771520154, address );
        Company co2 = new Company("Intel",56920154, address );
        Company co3 = new Company("Western Union",12320154, address1 );
        Company co4 = new Company("Goldman Sachs",56945654, address1 );


        companyArray.add(co1);
        companyArray.add(co2);
        companyArray.add(co3);
        companyArray.add(co4);

        companyArray.displayAll();

        System.out.println("---poszukiwanie firmy o nip: 771520154 ---");
        Company company = companyArray.findCompanyByNIP(770154);
        if(company != null){
            company.display();
        }else {
            System.out.println("not find");
        }


    }
}
