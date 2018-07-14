package hackerrank.easy.diagonal_differences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author nguye
 *
 */
public class Solution {

	//constant
	private static final String FILE_NAME = "sample";
	//variables
	private int matrixSize = 0;
	private int matrix[][];
	private Result result = new Result();
	
	public Solution() {
		initialize();
	}
	
	private void initialize() {
		try(BufferedReader inputReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(FILE_NAME)))){
			String line = inputReader.readLine();
			matrixSize = Integer.valueOf(line);
			if(0 < matrixSize) 
				matrix = new int[matrixSize][matrixSize];
			int tmpCounter = 0;
			while(null != (line = inputReader.readLine())) {
				String[] stringRow = line.trim().split(" ");
				for (int i = 0; i < matrixSize; i++) {
					matrix[tmpCounter][i] = Integer.valueOf(stringRow[i]);
				}
				tmpCounter++;
			}
		}
		catch(IOException ioe) {
			
		}
	}
	
	public void solve() {
		if(null != matrix) {
			for (int i = 0; i < matrixSize; i++) {
				for(int j = 0;j < matrixSize; j++) {
					if(i == j) {
						int left = result.getLeftDiagonal();
						result.setLeftDiagonal(left+=matrix[i][j]);
					}else if(matrixSize -1 == i + j) {
						int right = result.getRightDiagonal();
						result.setRightDiagonal(right += matrix[i][j]);
					}else {
						continue;
					}
				}
			}
		}
	}

	public Result getResult() {
		return result;
	}
	
	
}
