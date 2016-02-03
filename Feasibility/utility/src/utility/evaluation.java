package utility;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import utility.Passenger;

public class evaluation {

	static double F = 10.0;
	static double G = 2;
	
	
	public static boolean isFeasible(List<Passenger> curr_passengers, List<Passenger> new_passengers, double delay){
		List<Double> newCost = new ArrayList<Double>();
		List<Double> oldCost = new ArrayList<Double>();
		boolean isFeasible=true;

		Set<Passenger> inputSet = new HashSet<Passenger>();
		inputSet.addAll(curr_passengers);
		Set<Passenger> inputSetNew = new HashSet<Passenger>();
		inputSetNew.addAll(curr_passengers);
		inputSetNew.addAll(new_passengers);

		List<Set<Passenger>> subSets = new ArrayList<Set<Passenger>>();
		List<Set<Passenger>> subSetsNew = new ArrayList<Set<Passenger>>();
		for(Passenger addToSets:inputSet) {
		    List<Set<Passenger>> newSets = new ArrayList<Set<Passenger>>();
		    for(Set<Passenger> curSet:subSets) {
		        Set<Passenger> copyPlusNew = new HashSet<Passenger>();
		        copyPlusNew.addAll(curSet);
		        copyPlusNew.add(addToSets);
		        newSets.add(copyPlusNew);
		    }
		    Set<Passenger> newValSet = new HashSet<Passenger>();
		    newValSet.add(addToSets);
		    newSets.add(newValSet);
		    subSets.addAll(newSets);
		}
		for(Passenger addToSets:inputSetNew) {
		    List<Set<Passenger>> newSets = new ArrayList<Set<Passenger>>();
		    for(Set<Passenger> curSet:subSetsNew) {
		        Set<Passenger> copyPlusNew = new HashSet<Passenger>();
		        copyPlusNew.addAll(curSet);
		        copyPlusNew.add(addToSets);
		        newSets.add(copyPlusNew);
		    }
		    Set<Passenger> newValSet = new HashSet<Passenger>();
		    newValSet.add(addToSets);
		    newSets.add(newValSet);
		    subSetsNew.addAll(newSets);
		}
		
		oldCost = calculateCost(curr_passengers,inputSet,subSets);
		newCost = calculateCost(curr_passengers,inputSetNew,subSetsNew);
		
		for(int i=0;i<curr_passengers.size();i++){
			isFeasible = checkUtility(curr_passengers.get(i),delay, oldCost.get(i), newCost.get(i));
			if(!isFeasible)
				return isFeasible;
		}
		return isFeasible;
		
	}
	
	public static double calculateIndividualCost(List<Passenger> curr_passengers){
		double cost=0;
		int maxLegs = 0;
		for (Passenger p :curr_passengers){
			if(p.legs>maxLegs)
				maxLegs = p.legs;
		}
		cost = F + G * maxLegs;
		return cost;
	}
	
	public static List<Double> calculateCost(List<Passenger> curr_passengers, Set<Passenger> inputSet, List<Set<Passenger>> subSets){
		double oldCostSet = 0.0;
		double oldCostSetWithout = 0.0;
		List<Double> cost = new ArrayList<Double>();
		for(Passenger p:curr_passengers){
			double newCostTmp = 0.0;
			for(Set<Passenger> set:subSets) {
				if(set.contains(p)){
					List <Passenger> tmp_passengers=new ArrayList<Passenger>();
					tmp_passengers.addAll(set);
					oldCostSet = calculateIndividualCost(tmp_passengers);
					tmp_passengers.remove(p);
					if(tmp_passengers.isEmpty())
						oldCostSetWithout = 0;
					else
						oldCostSetWithout = calculateIndividualCost(tmp_passengers);
					newCostTmp += (factorial(set.size()-1)*factorial(inputSet.size()-set.size())/factorial(inputSet.size()))*(oldCostSet - oldCostSetWithout);
				}
			}
			cost.add(newCostTmp);
		}
		return cost;
	}
	
	public static double factorial(int n) {
		double fact = 1.0; // this  will be the result
		for (int i = 1; i <= n; i++) {
			fact *= i;
			}
		return fact;
	}

	public static boolean checkUtility(Passenger pssgr, double delay, double oldCost, double newCost) {
		
		double timeConst = 0.7;
		double costConst = 0.5;
		double uOld = 0.0;
		double uNew = 0.0;
	
/*		uOld = pssgr.weightTravelTime * timeConst*((pssgr.maxTravelTime -  pssgr.travel_time) - Math.abs(pssgr.maxTravelTime - pssgr.travel_time)); 
		uOld += pssgr.weightCost *( -costConst*(oldCost/pssgr.maxCost));
		uOld = Math.exp(uOld);
*/
		uOld = pssgr.weightTravelTime * (-timeConst*(pssgr.travel_time/pssgr.maxTravelTime));
		uOld += pssgr.weightCost *( -costConst*(oldCost/pssgr.maxCost));
		uOld = Math.exp(uOld);
		
		if (uOld < 0 || uOld>1)
			uOld=0;
		
/*		uNew = pssgr.weightTravelTime * timeConst*((pssgr.maxTravelTime -  (pssgr.travel_time+delay)) - Math.abs(pssgr.maxTravelTime - (pssgr.travel_time + delay))); 
		uNew += pssgr.weightCost *( -costConst*(newCost/pssgr.maxCost));
		uNew = Math.exp(uNew);
	*/
		uNew = pssgr.weightTravelTime * (-timeConst*((pssgr.travel_time+delay)/pssgr.maxTravelTime));
		uNew += pssgr.weightCost *( -costConst*(newCost/pssgr.maxCost));
		uNew = Math.exp(uNew);
	
		if (uNew < 0 || uNew>1)
			uNew=0;
		if (uNew>=uOld)
			return true;
		else
			return false;
	}
	
public static void main(String[] args) {
		
		
		List<Passenger> curr_passengers = new ArrayList<Passenger>();
		List<Passenger> new_passengers= new ArrayList<Passenger>();
		
		/*For a specific route a-b-c-d-e, there are four current passengers and two new ones,
		 *so we want to check if the solution remains feasible for the current passengers */
		Passenger p = new Passenger();
		p.setId(1);
		p.setStart("a");
		p.setEnd("e");
		p.setLegs(4); 
		p.setTravelTime(1200);
		p.setCost(9.0);
		p.setWeightTravel(0.5);
		p.setWeightCost(0.5);
		p.setMaxTravel(1600);
		p.setMaxCost(10);
		
		curr_passengers.add(p);
		curr_passengers.add(new Passenger(2,"b", "e", 3,900,7,0.5,0.5,1600,10));		
		curr_passengers.add(new Passenger(3,"d", "e", 1,300,5,0.5,0.5,1200,10));
		curr_passengers.add(new Passenger(4,"d", "e", 1,300,5,0.5,0.5,1200,10));
		
		new_passengers.add(new Passenger(3,"d", "e", 1,300,5,0.5,0.5,1200,10));
		new_passengers.add(new Passenger(4,"d", "e", 1,300,5,0.5,0.5,1200,10));
		
		
		double delay=60;
		System.out.println(evaluation.isFeasible(curr_passengers,new_passengers, delay));
		delay=120;
		System.out.println(evaluation.isFeasible(curr_passengers,new_passengers, delay));
		delay=180;
		System.out.println(evaluation.isFeasible(curr_passengers,new_passengers, delay));
		
	}
	
	
}