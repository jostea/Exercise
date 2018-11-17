package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.stream.Collectors;

public class SortList {

    public static List<User> sortedList(List<User> userList) {
        List<User> sortedUsers = userList.stream().distinct().collect(Collectors.toList());
        return sortedUsers;
    }
}
