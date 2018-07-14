/**
 * 
 */
package hackerrank.easy.diagonal_differences;

/**
 * @author nguye
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solve();
		Result result = solution.getResult();
		System.out.println("Left diagonal: " + result.getLeftDiagonal());
		System.out.println("Right diagonal:" + result.getRightDiagonal());
		System.out.println("Absolute differences: " + Math.abs(result.getLeftDiagonal() - result.getRightDiagonal()));
		return;
	}

}
