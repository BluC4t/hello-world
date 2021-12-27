/**
 * Exercise
 * We have tocalculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods 
 * namely ‘ofArea'. Now create another class ‘Rectangle’, ‘Square’ and ‘Circle’ providing differing implementation of computing area of 
 * the shape. Create an object of eachclass and call all the ‘ofArea’ method. Note: You may demonstrate with object orientedconcepts.
 * 
 * Make a Printable interface with a ’print’ method. The output of this method shows the details of each one of 
 * the objects that were instantiated.
 */

public class exercise_abstract{
    public static void main(String[] args) {
        
    }
}

interface printable{
    void print();
}
abstract class Shape implements printable{
    void ofArea(){

    }
}

class Rectangle{

}