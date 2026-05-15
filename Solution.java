
import java.util.Scanner;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Physics marks:");
        float Physics=sc.nextFloat();
        System.out.println("Enter Chemistry marks:");
        int Chemistry=sc.nextInt();
        System.out.println("Enter Mathematics marks:");
        int Mathematics=sc.nextInt();
        System.out.println("Enter Biology marks:");
        int Biology=sc.nextInt();
        float Total_PCM=Physics+Chemistry+Mathematics;
        float Total_PCB=Physics+Chemistry+Biology;
        float average_PCM=(Physics+Chemistry+Mathematics)/3;
        float average_PCB=(Physics+Chemistry+Biology)/3;
        System.out.println("Physics:"+Physics);
        System.out.println("Chemistry:"+Chemistry);
        System.out.println("Mathematics:"+Mathematics);
        System.out.println("Biology:"+Biology);
        System.out.println("Total_PCM:"+Total_PCM);
        System.out.println("Total_PCB:"+Total_PCB);
        System.out.println("Average PCM:"+average_PCM);
        System.out.println("Average PCB:"+average_PCB);
        
        
        if(average_PCM>average_PCB  ||  average_PCM==average_PCB)
        {
                System.out.println("Maximum Average:PCM");
        }
        else
        {
                 System.out.println("Maximum Average:PCB");
        }
        
        
       
    }
}