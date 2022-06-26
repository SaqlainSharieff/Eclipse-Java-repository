class Box{
	float width;
	float height;
	float depth;
	float calVol() {
		return width*height*depth;
	}
}
public class BoxDemo {

	public static void main(String[] args) {
		Box box1;
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol=box1.calVol();
		System.out.println("volume of box1 is "+vol);
		Box box2=new Box();
		box2.height=3.5f;
		box2.width=2.5f;
		box2.depth=1.5f;
		vol=box2.calVol();
		System.out.println("Volume of box2 "+vol);
		
		
		

	}

}
