package Lesson17_Hometask;

import java.util.*;
import java.time.LocalDate;

import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

import java.util.stream.Stream;
import java.util.stream.Collectors;

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main{

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate date = LocalDate.of(2025, 12, 11);
        //1_1
        System.out.println(today.getDayOfWeek());
        System.out.println(date.getDayOfWeek());
        //1_2
        LocalDate dateNextTuesday = date.with(nextOrSame(TUESDAY));
        System.out.println(dateNextTuesday);
        //1_3
        String triangle = "triangle";
        String square = "square";
        String figure = square;
        if (figure == "triangle") {
            execute( (x, y) -> System.out.println("Shape square: " + 0.5 * x * y) );
        } else if (figure == "square") {
            execute( (x, y) -> System.out.println("Shape square: " + x * y) );
        } else {System.out.println("There are no such figure!");}
        //1_4
        Operationable op;
        int a = 3, b = 3;
        if (a > b) {
            op = (x, y) -> x;
        } else if (a < b) {
            op = (x, y) -> y;
        } else {op = (x, y) -> 0;}
        int result = op.execute(a, b);
        System.out.println(result);
        //2_1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Year of birth: ");
        int inputYear = scanner.nextInt();
        System.out.println("Month of birth: ");
        int inputMonth = scanner.nextInt();
        System.out.println("Day of birth: ");
        int inputDay = scanner.nextInt();
        LocalDate birthDay = LocalDate.of(inputYear, inputMonth, inputDay);
        LocalDate futureDate = birthDay.plusYears(100);
        System.out.println(futureDate);
        //2_2
        int[] numbers = new int[]{1, -2, 3, 4, -5, 6};
        //List<Integer> numbers = Arrays.asList(1, -2, 3, 4, -5, 6);
        Predicate<Integer> startsWithHello = s -> s > 0;
        //System.out.println(startsWithHello.test(numbers));
        for (int number : numbers) {
          if (startsWithHello.test(number)) {
            System.out.print(number + " ");
          }
        }
        /*List<Integer> numbers = Arrays.asList(1, -2, 3, 4, -5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n > 0) // Условие: остаток от деления на 2 равен 0
                                           .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(evenNumbers);*/
        //2_3
        //"19 BYN"
        String input = scanner.nextLine();
        Function<String, Double> convert = x-> Double.valueOf(x.replace(" BYN", "")) * 0.34;
        System.out.println(convert.apply(input) + " долларов"); // 5 долларов
        //2_4
        Consumer<String> printer = x-> System.out.printf("%s долларов \n", Double.valueOf(x.replace(" BYN", "")) * 0.34);
        printer.accept(input); // 600 долларов
        //2_5
        StringBuilder str = new StringBuilder(input);
        Supplier<String> value = ()-> str.reverse().toString();
        System.out.println(value.get());
    }

    public static void execute(IShape shape) {
        shape.getSquare(5, 4);
    }

}