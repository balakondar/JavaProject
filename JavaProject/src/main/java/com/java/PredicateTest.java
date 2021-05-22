/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author 91996
 */
public class PredicateTest {

	public static void main(String[] args) {
		Predicate<String> ps = str -> str.length() > 10;
		Predicate<Integer> p = i -> i > 5;
		System.out.println("PredicateTest :" + ps.test("KONDARED"));
		System.out.println("PredicateTest :" + p.test(7));

		List<String> slotList = Arrays.asList("08:00", "08:30", "09:00", "09:30", "19:00", "19:30", "20:00");

		slotList.stream().forEach(slotT -> {
			DateFormat formatter = new SimpleDateFormat("HH:mm");
			Date slot;
			try {
				slot = formatter.parse(slotT);
				Date startT = formatter.parse("08:30");
				Date endT = formatter.parse("20:00");
				if (slot.before(startT) || slot.after(endT) || slot.equals(endT)) {
					System.out.println("Disabled :" + slot);
				} else if (slot.after(startT) && slot.before(endT) ) {
					System.out.println("Enabled :" + slot);
				} else {
					System.out.println("Active :"+slot);
				}
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		});

	}

}
