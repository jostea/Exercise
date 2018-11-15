import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserService {


    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add(new User("Jostea", true, "Devops",
                "jostea@gmail.com", 9000, LocalDate.of(2018, 2, 19)));
        userList.add(new User("Kuzea", true, "Admin",
                "Kuzea@gmail.com", 11000, LocalDate.of(2018, 5, 9)));
        userList.add(new User("Jora", true, "Developer",
                "Jora@gmail.com", 20000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Jora", false, "Developer",
                "JoraDev@gmail.com", 20000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Valera", false, "Developer",
                "Valera1@gmail.com", 20000, LocalDate.of(2010, 12, 19)));
        userList.add(new User("Smith", false, "AM",
                "Smith@gmail.com", 20000, LocalDate.of(2010, 12, 19)));


        List<User> sortedUsers = userList.stream().distinct().collect(Collectors.toList());
//
//        for (User user : sortedUsers) {
//            System.out.println();
//            System.out.println(user.toString());
//        }
//

        double min = userList.stream().min(Comparator.comparing(User::getBalance)).get().getBalance();

        double max = userList.stream().max(Comparator.comparing(User::getBalance)).get().getBalance();
//
//        System.out.println("Min: " + min);
//        System.out.println("Max: " + max);
//
//        List<User> active = userList.stream().filter(User::getIsActive).collect(Collectors.toList());
//
        List<User> locked = userList.stream().filter(user -> {
                    if (user.getIsActive()) {
                        return false;
                    } else
                        return true;
                }
        ).collect(Collectors.toList());
//
//        System.out.println("Active accounts: ");
//        for (User user : active) {
//            System.out.println();
//            System.out.println(user.toString());
//        }
//
//        System.out.println("Locked accounts: ");
//        for (User user : locked) {
//            System.out.println();
//            System.out.println(user.toString());
//        }


//        List<String> emailList = userList.stream().map(User::getEmail).collect(Collectors.toList());
//        for (String email : emailList) {
//            System.out.println(email);
//        }
//
//        int numberOfNotActive = locked.size();
//        System.out.println(numberOfNotActive);


        NoneActive<Integer> noneActive =(user) -> {
            int n = 0;
            for (User user1 : userList) {
                if (user1.getIsActive()) {
                    return 0;
                } else {
                    return n++;
                }
            }
            return n;
        };


        System.out.println(noneActive);

//        int berOfNotActive=userList.stream().fil

//        List<LocalDate> localDates = userList.stream().map(User::getRegistrationDate).collect(Collectors.toList());
//        for (LocalDate date : localDates) {
//            System.out.println(date);
//        }


    }
}
