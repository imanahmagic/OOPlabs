package lab8;

import java.io.*;
import java.util.Random;

public class Events {
    //constant things so theyre enums
    private static final String[] EVENT_TYPES = {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int NUM_RECORDS = 1000000;
    public static void generateEventsFile(String filename, int numOfRecords) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
        Random rnd = new Random();
        for(int i=0; i<numOfRecords; i++){
            String eventType = EVENT_TYPES[rnd.nextInt(EVENT_TYPES.length)];
            int userId = rnd.nextInt(999);

            bw.write(eventType + userId);
            bw.newLine();
            bw.close();
        }
    }
    private static void readEventsFile(String filename) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(filename));
        for(int i=0; i<5; i++){
            System.out.println(br.readLine());
        }
    }
    public static void main(String[] args) {
        String fileName = "events.txt";

        try {
            generateEventsFile(fileName, NUM_RECORDS);
            readEventsFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
