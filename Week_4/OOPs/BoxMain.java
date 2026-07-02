class Box {
    private int length;
    private int breadth;
    private int height;

    Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;

    }

}

class Box3D extends Box {
    private int height;

    Box3D(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int volume() {
        return area() * height;
    }

}

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box(5, 10);
        System.out.println("Area of the box: " + box.area());

        Box3D box3D = new Box3D(5, 10, 15);
        System.out.println("Volume of the box: " + box3D.volume());
    }
}
