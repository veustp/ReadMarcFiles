package libis.be.ReadMarcFiles;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MarcFile {
	private final static int recordTerminator = 0x1D;	
	private final static int fieldTerminator = 0x1E;
	private final static int subFieldTerminator = 0x1F;
	private List<Record> recordList;
	public MarcFile(String fileName) {
		this.recordList = new ArrayList<Record>();
		File f=new File(fileName);     //Creation of File Descriptor for input file
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
			int c = 0; 
			String mRec = "";
			try {
				while((c = br.read()) != -1)  {       //Read char by Char
					char character = (char) c;          //converting integer to char
					mRec = mRec + character;
					if (character == recordTerminator) {
						System.out.println("New String "+mRec);
						mRec = "";
					}
					//System.out.println(character);        //Display the Character
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}   //Creation of File Reader object
	}
}
