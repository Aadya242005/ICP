package lec5;

public class Gas_station {
    public static void main(String[] args){
        int[] gas ={1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        
    }
     public int canCompleteCircuit(int[] gas, int[] cost) {
        int start =0;
        int tank =0;
        int total=0;
        for(int i=0;i<gas.length;i++){
            int diff = gas[i]-cost[i];
            tank += diff;
            total+= diff;
            if(tank<0){
                start=i+1;
                tank=0;
            }
        }
        if(total >= 0){
            return start; 
        } else {
            return -1;     
        }
        
    }

    
}
