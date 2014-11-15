package com.gudlike.fishing.test.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class test {

	@Test
	public void aaa() {
		String a = "p12-m2";
		Pattern patt = Pattern.compile("([a-zA-Z]+)(\\d+)");
		Matcher matcher = patt.matcher(a);
		while (matcher.find()) {
			System.out.println(matcher.group());
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
		}
	}
}
