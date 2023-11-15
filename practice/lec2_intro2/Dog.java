package lec2_intro2;

public class Dog {
    /*
    public static void makeNoise() { //没有main，不能直接run
        System.out.println("Bark!");
    }
    */
    public int weightInPounds; // instance variable/attribute, non-static variable
    public static String binomen = "Canis familiaris"; // class variable, static variable
    //properties inherent to the class itself

    public Dog(int startingWeight) {  // constructor
        weightInPounds = startingWeight;
    }

    public void makeNoise() {  // instance method/non-static method
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {  // class method
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog2(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) { // this: current object
            return this;
        }
        return d2;
    }

    public Dog maxDog3(Dog d1, Dog d2) {
        if (weightInPounds > d2.weightInPounds) { // this: current object
            return this;
        }
        return d2;
    }
}

/** two types of method:
 *  1. class methods a.k.a. static method: lec2_intro2.Dog.
 *  2. instance methods a.k.a. non-static method
 */
