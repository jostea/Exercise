package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByRoles {

    public static Map<String, List<User>> groupingByUser(List<User> userList) {
        return userList.stream().collect(Collectors.groupingBy(
                servicePackage.User::getRoles, Collectors.toList()));
    }
}
