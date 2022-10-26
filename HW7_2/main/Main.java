package HW7_2.main;

import HW7_2.entity.Directory;
import HW7_2.entity.TextFile;
import HW7_2.view.View;

public class Main {
    
	public static void main(String[] args) {

		TextFile textFile = new TextFile("My file", " This is my text file.");

		textFile.setName("My textFile");

		Directory directory = new Directory();

		directory.addFile(textFile);

		View view = new View();

		view.print(textFile);

		textFile.addText(" I have created it.");

		view.print(textFile);

		directory.removeFile(textFile);

	}

}
