public class Mostfreq {
    

        public static int mostFrequent(int[] nums, int key) {
            int  table[]=new int [1001];
    
           for(int i=0;i<nums.length-1;i++)
           {
               if(nums[i]== key)
               {
                   table[nums[i+1]]++;
               }
           }
    
           int max=0;
           int  target=0;
    
           for(int i=0;i<table.length;i++)
           {
               if(table[i]>max)
               {
                   target=i;
                   // max=table[i];
               }
           }
    
           return target;
        }
            
    
        public static void main(String[] args) {
    
            int nums[]={1,100,200,1,100};
    
            System.out.print(mostFrequent(nums,1));
            
            
        }
        
    
    
    
}
