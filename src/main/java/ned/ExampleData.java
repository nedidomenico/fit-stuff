package ned;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import java.util.ArrayList;

public class ExampleData {

    public ArrayList<Vector2D> position;

    public ArrayList<double[]> rangeTimes;

    public ExampleData() {
        position = new ArrayList<Vector2D>();
        rangeTimes = new ArrayList<double[]>();
    }

}
