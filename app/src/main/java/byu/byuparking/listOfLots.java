package byu.byuparking;

import java.util.TreeMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by samue on 10/5/2017.
 */

public class listOfLots {
    private TreeMap<String, lots> parkingList;

    //public lots(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType, LatLng destination)
    public listOfLots() {
        lots A3 = new lots(100,25,7,7,"A", new LatLng(40.249727,-111.646723));
        lots Y37 = new lots(500,333,7,4,"Y", new LatLng(40.248638,-111.656969));
        //lots Y37 = new lots(500,333,7,4,"Y", new LatLng(40.248638,-111.656969));
        parkingList.put("A3",A3);
        parkingList.put("Y37",Y37);
    }

    public TreeMap<String, lots> getParkingList() {
        return parkingList;
    }
}
