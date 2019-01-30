import java.util.Scanner;

public class RainWaterRunOff {
    public static void main(String[] args){
        double roofWidth;
        double roofLength;
        double rainInches;
        double waterCubicInches;
        double waterGallons;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input width of roof in feet: ");
        roofWidth = keyboard.nextDouble();
        System.out.println("Input length of roof in feet: ");
        roofLength = keyboard.nextDouble();
        System.out.println("Input rainfall in inches: ");
        rainInches = keyboard.nextDouble();

        waterCubicInches = (roofWidth * 12) * (roofLength * 12) * rainInches;
        waterGallons = waterCubicInches / 231;

        System.out.println("The amount of rainfall runoff was " + waterCubicInches + " cubic inches. Which is " + waterGallons + " gallons of rain.");







    }
}
