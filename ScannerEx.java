import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		int Miles_Covered;
		double Gallons_of_Fuel;
		double Miles_Per_Gallon;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please Enter the Distance Covered (Miles):");
		Miles_Covered=scan.nextInt();
		
		System.out.print("Please Enter the Fuel Used (Gallons):");
		Gallons_of_Fuel=scan.nextDouble();
		
		Miles_Per_Gallon = Miles_Covered / Gallons_of_Fuel;
		
		System.out.println("MilesPerGalon (MPG):"+ Miles_Per_Gallon);
	}
}
