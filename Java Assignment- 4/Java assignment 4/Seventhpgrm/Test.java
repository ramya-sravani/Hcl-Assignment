package Seventhpgrm;
import java.io.IOException;

	import Sixthpgrm.InputException;

	public class Test
	{

		public static void main(String[] args) 
		{
			Exception exception = new Exception();
			try {
				exception.throwException();
			} 
			catch (InputException e)
			{
			
				e.printStackTrace();
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}


