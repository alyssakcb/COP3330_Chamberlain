public class Encrypter
{
        public int[] encrypter (int[] integar)
    {
        int digitOne, digitTwo, digitThree, digtFour, temp;
        int[] number = new int[4]
 
        digitOne = integar[0] / 1000;
        digitTwo = integar[1] / 100 % 10;
        digitThree = integar[2] / 10 % 10;
        digitFour = integar[3] % 10;
 
        digitOne = (digitOne + 7) % 10;
        digitTwo = (digitTwo + 7) % 10;
        digitThree = (digitThree + 7) % 10;
        digitFour = (digitFour + 7) % 10;
 
        temp = digitOne;
        digitOne = digitThree;
        digitThree = temp;
 
        temp = digitTwo;
        digitTwo = digitFour;
        digitFour = temp;
 
        number[0] = digitOne;
        number[1] = digitTwo;
        number[2] = digitThree;
        number[3] = digitFour;

        return number;
    }
}