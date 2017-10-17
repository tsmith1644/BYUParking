package byu.byuparking;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by samue on 10/5/2017.
 */

public class listOfLots {
    private TreeMap<String, Lot> parkingList = new TreeMap<>();

    //public Lot(int totalSpots, int currentAvailable, int hoursStart, int hoursEnd, String lotType, LatLng destination)
    public listOfLots() {
        List<LatLng> A3Shape = new ArrayList<>();
        A3Shape.add(new LatLng(40.250144, -111.647228));
        A3Shape.add(new LatLng(40.249472, -111.647206));
        A3Shape.add(new LatLng(40.249480, -111.646186));
        A3Shape.add(new LatLng(40.250127, -111.646176));
        Lot A3 = new Lot(100, 25, 7, 7, "A", new LatLng(40.249727, -111.646723), A3Shape);

        List<LatLng> Y37Shape = new ArrayList<>();
        Y37Shape.add(new LatLng(40.247982, -111.656237));
        Y37Shape.add(new LatLng(40.247973, -111.657938));
        Y37Shape.add(new LatLng(40.248840, -111.657920));
        Y37Shape.add(new LatLng(40.249445, -111.656887));
        Y37Shape.add(new LatLng(40.248946, -111.656289));
        Lot Y37 = new Lot(500, 333, 7, 4, "Y", new LatLng(40.248638, -111.656969), Y37Shape);

        List<LatLng> G26Shape = new ArrayList<>();
        G26Shape.add(new LatLng(40.249698, -111.644851));
        G26Shape.add(new LatLng(40.249666, -111.643434));
        G26Shape.add(new LatLng(40.248690, -111.643436));
        G26Shape.add(new LatLng(40.248674, -111.644167));
        G26Shape.add(new LatLng(40.249545, -111.644331));
        G26Shape.add(new LatLng(40.249541, -111.644804));
        Lot G26 = new Lot(250, 3, 7, 4, "G", new LatLng(40.249179, -111.643874), G26Shape);

        List<LatLng> A26Shape = new ArrayList<>();
        A26Shape.add(new LatLng(40.249413, -111.644307));
        A26Shape.add(new LatLng(40.248693, -111.644321));
        A26Shape.add(new LatLng(40.248687, -111.644863));
        A26Shape.add(new LatLng(40.249485, -111.644859));
        Lot A26 = new Lot(125, 17, 7, 4, "A", new LatLng(40.249010, -111.644557), A26Shape);

        List<LatLng> VP1Shape = new ArrayList<>();
        VP1Shape.add(new LatLng(40.247988, -111.645520));
        VP1Shape.add(new LatLng(40.248336, -111.645530));
        VP1Shape.add(new LatLng(40.248384, -111.644290));
        VP1Shape.add(new LatLng(40.248011, -111.644268));
        Lot VP1 = new Lot(130, 56, 5, 11, "V", new LatLng(40.248266, -111.644780), VP1Shape);

        List<LatLng> U45Shape = new ArrayList<>();
        U45Shape.add(new LatLng(40.258806, -111.658369));
        U45Shape.add(new LatLng(40.258828, -111.656264));
        U45Shape.add(new LatLng(40.256632, -111.656316));
        U45Shape.add(new LatLng(40.256697, -111.657587));
        U45Shape.add(new LatLng(40.257565, -111.657533));
        U45Shape.add(new LatLng(40.257571, -111.658364));
        Lot U45 = new Lot(600, 435, 5, 11, "U", new LatLng(40.257881, -111.657452), U45Shape);

        List<LatLng> Y49Shape = new ArrayList<>();
        Y49Shape.add(new LatLng(40.255998, -111.653227));
        Y49Shape.add(new LatLng(40.255889, -111.650957));
        Y49Shape.add(new LatLng(40.256648, -111.651823));
        Y49Shape.add(new LatLng(40.256909, -111.653249));
        Lot Y49 = new Lot(600, 248, 7, 4, "Y", new LatLng(40.256355, -111.652631), Y49Shape);

        List<LatLng> Y48Shape = new ArrayList<>();
        Y48Shape.add(new LatLng(40.255988, -111.655842));
        Y48Shape.add(new LatLng(40.256280, -111.655864));
        Y48Shape.add(new LatLng(40.256313, -111.653403));
        Y48Shape.add(new LatLng(40.255997, -111.653395));
        Lot Y48 = new Lot(150, 63, 7, 4, "Y", new LatLng(40.256118, -111.654742), Y48Shape);

        List<LatLng> Y19Shape = new ArrayList<>();
        Y19Shape.add(new LatLng(40.255478, -111.650157));
        Y19Shape.add(new LatLng(40.255783, -111.649111));
        Y19Shape.add(new LatLng(40.255047, -111.649044));
        Y19Shape.add(new LatLng(40.255044, -111.650211));
        Lot Y19 = new Lot(75, 13, 7, 4, "Y", new LatLng(40.255232, -111.649710), Y19Shape);

        List<LatLng> A39Shape = new ArrayList<>();
        A39Shape.add(new LatLng(40.250153, -111.654560));
        A39Shape.add(new LatLng(40.247910, -111.654507));
        A39Shape.add(new LatLng(40.247905, -111.655991));
        A39Shape.add(new LatLng(40.247753, -111.655986));
        A39Shape.add(new LatLng(40.247796, -111.654388));
        A39Shape.add(new LatLng(40.250075, -111.654031));
        Lot A39 = new Lot(115, 77, 7, 4, "A", new LatLng(40.249020, -111.654383), A39Shape);

        List<LatLng> G40Shape = new ArrayList<>();
        G40Shape.add(new LatLng(40.251599, -111.652649));
        G40Shape.add(new LatLng(40.250993, -111.652002));
        G40Shape.add(new LatLng(40.250867, -111.653310));
        G40Shape.add(new LatLng(40.250248, -111.653277));
        G40Shape.add(new LatLng(40.250199, -111.652442));
        G40Shape.add(new LatLng(40.249873, -111.652590));
        G40Shape.add(new LatLng(40.250245, -111.653667));
        G40Shape.add(new LatLng(40.250829, -111.653613));
        Lot G40 = new Lot(115, 65, 7, 4, "G", new LatLng(40.250722, -111.653391), G40Shape);

        List<LatLng> A16Shape = new ArrayList<>();
        A16Shape.add(new LatLng(40.249951, -111.651535));
        A16Shape.add(new LatLng(40.249941, -111.651144));
        A16Shape.add(new LatLng(40.249535, -111.651250));
        A16Shape.add(new LatLng(40.249535, -111.651645));
        Lot A16 = new Lot(225, 166, 7, 6, "A", new LatLng(40.249748, -111.651369), A16Shape);

        List<LatLng> A2Shape = new ArrayList<>();
        A2Shape.add(new LatLng(40.251082, -111.647698));
        A2Shape.add(new LatLng(40.251607, -111.646983));
        A2Shape.add(new LatLng(40.250808, -111.646710));
        A2Shape.add(new LatLng(40.250708, -111.647016));
        Lot A2 = new Lot(151, 88, 5, 11, "A", new LatLng(40.251302, -111.646975), A2Shape);

        List<LatLng> VP2Shape = new ArrayList<>();
        VP2Shape.add(new LatLng(40.251144, -111.647790));
        VP2Shape.add(new LatLng(40.251721, -111.647061));
        VP2Shape.add(new LatLng(40.252034, -111.647765));
        VP2Shape.add(new LatLng(40.251906, -111.647941));
        Lot VP2 = new Lot(151, 28, 7, 6, "V", new LatLng(40.251588, -111.647672), VP2Shape);


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
