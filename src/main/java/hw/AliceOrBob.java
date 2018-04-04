package hw;

import java.util.Scanner;

public class AliceOrBob {
    public static void main(String[] args) {
        String[] names = new String[]{"Alice", "Bob"};
        boolean name_found = false;
        String name_entered;
        Scanner sc;

        System.out.println("Enter a name");
        sc = new Scanner(System.in);
        name_entered = sc.nextLine();

        search_name:
        while (!name_found) {
            for (int i = 0; i < names.length; i++) {
                if (names[i].equalsIgnoreCase(name_entered)) {
                    name_found = true;
                    break search_name;
                }
            }

            System.out.println("wrong name, try again");
            sc = new Scanner(System.in);
            name_entered = sc.nextLine();
        }

        System.out.println("Welcome " + name_entered);
    }
}
