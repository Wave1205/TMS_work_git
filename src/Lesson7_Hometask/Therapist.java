package Lesson7_Hometask;

public class Therapist extends Doctor {

    public void heal(){
        System.out.println("Therapizing ...");
    }

    public String appointment(int code) {
    switch(code) {
            case 1 :
                Doctor doctor1 = new Surgeon();
                doctor1.heal();
                return "Surgeon";
            case 2 :
                Doctor doctor2 = new Dentist();
                doctor2.heal();
                return "Dentist";
            default :
                Doctor doctor = new Therapist();
                doctor.heal();
                return "Therapist";
        }
    }

}