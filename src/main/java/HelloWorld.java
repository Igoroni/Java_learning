public class HelloWorld {

    public static void main(String[] args) {
        PrinSmth pr = new PrinSmth();
        System.out.println("Hello World");
        System.out.println("Just for print Smth");
        pr.print();
    }
}

class PrinSmth{
    public void print() {
        System.out.println("another print");
    }
}
