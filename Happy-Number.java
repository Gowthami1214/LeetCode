class Solution {
    public boolean isHappy(int n) {
     Set<Integer> res=new HashSet<>();  
     while(!res.contains(n)&& n!=1){
        res.add(n);
        n=getSum(n);
        
        }
        return n==1;
    }
    int getSum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n/=10;
            sum+=rem*rem;
        }
        return sum;
    }
}