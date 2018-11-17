package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.stream.Collectors;

public class Emails {
    public static List<String> email(List<User> list) {
        return list.stream().map(User::getEmail).collect(Collectors.toList());
    }
}
