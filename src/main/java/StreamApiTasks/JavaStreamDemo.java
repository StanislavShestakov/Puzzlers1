package StreamApiTasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamDemo {
    private static final List<String> DATA_1 = Arrays.asList("a1", "a2", "a4", "a3", "a1", "a4");
    private static final List<People> DATA_2 = Arrays.asList( new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN), new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));
    private static final List<Integer> DATA_3 = Arrays.asList(1, 2, 3, 4, 2);
    private static final List<String> DATA_4 = Arrays.asList("a1", "b2", "c4", "d3", "a1", "a4");

    public static void main(String[] args) {
        System.out.println(task1_1());
        System.out.println(task1_2());
        System.out.println(task1_3());
        System.out.println(task1_4());
        System.out.println(task1_5());
        System.out.println(Arrays.toString(task1_6()));

        System.out.println(Arrays.toString(task2_1()));
        System.out.println(task2_2());
        System.out.println(task2_3());

        System.out.println(task3_1());
        System.out.println(task3_2());
        System.out.println(task3_3());
        System.out.println(task3_4());

        System.out.println(Arrays.toString(task4_1()));
        System.out.println(Arrays.toString(task4_2()));
        System.out.println(Arrays.toString(task4_3()));
        System.out.println(Arrays.toString(task4_4()));
        System.out.println(Arrays.toString(task4_5()));
        System.out.println(Arrays.toString(task4_6()));

        System.out.println(task5_1());
        System.out.println(task5_2());
        System.out.println(task5_3());
        System.out.println(task5_4());

        System.out.println(task6_1());
        System.out.println(task6_2());
        System.out.println(task6_3());

        System.out.println(task7_1());
        System.out.println(task7_2());
        System.out.println(task7_3());
        System.out.println(task7_4());

        System.out.println(task8_1());
        System.out.println(task8_2());
        System.out.println(task8_3());
        System.out.println(task8_4());
        System.out.println(task8_5());
        System.out.println(task8_6());
    }

    private static long task1_1(){
        return DATA_1.stream().filter(e -> e.equals("a1")).count();
    }

    private static String task1_2(){
        return DATA_1.stream().findFirst().orElse("0");
    }

    private static String task1_3(){
        return DATA_1.stream().skip(DATA_1.size() -1 ).findFirst().orElse("empty");
    }

    private static String task1_4(){
        return DATA_1.stream().filter(e -> e.equals("a3")).findFirst().get();
    }

    private static String task1_5(){
        return DATA_1.stream().skip(2).findFirst().orElse("0");
    }

    private static String[] task1_6(){
        return DATA_1.stream().skip(1).limit(2).toArray(String[]::new);
    }

    private static People[] task2_1(){
        return DATA_2.stream().filter(e -> e.sex == Sex.MAN && e.age > 18 && e.age < 27).toArray(People[]::new);
    }

    private static double task2_2(){
        return DATA_2.stream().filter(e -> e.sex == Sex.MAN).mapToInt( e -> e.age).average().orElse(0);
    }

    private static long task2_3(){
        return DATA_2.stream().filter(e -> (e.age > 18 && ((e.sex == Sex.MAN && e.age < 60)) || (e.sex == Sex.WOMEN && e.age < 55))).count();
    }

    private static boolean task3_1(){
        return DATA_1.stream().anyMatch(e -> e.equals("a1"));
    }

    private static boolean task3_2(){
        return DATA_1.stream().anyMatch(e -> e.equals("a8"));
    }

    private static boolean task3_3(){
        return DATA_1.stream().allMatch(e -> e.contains("1"));
    }

    private static boolean task3_4(){
        return DATA_1.stream().noneMatch(e -> e.equals("a7"));
    }

    private static String[] task4_1(){
        return DATA_1.stream().sorted().toArray(String[]::new);
    }

    private static String[] task4_2(){
        return DATA_1.stream().sorted(Comparator.reverseOrder()).toArray(String[]::new);
    }

    private static String[] task4_3(){
        return DATA_1.stream().distinct().sorted().toArray(String[]::new);
    }

    private static String[] task4_4(){
        return DATA_1.stream().distinct().sorted(Comparator.reverseOrder()).toArray(String[]::new);
    }

    private static People[] task4_5(){
        return DATA_2.stream().sorted(Comparator.comparing(a -> a.name)).toArray(People[]::new);
    }

    private static People[] task4_6(){
        return DATA_2.stream().sorted(Comparator.comparing((People p) -> p.sex).thenComparing(p -> p.name)).toArray(People[]::new);
    }

    private static String task5_1(){
        return DATA_1.stream().max(String::compareTo).get();
    }

    private static String task5_2(){
        return DATA_1.stream().min(String::compareTo).get();
    }

    private static People task5_3(){
        return DATA_2.stream().max(Comparator.comparingInt(People::getAge)).get();
    }

    private static People task5_4(){
        return DATA_2.stream().min(Comparator.comparingInt(People::getAge)).get();
    }


    private static Integer task6_1(){
        return DATA_3.stream().mapToInt(Integer::intValue).sum();
    }

    private static Integer task6_2(){
        return DATA_3.stream().mapToInt(Integer::intValue).max().orElse(-1);
    }

    private static Integer task6_3(){
        return DATA_3.stream().mapToInt(Integer::intValue).filter(e -> e % 2 != 0).sum();
    }

    private static Integer task7_1(){
        return DATA_3.stream().mapToInt(Integer::intValue).filter(e -> e % 2 != 0).sum();
    }

    private static Double task7_2(){
        return DATA_3.stream().mapToInt(Integer::intValue).map(e -> e -= 1).average().getAsDouble();
    }

    private static String task7_3(){
        return DATA_3.stream().mapToInt(Integer::intValue).map(e -> e += 3).summaryStatistics().toString();
    }

    private static Map<Boolean, List<String>> task7_4(){
        return DATA_3.stream().collect(Collectors.groupingBy((Integer e) -> e % 2 == 0, Collectors.mapping(String::valueOf, Collectors.toList())));
    }

    private static List<String> task8_1(){
        return DATA_4.stream().distinct().collect(Collectors.toList());
    }

    private static List<String> task8_2(){
        return DATA_4.stream().distinct().map(String::toUpperCase).collect(Collectors.toList());
    }

    private static String task8_3(){
        return DATA_4.stream().map(e -> "<b>".concat(e.concat("</b>"))).collect(Collectors.joining(":"));
    }

    private static Map<Character, Character> task8_4(){
        return DATA_4.stream().collect(Collectors.toMap((String e) -> e.charAt(0), (String e) -> e.charAt(1), (a1, a2) -> a1));
    }

    private static Map<Character, List<String>> task8_5(){
        return DATA_4.stream().collect(Collectors.groupingBy((String e) -> e.charAt(0), Collectors.mapping(e -> e, Collectors.toList())));
    }

    private static Map<Character, String> task8_6(){
        return DATA_4.stream().collect(Collectors.groupingBy((String e) -> e.charAt(0), Collectors.mapping((String e) -> String.valueOf(e.charAt(1)), Collectors.joining(":"))));
    }



    private static class People {
        String name;
        int age;

        Sex sex;

        People(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        String getName() {
            return name;
        }

        int getAge() {
            return age;
        }

        Sex getSex() {
            return sex;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }

    private enum Sex{
        MAN, WOMEN
    }
}
