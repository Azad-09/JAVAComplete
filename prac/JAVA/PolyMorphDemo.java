

class AreaDemo{
    void area(int side){
        System.out.println("Area of the Square is: " + (side * side));
    }

    void area(int length, int breadth){
        System.out.println("Area of the Reactangle is: " + (length * breadth));
    }

    void area(double radius){
        System.out.println("Area of Cicle is: " + (3.14 * radius * radius));
    }

    void area(int length, int breadth, int height){
        System.out.println("Area of Cuboid is: " + (length * breadth * height));
    }
}

class PolyMorphDemo{

    public static void main (String [] args){
        AreaDemo obj1 = new AreaDemo();
        obj1.area(22);
        obj1.area(21, 31);
        obj1.area(17.2);
        obj1.area(11, 12, 13);
    }
}