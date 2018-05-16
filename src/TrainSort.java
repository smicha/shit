import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Created by smicha on 5/16/18.
 */


public class TrainSort {



    public static void main(String[] args) throws FileNotFoundException,ParseException {

        TrainSort trainSort = new TrainSort();
        File file =
                new File("input.txt");
        Scanner sc = new Scanner(file);
        //get the number of trains
        Integer numberofTrains = Integer.parseInt(sc.nextLine());
        System.out.println(numberofTrains);
        //get the distance
        Integer distance = Integer.parseInt(sc.nextLine());
        System.out.println(distance);

        //create array based on number of Trains
        Train[] trains = new Train[numberofTrains];

       //load train info into the array
        Integer trainIndex = 0 ;
        Integer trainDelimiterIndex = 0;
        while (trainIndex < numberofTrains){

            trains[trainIndex] = new Train();

            try {
                //load train name
                trains[trainIndex].setTrainName(sc.nextLine());

                DateFormat formatter = new SimpleDateFormat("hh mm");
                //load arrival time
                Date arrivalTime = (Date) formatter.parse(sc.nextLine());
                trains[trainIndex].setArrival(arrivalTime);

                //departure time
                Date departureTime = (Date) formatter.parse(sc.nextLine());
                trains[trainIndex].setDeparture(departureTime);

                trains[trainIndex].setDuration(trainSort.getDuration(departureTime,arrivalTime));
                System.out.println(trains[trainIndex].toString());

                trainDelimiterIndex++;

                if (trainDelimiterIndex == 3) {
                    trainIndex++;
                    trainDelimiterIndex = 0;
                    continue;
                }
            }
            catch(NoSuchElementException nse)
            {
                System.out.println("End of file ");
                break;
            }


        }




   }

   private Duration getDuration(Date start ,Date end)
   {

       //TODO : This is a dummy function . clean it up . make it work  . Explore other options !!!!

       //TODO : Handle overnight train logic

       long diffInMilliseconds = Math.abs(end.getTime() - start.getTime());

       Duration duration = Duration.ofMillis(diffInMilliseconds);
       return duration;

   }

   private Train getFastestTrain (Train []trains)
   {

       //TODO: sort array based on duration
       //TODO : return quickest train
       return null;
   }
}
