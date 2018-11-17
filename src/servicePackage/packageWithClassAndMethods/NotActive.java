package servicePackage.packageWithClassAndMethods;

import servicePackage.User;

import java.util.List;
import java.util.stream.Collectors;

public class NotActive {

    public static List<User> isNotActive(List<User> userList){
        return userList.stream().filter(user -> !user.getIsActive()).collect(Collectors.toList());
    }

}
