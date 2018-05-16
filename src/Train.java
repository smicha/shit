import java.time.Duration;
import java.util.Date;

/**
 * Created by smicha on 5/16/18.
 */

class Train {
    String trainName;
    Date departure;
    Date arrival;
    Duration duration;


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

    @Override
    public String toString() {
        return "Train{" +
                "trainName='" + trainName + '\'' +
                ", departure=" + departure +
                ", arrival=" + arrival +
                ", duration=" + duration +
                '}';
    }
}
