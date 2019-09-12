public class Main {
    public static void main(String[] args) {

        Shape[] arr = new Shape[3];
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Circle circle = new Circle();
        arr[0] = rectangle;
        arr[1] = square;
        arr[2] = circle;
        double percent;

        for (Shape shape : arr) {

            if (shape instanceof Rectangle) {
                percent = Math.floor(Math.random() * 100 + 1);
                System.out.println(percent + "%");
                System.out.println(rectangle.getArea());
                rectangle.resize(percent);
                System.out.println(rectangle.getArea());

            } else if (shape instanceof Square) {
                percent = Math.floor(Math.random() * 100 + 1);
                System.out.println(percent + "%");
                System.out.println(square.getArea());
                square.resize(percent);
                System.out.println(square.getArea());
            } else if (shape instanceof Circle) {
                percent = Math.floor(Math.random() * 100 + 1);
                System.out.println(percent + "%");
                System.out.println(circle.getArea());
                circle.resize(percent);
                System.out.println(circle.getArea());
            }
        }
    }
}
