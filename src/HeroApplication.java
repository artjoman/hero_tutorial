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
    }
}
