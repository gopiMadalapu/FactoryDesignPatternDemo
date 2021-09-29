public class RecipeFactory {
    public static AbstractFactory getFactory(String type) {
        if(type.equalsIgnoreCase("VEG")){
            return new VegRecipeFactory();
        }
        else if(type.equalsIgnoreCase("NONVEG")){
            return new NonVegRecipeFactory();
        }
        return null;
    }
}
