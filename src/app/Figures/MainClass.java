package app.Figures;

public class MainClass {
    public static void main(String[] args) {
        Circle circle = new Circle(4.34);
        System.out.println("Circle area is: " + circle.areaFigure());

        Triangle triangle = new Triangle(21.35, 2.25);
        System.out.println("Triangle area is: " + triangle.areaFigure());

        Squeare squeare = new Squeare(5.27);
        System.out.println("Squeare area is: " + squeare.areaFigure());

        CountAreaFigures[] figures = new CountAreaFigures[]{circle, triangle, squeare};
        sumFiguresAreas(figures);

    }

    private static void sumFiguresAreas(CountAreaFigures[] figures) {
        double sum = 0;
        for (CountAreaFigures element : figures) {
            sum += element.areaFigure();
        }
        System.out.println("Sum of all figures areas is: " + sum);

    }


}
