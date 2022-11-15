public class RecursionBS {
    public static void main(String[] args) {
        int[] arr = {2,4,8,12,22,33,44};
        int ans = bS(arr,9,0,arr.length-1);
        System.out.println(ans);

    }

    static int bS(int [] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]<target){
            return bS(arr,target,m+1,e);
        }
        if(arr[m]>target){
            return bS(arr,target,s,m-1);
        }
        if(arr[m]==target){
            return m;
        }
        return -2;
    }
}
