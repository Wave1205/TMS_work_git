package Lesson4_Hometask;
//2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.
//2.2 вывести в консоль второй и четвертый.
//2.3 вывести в консоль длину массива.
//2.4 третий фрукт заменить на иной.
//2.5 проверить результат в консоли.
public class Zad1_2 {
    public static void main(String[] args) {
        //String[] fruits = new String[]{"banana","apple","orange","peach"};
        String[] fruits = {"banana","apple","orange","peach"};
        //fruits[0] = "banana";
        //fruits[1] = "apple";
        //fruits[2] = "orange";
        //fruits[3] = "peach";
        for (String fruit : fruits){
            System.out.println("Current fruit is: " + fruit);
        }
        int size = fruits.length;
        System.out.println("The second and forth ones: " + fruits[1] + " and " + fruits[3]);
        System.out.println("The lenght of massiv: " + size);
        fruits[2] = "melon";
        System.out.println("The new third fruit: " + fruits[2]);

    }
}
