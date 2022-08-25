package TestsOlya.Java8.Users;

import java.util.List;

public class UserFiltering {
    List<User> userList;

    UserFiltering(List<User> userList) {this.userList = userList;
    }

    public boolean printSexW() {
        for (User user : userList) {
            if (user.sex) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printSexM() {
        for (User user : userList) {
            if (user.sex){
                System.out.println(user);
            }
        }
        return true;
    }

    public boolean printAgeMoreThan50() {
        for (User user : userList) {
            if (user.age < 50) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printAgeLessThan90() {
        for (User user : userList) {
            if (user.age >= 90) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printSpeciality() {
        for (User user : userList) {
            if (user.speciality.equals("Seamstress")) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printNameEgor() {
        for (User user : userList) {
            if (user.name.equals("Egor")) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printAgeMoreThan20() {
        for (User user : userList) {
            if (user.age > 20) {
                System.out.println(user);
            }
        }
        return true;
    }


    public boolean printSpecialityMix() {
        for (User user : userList) {
            if (user.speciality.equals("QI/QX Desing")){
                System.out.println(user);}
            if (user.speciality.equals("QA")){
                System.out.println(user);}
        }
        return true;
    }
    public boolean printWomenWeightMore90AgeLess35() {
        for (User user : userList) {
            if (user.age > 35);
            if (user.weight < 90);
            if (user.sex) {
                System.out.println(user);
            }
        }
        return true;
    }
    public boolean printWomenAgeMore20Less100WeightMore66Less90() {
        for (User user : userList) {
            if (user.age > 20)
                if (user.age < 100)
                    if (user.weight >66)
            if (user.weight < 90){
            System.out.println(user);
            }
        }
        return true;
    }
    public boolean printWeightLess77() {
        for (User user : userList) {
                    if (user.weight <77) {
                        System.out.println(user);
                    }
        }
        return true;
    }

}
