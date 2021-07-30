import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HeroApplication {

    // Function to add x in arr
    public static String[] addX(String heroArray[], String newHeroName) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Add the new element
        arrlist.add(newHeroName);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);

        // return the array
        return heroArray;
    }

    // Function to remove a hero from an array
    public static String[] removeX(String heroArray[], int heroIndexToDelete) {
        // create a new ArrayList
        List<String> arrlist
                = new ArrayList<String>(
                Arrays.asList(heroArray));

        // Find and remove a String from an array
        arrlist.remove(heroIndexToDelete);

        // Convert the Arraylist to array
        heroArray = arrlist.toArray(heroArray);
        heroArray = Arrays.copyOf(heroArray, heroArray.length - 1);
        // return the array
        return heroArray;
    }

    public static void main(String[] args) {


        // VARIABLES
        String[] heroList = {"AliExpressMan", "DogoMom", "Oh Lora", "Garbage man", "ProblemSolver", "Blossom", "Bubble", "FlowerGirl", "SuperSnowflake", "MuffinGirl", "STAR"};
        double[] heroSalaries = { 1000.00d,  1111d};
        String[] heroCities = {};

        // MENU
        int menuEntry;
        Scanner scanner = new Scanner(System.in);

        // BUSINESS REQUIREMENTS FOR LESSON #12
        // 1. I would like to see a MENU to select different parts of superhero information card
        // 2. A list of superheroes
        // 3. Add new superhero
        // 4. show specific superhero information
        // 5. Delete the superhero from the list
        // 0. Exit
        do {
            // EXIT == 0
            System.out.println("Welcome!");
            System.out.println("Please select what to do:");
            System.out.println("1 - Show a list of superheroes");
            System.out.println("2 - Add a new superhero");
            System.out.println("3 - Show specific superhero information");
            System.out.println("4 - Delete the superhero");
            System.out.println("0 - Exit");
            menuEntry = scanner.nextInt();

            switch (menuEntry) {
                case 1:

                    System.out.println("======== SUPERHERO LIST +++++++++");
                    for (String heroName : heroList
                    ) {
                        System.out.println(heroName);
                    }
                    System.out.println();

                    break;
                case 2:
                    System.out.println("Enter hero's name");
                    String newHeroName = scanner.next();
                    heroList = addX(heroList, newHeroName);
                    break;
                case 3:

                    // Show different information, based on selected superhero!
                    System.out.println("Which superhero info to print?");
                    int superheroIndex = scanner.nextInt();
//                    String superHeroName = scanner.next();

                    System.out.println("Hero name: " + heroList[superheroIndex]);

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
                    System.out.println(realName + " hides his identity.");
                    System.out.println("Hero lives in " + universe + " Universe");
                    System.out.println();
                    System.out.println("***************************");
                    System.out.println("*** HERO INFORMATION ***");
                    System.out.println("***************************");


                    // If a hero is a villain or a hero
                    if (isEvil) {
                        System.out.println(" Hero is a villain. he is stealing cookies!!!");
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
                    int numOfCookies = (int) Math.floor(heroSalary / 1.29);
                    System.out.println(" Hero can purchase " + numOfCookies + " cookies");
                    double averageDailySalary = Math.round((heroSalary / 30 * 100)) / 100;
                    System.out.println(" Hero average daily salary is " + averageDailySalary + " euro");
                    break;
                case 4:
                    System.out.println("please enter hero index to be removed");
                    int heroToRemove = scanner.nextInt();

                    heroList = removeX(heroList, heroToRemove);
                    break;
                default:
                    System.out.println("menu item does not exist");
            }

        } while (menuEntry != 0);


    }
}
