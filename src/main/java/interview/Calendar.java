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

        if (month.equals("February")) {
            return "Valentine's Day";
        }

        if (month.equals("March")) {
            return "St. Patrick's Day";
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

        if (month.equals("July")) {
            return "Independence Day";
        }
        
        if (month.equals("August")) {
            return "International Youth Day";
        }

        if (month.equals("September")) {
            return "Labor Day";
        }

        if (month.equals("October")) {
            return "Halloween";
        }

        if (month.equals("November")) {
            return "Thanksgiving";
        }

        if (month.equals("December")) {
            return "Christmas";
        }
        return "";
    }
}