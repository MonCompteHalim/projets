package tdd;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pyramid pyramid=new Pyramid();
		
		pyramid.addLayer("250 Slaves, 10 Anks");
		
		pyramid.addLayer("150 Slaves, 4 Anks");
		pyramid.addLayer("50 Slaves, 2 Anks");
		
		System.out.println(pyramid.print());
	}
	

}
