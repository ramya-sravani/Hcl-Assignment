import java.util.Arrays;

public class Arrar_print {
    public static void main(String[] args) {
		
		int Arr[] = {5,50,67,100};
		
		int b[] = copyOf(Arr);
		
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
	
	public static int[] copyOf(int[] array) {
		int copyArr[] = Arrays.copyOf(array, 