package com.edu.java;

public interface Tree<D extends Comparable> {
	public boolean isEmpty();
	public int cardinality();
	public boolean member(D elem);
	public NonEmptyBST<D> add(D elem);
}
