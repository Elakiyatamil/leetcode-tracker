// Last updated: 09/07/2026, 09:48:01
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Check leap year
        if (isLeap(year)) {
            daysInMonth[1] = 29;
        }

        int totalDays = 0;

        // Add days of previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        // Add current day
        totalDays += day;

        return totalDays;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}