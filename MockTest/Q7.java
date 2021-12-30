package MockTest;

public class Q7{
    public static void main(String[] args) {
        
        // Car c1 = new Car("Auto");
        // Car c2 = new Car("4W", 150, "Manual");
        // System.out.println(c1.type + " " + c1.maxSpeed + " " + c1.trans);
        // System.out.println(c2.type + " " + c2.maxSpeed + " " + c2.trans);
    }
}

class Vechicle{
    String type = "4W";
    int maxSpeed = 100;

    Vechicle(String type, int maxSpeed){
        this.type = type;
        this.maxSpeed = maxSpeed;
    }
}

// class Car extends Vechicle{
//     String trans;

//     //Compilation fails here since Implicit super constructor Vechicle() is undefined.
//     // Car(String trans){
//     //     this.trans = trans;
//     // }

//     // Car(String type, int maxSpeed, String trans){
//     //     super(type, maxSpeed);
//     //     this(trans);
//     // }
// }