package servicePackage;

import servicePackage.packageWithClassAndMethods.*;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UserService {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Jostea", true, "DevOps",
                "jostea@gmail.com", 9000, LocalDate.of(2018, 2, 19)));
        userList.add(new User("Kuzea", true, "Admin",
                "Kuzea@gmail.com", 100000, LocalDate.of(2018, 5, 9)));
        userList.add(new User("Jora", true, "Developer",
                "Jora@gmail.com", 2000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Jora", true, "Developer",
                "Jora@gmail.com", 2000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Valera", false, "Software engineer",
                "Valera1@gmail.com", 2000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Smith", false, "AM",
                "Smith@gmail.com", 2000, LocalDate.of(1999, 2, 1)));
        userList.add(new User("Jerry", true, "AM",
                "Smith@gmail.com", 3000, LocalDate.of(2001, 1, 9)));


        SortList.sortedList(userList).forEach(user -> System.out.println(user + "\n"));
//
        double min = userList.stream().min(Comparator.comparing(User::getBalance)).get().getBalance();

        double max = userList.stream().max(Comparator.comparing(User::getBalance)).get().getBalance();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


        System.out.println("Active accounts: ");
        ActiveUsers.isActive(userList).forEach(user -> System.out.println(user + "\n"));

        System.out.println("Locked accounts: ");
        NotActive.isNotActive(userList).forEach(user -> System.out.println(user + "\n"));

        long num = userList.stream().filter(user -> !user.getIsActive()).count();

        System.out.println("Locked accounts: " + num);

        System.out.println();
        Emails.email(userList).forEach(user ->
                System.out.println("Email: " + user));


        GroupingByLocalDate.groupingByLocalDate(userList)
                .forEach((key, value) -> System.out.println("\n" + "Key : " + key + " Value : " + value));


        GroupByRoles.groupingByUser(userList).forEach((key, value) -> System.out.println("Key: " + key +
                " \nValue:\n " + value + "\n"));


        SetUsers.toSet(userList).forEach(user -> System.out.println(user + "\n"));

//      Set<User> targetSet2 = new HashSet<>(userList);

        System.out.println(userList.stream().filter(user -> user.getBalance() > 10000).findFirst());

        System.out.println(userList.stream().map(User::getName).collect(Collectors.joining(",")));


    }
}
