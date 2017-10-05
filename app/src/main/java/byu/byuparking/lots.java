package byu.byuparking;

/**
 * Created by Garrett on 10/5/2017.
 */

public class lots
{
    private int totalSpots;
    private int currentAvailable;
    private int hoursStart;
    private int hoursEnd;
    private double distance;
    private String lotType;
    //Find lat long for google maps for final destination

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

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getLotType() {
        return lotType;
    }

    public void setLotType(String lotType) {
        this.lotType = lotType;
    }

    public lots(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType)
    {
        this.totalSpots = totalSpots;
        this.currentAvailable = currentAvailable;
        this.hoursStart = hoursStart;
        this.hoursEnd = hoursEnd;
        this.lotType = lotType;
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
        String hours = Integer.toString(hoursStart)+"am-"+Integer.toString(hoursEnd)+"pm";
        return hours;
    }

    //pass in the lat long (currentLocation)
    public void updateDistance()
    {

    }



}
