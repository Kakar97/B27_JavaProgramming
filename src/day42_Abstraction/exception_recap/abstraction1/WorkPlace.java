package day42_Abstraction.exception_recap.abstraction1;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {


        Tester Rameen = new Tester("Rmeen", 20,"SdET",100_000);
        System.out.println(Rameen);
        Rameen.sleep(8);
        Rameen.work();


        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(Rameen);
        testers.addAll(Arrays.asList(
                new Tester("Bato", 30, "SDET", 150000),
                new Tester("Jonathan", 40, "Senior SDET", 200000),
                new Tester("Isa", 30, "SDET", 180000),
                new Tester("Nasiba", 25,  "SDET", 120_000),
                new Tester("Nargiz", 27, "Qa engineer ", 120000)
        ));

        System.out.println();

        for(Tester each : testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }
    }
}
