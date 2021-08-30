import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    public ArrayList<Attraction> attractions;
    public ArrayList<Stall> stalls;


    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

//    public ArrayList<IReviewed> getAllReviewed(){
//        ArrayList<IReviewed> allReviewed;
//        return allReviewed;
//    }
    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addVisitedAttractions(attraction);
    }
}
