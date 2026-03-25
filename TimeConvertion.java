 public class TimeConvertion{
 public static String timeConversion(String s) {
    // Write your code here
          String period = s.substring(8); // AM or PM
    int hour = Integer.parseInt(s.substring(0, 2));
    String rest = s.substring(2, 8); // :mm:ss
    
    if (period.equals("AM")) {
        if (hour == 12) {
            hour = 0;
        }
    } else { // PM
        if (hour != 12) {
            hour += 12;
        }
    }

    return String.format("%02d", hour) + rest;

    }

}