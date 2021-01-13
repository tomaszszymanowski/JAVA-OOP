package method;

public class Amber {

    String color;
    double hardnes;
    double density;
    int meltingTemperatureInCelsius;

    public Amber(String color, double hardnes, double density, int meltingTemperatureInCelsius) {
        this.color = color;
        this.hardnes = hardnes;
        this.density = density;
        this.meltingTemperatureInCelsius = meltingTemperatureInCelsius;
    }

    double displayMeltingTempInFahrenheit(){
        return (this.meltingTemperatureInCelsius * 1.8)+32;
    }

    double increasinDensity(double densityValueToIncrease){

        return this.density+=densityValueToIncrease;
    }

    void displayInfoAboutAmber(){
        System.out.println("color: " + color);
        System.out.println("hardnes: " + hardnes);
        System.out.println("density: " + density);
        System.out.println("melting temperature: " + meltingTemperatureInCelsius + " Celsjus");

    }



}
