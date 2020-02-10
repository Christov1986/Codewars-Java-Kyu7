/* Author - Christov van Heerden
 * Date - 2020-02-06
 * CodeWars exercises - 7Kyu
 * Is this a triangle?
 * 
 * Implement a method that accepts 3 integer values a, b, c. 
 * The method should return true if a triangle can be built with the sides of given length and false in any other case.
 * (In this case, all triangles must have surface greater than 0 to be accepted).
 * 
 */

public class Isthisatriangle {
	public static void main(String args[]) {
		System.out.println(isTriangle(1,2,2) + " = True");
		System.out.println(isTriangle(7,2,2) + " = False");
	}
	
	public static boolean isTriangle(int a, int b, int c){
		boolean result = true;
		
		// Test the sides to see if the statement should be adjusted to false
		if(a + b <= c || a + c <= b || b + c <= a) {
			result = false;
		}
		
		// Test that the triangle has a surface area greater then 0
		if(a < 0 || b < 0 || c < 0) {
			result = false;
		}
		
		return result;
	}
}
