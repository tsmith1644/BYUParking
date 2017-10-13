package byu.byuparking;

import java.util.TreeMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by samue on 10/5/2017.
 */

public class listOfLots {
    private TreeMap<String, Lot> parkingList = new TreeMap<>();

    //public Lot(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType, LatLng destination)
    public listOfLots() {
        Lot A3 = new Lot(100, 25, 7, 7, "A", new LatLng(40.249727, -111.646723));
        Lot Y37 = new Lot(500, 333, 7, 4, "Y", new LatLng(40.248638, -111.656969));
        Lot G26 = new Lot(250, 3, 7, 4, "G", new LatLng(40.249179, -111.643874));
        Lot A26 = new Lot(125, 17, 7, 4, "A", new LatLng(40.249010, -111.644557));
        Lot VP1 = new Lot(130, 56, 5, 11, "V", new LatLng(40.248266, -111.644780));
        Lot U45 = new Lot(600, 435, 5, 11, "U", new LatLng(40.257881, -111.657452));
        Lot Y49 = new Lot(600, 248, 7, 4, "Y", new LatLng(40.256355, -111.652631));
        Lot Y48 = new Lot(150, 63, 7, 4, "Y", new LatLng(40.256118, -111.654742));
        Lot Y19 = new Lot(75, 13, 7, 4, "Y", new LatLng(40.255232, -111.649710));
        Lot A39 = new Lot(115, 77, 7, 4, "A", new LatLng(40.249020, -111.654383));
        Lot G40 = new Lot(115, 65, 7, 4, "G", new LatLng(40.250722, -111.653391));
        Lot A16 = new Lot(225, 166, 7, 6, "A", new LatLng(40.251122, -111.650650));
        Lot A2 = new Lot(151, 88, 5, 11, "A", new LatLng(40.251302, -111.646975));
        Lot VP2 = new Lot(151, 28, 7, 6, "V", new LatLng(40.251588, -111.647672));


        parkingList.put("A3",A3);
        parkingList.put("Y37",Y37);
        parkingList.put("G26",G26);
        parkingList.put("A26",A26);
        parkingList.put("VP1",VP1);
        parkingList.put("U45",U45);
        parkingList.put("Y49",Y49);
        parkingList.put("Y48",Y48);
        parkingList.put("Y19",Y19);
        parkingList.put("A39",A39);
        parkingList.put("G40",G40);
        parkingList.put("A16",A16);
        parkingList.put("A2",A2);
        parkingList.put("VP2",VP2);


    }

    public TreeMap<String, Lot> getParkingList() {
        return parkingList;
    }
}
