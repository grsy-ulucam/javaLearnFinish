package Proje.Clarusway.deneme1;

public class Student extends Person {

     private  String studentNo;
     private  String sınıf;

    public Student(String nameSurname, String personID, int age, String studentNo, String sınıf) {
        super(nameSurname, personID, age);
        this.studentNo = studentNo;
        this.sınıf = sınıf;
    }



    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getSınıf() {
        return sınıf;
    }

    public void setSınıf(String sınıf) {
        this.sınıf = sınıf;
    }
}




