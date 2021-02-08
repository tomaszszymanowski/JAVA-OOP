package hermetization;

public class CommunicationDepartment {
    Application[] applications;
    int numberOfAplications =0;

    public CommunicationDepartment() {
        applications = new Application[20];
    }

    public void addAplication(Application application){
        applications[numberOfAplications++] = application;
    }

    public void findApplication(int number){
        for(int i = 0; i < applications.length && applications[i] != null; i++){
            if(number == applications[i].getAplicationNumber()){
                System.out.println("Status wniosku: " + applications[i].getStatus());
            }
        }

    }

    public void displayAllApplications(){
        for(int i = 0; i < applications.length && applications[i] != null; i++){
            System.out.println(applications[i].getAplicationNumber());
        }
    }

    public void changeStatus(int number, String status) {
        for(int i = 0; i < applications.length && applications[i] != null; i++){
            applications[i].setStatus(status);
        }
    }

    public void displayApplicationStatus(int number){
        for(int i = 0; i < applications.length && applications[i] != null; i++){
            if(i == number){
                System.out.println("Zmieniono status na: " +applications[number].getStatus() );
               // System.out.println();
            }

        }
    }
}
