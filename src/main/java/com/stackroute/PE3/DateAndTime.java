package com.stackroute.PE3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateAndTime {

        public static void main(String []args) {
            DateAndTime.calendarDate();
        }

        public static void calendarDate(){
            // Get calendar set to current date and time
            Calendar c = Calendar.getInstance();

            // Set the calendar to monday of the current week
            c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

            System.out.println();
            // Print dates of the current week starting on Monday
            DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
            System.out.println(df.format(c.getTime()));
            for (int i = 0; i <6; i++) {
                c.add(Calendar.DATE, 1);
            }
            System.out.println(df.format(c.getTime()));
            System.out.println();
        }
    }

