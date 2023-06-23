//6. Write a Java program that takes a month number as input (1-12)
// and outputs the corresponding month name using a switch statement.

public class Que10_6 {
    public static void main(String[] args) {
        int month = 11;
        String dayName;

        switch (month) {
            case 1:
                dayName = "january";
                break;
            case 2:
                dayName = "February";
                break;
            case 3:
                dayName = "March";
                break;
            case 4:
                dayName = "April";
                break;
            case 5:
                dayName = "May";
                break;
            case 6:
                dayName = "June";
                break;
            case 7:
                dayName = "July";
                break;
            case 8:
                dayName = "August";
                break;
            case 9:
                dayName = "September";
                break;
            case 10:
                dayName = "Octuber";
                break;
            case 11:
                dayName = "November";
                break;
            case 12:
                dayName = "December";
                break;
            default:
                dayName = "Invalid month";
                break;
        }

        System.out.println(dayName);
    }
}
