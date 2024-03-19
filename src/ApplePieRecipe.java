import com.sun.security.jgss.InquireType;

public class ApplePieRecipe {
    Ingredient butter = new Ingredient(300, "gram", "ongezouten roomboter");
    Ingredient casterSugar = new Ingredient(200, "gram", "witte basterd suiker");
    Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanilla = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient apple = new Ingredient(1500, "gram", "zoetzure appels");
    Ingredient granulatedSugar = new Ingredient(200, "gram", "kristal suiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients(){
        System.out.println("Ingrediënten voor de appeltaart:");
        System.out.println(butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println(casterSugar.getAmount() + " " + casterSugar.getUnit() + " " + casterSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanilla.getAmount() + " " + vanilla.getUnit() + " " + vanilla.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apple.getAmount() + " " + apple.getUnit() + " " + apple.getName());
        System.out.println(granulatedSugar.getAmount() + " " + granulatedSugar.getUnit() + " " + granulatedSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }

    public void preHeatOven() {
        System.out.println("Stap 1: Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void clutchEgg() {
        System.out.println("Stap 2: Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void prepareIngredients() {
        System.out.println("Stap 3: Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void cutPotatoes() {
        System.out.println("Stap 4: Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void prepareBakingMold() {
        System.out.println("Stap 5: Vet de springvorm in en bestrooi deze met bloem");
    }

    public void putDoughInBakingMold() {
        System.out.println("Stap 6: Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void prepareTop() {
        System.out.println("Stap 7: Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void makeTopFinished() {
        System.out.println("Stap 8: Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void putApplePieInOven() {
        System.out.println("Stap 9: Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printAllSteps() {
        printIngredients();
        preHeatOven();
        clutchEgg();
        prepareIngredients();
        cutPotatoes();
        prepareBakingMold();
        putDoughInBakingMold();
        prepareTop();
        makeTopFinished();
        putApplePieInOven();
    }




}
