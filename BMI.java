import java.util.Scanner;

public class BMI {
    private final double POUND_KG =  0.45359237;
    private final double INCH_METER =   0.0254;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double w = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double h = input.nextDouble();
        BMI currBMI = new BMI();
        currBMI.getBMI(w,h);
    }


    public void getBMI(double weight, double height) {
        double height_m = height * this.INCH_METER;
        double weight_kg= weight * this.POUND_KG;
        double result =  weight_kg/ (height_m * height_m);

        System.out.println("BMI is " + result);
        System.out.println(interpretation(result));
        
    }

    private String interpretation(double bmi){
        if(bmi  < 18.5){
            return "Underweight";
        }
        else if (bmi <25.0){
            return "Normal";
        }
        else if (bmi  < 30.0){
            return "Overweight";
        }
        else{
            return "Obese";
        }
    }

    
}
