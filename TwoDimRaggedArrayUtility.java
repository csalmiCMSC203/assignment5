import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class TwoDimRaggedArrayUtility {

	private File inputFile,outputFile;
	public void TwDimRaggedArrayUtility() {
		
	}
	
	public static double getAverage(double[][] data) {
		double averageData;
		double total = 0; 
		int numberOfElements = 0; 

		for(int i=0; i < data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				total += data[i][j]; 
				numberOfElements ++;
			}
		}
		
		averageData = total/(numberOfElements);
		
		return averageData;
	}
	
	public static double getTotal(double[][] data) {
		double total = 0;
		for(int i=0; i < data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				total += data[i][j]; 
			}
		}
		
		return total;
	}
	
	public static double getHighestInArray(double[][] data) {
		double highest = data[0][0];
		for(int i=0; i < data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				if(data[i][j] > highest) {
					highest = data[i][j];
				}
			}
		}
		return highest;
	}
	
	public static double getLowestInArray(double[][] data) {
		double lowest = Double.POSITIVE_INFINITY;;
		for(int i=0; i < data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				if(data[i][j] < lowest) {
					lowest = data[i][j];
				}
			}
		}
		return lowest;
	}
	
	public static double getHighestInColumn(double[][] data, int col) {
		double highestInColumn = Double.NEGATIVE_INFINITY;
		for(int i=0; i<data.length;i++) {
			if(data[i].length > col) {
				if(data[i][col] > highestInColumn) {
					highestInColumn = data[i][col];
				}
			}
		}
		return highestInColumn;
	}
	
	public static int getHighestInColumnIndex(double[][] data, int col) {
		double highestInColumn = Double.NEGATIVE_INFINITY;
		int highestInColumnIndex = 0;
		for(int i=0; i<data.length; i++) {
			if(data[i].length > col) {
				if(data[i][col] > highestInColumn) {
					highestInColumn = data[i][col];
					highestInColumnIndex = i;
				}
			}
		}
		return highestInColumnIndex;
	}
	
	public static double getLowestInColumn(double[][] data, int col) {
		double lowestInColumn = Double.POSITIVE_INFINITY;
		for(int i=0; i<data.length;i++) {
			if(data[i].length > col) {
				if(data[i][col] < lowestInColumn) {
					lowestInColumn = data[i][col];
				}
			}
		}
		return lowestInColumn;
	}
	
	public static int getLowestInColumnIndex(double[][] data, int col) {
		double lowestInColumn = Double.POSITIVE_INFINITY;
		int lowestInColumnIndex = 0;
		for(int i=0; i<data.length;i++) {
			if(data[i].length > col) {
				if(data[i][col] < lowestInColumn) {
					lowestInColumn = data[i][col];
					lowestInColumnIndex = i;
				}
			}
		}
		return lowestInColumnIndex;
	}
	
	public static double getColumnTotal(double[][] data, int col) {
		double columnTotal = 0;
		for(int i=0; i < data.length; i++) {
			if(data[i].length > col) {
				columnTotal += data[i][col];
			}
		}
		return columnTotal;
	}
	
	public static double getHighestInRow(double[][] data, int row) {
		double highestInRow = Double.NEGATIVE_INFINITY;
		for(int i=0; i<10;i++) {
			if(data[row].length > i) {
				if(data[row][i] > highestInRow) {
					highestInRow = data[row][i];
				}
			}
		}
		return highestInRow;
	}
	
	public static int getHighestInRowIndex(double[][] data, int row) {
		double highestInRow = Double.NEGATIVE_INFINITY;
		int highestInRowIndex = 0;
		for(int i=0; i<10;i++) {
			if(data[row].length > i) {
				if(data[row][i] > highestInRow) {
					highestInRow = data[row][i];
					highestInRowIndex = i;
				}
			}
		}
		return highestInRowIndex;
	}
	
	public static double getLowestInRow(double[][] data, int row) {
		double lowestInRow = Double.POSITIVE_INFINITY;
		for(int i=0; i<10;i++) {
			if(data[row].length > i) {
				if(data[row][i]< lowestInRow) {
					lowestInRow = data[row][i];
				}
			}
		}
		return lowestInRow;
	}
	
	public static int getLowestInRowIndex(double[][] data, int row) {
		double lowestInRow = Double.POSITIVE_INFINITY;
		int lowestInRowIndex = 0;
		for(int i=0; i<10;i++) {
			if(data[row].length > i) {
				if(data[row][i] < lowestInRow) {
					lowestInRow = data[row][i];
					lowestInRowIndex = i;
				}
			}
		}
		return lowestInRowIndex;
	}
	
	public static double getRowTotal(double[][] data, int row) {
		double rowTotal = 0;
		for(int i=0; i < 10; i++ ) {
			if(data[row].length > i) {
				rowTotal += data[row][i];
			}
		}
		return rowTotal;
	}
	
	public static double[][] readFile(File file) throws FileNotFoundException{
		Scanner sc = new Scanner(new BufferedReader(new FileReader(file)));
		 ArrayList<double[]> myList = new ArrayList<double[]>();
	     while(sc.hasNextLine()) {
	            String[] line = sc.nextLine().trim().split(" ");
	            double[] myArray = new double[line.length];
	            for (int i=0; i<line.length; i++) {
	               myArray[i] = Double.parseDouble(line[i]);
	            }
	            myList.add(myArray);
	         }
	      double[][] myArray = new double[myList.size()][];
	      for(int i=0; i<myList.size(); i++) {
	    	  myArray[i] = myList.get(i);
	      }
	      return myArray;
	}
	
	public static void writeToFile(double [][] data, File outPutFile) throws FileNotFoundException {
		StringBuilder builder = new StringBuilder();

		for(int i=0; i < data.length; i++) {
			for(int j=0; j<data[i].length; j++) {		   
		      builder.append(data[i][j] + " ");
		   }
		   builder.append("\n");
		}
		try {
		BufferedWriter writer = new BufferedWriter(new FileWriter(outPutFile));
		writer.write(builder.toString());
		writer.close();
		}
		catch(FileNotFoundException e){
			throw new FileNotFoundException();
		}
		catch(IOException e) {
			throw new FileNotFoundException();
			}
		}	
}
