package Lesson6_Hometask;

public class ATM {

    int quantityOf20;
    int quantityOf50;
    int quantityOf100;

    //Конструктор принимающий три параметра
    public ATM(int quantityOf20, int quantityOf50, int quantityOf100) {
        this.quantityOf20 = quantityOf20;
        this.quantityOf50 = quantityOf50;
        this.quantityOf100 = quantityOf100;
    }

    //double currentAmountValue = quantityOf20*20 + quantityOf50*50 + quantityOf100*100;

    public void getCurrentAmount() {

        System.out.println("Quantity of 100: " + quantityOf100);
        System.out.println("Quantity of 50: " + quantityOf50);
        System.out.println("Quantity of 20: " + quantityOf20);
    }

    //Функция(method) принимающая сумму и считывающая успешная ли операция
    public void takeMoney(int amount) {
        int qOf100;
        int qOf50;
        int qOf20;
        if (amount == 10 || amount == 30) {
            System.out.println("Can't take less then 40!");
            return;
        } else {
            qOf100 = amount / 100;
            if (((amount % 100) % 50) % 20 > 0) {
                qOf50 = 0;
                qOf20 = (amount % 100) / 20;
            } else {
                qOf50 = (amount % 100) / 50;
                qOf20 = ((amount % 100) % 50) / 20;
            }
        }
        if (this.quantityOf20 < qOf20 ||
                this.quantityOf50 < qOf50 ||
                this.quantityOf100 < qOf100) {
            System.out.println("ATM don't have that amount of money");
        } else {
            this.quantityOf20 -= qOf20;
            this.quantityOf50 -= qOf50;
            this.quantityOf100 -= qOf100;
            System.out.println("Succes!");
            System.out.println("\tCheck:" +
                    "\nYou took: " + amount + " money, in\n" +
                    "20 bill: \t" + this.quantityOf20 +
                    "\n50 bill: \t" + this.quantityOf50 +
                    "\n100 bill: \t" + this.quantityOf100
            );
        }
    }

    public void addMoney(int amount) {
        int qOf100;
        int qOf50;
        int qOf20;
        if (amount == 10 || amount == 30) {
            System.out.println("Can't take less then 40!");
            return;
        } else {
            qOf100 = amount / 100;
            if (((amount % 100) % 50) % 20 > 0) {
                qOf50 = 0;
                qOf20 = (amount % 100) / 20;
            } else {
                qOf50 = (amount % 100) / 50;
                qOf20 = ((amount % 100) % 50) / 20;
            }
        }
        this.quantityOf20 += qOf20;
        this.quantityOf50 += qOf50;
        this.quantityOf100 += qOf100;
    }

}