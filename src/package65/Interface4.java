package package65;

public interface Interface4 {

    void outerMethod();

    class InnerClazz {
        static void innerMethod(Interface4 i) {
            i.outerMethod();
        }
    }


}

class Imp2 implements Interface4 {
    @Override
    public void outerMethod() {
        System.out.println("Imp2 outerMethod()");
    }

    public static void main(String[] args) {
        var i = new Imp2();
        Interface4.InnerClazz.innerMethod(i);
    }
}
