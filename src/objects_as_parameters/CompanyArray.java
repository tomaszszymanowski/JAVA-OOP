package objects_as_parameters;

public class CompanyArray {

    Company[] companies;
    int iterator = 0;

    CompanyArray(int size) {
        companies = new Company[size];
    }

    void add(Company company) {
        if(iterator < companies.length) {
            companies[iterator] = company;
            iterator++;
        }else {
            System.out.println("Brak miejsca dla firmy: ");
            company.display();
            System.out.println("###########");
        }
    }

    Company findCompanyByNIP(long nip){
        Company findedCompany = null;

        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            if(companies[i].NIP == nip){
                findedCompany = companies[i];
            }
        }
        return findedCompany;
    }

    void displayAll() {
        System.out.println("---Wszystkie firmy---");
        for (int i = 0; i < companies.length && companies[i] != null; i++) {
            companies[i].display();
            System.out.println("----");
        }

    }



}
