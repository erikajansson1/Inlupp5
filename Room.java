import java.util.*;


/**
 * This class provides methods for a room
 */

public class Room {
    private ArrayList<Book> booksInRoom;
    private ArrayList<Creature> creaturesInRoom;
    private Hashtable<String, Integer> directions;
    private String name;
    private ArrayList<Room> doorDirections;
    private ArrayList<Boolean> openLookedDoor;
    private ArrayList<Key> keysInRoom;


   //KONSTRUKTOR;

    /**
     * Creates a room
     *
     * @param books A list with all books the room should contain
     * @param creatures A list with all creatures the room should contain
     * @param name The name of the room
     * @param keys A list with all keys the room should contain
     */
    
    public Room(ArrayList<Book> books, ArrayList<Creature> creatures, String name, ArrayList<Keys> keys){
	this.booksInRoom = books;
	this.creaturesInRoom = creatures;
	this.directions = new Hashtable<String, Integer>();
	directions.put(0, "North");
	directions.put(1, "Easth");
    	directions.put(2, "South");
    	directions.put(3, "West");
	this.name = name;
	this.keysInRoom = keys;
    }

    public Room (String name) {
	this.name = name;
    }

    public Room (String[] InParse) {
	name = InParse[0];
	directions = InParse[1],
    }

    //METODER;
    /**
     * Returns the name of the room
     */
    
    public String getName(){
    	return this.name;
    }
    
    /**
     * Returns a list with all books in the room
     */
    
    public ArrayList<Book> getBooks(){
    	return this.booksInRoom;
    }


    /**
     * Returns a list with all cretures in the room
     */

    public ArrayList<Creature> getCreatures(){
    	return this.creaturesInRoom;
    }


    /**
     * Returns a list with all keys in the room
     */
    
    publicArrayList<Key> getKeys(){
	return this.keysInRoom;
    }


    /**
     * Checks wheter it is a door or not in chosed direction
     *
     * @param direction The required direction to search for a door 
     */

    public Boolean isADoor(String direction){
	switch (direction) {
	case "North": 
	    if (openLookedDoor[0] != null)
		return true;
	    else
		return false;
	    break;
	case "Easth":
	    if (openLookedDoor[1] != null)
		return true;
	    else
		return false;
	    break;
	case "South":
	    if (openLookedDoor[2] != null)
		return true;
	    else
		return false;
	    break;
	case "West":
	    if (openLookedDoor[3] != null)
		return true;
	    else
		return false;
	    break;
	default:	
	    //FIXA VETTIG DEFAULT ACTION
	    System.out.println("No direction, try again");
	    break; 

	}

    }


    /**
     * Checks in which directions the room has doors
     */
    
    public ArrayList<String> availableDirections(){
	ArrayList<String> available = new ArrayList<String>();
	for(int i = 0; i<4; i++){
	    if (doorDirections[i] != null){
		available[i] = directions.get(Object i);
		return available;
	    }
	}
    }

    
}
