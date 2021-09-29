public class Test{

    public static void main(String []args){
        // Getting red and blue color shoes from sports shoes factory
        AbstractFactory  RecipesFactory =  RecipeFactory.getFactory("VEG");
        Recipe italianveg = RecipesFactory.getRecipe("ITALIAN");
        italianveg.details();
        Recipe chineseveg = RecipesFactory.getRecipe("CHINESE");
        chineseveg.details();
        
        //Getting the same color shoes but from dress shoes factory
        RecipesFactory = RecipeFactory.getFactory("NONVEG");
        Recipe italiannonveg = RecipesFactory.getRecipe("ITALIAN");
        italiannonveg.details();
        Recipe chinesenonveg = RecipesFactory.getRecipe("CHINESE");
        chinesenonveg.details();
    }
}