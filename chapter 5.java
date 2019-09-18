//5.2

public class Retail{
    
    public static void main(String[] args){
        System.out.println(calculateRetail(20, .50));
        
    }
    
    public static double calculateRetail(double wholesaleCost, double markup){
        double wholesaleCost = 0;
        double markup = 0;
        markup = wholesaleCost * markup;
        double calculateRetail =  markup + wholesaleCost;
        return calculateRetial;
    }
}

//5.6

public class Temperature{
    
    public static void main(String[] args){
        
        System.out.println("fahrenheit       Celsius");
        System.out.println("------------------------");
        
        for (int i = 0; i <= 20; i++){
            
            System.out.println(i + " \t\t" +celsius(i));
        }
    
    }
    
    public static double celsius(double fahrenheit){
        
        double celsius = .5555 * (fahrenheit - 32);
        return celsius;
        
    }
}

//5.7

import java.util.Scanner;
public class Grades{
    
    public static double calcAverage(double sumTestScore){
        
        
        double average = sumTestScore / 5;
        return average;
    }
    
    public static String determineGrade(double testScore){
        if(testScore >= 90){
            return "You received an A";
        } else if (testScore >= 80 && testScore <= 89){
            return "You received a B";
        } else if (testScore >= 70 && testScore <= 79){
            return "You received a C";
        } else if (testScore >= 60 && testScore <= 69){
            return "You received a D";
        } else {
            return "You received a F";
        }
    }    
    
    public static void main(String[] args){
   
        
       double calcAverage;
        double sumTestScore = 0;
        Scanner getUserInput = new Scanner(System.in);
        
        for(int i = 1; i <= 5; i++){
            System.out.println("What was the test score on test: " + i);
            double testScore = getUserInput.nextDouble();
            System.out.println(determineGrade(testScore));
            sumTestScore = testScore + sumTestScore;
            
            
            
        }
        System.out.println("The average of you five scores is " + calcAverage(sumTestScore));
           
    }
}




//











