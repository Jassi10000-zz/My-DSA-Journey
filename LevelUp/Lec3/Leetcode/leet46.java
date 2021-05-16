class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        
        backtrack(result , nums , new ArrayList() , visited);
        
        return result;
    }
    
    public void backtrack(List<List<Integer>> result , int[] nums , List<Integer> curr , boolean[] visited ){
        
        if( curr.size() == nums.length){
            result.add(new ArrayList(curr));
                return;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if(visited[i] == true ) continue;
            curr.add(nums[i]);
            visited[i] = true;
            
            backtrack(result , nums , curr , visited );
            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
            
            
    }
}