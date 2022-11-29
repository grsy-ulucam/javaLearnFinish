package j26_Inheritance;

public class Mammal extends Hayvancık {
    public Mammal() {
        System.out.println("Agam ahan da Mammal p'siz cons...");
    }

    public Mammal(char c) {//p'li cons

        super(17);

        System.out.println("Agam ahan da Mammal p'li cons...");

    }    public void mC(){

        System.out.println(" mC - > Mammal  class meth call.");

    }

    int m=1;

    int c=4;

    @Override
    public void mM() {
        super.mM();
        System.out.println(" mM - > Mammal  class meth call.");
    }
}