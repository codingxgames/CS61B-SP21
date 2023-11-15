package lec2_intro2;

public class DogProblem {
    // static method/function, has a return (no void)
    // the core method, narrative
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length]; // new Dog array
        int cnt = 0;

        // traverse every item of the original list
        for (int i = 0; i < dogs.length; i += 1) {
            if (isBiggestOfFour(dogs, i)) { // helper method
                returnDogs[cnt] = dogs[i];
                cnt = cnt + 1;
            }
        }

        returnDogs = arrayWithNoNulls(returnDogs, cnt); // helper method
        return returnDogs;
    }

    // helper method: cnt is the number of non-null items
    public static Dog[] arrayWithNoNulls(Dog[] dogs, int cnt) {
        Dog[] noNullDogs = new Dog[cnt]; // new Dog array
        for (int i = 0; i < cnt; i += 1) {
            noNullDogs[i] = dogs[i];
        }
        return noNullDogs;
    }

    // helper method: return true if dog[i] is larger than its four neighbors
    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        boolean isBiggest = true;
        for (int j = -2; j <= 2; j += 1) {
            int compareIndex = i + j;

            // avoid comparing self to self
            if (j == 0) {
                continue;
            }

            if (validIndex(dogs, compareIndex)) {
                if (dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds) {
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    // helper method: validIndex
    public static boolean validIndex(Dog[] dogs, int i) {
        if(i < 0) {
            return false;
        }
        if (i >= dogs.length) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20),
        };
        Dog[] bigDogs1 = largerThanFourNeighbors(dogs);

        for (int k = 0; k < bigDogs1.length; k += 1) {
            System.out.print(bigDogs1[k].weightInPounds + " ");
        }
        System.out.println();
    }
}
