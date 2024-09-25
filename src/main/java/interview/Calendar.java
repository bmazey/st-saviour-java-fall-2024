package interview;

public class Calendar {

    /*
     * getHoliday() accepts a string which reflects a month and returns a string which represents
     * a major holiday in that month. See CalendarTest.java for more details.
     */
    public static String getHoliday(String month) {
        // TODO implement getHoliday().
        
        if(month == "January"){
            return "New Year's Day";
        }
        if(month == "February"){
            return "Valentine's Day";
        }
        if(month == "March"){
            return "St. Patrick's Day";
        }
        if(month == "April"){
            return "April Fool's Day";
        }
        if(month == "May"){
            return "Memorial Day";
        }
        if(month == "June"){
            return "Juneteenth";
        }
        if(month == "July"){
            return "Independence Day";
        }
        if(month == "August"){
            return "International Youth Day";
        }
        if(month == "September"){
            return "Labor Day";
        }
        if(month == "October"){
            return "Halloween";
        }
        if(month == "November"){
            return "Thanksgiving";
        }
        if(month == "December"){
            return "Christmas";
        }
        return "";
    }
    
}
