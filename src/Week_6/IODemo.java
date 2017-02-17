public class IODemo{

	public static void main(String[] args) {

		String fileName = "/Path/To/Your/File";
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    System.out.println(line);
		}


		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);		
		BufferedReader br = new BufferedReader(isr);
		String line;
		while((line = br.readLine()) != null){
		     System.out.println(line);
		}
		br.close();


		Path path = Paths.get(fileName);
		Scanner scanner = new Scanner(path);
		while(scanner.hasNextLine()){
		    String line = scanner.nextLine();
		    System.out.println(line);
		}
		scanner.close();
	}
}