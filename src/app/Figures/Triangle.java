package app.Figures;

public class Triangle implements CountAreaFigures {
    private double baseTriangle;
    private double sideTriangle;


    public Triangle(double baseTriangle, double sideTriangle) {
        this.baseTriangle = baseTriangle;
        this.sideTriangle = sideTriangle;
    }

    public double getBaseTriangle() {
        return baseTriangle;
    }

    public void setBaseTriangle(double baseTriangle) {
        this.baseTriangle = baseTriangle;
    }

    public double getSideTriangle() {
        return sideTriangle;
    }

    public void setSideTriangle(double sideTriangle) {
        this.sideTriangle = sideTriangle;
    }

    @Override
    public double areaFigure() {
        return (baseTriangle * sideTriangle) / 2;
    }
}
