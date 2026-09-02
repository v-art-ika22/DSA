class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        parenthesis("",n,0,0,list);
        return list;
    }
    public void parenthesis(String s,int n,int open, int close,List<String> list){
        if(s.length()==n*2){
            list.add(s);
            return;
        }
        if(open<n){
            parenthesis(s+"(",n,open+1,close,list);
        }
        if(close<open){
            parenthesis(s+")",n,open,close+1,list);
        }
       
    }
}