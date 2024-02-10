package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pencils would you like to use?");
        String numberOfPencils = scanner.nextLine();
        System.out.println("Pencils: " + numberOfPencils);

        System.out.println("Who will be the first?");
        String name = scanner.nextLine();
        System.out.println("First name: " + name);

        String barSymbols = "|";

        int i = 0;
        int StringToInt = Integer.parseInt(numberOfPencils);

        while (i < StringToInt) {

            System.out.print(barSymbols);
            i++;
        }
        System.out.println();
        System.out.println(name);
    }

}
