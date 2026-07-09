// Last updated: 09/07/2026, 09:47:54
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDays(date1) - getDays(date2));
    }

    private int getDays(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int totalDays = 0;

        // Add days for years
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }

        // Days in months
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (isLeap(year)) {
            daysInMonth[1] = 29;
        }

        // Add days for months
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