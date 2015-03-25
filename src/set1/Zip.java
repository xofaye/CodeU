package set1;

class Zip {
	  // Fill in the method "join". It returns a boolean array. The ith
	  // value is that array (i.e., array[i]) should be true if the ith
	  // value in the first argument to join is divisible by the ith value
	  // in the second argument to join. The returned boolean array should
	  // be exactly as long as the shorter of the two arguments.
	  //
	  // Reminders: 
	  //
	  // 1. An integer p is said to be "divisible by" an integer q when there
	  // is some integer k such that q*k = p. This is the same as saying
	  // "the remainder of p when divided by q is 0". The remainder
	  // operator is Java is written with a percent sign: "a % b" is the
	  // remainder of a when divided by b.
	  //
	  // 2. The length of an array bar is stored in bar.length. 
	  //
	  // 3. New arrays are declared with the syntax:
	  //        float[] foo = new float[8];
	  //
	  static boolean[] join(int[] y, int[] z) {
		  int length;
		  if(y.length < z.length){
			  length = y.length;
		  }else{
			  length = z.length;
		  }
		  boolean[] boolArray = new boolean[length];
	      for(int i = 0; i < length; i++) {
	    	  try {
	    		  boolArray[i] = y[i] % z[i] == 0;
	    		  } catch (ArithmeticException divideByZero) {
	    			  boolArray[i] = false;
	    			  }
	    	  }
	      return boolArray;
	      // STUDENTS: WRITE YOUR CODE HERE!
	      }

	  public static void main(String[] args) {
	    //
	    // Expected output:
		  	//  false
		    //  false
		    //  false
		    //  false
		    //  true
		    //  false
		    //  true
		    //
		    // STUDENTS, ADD ADDITIONAL TEST CASES BELOW
		    //
		    int euler[] = {2, 7, 18, 28, 18, 28, 45, 90, 45};
		    int jenny[] = {8, 6, 7, 5, 3, 0, 9};
		    boolean divisibles[] = join(euler, jenny);
		    for (int i = 0; i < divisibles.length; ++i) {
		    	System.out.println(divisibles[i]);
		    }
		    int test1[] = {0, 1, 2, 15, 900};
		    int test2[] = {9, 1, 8, 3, 100, 8, 4, 3};
		    boolean case2[] = join(test1, test2);
		    for (int i = 0; i < case2.length; ++i) {
		    	System.out.println(case2[i]);
		    }
		  }
}
