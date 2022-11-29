package Proje.Clarusway.deneme1;

public class Teacher extends Person {

   private String brans;

   private String sicilNo;


    public Teacher(String nameSurname, String personID, int age, String brans, String sicilNo) {
        super(nameSurname, personID, age);
        this.brans = brans;
        this.sicilNo = sicilNo;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String
    toString() {
        return "Teacher{" +
                "brans='" + brans + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';













    }
}
