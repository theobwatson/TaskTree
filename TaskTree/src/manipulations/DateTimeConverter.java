package manipulations;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class provides methods for converting a string into a date and time object.
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
}
