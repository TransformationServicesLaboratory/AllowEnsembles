package utility;

public class Passenger{
		int id;
		String start_point;
		String end_point;
		int legs;
		double travel_time;
		double cost;
		double weightTravelTime;
		double weightCost;
		int maxTravelTime;
		double maxCost;

		
		public Passenger(int id, String start, String end, int legs, double travel_time, double cost, double wTravel, 
				double wCost, int maxTravel, double maxCost){
			this.id = id;
			this.start_point = start;
			this.end_point = end;
			this.legs = legs;
			this.travel_time = travel_time;
			this.cost = cost;
			this.weightTravelTime = wTravel;
			this.weightCost = wCost;
			this.maxTravelTime = maxTravel;
			this.maxCost = maxCost;
			
		}
		
		public Passenger(){
			;
		}
		
		public int getId() {
			return id;
		}
		
		public String getStart() {
			return start_point;
		}
		
		public String getEnd() {
			return end_point;
		}
		
		public int getLegs() {
			return legs;
		}
		
		public double getTravelTime() {
			return travel_time;
		}
		
		public double getCost() {
			return cost;
		}
		
		public double getWTravel() {
			return weightTravelTime;
		}
		
		public double getWCost() {
			return weightCost;
		}
		
		public int getMaxTravel() {
			return maxTravelTime;
		}
		
		public double getMaxCost(){
			return maxCost;
		}
		
		public void setId(int id) {
			 this.id = id;
		}
		
		public void setStart(String start) {
			this.start_point = start;
		}
		
		public void setEnd(String end) {
			this.end_point = end;
		}
		
		public void setLegs(int legs) {
			this.legs = legs;
		}
		
		public void setTravelTime(double travel_time) {
			this.travel_time = travel_time;
		}
		
		public void setCost(double cost) {
			this.cost = cost;
		}
		
		public void setWeightTravel(double wTravel) {
			this.weightTravelTime = wTravel;
		}
		
		public void setWeightCost(double wCost) {
			this.weightCost = wCost;
		}
		
		public void setMaxTravel(int maxTravel) {
			this.maxTravelTime = maxTravel;
		}
		
		public void setMaxCost(double maxCost){
			this.maxCost = maxCost;
		}
	}