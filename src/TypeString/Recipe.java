package TypeString;

public class Recipe {
    String name;
    String ingredients;
    String description;
    int preparationTimeInMinutes;
    String closureText = "***\nZachęcam do zapoznania się z innymi przepisami";

    public Recipe(String name, String ingredients, String description, int preparationTimeInMinutes) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.preparationTimeInMinutes = preparationTimeInMinutes;
    }

    void display() {
        System.out.println("Nazwa potrawy: "+name);
        System.out.println("Składniki: "+ ingredients);
        System.out.println("Sposób przygotowania: "+description);
        System.out.println("Czas przygotowania: " + preparationTimeInMinutes+" minut");
        System.out.println(closureText);
    }

    String descriptionFormatting(String description) {
        String[] splitedDescription = description.split("\\."); // description zamiast nowego stringa
        this.description = "";
        for (int i = 0; i < splitedDescription.length; i++) {
            if (i % 2 == 0 || i == 0) {
                this.description += "\n";
            }
            this.description += splitedDescription[i].trim() + ". ";
        }
        return this.description;
    }


}
