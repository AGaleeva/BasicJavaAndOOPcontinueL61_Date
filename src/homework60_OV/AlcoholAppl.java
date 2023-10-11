package homework60_OV;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AlcoholAppl {
    public static void main(String[] args) {

        List<Alcohol> alcohols = List.of(
                new Alcohol("Radler", 2.5, 3.5),
                new Alcohol("Cognac", 40, 40),
                new Alcohol("Black label", 40, 15),
                new Alcohol("Red wine", 12.5, 10),
                new Alcohol("Martini bianco", 12, 12),
                new Alcohol("Vodke", 40, 30),
                new Alcohol("Vodka", 40, 30)
        );

//        1. Получите LinkedList из топ 3 самых дорогих товаров.

        LinkedList<Alcohol> topThree = alcohols.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .distinct()
                .limit(3)
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(topThree);

        System.out.println("-----------------------------------------");

//        Задание 2. Получите самый дешевый товар.

        Alcohol cheapest = alcohols.stream()
                .sorted()
                .findFirst()
//                .orElseThrow(NoSuchFieldError::new);
                .orElseGet(() -> null);
        System.out.println(cheapest);
        /*if (cheapest != null) {
            cheapest.getTitle();
        }*/

        // Version2
//        Optional<Alcohol> cheapest2 = alcohols.stream()
//                .min((a, b) -> Double.compare(a.getPrice(), b.getPrice()));
//        System.out.println(cheapest2);

        System.out.println("--------------------------------------------------------------");

//        Задание 3. Создайте Set из исходного листа.
        Set<Alcohol> alcoholSet = alcohols.stream()
                .collect(Collectors.toSet());

        System.out.println("--------------------------------------------------------------");

//        Задание 4. Создайте Map из исходного листа, в котором ключами будут - названия товаров, а значениями будут цены.

        Map<String, Double> priceByTitle = alcohols.stream()
                .collect(Collectors
                        .toMap(
                                Alcohol::getTitle,
                                Alcohol::getPrice,
                                (a, b) -> a));

        System.out.println(priceByTitle);

    }
}
