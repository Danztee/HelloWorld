public class Main {

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 4;
        int finishedNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            System.out.println("Even Number " + number);
            evenCount++;

            if(evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers found " + oddCount);
        System.out.println("Total even numbers found " + evenCount);


//        for (int number = 100; number < 200; number += 10) {
//            System.out.println("Number =" + number);
//        }

//        int number = 0;
//        boolean isReady = false;
//        while (number < 50) {
//            number += 5;
//            System.out.print(number + "_");
//        }

//        int countOfMatches = 0;
//        int sumOfMatches = 0;
//
//        for (int loopNumber = 1; loopNumber < 1000; loopNumber++) {
//
//            if ((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
//                countOfMatches++;
//                sumOfMatches += loopNumber;
//
//                System.out.println("Found a match = " + loopNumber);
//
//                if(countOfMatches == 5) {
//                    break;
//                }
//
//            }
//
//            System.out.println("Sum = " + sumOfMatches);
//
//        }
//
//        HashMap<String, String> stateAndCapitals = new HashMap<String, String>();
//        stateAndCapitals.put("Abia", "Umahia");
//        stateAndCapitals.put("Adamawa", "Yola");
//        stateAndCapitals.put("Awka", "Uyo");
//        stateAndCapitals.put("Awka", "Uyo");
//
//
//        System.out.println(stateAndCapitals);


//        double first = 20.00;
//        double second = 80.00;
//
//        double result = (first + second) * 100;
//
//        double remainder = result % 40.00;
//
//        boolean isRemainder;
//
//        if (remainder == 0) {
//            isRemainder = true;
//            System.out.println(remainder);
//        } else {
//            isRemainder = false;
//            System.out.println("Got some remainder");
//        }


//
//        interface Pet {
//            void play();
//
//            default  void info() {
//                System.out.println("This is a pet");
//            }
//        }
//
//        class Cat implements Pet {
//            public void play() {
//                System.out.println("The cat is playing.");
//            }
//        }
//
//        new Cat().info();


//        boolean isDomestic = false;
//
//        String S = (isDomestic) ? "1" : "2";


//        System.out.println("Hello, Daniel");
//
//        boolean isAlien = false;
//
//        if (!isAlien) {
//            System.out.println("It is not an alien");
//            System.out.println("It is an alien");
//        }
//
//        int value = 0;
//
//        value++;


//        int newVal = 50;
//        if (newVal = 50) {}


//        boolean isCar = true;
//
//
//        String name =  "";
//
//      boolean accurate =  name == "Daniel" ? true : false;


//        double myFirstDouble  = 20.00d;
//        double mySecondDouble  = 80.00d;
//        double  answer  = (myFirstDouble + mySecondDouble) * 100.00d;
//        System.out.println("answer: " + answer);
//
//
//        double remainder = answer % 40.00d;
//        System.out.println("remainder: " + remainder);
//
//
//       boolean val;
//
//      if(remainder == 0.0) {
//           val = true;
//        } else {
//            val = false;
//        }
//
//       boolean val = (remainder == 0.0) ? true : false;
//
//        System.out.println("bool val: " + val);


//        boolean gameOver = true;
//        int score = 10_000;
//        int levelCompleted = 8;
//        int bonus = 200 ;
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Final Score: " + finalScore);
//        }


//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        System.out.println("Your final score was " +
//                calculateScore(gameOver, score, levelCompleted, bonus));


//////////////////////////////////

//        displayHighScore("Daniel", 1);
//        int highScore = calculateHighScorePosition(1500);
//
//        System.out.println("Your high score was " + highScore);

//        Long result = toMilesPerHour(75.114);
//        System.out.println(result);

//        printMegaBytesAndKiloBytes(5000);

//        boolean result = shouldWakeUp(true, -1);
//        System.out.println(result);

//        boolean result = isLeapYear(2000);
//        System.out.println(result);


//        boolean result = areEqualByThreeDecimalPlaces(-3.1756, -3.1756);
//        System.out.println(result);


        boolean result = hasEqualSum(1, -1, 0);
        System.out.println(result);


        for (double i = 7.5; i < 10; i += 0.25) {
            double interestAmount = calculateInterest(100.00, i);

            if (interestAmount > 8.5) {
                return;
            }
        }


        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;

                if (count == 3) {
                    System.out.println("Found 3 p exiting for loop");
                    break;
                }
            }

        }
    }


    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        return true;
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;


        }

        return finalScore;
    }

    public static void displayHighScore(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");

        } else {
            System.out.println("zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {

            double result = kilometersPerHour * 0.621371;

            return Math.round(result);
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println("KiloBytes: " + kiloBytes);

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int mb = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        System.out.println(kiloBytes + "KB = " + mb + "MB and " + remainder + "KB");
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        return false;
    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year > 9999) {
            return false;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        long firstRound = (long) one * 1000;
        long secondRound = (long) one * 1000;


        if (firstRound == secondRound) {
            return true;
        }

        return false;

    }

    public static boolean hasEqualSum(int first, int second, int third) {

//        if ((first + second) == third) {
//            return true;
//        }
//

        return (first + second) == third;
    }

    public static boolean hasTeen(int first, int second, int third) {

        return isTeen(first) || isTeen(second) || isTeen(third);

//        int range = 13 - 19;
//        if (first < range || second <range || third <range) {
//            return true;
//        }else  {
//            return false;
//        }


    }

    public static boolean isTeen(int val) {
        return val > 12 && val < 20;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

}
