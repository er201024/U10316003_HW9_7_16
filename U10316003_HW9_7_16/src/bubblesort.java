
public class bubblesort {
	public static void main(String[] args) {
		//the array 
		int[][] m = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};
		//sort m
		sort(m);
		//print  out
		for (int i = 0; i < m.length; i++) {
		      System.out.println("{" +m[i][0] + ", " + m[i][1] + "}");
		    }
		
	}
	//the method sort
	public static void sort(int[][] m) {
		//variable
		int hold;
		int holl;
		int i;
		// check first number whether need to change or not
		for(i = 0; i < m.length ; i++){
			for(int j = i; j < m.length ; j++){
				if( m[i][0] > m[j][0]){ 
					hold = m[i][0];
					m[i][0] = m[j][0];
					m[j][0] = hold;   
			       
					holl = m[i][1];
					m[i][1] = m[j][1];
					m[j][1] =  holl;  
				}
					// if the first number equal , check the second number
			  		if(m[i][0] == m[j][0] && m[i][1] > m[j][1]){  		 
			  			holl = m[i][1];
			  			m[i][1] = m[j][1];
			  			m[j][1] =  holl; 
			       
			  		}
			
			}
		}
		
}} 