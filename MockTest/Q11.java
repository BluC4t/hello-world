package MockTest;

public class Q11 {
    public static void main(String[] args) {
        //Answer: C (but D also works)
    }
}

interface Readable{
    public void readBook();
    public void setBookMark();
}
/* A */ //class Book implements Readable{
abstract class Book implements Readable{ //line n1
    public void readBook(){

    }
    //line n2
    /* B */
    //public abstract void setBookMark();
}


/* C */ abstract class EBook extends Book{
//class EBook extends Book{   //line n3
    public void readBook(){
        
    }
    //line n4
    /* D */
    // public void setBookMark(){

    // }
}