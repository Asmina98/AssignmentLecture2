package First;

public class Prog1 {
    public static void main(String[] args) {
// 1.get random number from 1 to 9
        int x = RandomNumbers.getRandomInt(1,9);
        double valueX = Math.pow(Math.PI, x);
        System.out.println(valueX);

//        2. get a random number y in the range 3 .. 14
        int y = RandomNumbers.getRandomInt(3,14);
        double valueY = Math.pow(Math.PI,y);
        System.out.println(valueY);

    }
    }


