package Lesson16_Hometask;

import java.util.*;

public class Main {

    public static String entryStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    //2_2
    public static Map<String, String> pairs(String[] array) {
        Map<String, String> wordPairs = new HashMap<>();
        for (String element : array) {
            String start = String.valueOf(element.charAt(0));
            String finish = String.valueOf(element.charAt(element.length()-1));
            wordPairs.put(start, finish);
        }
        return wordPairs;
    }

    //2_1
    public static Map<String, Boolean> worldMultiple(String[] array) {
        Map<String, Boolean> words = new HashMap<>();
        for (String element : array) {
            words.put(element, false);
        }
        words.forEach((key, value) -> {
            int kol = 0;
            for (int j = 0; j < array.length; j++) {
                if (key.equals(array[j])) {
                    kol++;
                }
            }
            if (kol >= 2) {words.replace(key, true);}
        });
        return words;
    }


    public static void main(String[] args) {

        //2_2
        //На вход поступает массив непустых строк, создайте и верните Map<String,
        //String> следующим образом: для каждой строки добавьте ее первый символ в
        //качестве ключа с последним символом в качестве значения. Пример:
        //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
        //pairs(["man", "moon", "main"]) → {"m": "n"}
        //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        /*String[] array1 = new String[]{"flower", "bear", "acid", "map", "moap"};
        String[] array2 = new String[]{"code", "bug"};
        String[] array3 = new String[]{"man", "moon", "main"};
        String[] array4 = new String[]{"man", "moon", "good", "night"};

        System.out.println(pairs(array1));
        System.out.println(pairs(array2));
        System.out.println(pairs(array3));
        System.out.println(pairs(array4));*/


        //2_1
        //На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
        //строка является ключом, и ее значение равно true, если эта строка встречается в массиве
        //2 или более раз. Пример:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        //worldMultiple(["e", "d", "e", "f", "f"])
        //Map<> words = new Map<String, Boolean>();
        String[] array1 = new String[]{"e", "d", "e", "f", "f"};
        String[] array2 = new String[]{"c", "b", "a"};
        String[] array3 = new String[]{"c", "c", "c", "c"};
        String[] array4 = new String[]{"a", "b", "a", "c", "b"};

        System.out.println(worldMultiple(array1));
        System.out.println(worldMultiple(array2));
        System.out.println(worldMultiple(array3));
        System.out.println(worldMultiple(array4));


        //1_2
        //Пользователь вводит строку с клавиатуры. Для каждого слова подсчитать частоту его
        //встречаемости. Слова, отличающиеся регистром букв считать разными. Использовать
        //класс HashMap. После выполнения результат вывести в консоль.
        //Cat dog frog cat Rabbit Dog tiger dog cat dog
        /*HashMap<String, Integer> wordsMap = new HashMap<>();
        String[] words = entryStr().split(" ");
        for (String word : words) {
          wordsMap.put(word, 0);
        }
        System.out.println(wordsMap);

        for (int i = 0; i < words.length; i++) {
          int kol = 0;
          for (int j = 0; j < words.length; j++) {
            if (words[i].equals(words[j])) {
              kol++;
            }
          }
          System.out.println(words[i] + " " + kol);
        }

        wordsMap.forEach((key, value) -> {
          int kol = 0;
          for (int j = 0; j < words.length; j++) {
            if (key.equals(words[j])) {
              kol++;
              wordsMap.replace(words[j], kol);
            }
          }
        });
        System.out.println(wordsMap);
        wordsMap.clear();*/

        //1
        //1.1 Создать список: номер карты и количество денег на карте, используя HashMap.
        HashMap<Integer, Double> creditCard = new HashMap<>();
        //1.2 Добавить к этому списку 3 записи.
        creditCard.put(123456, 6758.45);
        creditCard.put(567894, 746.37);
        creditCard.put(987654, 734992.89);
        System.out.println(creditCard);
        //1.3 Удалить 2 записи.
        creditCard.remove(123456);
        System.out.println(creditCard);
        //1.4 Вывести запись по ключу.
        System.out.println(creditCard.get(567894));
        //1.5 Вывести список всех ключей.
        System.out.println(creditCard.keySet());
        //1.6 Вывести список всех сумм на картах.
        System.out.println(creditCard.values());
        //1.7 Проверить, содержится ли любой элемент в коллекции.
        System.out.println(creditCard.containsKey(567894));
        System.out.println(creditCard.containsValue(746.37));
    }
}