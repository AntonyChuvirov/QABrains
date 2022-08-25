package TestsOlya.Java8.Users;

public class CheckSex implements UserCheck {
    @Override
    public boolean checkConditions(User user) {
        return user.sex;
    }
}
