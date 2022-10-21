package prZoologicoDAO;

public class Main {

	public static void main(String[] args) {
		
		
		
		Animal a= new Animal ("Perro","Casa",01.);
		AnimalDAO.insertAnimal(a);
		//AnimalDAO.deleteAnimal();
		System.out.println("a");
		AnimalDAO.deleteAnimalByNombre("Ardilla");
		Animal b = AnimalDAO.findById(9);
		System.out.println(b);
	}

}
