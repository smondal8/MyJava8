package Algorithm;
import java.io.*;
import java.util.*;

public class solution {
    static int minParkingSpaces(int[][] parkingStartEndTimes) {
        int lowStart = Integer.MAX_VALUE;
        int correspondingEnd = 0;
        int numberOfParkingLot = 0;
        boolean foundOverap = false;
        while(foundOverap) {
            foundOverap = false;
            for (int i = 0; i < parkingStartEndTimes.length; i++) {
                if (parkingStartEndTimes[i][0] < lowStart) {
                    lowStart = parkingStartEndTimes[i][0];
                    correspondingEnd = parkingStartEndTimes[i][1];
                    foundOverap = true;
                }
            }
            if (foundOverap) {
                numberOfParkingLot++;
                lowStart = correspondingEnd;
            }

        }
        return numberOfParkingLot;
    }

    // DO NOT MODIFY ANYTHING BELOW THIS LINE!!

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine().trim());
        int[][] parkingStartEndTimeList = new int[n][2];
        String[] parkingStartEndTimes = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
            for (int j = 0; j < parkingStartEndTime.length; j++) {
                parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
            }
        }

        int out = minParkingSpaces(parkingStartEndTimeList);
        System.out.println(out);

        wr.close();
        br.close();
    }
}