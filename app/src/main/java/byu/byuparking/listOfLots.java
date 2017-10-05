package byu.byuparking;

import java.util.TreeMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by samue on 10/5/2017.
 */

public class listOfLots {
    private TreeMap<String, lots> parkingList = new TreeMap<>();

    //public lots(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType, LatLng destination)
    public listOfLots() {
        lots A3 = new lots(100,25,7,7,"A", new LatLng(40.249727,-111.646723));
        lots Y37 = new lots(500,333,7,4,"Y", new LatLng(40.248638,-111.656969));
        lots G26 = new lots(250,3,7,4,"G", new LatLng(40.249179,-111.643874));
        lots A26 = new lots(125,17,7,4,"A", new LatLng(40.249010,-111.644557));
        lots VP1 = new lots(130,56,5,11,"V", new LatLng(40.248266,-111.644780));
        lots U45 = new lots(600,435,5,11,"U", new LatLng(40.257881,-111.657452));


        parkingList.put("A3",A3);
        parkingList.put("Y37",Y37);
        parkingList.put("G26",G26);
        parkingList.put("A26",A26);
        parkingList.put("VP1",VP1);
        parkingList.put("U45",U45);

    }

    public TreeMap<String, lots> getParkingList() {
        return parkingList;
    }
}
