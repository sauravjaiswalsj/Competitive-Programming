public class BitbyBit{
	public static void main(String[] args){
		byte signedByte=-1;
		int unsignedByte=signedByte & (0xff);

		System.out.println("Signed: "+signedByte+"unsigned: "+unsignedByte);
	}
}

