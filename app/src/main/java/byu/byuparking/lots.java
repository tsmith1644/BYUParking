package byu.byuparking;

/**
 * Created by Garrett on 10/5/2017.
 */
import com.google.android.gms.maps.model.LatLng;

public class lots
{
    private int totalSpots;
    private int currentAvailable;
    private int hoursStart;
    private int hoursEnd;
    private double distance;
    private String lotType;
    private LatLng destination;

    public int getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots(int totalSpots) {
        this.totalSpots = totalSpots;
    }

    public int getCurrentAvailable() {
        return currentAvailable;
    }

    public void setCurrentAvailable(int currentAvailable) {
        this.currentAvailable = currentAvailable;
    }

    public int getHoursStart() {
        return hoursStart;
    }

    public void setHoursStart(int hoursStart) {
        this.hoursStart = hoursStart;
    }

    public int getHoursEnd() {
        return hoursEnd;
    }

    public void setHoursEnd(int hoursEnd) {
        this.hoursEnd = hoursEnd;
    }

    public double getDistance() {
        return distance;
    }

    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }

    public lots(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType, LatLng destination)
    {
        this.totalSpots = totalSpots;
        this.currentAvailable = currentAvailable;
        this.hoursStart = hoursStart;
        this.hoursEnd = hoursEnd;
        this.lotType = lotType;
        this.destination = destination;
    }

    public LatLng getDestination() {
        return destination;
    }

    public String displayAvailability()
    {
        //could possibly remove available
        String results = Integer.toString(currentAvailable) + "/"+Integer.toString(totalSpots)+ " available";
        return results;
    }

    //sets up hours for display
    public String displayHours()
    {
        String hours = Integer.toString(hoursStart)+"am-"+Integer.toString(hoursEnd)+"pm M-F";
        return hours;
    }

    public void updateDistance( LatLng currentLocation)
    {

        double tempLat;
        double tempLong;
        int radius = 6371;
        tempLat = degreesToRadians(this.destination.latitude - currentLocation.latitude);
        tempLong = degreesToRadians(this.destination.longitude - currentLocation.longitude);
        double newDistance = Math.sin((tempLat/2)) * Math.sin(tempLat/2) +
                Math.cos(degreesToRadians(currentLocation.latitude)) * Math.cos(degreesToRadians(this.destination.latitude))
                * Math.sin(tempLong/2) * Math.sin(tempLong/2);

        double temp = 2 * Math.atan2(Math.sqrt(newDistance),Math.sqrt(1-newDistance));
        this.distance = radius*temp;
    }

    private double degreesToRadians(double degree)
    {
        return degree * (Math.PI/180);
    }



}
