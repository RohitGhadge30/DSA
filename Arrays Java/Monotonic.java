public class Monotonic {
    

        public static boolean mono(int arr[]) {
    
    
        Boolean inc=true;
        Boolean  dec=true;
    
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    inc= false;
                }
    
                if(arr[i]<arr[i+1]){
                     dec=false;
                }
               
                    
                    
                }
    
                return inc || dec;   //0r me eke bhi true true return;
            }
            
        
          
    
        public static void main(String[] args) {
    
        int arr[]={6,5,4,4};
    
        System.out.print(mono(arr));
            
        }
    }
    

