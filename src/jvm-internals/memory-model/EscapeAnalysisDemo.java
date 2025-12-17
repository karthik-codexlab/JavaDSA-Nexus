package memorymodel;

public class EscapeAnalysisDemo {

    public static void main(String[] args) {
        calculate();
    }

    private static void calculate() {
        Point p = new Point(10, 20); // Does NOT escape this method
        int sum = p.x + p.y;
        System.out.println("Sum = " + sum);
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
