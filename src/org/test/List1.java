package org.test;

import java.awt.List;
import java.util.ArrayList;

public class List1 {
public static void main(String[] args) {
	ArrayList lii = new ArrayList();
	lii.add(10);
	lii.add(50);
	lii.add(50);
	lii.add(50);
	lii.add(55);
	lii.add(50);
	System.out.println(lii);
	for (int i = 0; i < lii.size(); i++) {
		Integer j=lii.get(i);
