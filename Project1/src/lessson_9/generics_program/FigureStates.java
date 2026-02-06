package lessson_9.generics_program;

public class FigureStates <FigureType extends Figure>{
    FigureType[] figures;

    public FigureStates(FigureType[] figures) {
        this.figures = figures;
    }

    public double getSumArea(){
        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].getArea();
        }
        return sum;
    }

    public double getMaxArea(){
        double maxArea = Double.MIN_VALUE;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getArea() > maxArea) {
                maxArea = figures[i].getArea();
            }
        }
        return maxArea;
    }

    public double getMinArea(){
        double minArea = Double.MAX_VALUE;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getArea() < minArea) {
                minArea = figures[i].getArea();
            }
        }
        return minArea;
    }
}
