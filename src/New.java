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

        printYearsAndDays(525600);
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
    }
};
