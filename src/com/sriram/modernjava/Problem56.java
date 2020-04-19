package com.sriram.modernjava;

import java.util.List;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Problem56 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions =
                Arrays.asList(new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000),
                        new Transaction(raoul, 2011, 400), new Transaction(mario, 2012, 710),
                        new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

        // Find all transactions in the year 2011 and sort them by value (small to high).
        System.out.println("Find all transactions in the year 2011");
        List<Transaction> tr2011 =
                transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                        .sorted(comparing(Transaction::getValue)).collect(toList());
        printTransactions(tr2011);
        System.out.println("**********************");

        // What are all the unique cities where the traders work?
        System.out.println("Unique cities where the traders work");
        List<String> traderCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity()).distinct().collect(toList());
        printTransactions(traderCities);
        System.out.println("**********************");

        // Find all traders from Cambridge and sort them by name.
        System.out.println("All traders from Cambridge");
        List<String> tradersFromCambridge = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getTrader().getName()).distinct().sorted()
                .collect(toList());
        printTransactions(tradersFromCambridge);
        System.out.println("**********************");

        // Return a string of all traders’ names sorted alphabetically.
        String traderNames = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getName).distinct().sorted().reduce("", (a1, a2) -> a1 + ", " + a2);
                System.out.println("All traders names - " + traderNames);
        System.out.println("**********************");

        // Are any traders based in Milan?
        boolean anyTraderFromMilan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("Any Trader Based in Milan? " + anyTraderFromMilan);
        System.out.println("**********************");

        // Print the values of all transactions from the traders living in Cambridge.
        System.out.println("All transactions from the traders living in Cambridge.");
        List<Integer> transactionFromCambridgeTraders = transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(transaction -> transaction.getValue()).collect(toList());
        printTransactions(transactionFromCambridgeTraders);
        System.out.println("**********************");

        // What’s the highest value of all the transactions?
        System.out.println("Highest value of all transactions - "
                + transactions.stream().map(Transaction::getValue).reduce(Integer::max).get());
        System.out.println("**********************");

        // Find the transaction with the smallest value.
        System.out.println("Smallest value of all transactions - "
                + transactions.stream().map(Transaction::getValue).reduce(Integer::min).get());
        System.out.println("**********************");
    }

    private static void printTransactions(List<?> transactions) {
        transactions.stream().forEach(System.out::println);
    }
}
