import java.util.*;
  class Job {                           


    public char jobid;
    public int deadline;
    public int profit;

    public Job(char jobid,int deadline,int profit)
    {
        this.jobid=jobid;
        this.deadline=deadline;
        this.profit=profit;
    }

}

     public  class jobSchedule { 


    public static int  max(Job arr[]) {

        int profit=0;
        int maxdeadline=0;


        for(int i=0;i<arr.length;i++)
        {

           maxdeadline =Math.max(arr[i].deadline,maxdeadline);
        }

        char timeline[]=new char [maxdeadline];

        for(int i=0;i<maxdeadline;i++){
            timeline[i] = '*';
        }

        Arrays.sort(arr,(Job_a,Job_b) -> (Job_b.profit - Job_a.profit));


        for(int i=0;i<arr.length;i++)
        {
            for(int  j=arr[i].deadline-1;j>=0;j--)
            {
                if(timeline[j] == '*')
                {
                    profit +=arr[i].profit;
                    timeline[j] =arr[i].jobid;
                    break;
                }
            }
        }


        for(int i=0;i<timeline.length;i++)
        {
            if(timeline[i]!= '*'){
            
                 System.out.print(timeline[i]+" ");
            }
            
          
           
        }
        System.out.println();
        return profit;
        
    }




    public static void main(String[] args) {

        Job jobs[]=new Job [4];    //job is class 

        jobs[0]=new Job('a',4,20);
        jobs[1]=new Job('b',1,10);
        jobs[2]=new Job('c',1,40);
        jobs[3]=new Job('d',1,30);

        int ans=max(jobs);

        System.out.print(ans);

        
    }
    
}
