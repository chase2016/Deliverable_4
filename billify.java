import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;


public class billify {

	   
	   
	   public static int[] billify(int[] x) {
		   int sizeInput = x.length;
		   int sizeOutput = sizeInput + 1;
		   int[] outputArray = new int[sizeOutput];
		   int sum = 0;
		   for (int i = 0; i < sizeInput; i ++){
			   outputArray[i] = x[i] * x[i];
			   sum = sum + outputArray[i];
		   }
		   outputArray[sizeOutput-1] = sum;
		   return outputArray;
	   }

	
}
