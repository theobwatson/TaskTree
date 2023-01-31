package manipulations;

/**
 *
 * The DateVerification class validates user input date and time in the
 * format "dd/MM/yyyy" to ensure it is valid and not before the current date.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateVerification {

    // Fields to store user-inputted date and time
    private int hour;
    private int minute;
    private int year;
    private int month;
    private int day;

    // Constructor to set the values of hour, minute, year, month and day
    public DateVerification(int hour, int minute, int year, int month, int day) {
        this.hour = hour;
        this.minute = minute;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Validate the given date-time values
     *
     * @return error message as a string, or an empty string if no errors found
     */
    public String validate() {
        String errors = "";

        if (hour < 0 || hour > 23) {
            errors += "Hour must be between 0 and 23.\n";
        }
        if (minute < 0 || minute > 60) {
            errors += "Minute must be between 0 and 60.\n";
        }
        if (year < Calendar.getInstance().get(Calendar.YEAR)) {
            errors += "Year cannot be in the past.\n";
        }
        if (month < 1 || month > 12) {
            errors += "Month must be between 1 and 12.\n";
        }
        if (day < 1 || day > 31) {
            errors += "Day must be between 1 and 31.\n";
        }

        return errors;
    }

    /**
     * Check if the given date string is after today's date
     *
     * @param date String representing the date in the format "dd/MM/yyyy"
     * @return true if the given date is after today's date, false otherwise
     */
    public static boolean isDateAfterToday(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date inputDate = format.parse(date);
            Date today = Calendar.getInstance().getTime();
            return inputDate.after(today);
        } catch (ParseException e) {
            return false;
        }
    }
}
