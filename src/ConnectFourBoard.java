
public class ConnectFourBoard {

	String[][] board; //= new String[7][6]; 
	int row = board.length;
	int col = board[0].length;
	int connect;
	
	public ConnectFourBoard()
	{
		board = new String[7][6];
	}
	
	public ConnectFourBoard(int rowUser, int colUser)
	{
		board = new String[rowUser][colUser];
	}
	
	public void displayBoard()
	{
		for (int x = 0; x < row; x++)
		{
			for (int y = 0; y < col; y++)
			{
				System.out.print(board[row][col]);
			}
		}
	}
	
	public boolean checkHor()
	{
		
	}
	
	public boolean checkVer()
	{
		
	}
	
	public boolean checkDiaLeft()
	{
		
	}
	
	public boolean checkDiaRight()
	{
		
	}
	
	
	public boolean checkConnectWin()
	{
		return (checkHor() || checkVer() || checkDiaLeft() || checkDiaRight());
	}
	
	public boolean checkIfColIsFull()
	{
		
	}
	
	public void placeChip()
	{
		
	}
	
	public void clearBoard()
	{
		
	}
	
	
	
}
