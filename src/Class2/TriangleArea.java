package Class2;

//Заданы плоские декартовы координаты треугольника. Найти площадь треугольника.
public class TriangleArea {

    private int x1, y1, x2, y2, x3, y3;

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public TriangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public TriangleArea() {

    }

    public static void main(String[] args) {

        TriangleArea area1 = new TriangleArea(3, 8, 3, 4, 5, 6);
        TriangleArea area2 = new TriangleArea(3, 3, 3, 9, 7, 3);
        System.out.println("Area of triangle calculated using coordinates and formula with the determinant is " + calcTriangleAreaOne(area1));
        System.out.println("Area of triangle calculated using Heron formula is " + calcTriangleAreaHeron(area1));
        System.out.println("another triangle");
        System.out.println("Area of triangle calculated using coordinates and formula with the determinant is " + calcTriangleAreaOne(area2));
        System.out.println("Area of triangle calculated using Heron formula is " + calcTriangleAreaHeron(area2));

    }

    //формула 1⁄2 times the absolute value of the determinant
    static double calcTriangleAreaOne(TriangleArea tra) {

        double area = ((tra.getX1() - tra.getX3()) * (tra.getY2() - tra.getY1()) - (tra.getX1() - tra.getX2()) * (tra.getY3() - tra.getY1())) / 2.0;
        return Math.abs(area);

    }

    // Heron's formula
    static double calcTriangleAreaHeron(TriangleArea tra) {

        double area = 0;
        double ab = HelperMethods.calcDistance(tra.getX1(), tra.getY1(), tra.getX2(), tra.getY2());
        double bc = HelperMethods.calcDistance(tra.getX2(), tra.getY2(), tra.getX3(), tra.getY3());
        double ca = HelperMethods.calcDistance(tra.getX1(), tra.getY1(), tra.getX3(), tra.getY3());
        if (ab + bc <= ca || ab + ca <= bc || ca + bc <= ab)
            System.out.println("Triangle can't exist");
        else {
            double p = (ab + bc + ca) / 2.0;
            area = Math.sqrt(p * (p - ab) * (p - bc) * (p - ca));
        }
        return area;

        /*double s = (ab + bc + ca) / 2.0;
        return Math.sqrt(s * (s - ab) * (s - bc) * (s - ca));*/


    }
}
