public class Maze {
	/*Name: Akarsh
	 *Date: November 5th, 2020
	 *Purpose: Developing a Maze class to create objects representing the state and behavior of a real - life Maze
	 */
	
    //Instance Variables 
	private int length; 
	private int width; 
	private char[][] maze;
    private int startPointX;
    private int startPointY;
    private int endPointX;
    private int endPointY;
    private int playerPosX;
    private int playerPosY;

    //Accessors and Mutators 
    public int getLength(){
		//Returns the value of the instance variable length
		return length;
	}//getLength
	
	public void setLength (int length){
		/* Sets the value of the implicit object's length to the value
		  passed through the parameter*/
		if (length > 0) {	
			this.length = length;	
		}else {
			System.out.println("Invalid"); 
		}//if	
	}//setLength
	
	public int getWidth(){
		//Returns the value of the instance variable width
		return width;
	}//getWidth
	
	public void setWidth (int width){
		/* Sets the value of the implicit object's width to the value
		  passed through the parameter*/
		if (width > 0) {	
			this.width = width;	
		}else {
			System.out.println("Invalid"); //if the width is less than zero than it is invalid 
		}//if	
	}//setWidth
    
    public int getStartPointX(){
		//Returns the value of the instance variable startPointX
		return startPointX;
	}//getStartPointX
	
	public void setStartPointX (int startPointX){
		/* Sets the value of the implicit object's starting x - coordinate to the value
		  passed through the parameter*/
		if (startPointX > 0 && startPointX < this.maze[0].length) {	
			this.startPointX = startPointX;	
		}else {
			System.out.println("Invalid"); //if the start point is negative or greater than the length of maze 
		}//if	
	}//setStartPointX
    
	 public int getStartPointY(){
		//Returns the value of the instance variable startPointY
		return startPointY;
	}//getStartPointY
		
	public void setStartPointY (int startPointY){
		/* Sets the value of the implicit object's starting y - coordinate to the value
		  passed through the parameter*/
		if (startPointY > 0 && startPointY < this.maze.length) {	
			this.startPointY = startPointY;	
		}else {
			System.out.println("Invalid"); //if the start point is negative or greater than the length of maze 
		}//if	
	}//setStartPointY
	
	public int getEndPointX(){
		//Returns the value of the instance variable endPointX
		return endPointX;
	}//getEndPointX
		
	public void setEndPointX (int endPointX){
		/* Sets the value of the implicit object's ending x - coordinate to the value
		   passed through the parameter*/
		if (endPointX > 0 && endPointX < this.maze[0].length) {	
			this.endPointX = endPointX;	
		}else {
			System.out.println("Invalid"); //if the end point is negative or greater than the length of maze 
		}//if	
	}//setEndPointX
	    
	public int getEndPointY(){
		//Returns the value of the instance variable endPointY
		return endPointY;
	}//getEndPointY
			
	public void setEndPointY (int endPointY){
	/* Sets the value of the implicit object's ending y - coordinate to the value
		passed through the parameter*/
		if (endPointY > 0 && endPointY < this.maze.length) {	
			this.endPointY = endPointY;	
		}else {
			System.out.println("Invalid"); //if the end point is negative or greater than the length of maze 
		}//if	
	}//setEndPointY
	
	public int getPlayerPosX(){
		//Returns the value of the instance variable playerPosX
		return playerPosX;
	}//getPlayerPosX
		
	public void setPlayerPosX (int playerPosX){
		/* Sets the value of the implicit object's player's position x - coordinate to the value
		   passed through the parameter*/
		if (playerPosX > 0 && playerPosX < this.maze[0].length) {	
			this.playerPosX = playerPosX;	
		}else {
			System.out.println("Invalid"); //if the player position is negative or greater than the length of maze 
		}//if	
	}//setPlayerPosX
	    
	public int getPlayerPosY(){
		//Returns the value of the instance variable playerPosY
		return playerPosY;
	}//getPlayerPosY
			
	public void setPlayerPosY (int playerPosY){
	/* Sets the value of the implicit object's player's position y - coordinate to the value
		passed through the parameter*/
		if (playerPosY > 0 && playerPosY < this.maze.length) {	
			this.playerPosY = playerPosY;	
		}else {
			System.out.println("Invalid"); //if the player position is negative or greater than the length of maze
		}//if	
	}//setPlayerPosY
	
    //Constructor 
	public Maze() {
		//Constructor with No Parameters 
		this.length = 10;
    	this.width = 10; 
    	this.maze = new char[this.length][this.width]; //sets the maze size according to the length and width
    	this.startPointX = 0;
    	this.startPointY = 0;
    	this.endPointX = maze.length - 1;
    	this.endPointY = maze[endPointX].length - 1;
    	this.playerPosX = startPointX;
    	this.playerPosY = startPointY;
    	this.mazeMaker();
    }//MazeV2
	
    public Maze(int startPointX, int startPointY) {
    	//Constructor with the parameters startPointX, and startPointY 
    	this.length = 10;
    	this.width = 10; 
    	this.maze = new char[this.length][this.width];
    	this.startPointX = startPointX;
    	this.startPointY = startPointY;
    	this.endPointX = maze.length - 1;
    	this.endPointY = maze[endPointX].length - 1;
    	this.playerPosX = startPointX;
    	this.playerPosY = startPointY;
    	this.mazeMaker();
    }//MazeV2
    
    public Maze(int startPointX, int startPointY, int endPointX, int endPointY) {
    	//Constructor with the parameters startPointX, startPointY, endPointX, and endPointY 
    	this.length = 10;
    	this.width = 10; 
    	this.maze = new char[this.length][this.width];
    	this.startPointX = startPointX;
    	this.startPointY = startPointY;
    	this.endPointX = endPointX;
    	this.endPointY = endPointY;
    	this.playerPosX = startPointX;
    	this.playerPosY = startPointY;
    	this.mazeMaker(); 
    }//MazeV2
    
    public Maze(int length, int width, int startPointX, int startPointY, int endPointX, int endPointY) {
    	//Constructor with the parameters length, width, startPointX, startPointY, endPointX, and endPointY
    	this.length = length;
    	this.width = width;
    	this.maze = new char[this.length][this.width];
    	this.startPointX = startPointX;
    	this.startPointY = startPointY;
    	this.endPointX = endPointX;
    	this.endPointY = endPointY;
    	this.playerPosX = startPointX;
    	this.playerPosY = startPointY;
    	this.mazeMaker(); 
    }//MazeV2
    
    //Instance Methods 
    public void mazeMaker() {
    	//Creates the structure of the maze through using the randomly generated indexes to create walls of the maze  
    	//For - Loop accesses the different elements of the two - dimensional array containing the maze 
    	for (int rows = 0; rows <this.maze.length; rows++) { 
    		//Random indexes are generated using the random function multiplied by the length of the rows of the maze 
			int randomIndex1 = (int) (Math.random()*this.maze[0].length); 
			int randomIndex2 = (int) (Math.random()*this.maze[0].length);
			int randomIndex3 = (int) (Math.random()*this.maze[0].length);
			int randomIndex4 = (int) (Math.random()*this.maze[0].length);
			for (int cols = 0; cols < maze[rows].length; cols++) { 
				/* If - statement determines if the generated indexes are equal to the column value, if the rows value is not equal to the row value
				 * of the starting point, and if the column value is not equal to the column value of the ending point. If the conditions are met, the 
				 * value of the position is a wall consisting of 'x' indicating a invalid position
				 * If the conditions are not met, the value of the position would be '.' indicating a valid position.
				 */
				if ((cols == randomIndex1 || cols == randomIndex2 || cols == randomIndex3||cols == randomIndex4) && rows != this.startPointY && cols != endPointX) {
					this.maze[rows][cols] = 'X'; 
				}else{
					this.maze[rows][cols] = '.'; 
				}//if 
			}//For cols 
		}//For rows     	
    }//mazeMaker

public void welcomeScreen() {//title and movement information
    	System.out.println("Welcome to the DAC Maze!");
        System.out.println("The keys to move are 'N' (Up), 'E' (Right), 'S' (Down), 'W' (Left)");
        System.out.println();
    }//welcomeScreen
    
    public void showMaze() {
    	//For - Loop to display elements of the two - dimensional array of the maze
        for(int rows = 0; rows < this.maze.length; rows++ ) { 
            for(int cols = 0; cols < this.maze[0].length; cols++) {
                if(rows == this.playerPosY & cols == this.playerPosX ) { //If the location is where the player position is, then print 'P' to indicate to the user
                    System.out.print("P" + " ");
                }else if(rows == this.endPointY && cols == this.endPointX){ //If the location is where the exit position is, then print 'E' to indicate to the user
                    System.out.print("E" + " ");
                }else {
                	System.out.print(this.maze[rows][cols]+ " "); //If location is not player position or exit, print the values of maze 
                }//if 
            }//for 
            System.out.println(); //Next line
        }//for 
    }//showMaze
    
	public void moveUp() { 
		//Moves the player position northwards on the maze 
		if(this.playerPosY > 0 &&  this.maze[this.playerPosY - 1][this.playerPosX] != 'X') {
			this.playerPosY -= 1; //Will move if there is no wall (X) and the movement is in the bounds of the maze
		}else {
			System.out.println("Invalid move!"); //Does not move if there is a wall and informs the user  
		}//if
	}//moveUp
	
	public void moveDown() {
		//Moves the player position southwards on the maze
		if(this.playerPosY < maze.length - 1 &&  this.maze[this.playerPosY + 1][this.playerPosX] != 'X') {
			this.playerPosY += 1; //Will move if there is no wall (X) and the movement is in the bounds of the maze
		}else {
			System.out.println("Invalid move!"); //Does not move if there is a wall and informs the user 
		}//if
	}//moveDown
	
	public void moveLeft(){ 
		//Moves the player position leftwards on the maze
		if(this.playerPosX > 0 &&  this.maze[this.playerPosY][this.playerPosX - 1] != 'X') {
			this.playerPosX -= 1; //Will move if there is no wall (X) and the movement is in the bounds of the maze
		}else {
			System.out.println("Invalid move!"); //Does not move if there is a wall and informs the user 
		}//if
	}//moveLeft
	
	public void moveRight() { 
		//Moves the player position westwards on the maze
		if( this.playerPosX < maze[0].length - 1 &&  this.maze[this.playerPosY][this.playerPosX + 1] != 'X') {
			this.playerPosX += 1; //Will move if there is no wall (X) and the movement is in the bounds of the maze
		}else {
			System.out.println("Invalid move!"); //Does not move if there is a wall and informs the user 
		}//if
	}//moveRight
	
	public void updatePlayer(char command) { 
		//Collects the user input and calls the methods corresponding to the character
		if(command == 'N' || command == 'n') { //If user wants to go upwards
			moveUp();
		}else if(command == 'W' || command == 'w'){ //If user wants to go leftwards
			moveLeft();
		}else if(command == 'S' || command == 's') { //If user wants to go downwards
			moveDown();
		}else if(command == 'E'|| command == 'e') { //If user wants to go rightwards
			moveRight();
		}//if 
	}//updatePlayer
	
	public boolean ifSolved() { 
		//Determines if the user has reached the end point of the maze 
		if(this.playerPosX == endPointX & this.playerPosY == endPointY) { //If the player position is same as exit point will return true 
			return true;
		}//if
		return false; //If player is not at same position as exit will return false 
	}//ifSolved
	
	public String toString() { 
		//Displays user positions and status of completion
		return "Your position is "+this.playerPosX+","+this.playerPosY+"! Status of Maze: "+ifSolved();
	}//toString

public boolean equals(Maze maze) { //This method can be used to check if two maze size equal
		if (this.length == maze.length && this.width==maze.width) { //checks length/width
			return true; //returns true if they are same size
		} else {
			return false; //returns false if they are not same size
		}
	}//equals

}//MazeV2



//Below is tester class for class above


import java.util.Scanner;
public class MazeTester {
    /*Name: Akarsh, Dheeraj, Chetram
     *Purpose: Test the difference components of the Maze Class 
     *Date: November 5th, 2020
     */

    static Scanner input = new Scanner (System.in); //Input scanner object

    public static void main(String[] args) {
        Maze myMaze = new Maze (12,12,1,2,10,10); //Creates maze object with the corresponding parameters

        //Display welcome message and controls for user
        myMaze.welcomeScreen();

        myMaze.showMaze(); //Display the initially created maze

         while(!myMaze.ifSolved()) { //Keeps running until user wins
            char move = input.next().charAt(0); //Takes in user input
            myMaze.updatePlayer(move); //Plays the move
            myMaze.showMaze(); //Shows the updated maze
           }//while 
         System.out.print("YOU HAVE REACHED THE EXIT!"); //If user wins/completes maze
    }//main

}//MazeTester

