package cs499blue.algorithms;

import cs499blue.models.Edge;
import cs499blue.models.Vertex;

/**
 * author: vwilson
 * date: 4/1/14
 */

public class Distance {
      private static Set<Edge> edges;
    //returns the distance from a to b
    public static Double distanceFrom(Vertex a, Vertex b) {
        for(Edge e: edges){
            if(e.getA().equals(a)&& e.getB().equals(b)){
                return edge.getWeight();
                }
        }
        
        
        throw new UnsupportedOperationException("shouldn't occur");
    }

    //returns the length of e
    public static Double lengthOf(Edge e) {
        double x = e.getA();
        double y = e.getB();
        return distanceFrom(x, y)
    
}
