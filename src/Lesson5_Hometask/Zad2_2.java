package Lesson5_Hometask;

public class Zad2_2 {
    public static void main(String[] args) {
        calculating();
    }

    public static void calculating(){
        String[][] chess = new String[8][8];
        for (int i = 0; i <= chess.length-1; i++) {
            for (int j = 0; j <= chess[i].length-1; j++) {
                if ((i + j) % 2 == 0) {
                    chess[i][j] = "W";
                } else {chess[i][j] = "B";}
            }
        }
        for (int i = 0; i <= chess.length-1; i++) {
            for (int j = 0; j <= chess[i].length-1; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }
}
