class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex+1;
		List<List<Integer>> ans =new ArrayList<>();
		for(int i=0;i<n;i++) {
			List<Integer> List=new ArrayList<>();
			for(int j=0;j<=i;j++) {
				List.add(1);
			}
			ans.add(List);
		}
		for (int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) ans.get(i).set(j,1);
				else {
					int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
					ans.get(i).set(j,val);
				}
			}
		}
		
		
		return ans.get(rowIndex);
        
    }
}