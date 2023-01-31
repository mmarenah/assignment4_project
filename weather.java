import java.util.Scanner;

public class weather {

public static void main(String[] args){
    Scanner weather = new Scanner(System.in);
    System.out.println("What is the temperature outside today?");

    int temperature = weather.nextInt();
    if (temperature >= 50 )
    {
        System.out.println("It is hot outside, be sure to wear wear a beach hat!");

    }
    else if (temperature < 50)
    {
        System.out.println("It is cold outside, be sure to wear a jacket!");
    }


weather.close();

}

}