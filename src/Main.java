/**
 * Java Workshop On Interfaces
 * Quick references on how interfaces can be used to write custom logic.
 * Charlton Smith - July 13, 2017
 */
public class Main {

    /**
     * This is the interface we will be using to calculate the area in different ways
     */
    public interface AreaImpl {

        float getArea();

    }


    /**
     * Here we have a class, Square.
     * In this class we implements the interface we defined above
     * We then write our custom logic to this class to calculate the area of a square
     */
    static class Square implements AreaImpl {

        float width, height;

        public Square(float width, float height) {
            this.width = width;
            this.height = height;
        }


        @Override
        public float getArea() {
            return width * height;
        }
    }

    /**
     * Here we have a class, Triangle.
     * Like before, in this class we implements the interface we defined
     * We then write our custom logic to this class to calculate the area of a triangle
     */
    static class Triangle implements AreaImpl {

        public Triangle(float base, float height) {
            this.base = base;
            this.height = height;
        }

        float base, height;

        @Override
        public float getArea() {
            return (base * height) / 2;
        }
    }

    /**
     * When we run this program we should calculate
     * the area of both the triangle and square
     *
     * @param args
     */
    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 9);

        Square square = new Square(7, 3);

        System.out.printf("The area of the triangle is: %.2f\nThe area of the square is: %.2f", triangle.getArea(), square.getArea());

    }
}
