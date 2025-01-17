import java.util.Scanner;
class Tic_tac_toe{
	public static void main(String[] args) {
		char[][] board = new char[3][3];

		for(int row = 0 ; row < board.length ; row++){
			for (int col = 0 ;col < board[row].length ; col++ ) {
				board[row][col] = ' ';	
			}
		}
	try{
		char Player = 'X';
	boolean gameOver = false;
	Scanner sc = new Scanner(System.in);
		while(!gameOver){
		PrintBoard(board);
		System.out.println("Player " + Player + " enter : " );
		
		int row = sc.nextInt();
		int col = sc.nextInt();
		System.out.println();
 
		if(board[row][col] == ' '){
			//place the element 
			board[row][col] = Player;
			gameOver = haveWon(board,Player);
			if(gameOver){
				System.out.println("Player " + Player + " Has Won: " );
			}else{
				if(Player == 'X'){
					Player = 'O';
				}else{
					Player = 'X';
				}
			}
		}else{
			System.out.println("Invalid Move. Try again! ");
		}
		}
	PrintBoard(board);
	sc.close();
	}catch(IndexOutOfBoundsException e){
	System.out.println("Wrong Input : Please Restart The Game ");
	}
	
	}

	public static boolean haveWon(char[][] board, char Player){
			// check the rows
			for(int row = 0 ; row < board.length ; row++){
				if(board[row][0] == Player && board[row][1] == Player && board[row][2] == Player ){
					return true;
				}
			}

			for(int col = 0 ; col < board[0].length ; col++){
				if(board[0][col] == Player && board[1][col] == Player && board[2][col] == Player ){
					return true;
				}
			}

			if(board[0][0] == Player &&  board[1][1] == Player && board[2][2] == Player){
				return true;
			}

			if(board[0][2] == Player &&  board[1][1] == Player && board[2][0] == Player){
				return true;
			}

			return false;
	}

	public static void PrintBoard(char[][] board){
			for(int row = 0 ; row < board.length ; row++){
				for (int col = 0 ;col < board[row].length ; col++ ) {
				System.out.print(board[row][col] + " | ");	
			}
		System.out.println();
		}
	}

}