public class HeroApplication {

    public static void main(String[] args) {

        // Variable initialization
        String heroName;
        String heroCity;

        String heroPower1, heroPower2, heroPower3;

        boolean isEvil;

        double heroSalary;
        String realName;

        String universe;

        // Variable assignment
        heroName = "AliexpressMan";
        heroCity = "Dobele";
        heroPower1 = "Super discounts";
        heroPower2 = "Fast delivery";
        heroPower3 = "";
        isEvil = false;
        heroSalary = 99.99;
        realName = "Artjoms";
        universe = "Ours";

        // Print out Hero information card
        System.out.println("***************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("***************************");

        System.out.println("Hero name: " + heroName);
        System.out.println("This hero lives in  " + heroCity);

        System.out.println("----------------------------");
        System.out.println("Hero Superpowers:");
        System.out.println("---" + heroPower1);
        System.out.println("---" + heroPower2);
        System.out.println("---" + heroPower3);

        System.out.println("This super hero is evil? " + isEvil);

        System.out.println("This hero earns: " + heroSalary + " EUR");
        System.out.println( realName + " hides his identity.");
        System.out.println("Hero lives in " + universe + " Universe");
        System.out.println();
        System.out.println("***************************");
        System.out.println("*** HERO INFORMATION ***");
        System.out.println("***************************");





        // If a hero is a villain or a hero
        if(isEvil) {
            System.out.println( " Hero is a villain. he is stealing cookies!!!");
        } else {
            System.out.println("hero protects the city!");
        }


        heroCity = "Metropolis";

        switch (heroCity) {
            case "New York":
                heroSalary = 2000;
                break;
            case "Riga":
                heroSalary = 1200.91;
                break;
            case "Metropolis":
                heroSalary = 1000000;
                break;
            default:
                heroSalary = 100;
        }

        System.out.println("Hero's new salary: " + heroSalary);
        // How many cookies can superhero purchase for his /her salary
        // 1 cookie costs = 1.29 euro
        System.out.println("**********************************");
        System.out.println("********** Financials ***************");
        int numOfCookies = (int)Math.floor(heroSalary / 1.29);
        System.out.println(" Hero can purchase " + numOfCookies + " cookies");
        double averageDailySalary = Math.round( (heroSalary / 30 * 100)  ) / 100;
        System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");



        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
    }
}
