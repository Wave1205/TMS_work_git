package Lesson4_Hometask;


    //still undone!!!

    //Найти минимальный-максимальный элементы и вывести в консоль.
public class Zad2_2 {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //int masLength = scanner.nextInt();
        //double[] masDouble = new double[masLength];
    /*for (int i = 0; i <= masLength-1; i++){                 //Should be removed!!!
      masDouble[i] = Math.random();
    }*/
        //int masLength = 4;
        int[] masDouble = new int[] {11,45,32,12};
        System.out.println("Direct order of masDouble values: ");
        for (int i = 0; i <= masDouble.length-1; i++){
            System.out.print(masDouble[i] + "  ");
        }
        System.out.println();
        System.out.println();
    /*for (int i = 0; i <= masLength-2; i++) {
      for (int j = 1; j <= masLength-1; j++) {
        if (masDouble[j] > masDouble[i]) {
          double t = masDouble[i];
          masDouble[i] = masDouble[j];
          masDouble[j] = t;
        }
      }
    }*/ //Don't what the ***** is going
        int max = masDouble[0];
        int min = masDouble[0];
        for (int i = 1; i <= masDouble.length-1; i++){
            if (masDouble[i] >= max){
                max = masDouble[i];
            }
            if (masDouble[i] <= min){
                min = masDouble[i];
            }
        }

        System.out.println();
        System.out.println();


        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
