package objects_as_parameters;

public class Task3 {
    public static void main(String[] args) {

        int n = 5;
        FlightsTable flightsTable = new FlightsTable(n);

        Planes plane1 = new Planes("Boeing-ngx-127");
        Planes plane2 = new Planes("DreamLiner-nx-130");

        Flight flight1 = new Flight(15, 17,plane1);
        Flight flight2 = new Flight(15, 17,plane2);
        Flight flight3 = new Flight(15, 17,plane2);


        flightsTable.addFlight(flight1);
        flightsTable.addFlight(flight2);
        flightsTable.addFlight(flight3);

        flightsTable.displayAllFlights();

    }
}
