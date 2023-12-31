package lab2.LeapYear;

public class LeapYear {

    /**
     * Checks if an input year is a leap year.
     * @param year is the input year
     * Requires year to be a valid year
     * @return true iff year is a leap year
     */

    public static boolean isLeapYear(int year) {
		if (year % 100 == 0){
            if (year % 400 == 0) return true;
            else return false;
        }
        else {
            if (year % 4 == 0) return true;
            else return false;
        }
    }

    public static boolean isLeapYear_2(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            return true;
        }
        else {
            return false;
        }

    }
}

