public class Main {
    public static void main(String[] args) {
        isLeapYear(6785);
    }
    public static void isLeapYear(int year) {
        boolean result = true;
        boolean results1 = false;
        if (year >= 1 && year <= 9999) {
            System.out.println(result);
        } else if (result) {
            int step1 = year % 4;
            if (step1 == 0) {
                int step2 = year % 100;
                if (step2 == 0) {
                    int step3 = year % 400;
                    if (step3 == 0) {
                        System.out.println(result);
                    }

                }
            }
        }
        else {
            System.out.println(results1);
        }
    }
}