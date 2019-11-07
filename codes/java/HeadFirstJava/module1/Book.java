class books{
    String title;
    String author;
}
class Book{
    public static void main(String[] args){
        books[] myBook=new books[3];
        int x=0;
        myBook[0] =new books();
        myBook[1]=new books();
        myBook[2]=new books();
        myBook[0].title="The Grape of Java";
        myBook[1].title="the Java Gatsby";
        myBook[2].title="The Java CookBook";
        myBook[0].author="Bob";
        myBook[1].author="aue";
        myBook[2].author="Sa";
        while(x<3){
            System.out.println(myBook[x].title);
            System.out.println("by");
            System.out.println(myBook[x].author);
            x++;
        }
    }

}