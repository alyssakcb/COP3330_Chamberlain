public class BodyMassIndex
{
    public double calcBMIscore (double inches, double pounds)
    {
        double bmi;

        bmiScore = 703 * pounds / inches^2;

        return bmi;
    }
    public String calcBMIcategory (double bmi)
    {
        String bmiCategory;

        if (bmi < 18.5)
            bmiCategory = "Underweight";
        if (bmi >= 18.5 && bmi <= 24.9)
            bmiCategory = "Normal Weight";
        if (bmi >= 25.0 && bmi <= 29.9)
            bmiCategory = "Overweight";
        if (bmi >= 30.0)
            bmiCategory = "Obesity";

        return bmiCategory;
    }
}