

public class gameBoard {

	private boolean snakeBoard[][]= new boolean [26][26];
	
	public gameBoard(){
		for (int row=0; row<snakeBoard.length; row++) {
			for(int column=0; column<snakeBoard[row].length; column++){
				if (row>=1 && row <snakeBoard.length-1 && column>=1 && column<snakeBoard[row].length-1) {
					snakeBoard[row][column]=false;
				} else {
					snakeBoard[row][column]=true;
				}
			}
		}
	}

	public void displayBoard(){
		
		for (int row=0; row<snakeBoard.length; row++) {
			for(int column=0; column<snakeBoard[row].length; column++){
				if (snakeBoard[row][column]==false) {
					System.out.print("   ");
				} else {
					System.out.print("o  ");
				}
			}
			System.out.println();
		}

	}

	public void updateBoard(int X, int Y) {
		snakeBoard[X][Y]=true;
		displayBoard();
	}
	
}
