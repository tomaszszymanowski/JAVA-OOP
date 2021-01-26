package TypeString;

public class RecipeBookProgram {
    public static void main(String[] args) {
        Recipe rc1 = new Recipe("Sushi", "ryż, ryba, glony nori, ulubione dodatki",
                "Wlej wodę do garnka. " +
                "Wsyp szklankę ryżu. Ryż gotuj do miękkości. Ugotowany ryż przełóż do miski i pozostaw do wystygnięcia. Letni ryż wymieszaj z ocetem " +
                "ryżowym, cukrem i solą. Rozłóż listek nori błyszczącą stroną do bambusowej maty. Nałóż warstę ryżu, rozprowadz po całym listku. Dodaj rybę " +
                "i dodatki. Zacznij zawijać z wykorzystaniem bambusowej maty. Uzyskaną rolkę podziel na 8 kawałków. Podawaj z sosem sojowym.",
                65);

        RecipeBook recipes = new RecipeBook(10);


        rc1.description = rc1.descriptionFormatting(rc1.description);
        recipes.addRecipe(rc1);

        recipes.displayAllRecipes();



    }
}
