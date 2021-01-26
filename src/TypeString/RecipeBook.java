package TypeString;

public class RecipeBook {
    Recipe[] recipes;
    int iterator = 0;

    RecipeBook(int size) {
        recipes = new Recipe[size];
    }

    // dodawanie przepisów
    void addRecipe(Recipe recipe) {
        if (iterator < recipes.length) {
            recipes[iterator] = recipe;
            iterator++;
        }else {
            System.out.println("Nie można dodać przpisu, brak miejsca na nowe przpisy");
            // aby uniknąć przpełnienia tablicy można zastosować copyArray
        }
    }


    // wyśietlanie przepisów

    void displayAllRecipes() {
        System.out.println("Wszystkie zapisane przepisy");
        System.out.println("----------------------------");
        for(Recipe recipe : recipes){
            if(recipe != null){
                recipe.display();
                System.out.println("####");
            }else {
                break;
            }
        }

    }
}

