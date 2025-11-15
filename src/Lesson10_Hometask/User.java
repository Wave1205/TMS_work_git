package Lesson10_Hometask;

public class User {
    int id;
    String email;
    String role;
    String status;

    public User(int id, String email, String role, String status) {
        this.id = id;
        this.email = email;
        this.role = role;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Id: " + this.id +
                "\nemail: " + this.email +
                "\nrole: " + this.role +
                "\nstatus: " + this.status;
    }

    @Override
    public int hashCode() {
        int hash = id + email.hashCode() + role.hashCode() + status.hashCode();
        return hash;
    }

    /*@Override
    public boolean equals() {
        boolean res = true;
        return res;
    }*/
}
