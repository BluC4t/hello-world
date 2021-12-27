package exception_work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class exercise_exception{

    public static void main(String[] args) {
		String path = "C:\\Users\\agent\\hello-world\\exception_work\\score.txt";
		
		Scorer score = new Scorer( path );
		double total = score.sum();
		//double average = score.avg();
		
		//show
		System.out.println( "Total: "+ total );
    }
}

class Scorer {

	private final String targetFile;
	
	public Scorer( String file ) {
		this.targetFile = file;
	}
	
	/**
	 * + sum() : double
	 */
	public double sum() throws NumberFormatException{
		double sum = 0;
		List<String> scores = get();
		if( scores != null ) 
		{
			for (String scoreLine : scores) {
				//split, 12 23 34 45 56
				StringTokenizer tokenizer = new StringTokenizer( scoreLine );
				while ( tokenizer.hasMoreTokens() ) {
					sum += Double.parseDouble(tokenizer.nextToken());
				}
			}
		}
		return sum;
	}
	
	/**
	 * + avg() : double
	 */
	public double avg() {
		/**
		 * TO BE prepared by students... :)
		 */
        double average = 0;
        List<String> scores = get(); //Get / read the file.txt
        int count = 0;
        double sum = 0;

        if(scores != null)
        {
            for(String scoreLine : scores)
            {
                StringTokenizer tokenizer = new StringTokenizer(scoreLine);

                while(tokenizer.hasMoreTokens())
                {
                    sum += Double.parseDouble(tokenizer.nextToken());
                    count++;

                }
            }
        }

        average = sum / count;

		return average;
	}
	
	/**
	 * - get() : List<String>
	 */
	private List<String> get(){
		List<String> content = null;
		if( new File(targetFile).exists() ) //check the targetFile exist 
		{
			content = new ArrayList<>();
			//BufferedReader to read the content
			try {
				BufferedReader br = new BufferedReader(new FileReader(targetFile));
				String line;
				while ( (line = br.readLine()) != null ) {
					content.add(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println( "Done..." );
			}
		}
		return content;
	}
}
