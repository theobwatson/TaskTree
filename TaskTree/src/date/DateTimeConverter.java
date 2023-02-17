package date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class provides methods for converting a string into a date and time object,
 * and for converting a date and time object into a string.
 */
public class DateTimeConverter {

    /**
     * Converts a string into a Date object, using the format "dd/MM/yyyy HH:mm".
     * 
     * @param dateTimeString The string to be converted into a date and time object.
     * @return The Date object representation of the string, or null if the string cannot be parsed.
     */
    public static Date stringToDate(String dateTimeString) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            return format.parse(dateTimeString);
        } catch (ParseException e) {
            return null;
        }
    }
    
    /**
     * Converts a Date object into a string, using the format "dd/MM/yyyy HH:mm".
     *
     * @param date The Date object to be converted into a string.
     * @return The string representation of the Date object, or an empty string if the Date object is null.
     */
    public String dateToString(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return format.format(date);
    }
}
