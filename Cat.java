package EX_OOP.ex_3_catBorn;

import java.util.Scanner;

public class Cat {
    static int counterCatBorn = 0;

    public static int getCounterCatBorn() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (!(name.isEmpty())) {
            ++counterCatBorn;
        }
        return counterCatBorn;
    }
}
