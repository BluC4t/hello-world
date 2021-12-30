package MockTest;

import java.io.IOException;

public class Q8 {
    public static void main(String[] args) /* A */ throws Exception
    {
        X obj = new X();
        System.out.println("Q8.main() before");
        obj.printFileContent();
        System.out.println("Q8.main() after");



        /* B */
        // try {
        //     obj.printFileContent();
        // } catch (Exception e) {
        //     System.out.println("Q8.main() error done");
        // }
        // catch(IOException e){
            
        // }

        
        /* E */
        //throw new IOException();
    }
}

class X{
    public void printFileContent() /* C */throws IOException{
        
        throw new IOException(/* D *///"Exception raised"
        );
    }
}

