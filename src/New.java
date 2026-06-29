public class New {

    public static void main(String[] args) {
//        char character = 'B';
//
//        switch (character) {
//            case 'A':
//                System.out.println("A is able");
//                break;
//            case 'B':
//                System.out.println("B is baker");
//                break;
//            case 'C':
//                System.out.println("C is charlie");
//                break;
//            case 'D':
//                System.out.println("D is dog");
//                break;
//        }


//        double result = area(5.0);
//        System.out.println("Result " + result);

//        printYearsAndDays(561600);

        boolean result = isCatPlaying(true, 10);
        System.out.println("Result " + result);
    }


    public static void printDayOfTheWeek(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
    }

    public static void printNumberInWord(int number) {
        String numberInWord = switch (number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
    }


    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {

            System.out.println("Invalid value");

            return false;

        }

        return year / 400 == 0;
    }


    public static boolean hasTeen(int num1, int num2, int num3) {


        if (isTeen(num1) || isTeen(num2) || isTeen(num3)) {
            return true;
        }

        return false;
    }

    public static boolean isTeen(int num) {
        if (num >= 13 && num <= 19) {
            return true;
        }

        return false;
    }


    public static double area(double radius) {

        if (radius < 0) {
            return -1.0;
        }


        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }

        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("invalid value");
        }

//        years = minutes/525,600

//        let say we have our mins now
        // years = 3000/525600

//        years
        long y = minutes / 525600;

//        remainder of minutes
        long z = minutes % 525600;

//       remainder days
        long d = z / 1440;

        System.out.println(minutes + " min = " + y + "y and " + d + "d");
    }


    public static void printEqual(int one, int two, int three) {
        if (one < 0 || two < 0 || three < 0) {
            System.out.println("invalid value");
        } else if (one == two && two == three) {
            System.out.println("All numbers are equal");
        } else if (one != two && two != three && one != three) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {



//        int max = summer ? 45 : 35;
//
//
//        if (temperature >= 25 && temperature <= max) {
//            return true;
//        }
//
//        return false;
//
//

        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        }

        return false;
    }
};
