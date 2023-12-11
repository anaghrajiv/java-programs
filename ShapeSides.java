package practice;

abstract class Shape{
    abstract void numberOfSides();
}

class Triangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides : 3");
    }
}

class Rectangle extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides : 4");
    }
}
class Hexagon extends Shape{
    void numberOfSides(){
        System.out.println("Number of sides : 6");
    }
}


class ShapeSides {

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Rectangle rect = new Rectangle();
        Hexagon hex = new Hexagon();

        tri.numberOfSides();
        rect.numberOfSides();
        hex.numberOfSides();
    }


    
}
