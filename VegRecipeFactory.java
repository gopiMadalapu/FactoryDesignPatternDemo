public class VegRecipeFactory implements AbstractFactory {
    public Recipe getRecipe(String type){
        if(type.equalsIgnoreCase("ITALIAN")){
            return new ItalianVegRecipe();
        }
        else if(type.equalsIgnoreCase("CHINESE")){
            return new ChineseVegRecipe();
        }
        return null;
    }
}