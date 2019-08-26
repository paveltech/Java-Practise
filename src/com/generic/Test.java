package com.generic;

import java.util.List;

/**
 * 
 * 
 * @author android
 *
 * @param <T>
 * 
 *            this is a generic method where you can show any object comes from
 *            the main thread
 * 
 */

public class Test<T> {

	T object;

	java.util.List<T> ts;

	public Test() {

	}

	public void setObject(T object) {
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public Test(T object) {
		this.object = object;
	}

	public void showObject() {
		System.out.println(object.toString());
	}

	/**
	 * Show a arrayList
	 * 
	 * @param <T>
	 * @param arrayList
	 */

	@SuppressWarnings("hiding")
	public <T> void showList(T[] arrayList) {
		for (T t : arrayList) {
			System.out.println("" + t.toString());
		}
	}

	@SuppressWarnings("hiding")
	public <T> void showListFull(List<T> list) {
		for (T t : list) {

			if (t instanceof String) {
				System.out.println("String list: " + t.toString());
			}

			if (t instanceof Integer) {
				System.out.println("Integer list: " + t.toString());
			}
		}
	}
}
