package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLocalDate {
    public static Map<LocalDate, List<User>> groupingByLocalDate(List<User> userList) {
        return userList.stream().collect(Collectors.groupingBy
                (servicePackage.User::getRegistrationDate, Collectors.toList()));
    }
}
