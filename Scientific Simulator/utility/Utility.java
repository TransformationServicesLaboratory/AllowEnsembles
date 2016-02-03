package allow.simulator.entity.utility;

import java.util.Comparator;
import java.util.List;

import allow.simulator.mobility.planner.Itinerary;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 * @author UOC
 *
 */
public class Utility {

	private static Comparator<Itinerary> descUtility = new Comparator<Itinerary>() {
        @Override
        public int compare(Itinerary rt1, Itinerary rt2){
            return (int) ((rt2.utility - rt1.utility) * 100);
        }
	};
	/*For experiment 1: We choose just the quicker alternative*/
	private static Comparator<Itinerary> ascUtility = new Comparator<Itinerary>() {
        @Override
        public int compare(Itinerary rt1, Itinerary rt2){
            return (int) ((rt1.duration - rt2.duration) * 100);
        }
	};
	

	@JsonCreator
	public Utility() {
		
	}
	
	public List<Itinerary> rankAlternatives(Preferences prefs, List<Itinerary> itineraries) {
		
		for (Itinerary it : itineraries) {
			it.utility = computeUtility(prefs, it.duration, it.costs, it.walkDistance, it.legs.size());
		/*	long diff = prefs.getTmax() - it.duration;
			double u = prefs.getTTweight() * (Math.exp(diff - Math.abs(diff)));
			u += prefs.getCweight() * (Math.exp(-it.costs / prefs.getCmax()));
			u += prefs.getWDweight() * (-it.walkDistance / prefs.getWmax() + 1);
			
			int transfers = it.legs.size();
			
			if (transfers == 1)
				u += prefs.getNCweight();
			else if (transfers == 2)
				u += 0.8 * prefs.getNCweight();
			else if (transfers == 3)
				u += 0.6 * prefs.getNCweight();
			else if (transfers == 4)
				u += 0.4 * prefs.getNCweight();
			else
				u += 0.2 * prefs.getNCweight();
			it.utility = Math.max(u, 0);
			
			/*if (prefs.getCarPreference() >= prefs.getBusPreference()) {
				
				for (Leg l : it.legs) {
					if (l.mode == TType.CAR) {
						it.utility = 100000;
						break;
					}
				}
			} else {
				for (Leg l : it.legs) {
					if (l.mode == TType.BUS || l.mode == TType.CABLE_CAR) {
						it.utility = 100000;
						break;
					}
				}
			}*/
		}
		itineraries.sort(descUtility);
		/*For experiment 1: We choose just the quicker alternative*/
	//	itineraries.sort(ascUtility);
		return itineraries;
	}
	
	public double computeUtility(Preferences prefs, 
			double travelTime,
			double costs,
			double walkDistance,
			int transfers) {
		double k=0.3;
		long diff = (long) (prefs.getTmax() - travelTime);
		double u = prefs.getTTweight() * (Math.exp(diff - Math.abs(diff)));
		u += prefs.getCweight() * (Math.exp(-k*costs / prefs.getCmax()));
	//	u += prefs.getWDweight() * (-walkDistance / prefs.getWmax() + 1); /*Old utility*/
		u += prefs.getWDweight() * Math.exp(-(Math.pow(walkDistance/prefs.getWmax(), 2)));
				
		if (transfers == 1)
			u += prefs.getNCweight();
		else if (transfers == 2)
			u += 0.8 * prefs.getNCweight();
		else if (transfers == 3)
			u += 0.6 * prefs.getNCweight();
		else if (transfers == 4)
			u += 0.4 * prefs.getNCweight();
		else
			u += 0.2 * prefs.getNCweight();
		
		if(u<0 || u>1)
			u=0;
		return u;
	}
}
