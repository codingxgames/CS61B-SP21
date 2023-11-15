import lec2_intro2.Dog;

public class DogLauncher {
    public static void main(String[] args) {
        /*
        lec2_intro2.Dog d; //declaration of a lec2_intro2.Dog variable
        d = new lec2_intro2.Dog(); //instantiation, assignment
        d.weightInPounds = 20;
        d.makeNoise();
         */
        Dog smallDog = new Dog(5); // declaration, instantiation and assignment
        Dog hugeDog = new Dog(150);
        smallDog.makeNoise(); // invocation
        hugeDog.makeNoise();

        // arrays of objects
        Dog[] dogs = new Dog[2]; // array, size 2
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();

        // invoke class method
        Dog d = new Dog(15);
        Dog d2 = new Dog(100);
        Dog.maxDog(d, d2); // class method
        d.maxDog2(d2); // instance method
        System.out.println(d.maxDog3(d, d2));


    }
}
