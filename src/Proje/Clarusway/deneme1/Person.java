package Proje.Clarusway.deneme1;

public class Person {

private String nameSurname;
private String personID;
private int age;

    public Person(String nameSurname, String personID, int age) {
        this.nameSurname = nameSurname;
        this.personID = personID;
        this.age = age;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameSurname='" + nameSurname + '\'' +
                ", personID='" + personID + '\'' +
                ", age=" + age +
                '}';
    }
}
