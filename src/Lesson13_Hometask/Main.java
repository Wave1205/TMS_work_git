package Lesson13_Hometask;

public class Main {

    //1.1 Написать код, который выбросит ArrayIndexOutOfBoundException. Обработать
    //используя try-catch конструкцию.
    public static void oneCatch() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[2]); // Попытка доступа к элементу с индексом 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс массива выходит за пределы. " + e.getMessage());
        }
    }

    //1.2 Добавить обработку арифметического исключения к предыдущему блоку try-catch
    //используя множественные операторы.
    public static void someCatch() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[2]); // Попытка доступа к элементу с индексом 3
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Обработка арифметических ошибок
            System.out.println("Error: define on zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: index array come across the borders. " + e.getMessage());
        }
    }

    //1.3 Преобразовать множественные try-catch в мульти обработчик.
    public static void multiCatch() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[2]); // Попытка доступа к элементу с индексом 3
            int result = 10 / 1;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            // Этот блок catch будет выполнен для любого из указанных исключений
            System.out.println("Error: " + e.getMessage());
        }
    }

    //2
    //Создать собственное исключение которое будет выбрасываться в классе Person при
    //создании объекта, если ему меньше 18 лет. Попробовать создать объект Person до и
    //после 18 лет в методе main.
    public static void personException() {
        try {
            Person person1 = new Person("Steve", 19);
            Person person2 = new Person("Sveta", 17);
        } catch (PersonAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    //3
    //Создать класс с как минимум 4 разными методами, в каждом методе добавить проверку
    //на исключительные ситуации, используя:
    //Продемонстрировать обработку исключительных ситуаций на примерах.
    //3.1 try-catch
    public static void catCatch() {
        try {
            Cat cat1 = new Cat("Milly", 4);
            Cat cat2 = new Cat("Sand", 21);
        } catch (CatAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    //3.2 try-catch, где catch будет несколько
    public static void catSomeCatch() {
        try {
            Cat cat1 = new Cat("Milly", 4);
            cat1.eat("Meat");
            cat1.eat("Lolly Pop");
        } catch (CatAgeException e) {
            System.out.println(e.getMessage());
        } catch (CatFoodException e) {
            System.out.println(e.getMessage());
        }
    }

    //3.3 try-catch, с использованием multi-catch
    public static void catMultiCatch() {
        try {
            Cat cat1 = new Cat("Milly", 4);
            cat1.eat("Meat");
            cat1.molting(true);
            cat1.molting(false);
        } catch (CatAgeException | CatFoodException | CatMoultException e) {
            System.out.println(e.getMessage());
        }
    }

    //3.4 try-catch-finally
    public static void catFinally() {
        try {
            Cat cat1 = new Cat("Milly", 4);
            cat1.eat("Meat");
            cat1.molting(true);
            System.out.println(cat1.catAges());
        } catch (CatAgeException | CatFoodException | CatMoultException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cat is complete");
        }
    }

    //Zad2_1
    //Создать класс, в котором будет статический метод. Этот метод принимает на вход три
    //параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
    //login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
    //соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
    //password должна быть меньше 20 символов, не должен содержать пробелом и должен
    //содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
    //Если password не соответствует этим требованиям, необходимо выбросить
    //WrongPasswordException. WrongPasswordException и WrongLoginException -
    //пользовательские классы исключения с двумя конструкторами – один по умолчанию,
    //второй принимает сообщение исключения и передает его в конструктор класса Exception.
    //Метод возвращает true, если значения верны, false в противном случае.

    public static boolean authentication(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        if (login.length() > 20  || login.contains(" ")) {
            throw new WrongLoginException(false + " Check login for the quantity of symbols and presentse of spaces");
        } else {
            if (password.length() > 20 || password.contains(" ") || password.matches("^\\D*$")) {
                throw new WrongPasswordException(false + " Check password for the quantity of symbols and presentse of spaces");
            } else {
                if (confirmPassword.length() > 20  || confirmPassword.contains(" ") || confirmPassword.matches("^\\D*$") || password != confirmPassword) {
                    throw new WrongPasswordException(false + " Check confirmPassword for the quantity of symbols and presentse of spaces and for equality of password");
                } else {
                    return true;
                }
            }
        }
    }

    public static void authenticationException() {
        //Zad2_star
        //Написать try/catch/finally, в котором finally вызван не будет.
        try {
            //System.out.println(authentication("jkkdjho jpo", "jkkdj1pd", "jkkdj1pd"));
            if (authentication("jkkdjhojpo", "jkkdj1pd", "jkkdj1pd") == true) System.exit(0);     //Not working or maybe does

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("cake");
        }
    }

    public static void main(String[] args) {

        //Zad1_1.1
        oneCatch();
        //Zad1_1.2
        someCatch();
        //Zad1_1.3
        multiCatch();
        //Zad1_2
        personException();
        //Zad1_3.1
        catCatch();
        //Zad1_3.2
        catSomeCatch();
        //Zad1_3.3
        catMultiCatch();
        //Zad1_3.4
        catFinally();

        //Zad2_1
        authenticationException();
    }
}