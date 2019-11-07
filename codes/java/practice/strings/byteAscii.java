public class byteAscii{
    public static void main(String[] args){
        byte[] ascii={65,66,67,68,69,70,71,72};
        String s=new String(ascii,1,4);
        System.out.println(s);
    }

}