package org.example.sorting;

/*
HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity. If the amount spent by a client on a particular day is greater than or equal to  the client's median spending for a trailing number of days, they send the client a notification about potential fraud. The bank doesn't send the client any notifications until they have at least that trailing number of prior days' transaction data.

Given the number of trailing days  and a client's total daily expenditures for a period of  days, determine the number of times the client will receive a notification over all  days.
 */

import java.util.ArrayList;
import java.util.List;

public class activityNotifications {

    private static double getMedian(int[] count, int d){

        int medianPos1 = d /2;
        int medianPos2 = d%2 == 0 ? d/2 -1 : medianPos1;

        int countSum = 0;
        double median1 = 0, median2 = 0;

        for (int i = 0; i < count.length; i++) {

            countSum += count[i];

            if(countSum > medianPos2 && median2 == 0){
                median2 = i;
            }

            if(countSum > medianPos1){
                median1 = i;
                break;
            }

        }

        return (median1 + median2) / 2.0;

    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notificationCount = 0;

        int n = expenditure.size();

        int[] count = new int[201];

        for (int i = 0; i < d; i++) {
            count[expenditure.get(i)]++;
        }

        for (int i = d; i < n; i++) {

            double median = getMedian(count, d);

            if(expenditure.get(i) >= median * 2){
                notificationCount++;
            }

            count[expenditure.get(i-d)]--;
            count[expenditure.get(i)]++;

        }


        return notificationCount;

    }

    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();

        num.add(2);
        num.add(3);
        num.add(4);
        num.add(2);
        num.add(3);
        num.add(6);
        num.add(8);
        num.add(4);
        num.add(5);
        activityNotifications(num, 5);
    }
}
