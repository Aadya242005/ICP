package lec5;
public class Lemonade {
    public static void main(String[] args){
        int[] arr = {5,5,5,10,20};
        System.out.print(isLamonade(arr));
    } 
    public static boolean isLamonade(int[]arr){
        int n = arr.length;
        int deno5 =0;
        int deno10 =0;
        for(int i=0;i<n;i++){
            if(arr[i]==5){
                deno5++;
            }
            else if(arr[i]==10){
                if(deno5==0){
                    return false;
                }else{
                    deno5--;
                    deno10++;
                }

            }else{
                if(deno5>0 && deno10>0){
                    deno5--;
                    deno10--;
                }else if(deno5>=3){
                    deno5-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
       
    
    }
    
}
