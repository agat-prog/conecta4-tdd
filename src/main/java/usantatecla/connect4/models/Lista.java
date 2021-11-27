package usantatecla.connect4.models;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lista<E> implements List<E> {
	
	private Object[] items = {};

	@Override
	public int size() {
		return items.length;
	}

	@Override
	public boolean isEmpty() {
		return this.items.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		for (Object obj : this.items) {
			if (obj.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		return null;
	}

	@Override
	public Object[] toArray() {
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	@Override
	public boolean add(E e) {
		Object[] temporal = Arrays.copyOf(this.items, this.items.length + 1);
		temporal[this.items.length] = e;
		this.items = temporal;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public E get(int index) {
		return (E) this.items[index];
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void add(int index, E element) {
	}

	@Override
	public E remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}
}
