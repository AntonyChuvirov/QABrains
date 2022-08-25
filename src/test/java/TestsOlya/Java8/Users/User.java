package TestsOlya.Java8.Users;

public class User {
    int age;
    String name;
    int weight;
    boolean sex;
    String speciality;
    public User(int age,String name,int weight,boolean sex,String speciality){
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.sex = sex;
        this.speciality = speciality;

    }
    public String toString(){
        return "your age " + age +", name - " + name + ", your weight is " + weight + ",your specialty " + speciality;}
}
