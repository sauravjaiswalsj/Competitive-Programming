public class LightYears{
	public static void main(String[] args){
		int lightyears=186000;
		long days=1000,seconds,distance;

		seconds=days*24*60*60;
		distance=lightyears*seconds;
		System.out.println("distance: "+distance+"\nSeconds: "+seconds);
	}
}
