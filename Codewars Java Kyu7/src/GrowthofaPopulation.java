/* Author - Christov van Heerden
 * Date - 2020-02-06
 * CodeWars exercises - 7Kyu
 * Growth of a Population
 * 
 * In a small town the population is p0 = 1000 at the beginning of a year. 
 * The population regularly increases by 2 percent per year and moreover 50 new inhabitants per year come to live 
 * in the town. How many years does the town need to see its population greater or equal to p = 1200 inhabitants?
 * 
 * More generally given parameters:
 * p0, percent, aug (inhabitants coming or leaving each year), p (population to surpass)
 * the function nb_year should return n number of entire years needed to get a population greater or equal to p.
 * aug is an integer, percent a positive or null number, p0 and p are positive integers (> 0)
 * 
 */

public class GrowthofaPopulation {
	public static void main(String args[]) {
		System.out.println(nbYear(1500, 5, 100, 5000) + " = 15");
		System.out.println(nbYear(1500000, 2.5, 10000, 2000000) + " = 10");
		System.out.println(nbYear(1500000, 0.25, 1000, 2000000) + " = 94");
		
	}
	
	public static int nbYear(int p0, double percent, int aug, int p) {
        // Declare and calculate variables
		int years = 0;
		double population = p0;
		double growth = 1 + (percent/100);
		
		// Perform a while loop until the population exceeds the required amount
		while(population <= p) {
			population = (population * growth) + aug;
			years = years + 1;
		}
		
		// Return the total number of years it took for the population to exceed the required amount
		return years;
    }
}
