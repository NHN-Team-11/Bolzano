package Bolzano.Stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.text.Style;


public class Test {
    public static void main(String[] args) throws IOException {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> list = transactions.stream()
        .filter(s -> (s.getYear() == 2011))
        .sorted(Comparator.comparing((Transaction t) -> t.getValue()))
        .collect(Collectors.toList());

        list.forEach(System.out::println);

        System.out.println();

        List<String> list2 = transactions.stream()
        .map(Transaction::getTrader)
        .map(Trader::getCity)
        .distinct()
        .collect(Collectors.toList());

        list2.forEach(System.out::println);

        System.out.println();

        List<String> list3 = transactions.stream()
        .map(Transaction :: getTrader)
        .filter((s) -> s.getCity().equals("Cambridge"))
        .map(Trader::getName)
        .distinct()
        .sorted()
        .collect(Collectors.toList());

        System.out.println(list3);

        System.out.println();

        String name = transactions.stream()
        .map(s -> s.getTrader().getName())
        .distinct()
        .sorted()
        .reduce("", (x, y) -> x + y + " ");
        System.out.println(name);
    }
}
