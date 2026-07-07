class Solution {
    public int countArrangement(int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list1.add(i);
        }
        int ans = count(list1,list2,0);
        return ans;
    }
    public int count(ArrayList<Integer> list1,ArrayList<Integer> list2,int i){
       if(list1.size()==0){
        return 1;
       }
       int c=0;
       int pos = list2.size()+1;
       for(int j=0;j<list1.size();j++){
          if(list1.get(j)%pos==0||pos%list1.get(j)==0){
           int val = list1.remove(j);
           list2.add(val);
            c = c +  count(list1,list2, 0);
             list2.remove(list2.size()-1);
            list1.add(j, val);
          }
       }
      
       return c;
       
    }
}