package ie.gmit.week2;

public class Calculator
{
    // This method will add two numbers
//    public double add(double nb1, double nb2)
//    {
//        return nb1 + nb2;
//    }
    public Calculator()
    {
    }


    public int sub(int nb1, int nb2)
    {
        if(nb1 >= 0 && nb1 < 1000)
        {
            int result = nb1 - nb2;
            return result;
        }
        else
        {
            String message = "Invalid Input";
            throw new IllegalArgumentException(message);
        }
    }


//    public double mult(double nb1, double nb2)
//    {
//        return nb1 * nb2;
//    }
//
//    public double div(double nb1, double nb2)
//    {
//        return nb1 / nb2;
//    }
}
