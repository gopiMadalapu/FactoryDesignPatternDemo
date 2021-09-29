public class NonVegRecipeFactory implements AbstractFactory {
    public Recipe getRecipe(String type){
        if(type.equalsIgnoreCase("ITALIAN")){
            return new ItalianNonVegRecipe();
        }
        else if(type.equalsIgnoreCase("CHINESE")){
            return new ChineseNonVegRecipe();
        }
        return null;
    }
}
