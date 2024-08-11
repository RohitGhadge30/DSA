import java.util.*;

public class Jobsequence {
    public static class Job{
        char jobid;
        int deadline;
        int profit;

        public Job(char jobid, int deadline,int  profit)
        {
            this.jobid=jobid;
            this.deadline=deadline;
            this.profit=profit;
        }

    }

    public static void  max(Job arr[])
    {

        int maxdeadline=0;
        for(int i=0;i<arr.length;i++)
        {
            maxdeadline=Math.max(maxdeadline,arr[i].deadline);
        }

        char timeline[]=new char[maxdeadline];

        for(int i=0;i<maxdeadline;i++)
        {
             timeline[i]='*';
        }


        Arrays.sort(arr,(Joba,Jobb)-> (Jobb.profit-Joba.profit));

        int maxprofit=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i].deadline-1;j>=0;j--)
            {
                if(timeline[j] == '*')
                {
                    maxprofit+=arr[i].profit;
                    timeline[j]=arr[i].jobid;
                    break;
                }
                
            }

        }

        for(int i=0;i<timeline.length;i++)
        {
            if(timeline[i]  != '*')
            {
                System.out.println("job id which we can do is: "+timeline[i]+" ");
            }
        
       
        }
        System.out.println("maxprofit we can make is :  "+ maxprofit);

    }

   

    public static void main(String[] args) {
        
        Job jobs[]=new Job[4];
        jobs[0]=new Job('a',4,20);
        jobs[1]=new Job('b',1,10);
        jobs[2]=new Job('c',1,40);
        jobs[3]=new Job('d',1,30);
        max(jobs);

    }
    
}
