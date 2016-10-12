/**
 * This problem is from the Programming Fundamentals Retake Exam (11 September 
 * 2016). Thea is a photographer. She takes pictures of people on special events. 
 * She is a good friend and you want to help her. She wants to inform her clients 
 * when their pictures will be ready. Since the number of pictures is big and it 
 * requires time for editing (#nofilter, #allnatural) every single picture - you 
 * decide to write a program in order to help her. Thea follows this pattern: 
 * first she takes all pictures. Then she goes through every single picture to 
 * filter these pictures that are considered "good". Then she needs to upload 
 * every single filtered picture to her cloud. She is considered ready when all 
 * filtered pictures are uploaded in her picture storage. You will receive the 
 * amount of pictures she had taken. Then the approximate time in seconds for 
 * every picture to be filtered. Then a filter factor – a percentage (integer 
 * number) of the total photos (rounded to the nearest bigger integer value e.g. 
 * 5.01 -> 6) that are good enough to be given to her clients (Photoshop may do 
 * miracles but Thea does not). Approximate time for every picture to be uploaded 
 * will be given again in seconds. Your task is: based on this input to display 
 * total time needed for her to be ready with the pictures in given below format.
 * Input
 * On the first line you will receive an integer N – the amount of pictures Thea had taken.
 * On the second line you will receive an integer FT – the amount of time (filter time) in seconds that Thea will require to filter every single picture.
 * On the third line you will receive an integer FF – the filter factor or the percentage of the total pictures that are considered “good” to be uploaded.
 * On the fourth line you will receive an integer UT – the amount of time needed for every filtered picture to be uploaded to her storage.
 * The input will be in the described format, there is no need to check it explicitly.
 * Output
 * Print the amount of time Thea will need in order to have her pictures ready to be sent to her client in given format:
 * d:HH:mm:ss 
 * d - days needed – starting from 0.
 * HH –  hours needed – from 00 to 24.
 * mm – minutes needed – from 00 to 59.
 * ss – minutes needed – from 00 to 59.
 * Constrains
 * The amount of total pictures Thea will have taken is range [0 … 1 000 000]
 * The seconds for both filtering and uploading will be in range [0 … 100 000]
 * The filter factor will be an integer number between [0 … 100].
 */
package Exercises_Data_Types_and_Variables;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author There Be Dragons
 */
public class P20_Thea_the_Photographer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPics = sc.nextInt();
        long filterTimePerPic = sc.nextLong();
        int filterFactor = sc.nextInt();
        long uploadTimePerPic = sc.nextLong();
        
        int filteredPics = (int)Math.ceil((double)totalPics * ((double)filterFactor / 100));
        long totalFilterTime = totalPics * filterTimePerPic;
        long totalUploadTime = filteredPics * uploadTimePerPic;
        long totalTime = (totalFilterTime + totalUploadTime) * 1000;
        
        
        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;

        long elapsedDays = totalTime / daysInMilli;
        totalTime = (int) (totalTime % daysInMilli);

        long elapsedHours = totalTime / hoursInMilli;
        totalTime = (int) (totalTime % hoursInMilli);

        long elapsedMinutes = totalTime / minutesInMilli;
        totalTime = (int) (totalTime % minutesInMilli);

        long elapsedSeconds = totalTime / secondsInMilli;

        System.out.printf(
            "%d:%02d:%02d:%02d",
            elapsedDays,
            elapsedHours, elapsedMinutes, elapsedSeconds);
                
    }
}
