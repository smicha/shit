import java.io.File;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by smicha on 5/16/18.
 */


public class TrainSort {

    //inner class for demo purposes
    class Train {
        String trainName;
        Date departure;
        Date arrival;
        Duration duration;

        public Train(String trainName, Date departure, Date arrival, Duration duration) {
            this.trainName = trainName;
            this.departure = departure;
            this.arrival = arrival;
            this.duration = duration;
        }

        public String getTrainName() {
            return trainName;
        }

        public void setTrainName(String trainName) {
            this.trainName = trainName;
        }

        public Date getDeparture() {
            return departure;
        }

        public void setDeparture(Date departure) {
            this.departure = departure;
        }

        public Date getArrival() {
            return arrival;
        }

        public void setArrival(Date arrival) {
            this.arrival = arrival;
        }

        public Duration getDuration() {
            return duration;
        }

        public void setDuration(Duration duration) {
            this.duration = duration;
        }

        //dont worry about the equals and hashcode  methods for now .
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Train train = (Train) o;

            if (trainName != null ? !trainName.equals(train.trainName) : train.trainName != null) return false;
            if (departure != null ? !departure.equals(train.departure) : train.departure != null) return false;
            if (arrival != null ? !arrival.equals(train.arrival) : train.arrival != null) return false;
            return duration != null ? duration.equals(train.duration) : train.duration == null;
        }

        @Override
        public int hashCode() {
            int result = trainName != null ? trainName.hashCode() : 0;
            result = 31 * result + (departure != null ? departure.hashCode() : 0);
            result = 31 * result + (arrival != null ? arrival.hashCode() : 0);
            result = 31 * result + (duration != null ? duration.hashCode() : 0);
            return result;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

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

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());


   }
}
