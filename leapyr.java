public class leapyr {
    public static void main(String[] args) {
        int year=2024;
                    // not century yr-2100        check century yr
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
