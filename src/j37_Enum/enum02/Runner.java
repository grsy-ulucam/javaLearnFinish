package j37_Enum.enum02;

import java.nio.file.attribute.UserPrincipal;

public class Runner {
    public static void main(String[] args) {
        user kll1=new user();
        kll1.name="güzel insan ebubekir";
       // kll1.role=0;
       // kll1.status=2;
        kll1.yetki=Role.ADMIN;
        kll1.durum=Status.INACTIVE;

        user kll2=new user();
        kll1.name="KUTSAL ŞEHİR muhtarı fatih bey";
        // kll1.role=0;
        // kll1.status=2;
        kll2.yetki=Role.CUSTOMER;
        kll2.durum=Status.LOGING;
        if (kll1.yetki==Role.ADMIN){
            System.out.println("ağam mühür sende");
        }else System.out.println(" te ALLAHIM ya ADMİN DEĞİL");
        if (kll2.yetki==Role.ADMIN){
            System.out.println("ağam mühür sende");
        }else System.out.println(" te ALLAHIM ya ADMİN DEĞİL");


    }
}
