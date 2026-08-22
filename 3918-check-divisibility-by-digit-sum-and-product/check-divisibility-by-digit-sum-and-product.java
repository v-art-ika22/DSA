class Solution {
    public boolean checkDivisibility(int n) {
        int pro=1;int k=n;
        int sum=0;
        while(n>0){
            int d = n%10;
            pro*=d;
            sum+=d;
            n/=10;
        }
        return k%(pro+sum)==0;

    }
}