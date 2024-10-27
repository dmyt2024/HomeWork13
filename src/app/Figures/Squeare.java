package app.Figures;

public class Squeare implements CountAreaFigures {
    private double sideSqueare;

    public Squeare(double sideSqueare) {
        this.sideSqueare = sideSqueare;
    }

    public double getSideSqueare() {
        return sideSqueare;
    }

    public void setSideSqueare(double sideSqueare) {
        this.sideSqueare = sideSqueare;
    }

    @Override
    public double areaFigure() {
        return sideSqueare * sideSqueare;
    }
}
