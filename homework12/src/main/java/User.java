public class User {
    String Name;
    String Surname;
    int Age;
    String Email;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    public User(String name, String surname, int age, String email) {
        Name = name;
        Surname = surname;
        Age = age;
        Email = email;
    }
}
