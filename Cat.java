package EX_OOP.ex_3_catBorn;

import java.util.Scanner;

public class Cat {
    static String name = "";
    static int counterCatBorn = 0;

    public static int getCounterCatBorn() {
        if (!(name.isEmpty())) {
            ++counterCatBorn;
        }
        return counterCatBorn;
    }
}
