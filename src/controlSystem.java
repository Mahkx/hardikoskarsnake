public class controlSystem {
	
	public static void main(String [] args) {

		gameBoard board= new gameBoard();
		board.displayBoard();
		
		positionRNG boardPosition = new positionRNG();
		
		board.updateBoard(boardPosition.snakeSpawnX(), boardPosition.snakeSpawnY());
		
//		for (int row=0; row<gameBoard.length; row++) {
//			for(int column=0; column<gameBoard[row].length; column++){
//				if (gameBoard[row][column]==false) {
//					System.out.print("x   ");
//				} else {
//					System.out.print("o   ");
//				}
//			}
//			System.out.println();
//		}
		
	}
}
