import java.util.Scanner;

public class weather {

public static void main(String[] args){
    Scanner weather = new Scanner(System.in);
    System.out.println("What is the weather today?");

    int temperature = weather.nextInt();
    if (temperature >= 50 )
    {
        System.out.println("It is hot outside!");

    }
    else if (temperature < 50)
    {
        System.out.println("It is cold outside!");
    }


weather.close();

}

}