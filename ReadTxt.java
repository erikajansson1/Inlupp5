import java.util.*;
import java.lang.Object;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class ReadTxt {
 
    private String name;
    private File fileToRead;
    private ArrayList<String> directions;
    private ArrayList<String> doorStatus;

    public ReadTxt (String file) {
	this.fileToRead = new File(file);
    }

    public ArrayList<String> scan() {
	try{
	    Scanner sc = new Scanner(this.fileToRead);
	    ArrayList<String> in = new ArrayList<String>();
	    while (sc.hasNextLine()) {
	        in.add(sc.nextLine());
		//System.out.println(in);
		/*	String[] parse = in.split(";");
			System.out.println(in);
			System.out.println(parse[1]);
			System.out.println(parse[2]);
			System.out.println(parse[3]);
			System.out.println(parse[4]); 
			return in; */
	    }
	    return in;
	      
	}
	catch (FileNotFoundException e) {
	    e.printStackTrace();
	}
	return null;
    }

    public void scanRooms(ArrayList<String> in){
	for (String toPrint : in) {
	    String[] parse = toPrint.split(";");
	    Room newroom = new Room(parse);
	    System.out.println(parse[0]);
	    System.out.println(parse[1]);
	    System.out.println(parse[2]);
	    System.out.println(parse[3]);
	    System.out.println(parse[4]);
	}
    }
    


    public static void main(String[] args) {
	ReadTxt test = new ReadTxt("rooms.txt");
	ArrayList<String> prov = test.scan();
	test.scanRooms(prov);
	/* ReadTxt test2 = new ReadTxt("courses.txt");
	   test2.scan();
	   ReadTxt test3 = new ReadTxt("Books.txt");
	   test3.scan(); */
    }
}
/*
  public void scan() {
  private Scanner sc = new Scanner(new File("rooms")).useDelimiter("\\sc*;\\sc*");
  String line = null;
  try {
  while ((line = sc.readLine()) != null) {
  contents.append(line);
  contents.append(System.getProperty("line.separator"));
  }
  }
  finally {
  input.close();
  }
   

  }
    

  public void print(){
  System.out.println(sc.next());
  }    }
  public void end() {
  sc.close();

  }

  public static void main(String[] args) {

  ReadTxt n = new ReadTxt();
  n.print();
  //	while(sc.hasNext()) {
    
	
  //	}
    
  }
  }
*/
