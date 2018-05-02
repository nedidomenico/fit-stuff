package ned;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        CircleFit.fitSome();
        Vector2D[] fp = new Vector2D[] {
                new Vector2D( 30.0,  0.0),
                new Vector2D( 35.0,  5.0),
                new Vector2D( 40.0,  10.0),
                new Vector2D( 50.0,  15.0),
                new Vector2D( 60.0,  15.0)
        };

        Vector2D gp = new Vector2D(10,0);

        ArrayList<double[]> out;

        out = GenExData.genDat(fp, gp);


    }
}
