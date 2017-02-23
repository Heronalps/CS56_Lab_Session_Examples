public class ExceptionDemo {

	static String readFirstLineFromFile1(String path) throws IOException {
	    try (BufferedReader br =
	                   new BufferedReader(new FileReader(path))) {
	        return br.readLine();
	    }
	}

	static String readFirstLineFromFile2(String path)
                                                     throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(path));
	    try {
	        return br.readLine();
	    } finally {
	        if (br != null) br.close();
	    }
	}


	public void writeList() {
		
	    PrintWriter out = null;

	    try {
	        System.out.println("Entering" + " try statement");

	        out = new PrintWriter(new FileWriter("OutFile.txt"));
	        for (int i = 0; i < SIZE; i++) {
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	    } catch (IndexOutOfBoundsException e) {
	        System.err.println("Caught IndexOutOfBoundsException: "
	                           +  e.getMessage());
	                                 
	    } catch (IOException e) {
	        System.err.println("Caught IOException: " +  e.getMessage());
	                                 
	    } finally {
	        if (out != null) {
	            System.out.println("Closing PrintWriter");
	            out.close();
	        } 
	        else {
	            System.out.println("PrintWriter not open");
	        }
	    }
}
}

