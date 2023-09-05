class Solution {
    public int[] twoSum(int[] numb, int target) {
        int len= numb.length;
        int[] result = new int[2] ;
        int num1 = 0;
        int sum = 0;

        for(int i=0; i<len;i++){
            num1= numb[i];
            for(int j=i+1; j<len;j++){
                sum=num1+numb[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                }
            }               
        }
        return result;
    }
}
