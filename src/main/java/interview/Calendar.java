package interview;

public class Calendar {

    /*
     * getHoliday() accepts a string which reflects a month and returns a string which represents
     * a major holiday in that month. See CalendarTest.java for more details.
     */
    public static String getHoliday(String month) {
        // TODO implement getHoliday().
        // month = month.toLowerCase();

        switch (month) {
            case "January":
                return "New Year's Day";
            case "February":
                return "Valentine's Day";
            case "March":
                return "St. Patrick's Day";
            case "April":
                return "April Fool's Day";
            case "May":
                return "Memorial Day";
            case "June":
                return "Juneteenth";
            case "July":
                return "Independence Day";
            case "August":
                return "International Youth Day";
            case "September":
                return "Labor Day";
            case "October":
                return "Halloween";
            case "November":
                return "Thanksgiving";
            case "December":
                return "Christmas";
            default:
                return "";
            
        }
    }

}
