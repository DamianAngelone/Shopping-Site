/*
* Name: Damian Angelone, Liam Duncan, Gagandeep Singh 
* MacID:​ angelodp, duncanla, singhg25
* Student 1408211, 1427659, 1306242
* Description:​ Creates MP3 objects and all of its parameters for our Online Shopping OOP assignment. 
*/

//Class that creates MP3s (extends Audio -> Item).
public class MP3 extends Audio {

	@Override
	public int getPrice() { //Used to get the price.
		return price; //No enviornmental tax.
	}
	
	public MP3(String[] info){ //Creates MP3 objects.
		
		sNo = Integer.parseInt(info[0]); //Reads in first value for serial number.
		name = info[1]; //Reads in second value for the MP3 name.
		artistName = info[2]; //Reads in third value for the artist name.
		price = Integer.parseInt(info[3]); //Reads in fourth value for the price.
		quantity = Integer.parseInt(info[4]); //Reads in fifth value for the quantity.
		type = info[5]; //Reads in sixth value for the type.
	}
}
