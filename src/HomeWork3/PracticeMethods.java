package HomeWork3;

public class PracticeMethods {
    public static String model = "ZenBookPro";
    static int year;
    String name = "Asus";
    int ram = 16;
    public PracticeMethods() {

    }
    public PracticeMethods(int year) {
        this.year = year;

    }

    public static void printmodel() {
        System.out.println(model);
    }

    public static String getmodel() {
        return model;

    }

    public void testmethods() {
        System.out.println("something");
    }

    public void printyear() {
        System.out.println(year);


    }


}


