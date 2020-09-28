import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();
    
        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();
    
            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);
    
            displayBmiInfo(bmi);
        }
    
        displayBmiStatistics(bmiData);
    }
    public boolean moreInput ()
    {
        char moreInp;
        boolean ret;

        Scanner in = new Scanner (System.in);
        System.out.println ("Would you like to enter a new input? Enter Y or N: ");
        moreInp = in.nextChar ();
        if (moreInp == 'T')
        {
            ret = true;
        }
        else
        {
            ret = false;
        }
        return ret;
    }
    public double getUserHeight ()
    {
        double height;
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter your height in inches: ");
        height = in.nextDouble ();
        if (height > 0)
            return height;
    }
    public double getUserWeight ()
    {
        double weight;
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter your weight in pounds ");
        weight = in.nextDouble ();
        if (weight > 0)
            return weight;
    }
    public double average (Array bmiData)
    {
       double average, sum = 0;

        for (int i = 0; i < bmiData.lenth; i++)
        {
            sum = sum + bmiData[i];
        }

        average = sum / bmiData.length;
        return average;
    }
    public String category (double bmi)
    {
        if (bmi < 18.5)
            return "Underweight";
        if (bmi >= 18.5 && bmi <= 24.9)
            return "Normal Weight";
        if (bmi >= 25.0 && bmi <= 29.9)
            return "Overweight";
        if (bmi >= 30.0)
            return "Obesity";
    }
    public void displayBmiInfo (double bmi)
    {
        printf ("Your BMI is %d.\nYour BMI category is %s.\n", bmi, category (bmi));
    }
    public void displayBmiStatistics (Array bmiData)
    {
        printf ("The average BMI score from all users of this program is %d", average(bmiData));
    }
}