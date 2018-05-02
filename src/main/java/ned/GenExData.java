package ned;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import java.util.ArrayList;

public class GenExData {

    public static ArrayList<double[]> genDat(Vector2D[] flightPos, Vector2D guyPos){

        ArrayList<double[]> rangeTimes = new ArrayList<>();
        double tTime = 0;
        for (Vector2D fp: flightPos) {
            rangeTimes.add( new double[]{fp.distance(guyPos), tTime} );
            tTime += 1.0;
        }
        return rangeTimes;
    }
}
