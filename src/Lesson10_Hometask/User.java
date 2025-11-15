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
        return "\tId: \t" + this.id +
                "\n\temail: \t" + this.email +
                "\n\trole: \t" + this.role +
                "\n\tstatus: " + this.status;
    }

    @Override
    public int hashCode() {
        int hash = id + email.hashCode() + role.hashCode() + status.hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        boolean emailEquals = (this.email == null && other.email == null) ||
                (this.email != null && this.email.equals(other.email));
        boolean roleEquals = (this.role == null && other.role == null) ||
                (this.role != null && this.role.equals(other.role));
        boolean statusEquals = (this.status == null && other.status == null) ||
                (this.status != null && this.status.equals(other.status));
        return this.id == other.id && emailEquals && roleEquals && statusEquals;
    }
}
