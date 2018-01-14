package javabasic_1;

import entity.People;
import entity.Trader;
import entity.Transaction;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

/**
 * java 流
 */
public class JavaStream {
    private static Trader raoul = new Trader("raoul", "Cambridge");
    private static Trader mario = new Trader("mario", "Milan");
    private static Trader alan = new Trader("alan", "Cambridge");
    private static Trader brian = new Trader("brian", "Cambridge");

    private static List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
    );

    public static void main(String[] args) {

    }

    public static void test() {
        //1. 找出2011年发生的所有交易，交易额排序 （di -> gao)
        transactions.stream()
                .filter(t -> 2011 == t.getYear())
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        //2. 交易员在哪些不同的城市工作过
        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());

        transactions.stream()
                .map(t -> t.getTrader().getCity())
                .collect(Collectors.toSet());
        //3. 查找所有来自剑桥的交易员，并按姓名排序
        transactions.stream()
                .filter(t->t.getTrader().getCity().equals("Cambredge"))
                .map(t->t.getTrader())
                .distinct()
                .sorted(Comparator.comparing(t->t.getName()))
                .collect(Collectors.toList());
        //4. 返回所有交易员的姓名字符串，按字母顺序排序
        transactions.stream()
                .map(t->t.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining());
        //5. 有没有交易员是在米兰工作的
        transactions.stream()
                .anyMatch(t -> t.getTrader().getCity().equals("Milan"));
        //6. 打印生活在剑桥的交易员的所有交易额
        transactions.stream()
                .filter(t->t.getTrader().getCity().equals("Cambridge"))
                .map(t->t.getValue())
                .forEach(System.out::println);
        //7. 所有交易中最高的交易额是多少
        Optional<Integer> maxValue = transactions.stream()
                .map(t->t.getValue())
                .reduce(Integer::max);
        //8. 找到交易额最小的交易
        Optional<Transaction> minValueTran = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        //9. 得到所有交易额的总和
        int sumValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .sum();


    }
}
