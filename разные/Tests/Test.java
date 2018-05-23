package разные.Tests;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {

/*
Появился в Java 9. Всё то же самое, только добавляется ещё один аргумент hasNext:
если он возвращает false, то стрим завершается. Это очень похоже на цикл for:
    for (i = seed; hasNext(i); i = f(i)) {

 */

/*
        Stream.iterate(2, x -> x < 25, x -> x + 6)
                .forEach(System.out::println);
*/


        Map<Boolean, List<String>> map1 = Stream.of(
                "ab", "c", "def", "gh", "ijk", "l", "mnop")
                .collect(Collectors.partitioningBy(s -> s.length() <= 2));
        //map1.entrySet().forEach(System.out::println);

        for (Map.Entry<?,?> entry: map1.entrySet()){
           // System.out.println();
           System.out.println(entry.getKey()+" "+entry.getValue());
       }
        System.out.println(map1.size());
    }
}
