package arrayAndString;

public class RotateMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		if(matrix.length != 0 || matrix.length == matrix[0].length) {
			int length = matrix.length;
			for(int layer = 0; layer < length/2; layer++) {
				int first = layer;
				int last = length -1 - layer;
				for(int i= first; i < last; i++) {
					int offset = i-first;
					int top = matrix[first][i];
					matrix[first][i] = matrix[last-offset][first];
					matrix[last-offset][first] = matrix[last][last-offset];
					matrix[last][last-offset] = matrix[i][last];
					matrix[i][last] = top;
				}
			}
		}
	}
}
