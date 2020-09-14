public class Decrypter
{
    public int[] decrypter (int[] integar)
    {
        int digitOne, digitTwo, digitThree, digitFour, temp;
        int[] number = new int[4];
        
        digitOne = integar[0] / 1000;
        digitTwo = integar[1] / 100 % 10;
        digitThree = integar[2] / 10 % 10;
        digitFour = integar[3] % 10;
 
        if(digitOne <= 6 && digitOne >= 0)
            digitOne = digitOne + 10;
        if(digitTwo <= 6 && digitTwo >= 0)
            digitTwo = digitTwo + 10;
        if(digitThree <= 6 && digitThree >= 0)
            digitThree = digitThree + 10;
        if(digitFour <= 6 && digitFour >= 0)
            digitFour = digitFour + 10;
 
        digitOne = digitOne - 7;
        digitTwo = digitTwo - 7;
        digitThree = digitThree - 7;
        digitFour = digitFour - 7;
 
        temp = digitOne;
        digitOne = digitThree * 1000;
        digitThree = temp * 10;
 
        temp = digitTwo;
        digitTwo = digitFour * 100;
        digitFour = temp;

        number[0] = digitOne;
        number[1] = digitTwo;
        number[2] = digitThree;
        number[3] = digitFour;

        return number;
    }
}