class FindMaxSquare {
	public int maximalSquare(char[][] matrix) {

		if(matrix.length==0){
		return 0;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int ans = 0;

		int copy[][] = new int[m+1][n+1];

		for(int i=1; i<=m ; i++){
			for(int j=1; j <= n ; j++){
				if(matrix[i-1][j-1] == '1'){
					copy[i][j] = Math.min(copy[i-1][j-1],Math.min(copy[i-1][j],copy[i][j-1])) +1;
					ans = Math.max(copy[i][j],ans);
				}
			}
		}

		return ans*ans;

	}
}