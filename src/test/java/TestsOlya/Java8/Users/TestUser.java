package TestsOlya.Java8.Users;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestUser {

    User firstUser = new User(15, "Olga", 60, true, "QA");
    User secondtUser = new User(55, "Ludmila", 65, true, "veterinarian");
    User thirdUser = new User(25, "Tanya", 70, true, "Seamstress");
    User fourthOrder = new User(35, "Lina", 40, true, "Seamstress");
    User fifthOrder = new User(42, "Bogdana", 72, true, "QI/QX Desing");
    User sixthOrder = new User(62, "Galina", 110, true, "Interior designer");
    User seventhOrder = new User(55, "Irina", 77, true, "Driver");
    User eighthOrder = new User(44, "Gleb", 82, false, "Football player");
    User ninethUser = new User(90, "Egor", 91, false, "Journalist");
    User tenhtUser = new User(32, "Fedor", 75, false, "Builder");
    User eleventhUser = new User(52, "Vadym", 88, false, "Painter");
    User twelfthUser = new User(53, "Maxim", 99, false, "Seller");
    User thirteenthUser = new User(100, "Egor", 71, false, "Consultant");
    User fourteenthUser = new User(88, "Fotiy", 89, false, "Military");
    User fifteenthUser = new User(99, "Evgeniy", 50, false, "Teacher");
    List<User> userList = Arrays.asList(firstUser, secondtUser, thirdUser, fourthOrder, fifthOrder, sixthOrder, seventhOrder, eighthOrder, ninethUser, tenhtUser, eleventhUser, twelfthUser, thirteenthUser, fourteenthUser, fifteenthUser);

    @Test
    public void checkSexWomen() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printSexW();

        Assert.assertTrue(userFiltering.printSexW());
    }
        @Test
        public void checkSexMan() {
        UserFiltering userFiltering = new UserFiltering(userList);
            userFiltering.printSexM();
            Assert.assertTrue(userFiltering.printSexM());}

    @Test
    public void checkAgeMore50() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printAgeMoreThan50();
        Assert.assertTrue(userFiltering.printAgeMoreThan50());
    }

    @Test
    public void checkAgeLess90() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printAgeLessThan90();
        Assert.assertTrue(userFiltering.printAgeLessThan90());
    }


    @Test
    public void checkSpecialitySeamstress() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printSpeciality();
        Assert.assertTrue(userFiltering.printSpeciality());
    }

    @Test
    public void checkWomenAgeMore20() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printSexW();
        userFiltering.printAgeMoreThan20();

        Assert.assertTrue(userFiltering.printAgeMoreThan20());
    }

   @Test
    public void checkNameEgor() {
        UserFiltering userFiltering = new UserFiltering(userList);
userFiltering.printNameEgor();
      Assert.assertTrue(userFiltering.printNameEgor());}

    @Test
    public void checkSpecialityMix() {
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printSpecialityMix();
        Assert.assertTrue(userFiltering.printSpecialityMix());}

    @Test
    public void checkWomenWeightMore90AgeLess35(){
    UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printWomenWeightMore90AgeLess35();

        Assert.assertTrue(userFiltering.printWomenWeightMore90AgeLess35());
}
    @Test
    public void checkWomenAgeMore20Less100WeightMore66Less90(){
        UserFiltering userFiltering = new UserFiltering(userList);
        userFiltering.printWomenAgeMore20Less100WeightMore66Less90();

        Assert.assertTrue(userFiltering.printWomenAgeMore20Less100WeightMore66Less90());}
        @Test
        public void checkWeightLess77(){
            UserFiltering userFiltering = new UserFiltering(userList);
            userFiltering.printWeightLess77();

            Assert.assertTrue(userFiltering.printWeightLess77());


}}







