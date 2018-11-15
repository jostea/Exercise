import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
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

    public void setName(String name) {
        this.name = name;
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

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }


    @Override
    public String toString() {
        return "Name " + getName() + "\nEmail " + getEmail() +
                "\nRoles " + getRoles() + "\nBalance " + getBalance() +
                "\nActive " + getIsActive() +
                "\nRegistration Time: " + getRegistrationDate();


    }
}
