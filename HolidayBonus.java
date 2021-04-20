
public class HolidayBonus {

	public HolidayBonus() {
	}
	
	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
		double[] holidayBonus = new double[10];
		for (int i=0; i<data.length; i++) {
			for(int j=0; j < data[i].length; j++) {
				if(data[i][j] > 0) {
					
					if(TwoDimRaggedArrayUtility.getHighestInColumn(data, j) == data [i][j] ) {
						holidayBonus[i] += high;
					}
					else if(TwoDimRaggedArrayUtility.getLowestInColumn(data, j) == data [i][j]) {
						holidayBonus[i] += low;
					}
					else 
						holidayBonus[i] += other;
				}
			}
		}
		return holidayBonus;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		double holidayBonusTotal = 0;
		double[] holidayBonus = calculateHolidayBonus(data, high,low,other);
		for(int i=0; i<holidayBonus.length; i++) {
			holidayBonusTotal += holidayBonus[i];
		}
		return holidayBonusTotal;
	}
}
