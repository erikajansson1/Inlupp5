import java.util.*;

public class Room {
    private ArrayList<Book> booksInRoom;
    private ArrayList<Creature> creaturesInRoom;
    private Hashtable<String, Integer> directions;
    private String name;


	//KONSTRUKTOR;
	public Room(ArrayList<Book> books, ArrayList<Creature> creatures, String name){
		this.booksInRoom = books;
		this.creaturesInRoom = creatures;
		this.directions = new Hashtable<String, Integer>();
		directions.put("north", 1);
		directions.put("easth", 2);
    	directions.put("south", 3);
    	directions.put("west", 4);
		this.name = name;

	}


    //METODER;

    public String getName(){
    	return this.name;
    }

    public ArrayList<Book> getBooks(){
    	return this.booksInRoom;
    }




    
}
