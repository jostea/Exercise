package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.stream.Collectors;

public class ActiveUsers {
    public static List isActive(List<User> userList) {
        return userList.stream().filter(User::getIsActive).collect(Collectors.toList());
    }
}
