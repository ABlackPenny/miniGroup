package comp1110.homework.J05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Movie {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String title = reader.readLine();
        int duration = Integer.parseInt(reader.readLine());
        String convertedDuration = convertedDuration(duration);
        System.out.println(title + " runs for " + convertedDuration);
    }

    public static String convertedDuration(int duration) {
        int hours = 0;
        int minutes;
        String convertedDuration;
        if (duration < 60) {
            minutes = duration;
        } else {
            hours = duration / 60;
            minutes = duration % 60;
        }

        if (hours == 0) {
            if (minutes == 1) convertedDuration = minutes + " minute";
            else convertedDuration = minutes + " minutes";
        } else if (hours == 1) {
            if (minutes == 1) convertedDuration = hours + " hour" + " and " + minutes + " minute";
            else if (minutes == 0) convertedDuration = hours + " hour";
            else convertedDuration = hours + " hour" +  " and " +minutes + " minutes";
        } else {
            if (minutes == 1) convertedDuration = hours + " hours" + " and " + minutes + " minute";
            else if (minutes == 0) convertedDuration = hours + " hours";
            else convertedDuration = hours + " hours" + " and " + minutes + " minutes";
        }

        return convertedDuration;
    }
}
