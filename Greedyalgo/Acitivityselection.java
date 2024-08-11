import java.util.*;
public class Acitivityselection{



    //If the end time is sorted 

    // public static void act(int start[],int end[])
    // {
    //     int maxact=0;
    //     ArrayList <Integer> ans=new ArrayList();

    //     maxact=1;
    //     ans.add(0);
    //     int lastactend= end[0];

    //     for(int i=1;i<end.length;i++)
    //     {
    //         if(start[i]>= lastactend)
    //         {
    //             maxact++;
    //             ans.add(i);
    //             lastactend=end[i];
    //         }
    //     }
    //     System.out.print(maxact);
    //     System.out.print(ans);

    // }


    public static void act(int start[],int end[]) {

        int maxact=0;
        ArrayList <Integer> ans=new ArrayList();

        int activities[][]=new int[start.length][3];

        for(int i=0;i<activities.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        //lamda fun short form of big fn

       Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        maxact=1; 
        ans.add(activities[0][0]);
        int lastactend=activities[0][2];

        for(int i=1;i<activities.length;i++)
        {
            if(activities[i][1] >= lastactend)
            {
                maxact++;
                ans.add(activities[i][0]);
                lastactend=activities[i][2];
            }

        }

        System.out.println("max activity we can do : "+maxact);
           System.out.println("activity "+ans);

        




        
    }












    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]=  {2,4,6,7,9,9};    

        act(start, end);


    }

}