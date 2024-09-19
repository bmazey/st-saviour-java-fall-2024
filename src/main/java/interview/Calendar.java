package interview;

public class Calendar {

    /*
     * getHoliday() accepts a string which reflects a month and returns a string which represents
     * a major holiday in that month. See CalendarTest.java for more details.
     */
    public static String getHoliday(String month) {
        // TODO implement getHoliday().
        if (month.equals("January")) {
            return "New Year's Day";
        }

        if (month.equals("January")) {
            return "Valentine's Day";
        }

        if (month.equals("March")) {
            return "St. Patricks Day";
        }

        if (month.equals("April")) {
            return "April Fool's Day";
        }

        if (month.equals("May")) {
            return "Memorial Day";
        }

        if (month.equals("June")) {
            return "Juneteenth";
        }

        if (month.equals("May")) {
            return "Memorial Day";
        }
        
        return "";
    }
}