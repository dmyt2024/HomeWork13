package app.Figures;

public class Circle implements CountAreaFigures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return Math.PI * radius * radius;
    }
}
