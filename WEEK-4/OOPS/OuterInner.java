package oops.week4;

class Outer {

    void display() {
        System.out.println("This is Outer Class");
    }

    class Inner {

        void display() {
            System.out.println("This is Inner Class");
        }
    }
}

public class OuterInner {

    public static void main(String[] args) {

        Outer obj = new Outer();

        obj.display();

        Outer.Inner in = obj.new Inner();

        in.display();
    }
}