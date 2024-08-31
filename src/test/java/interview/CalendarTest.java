package interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarTest {
    
    @Test
    public void testCalendarHolidays() {
        // Should return empty string when given an invalid month.
        assertEquals("", Calendar.getHoliday("Snoctober"));

        // Should return the below holidays for each month.
        assertEquals("New Year's Day", Calendar.getHoliday("January"));
        assertEquals("Valentine's Day", Calendar.getHoliday("February"));
        assertEquals("St. Patrick's Day", Calendar.getHoliday("March"));
        assertEquals("April Fool's Day", Calendar.getHoliday("April"));
        assertEquals("Memorial Day", Calendar.getHoliday("May"));
        assertEquals("Juneteenth", Calendar.getHoliday("June"));
        assertEquals("Independence Day", Calendar.getHoliday("July"));
        assertEquals("International Youth Day", Calendar.getHoliday("August"));
        assertEquals("Labor Day", Calendar.getHoliday("September"));
        assertEquals("Halloween", Calendar.getHoliday("October"));
        assertEquals("Thanksgiving", Calendar.getHoliday("November"));
        assertEquals("Christmas", Calendar.getHoliday("December"));
    }
}
