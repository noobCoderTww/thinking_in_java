package package65;

public interface Interface1 {

    void m1();

    class Inner implements Interface1 {
        @Override
        public void m1() {
            System.out.println("m1()");
        }

        public static void main(String[] args) {
            new Inner().m1();
        }

    }
}
