package lista_Prioridade.classes;

import java.util.Comparator;

public class DefaultComparator<E> implements Comparator<E> {

	@SuppressWarnings("unchecked")

	public int compare(E a, E b) throws ClassCastException {

	return ((Comparable<E>) a).compareTo(b);

	}
}
