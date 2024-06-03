import java.util.ListIterator;

public class ExercicioIterator {

	public static void main(String[] args) {
		ListaDuplaInteiros lista = new ListaDuplaInteiros();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		
		ListIterator iterator = lista.iterator();
		iterator.add(4);
		iterator.next();
		iterator.next();
		iterator.add(5);
		//iterator.add(new NoListaDupla(2));
		System.out.println("Teste: "+lista);
	}

}