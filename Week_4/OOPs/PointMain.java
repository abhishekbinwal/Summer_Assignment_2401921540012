class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void SetXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

public class PointMain {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = new Point(5, 10);

        point1.setX(2);
        point1.setY(3);
        point1.SetXY(4, 6);

        point2.setX(8);
        point2.setY(12);
        point2.SetXY(15, 20);

    }
}
