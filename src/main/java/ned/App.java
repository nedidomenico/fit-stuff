package ned;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

import java.util.ArrayList;

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

        Vector2D gp = new Vector2D(10,2);

        ArrayList<double[]> out;

        out = GenExData.genDat(fp, gp);
//        out.forEach( a -> System.out.println(a[0] + " " + a[1]) );
        double[] prescribedDistances = new double[out.size()];
        for(int i = 0; i<prescribedDistances.length; i++){
            prescribedDistances[i] = out.get(i)[0];
        }

        Vector2D[] observedPoints = fp;

        CircleFit.fitSome(prescribedDistances, observedPoints);

    }
}
