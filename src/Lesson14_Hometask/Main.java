package Lesson14_Hometask;
import java.io.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Zad1_1
        //Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
        //пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
        //все пробелы на знак нижнего подчеркивания.
        //useStream("src\\Lesson14_Hometask\\tms.txt");

        //Zad1_2                    is undone
        //Используя FileReader и FileWriter сначала записать в файл tms2.txt фразу на латыни
        //“Cognosce te ipsum”, а затем считать ее и вывести в консоль первую букву.
        //String str2 = "Cognosce te ipsum";
        //useReader("src\\Lesson14_Hometask\\tms2.txt", str2);

        //Zad1_3
        //Cоздать объект класса Student, сериализовать и десериализовать его.
        //Student student = new Student("Jonny", 120508);
        //serialise("src\\Lesson14_Hometask\\tms3.txt", student);
        //student.getStudent();
        //Student studentRestored = new Student();
        //studentRestored.getStudent();
        //deserialise("src\\Lesson14_Hometask\\tms3.txt");
        //studentRestored.getStudent();

        //Zad2_1
        //В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
        //Проанализировать и записать в другой файл самое длинное слово.
        mostLongWorld("src\\Lesson14_Hometask\\text.txt");

    }

    public static void mostLongWorld(String path) {
        try (FileInputStream fin = new FileInputStream( path )){
            int i;
            String newStr = null;
            while ((i = fin.read()) != -1) {
                String str = String.valueOf((char) i);
                newStr = find(str);

                //System.out.print(newStr);
            }
            writeInStream("src\\Lesson14_Hometask\\text2.txt", newStr);
        } catch (IOException ex) {
            System. out.println(ex.getMessage()) ;
        }
    }

    public static String find(String str) {
        str.replace(",", "");
        str.replace(".", "");
        String[] words = str.split(" ");
        String max = words[0];
        for (String word : words) {
            if (max.length() < word.length()) {
                max = word;
            }
        }
        return max;
    }

    public static void serialise(String path, Student student) {
        //Сериализация в файл с помощью класса ObjectOutputStream
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deserialise(String path) {
        // Десериализация из файла с помощью класса ObjectInputStream
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(path));
            Student student = (Student) objectInputStream.readObject();
            //Person renatRestored = (Person) objectInputStream.readObject();
            student.getStudent();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeReader(String path, String str) {
        try (FileWriter fw = new FileWriter( path )) {
            fw.write( str );
            fw.flush() ;
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }

    public static void useReader(String path, String str) {
        //writeReader(path, str);
        try (FileReader fr = new FileReader( path )) {
            int i;
            while ((i = fr.read()) != -1) {

                String str1 = String.valueOf((char) i);
                //String newStr = String.valueOf(str1.charAt(0));
                System.out.print(str1.charAt(0));

                //System.out.print(( char) i);
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }
    }

    public static void writeInStream(String path, String str) {
        try (FileOutputStream fos = new FileOutputStream( path )) {
            // перевод строки в байты
            byte[] buffer = str.getBytes() ;
            fos.write(buffer , 0, buffer.length);
            System.out.println( "The file has been written" );
        } catch (IOException ex) {
            System. out.println(ex.getMessage()) ;
        }
    }

    public static String takeFromConsole() {
        System.out.println("Give str: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        return str;
        //String text = "Hello world!"; // строка для записи
    }

    public static void useStream(String path) {
        writeInStream(path, takeFromConsole());
        try (FileInputStream fin = new FileInputStream( path )){
            int i;
            while ((i = fin.read()) != -1) {
                String str = String.valueOf((char) i);
                String newStr = str.replace(" ", "_");
                System.out.print(newStr);
            }
        } catch (IOException ex) {
            System. out.println(ex.getMessage()) ;
        }
    }
}
