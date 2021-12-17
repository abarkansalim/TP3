package ma.education.tp4.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		Terre t1= Terre.getInstance(1000, 2000);
		Terre t2= Terre.getInstance(4000, 5000);
		
		System.out.println("Distance : "+t1.distanceToSoleil+ ", Surface : "+t1.surface);
		System.out.println("Distance : "+t2.distanceToSoleil+ ", Surface : "+t2.surface);
		//la methode getInstance() retour toujour la premiere instance crée
	}
}
