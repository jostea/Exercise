package servicePackage;

import java.time.LocalDate;
import java.util.Objects;

public class User {

    private String name;
    private boolean isActive;
    private String roles;
    private String email;
    private double balance;
    private LocalDate registrationDate;


    public User(String name, boolean isActive, String roles,
                String email, double balance, LocalDate registrationDate) {
        this.name = name;
        this.isActive = isActive;
        this.roles = roles;
        this.email = email;
        this.balance = balance;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return isActive == user.isActive &&
                Double.compare(user.balance, balance) == 0 &&
                Objects.equals(name, user.name) &&
                Objects.equals(roles, user.roles) &&
                Objects.equals(email, user.email) &&
                Objects.equals(registrationDate, user.registrationDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, isActive, roles, email, balance, registrationDate);
    }

    public boolean getIsActive() {
        return isActive;
    }


    public String getRoles() {
        return roles;
    }


    public String getEmail() {
        return email;
    }


    public double getBalance() {
        return balance;
    }


    public LocalDate getRegistrationDate() {
        return registrationDate;
    }


    @Override
    public String toString() {
        return "Name " + getName() + "\nEmail " + getEmail() +
                "\nRoles " + getRoles() + "\nBalance " + getBalance() +
                "\nActive " + getIsActive() +
                "\nRegistration Time: " + getRegistrationDate();


    }
}
