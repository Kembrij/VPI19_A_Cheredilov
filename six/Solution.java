package six;


/*Cоздать свой класс и переопределить equals таким образом чтобы сво-во симметри или транзитивности не выполнялось*/



class Shape {
    double area;

    public Shape(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(shape.area, area) == 0;
    }
}
class Cyrcle extends Shape {
    double radius;

    public Cyrcle(double area) {
        super(area);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        //if (!super.equals(o)) return false;
        Cyrcle cyrcle = (Cyrcle) o;
        return Double.compare(cyrcle.radius, radius) == 0;
    }
}



public class Solution {
    public static void main(String[] args) {
        Shape shape1 = new Shape(12);
        Cyrcle cyrcle1 = new Cyrcle(12);
        Cyrcle cyrcle2 = new Cyrcle(26);

        System.out.println(shape1.equals(cyrcle1));
        System.out.println(shape1.equals(cyrcle2));
        System.out.println(cyrcle2.equals(cyrcle1));

    }
}
