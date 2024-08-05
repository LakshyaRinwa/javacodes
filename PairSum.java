import java.util.*;
public class PairSum{
       public static void pair(Integer[] arr,int k){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment=k-arr[i];
            if(map.containsKey(compliment)){
                System.out.println(compliment+", "+arr[i]);
            }
            map.put(arr[i],i);
        }
    }
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        int k=x.nextInt();
        pair(arr,k);
    }
}