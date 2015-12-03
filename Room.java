import java.util.*;

public class Room {
    private ArrayList<Book> booksInRoom;
    private ArrayList<Creature> creaturesInRoom;
    private Hashtable<String, Integer> directions;
    private String name;
    private ArrayList<Room> doorDirections;
    private ArrayList<Boolean> openLookedDoor;
    private ArrayList<Key> keysInRoom;


	//KONSTRUKTOR;
    public Room(ArrayList<Book> books, ArrayList<Creature> creatures, String name){
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


    //METODER;

    public String getName(){
    	return this.name;
    }
    
    public ArrayList<Book> getBooks(){
    	return this.booksInRoom;
    }

    public ArrayList<Creature> getCreatures(){
    	return this.creaturesInRoom;
    }

    publicArrayList<Key> getKeys(){
	return this.keysInRoom;
    }


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

public String toString() {
    return "hej";
}
