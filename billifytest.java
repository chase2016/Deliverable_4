import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;


public class billifytest {
	
	// Test will verify the square of the number happens
	@Test
	public void SquareTest() {
		for(int i = 0; i < 100; i++) {
			int[] arr = outputArray();
			int[] billifyarr = billify.billify(arr);		
			for(int j = 0; j < billifyarr.length - 1; j++) {
				assertEquals(billifyarr[j], arr[j] * arr[j]);
			}
		}
		}

	
	//test runs if the array will work
    @Test
    public void RunTest() throws Exception {
    	assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});

    }

    
    //Test will verify the the output will always be larger
    @Test
	public void LargerTest() {
		for(int i = 0; i < 100; i++) {
			int[] arr = outputArray();
			int[] billifyarr = billify.billify(arr);		
			for(int i1 = 0; i1 < arr.length; i1++) {
				if(billifyarr[i1] > billifyarr[arr.length]) {
					fail();
				}
			}
		}
	}

	private int[] outputArray() {
		// TODO Auto-generated method stub
		return null;
	}
  
  
}