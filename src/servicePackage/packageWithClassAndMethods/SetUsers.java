package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetUsers {

    public static Set<User> toSet(List<User> userList) {
        return userList.stream().collect(Collectors.toSet());
    }
}
