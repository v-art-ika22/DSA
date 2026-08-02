class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int i=0;
        add(list1,list2,k,n,arr,i);
        return list1;

    }
    public void add(List<List<Integer>> list1,List<Integer> list2,int k,int target,int[]arr,int i){
        if(target<0){
            return;
        }
        if(list2.size()==k&&target==0){
            list1.add(new ArrayList<>(list2));
        }
        //List<Integer> list=new ArrayList<>();
        for(int y=i;y<arr.length;y++){
            list2.add(arr[y]);
            add(list1,list2,k,target-arr[y],arr,y+1);
            list2.remove(list2.size()-1);

}
        //list2.remove(list2.size()-1);
    }
}