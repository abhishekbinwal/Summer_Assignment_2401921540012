class Outer {
    public void display() {
        System.out.println("This is the outer class.");
    }

    class Inner {
        public void display() {
            System.out.println("This is the inner class.");
        }
    }

}

public class Testing {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        // Creating an instance-object of the inner class
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
