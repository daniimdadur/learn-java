package bootcam.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Dani";
        first = first + " " + "Imdadur";
        System.out.println(first);

        String second = "Dani Imdadur";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));

        String third = "Dani Imdadur";
        System.out.println(third);

        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
