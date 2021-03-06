package com.mckc.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class WordBreakProblem {

	public static void main(String args[]) {
		// Dynamic Programming problem
		// List of Strings to represent dictionary
				List<String> dict = Arrays.asList("this", "th", "is", "famous",
											"Word", "break", "b", "r", "e", "a", "k",
											"br", "bre", "brea", "ak", "problem");

				// input String
				String str = "Wordbreakproblem";
		
		wordBreak(dict, str, "");

	}

	public static void wordBreak(List<String> dict, String str, String out) {
		// if we have reached the end of the String,
		// print the output String

		if (str.length() == 0) {
			System.out.println(out);
			return;
		}

		for (int i = 1; i <= str.length(); i++) {
			// consider all prefixes of current String
			String prefix = str.substring(0, i);

			// if the prefix is present in the dictionary, add prefix to the
			// output String and recur for remaining String

			if (dict.contains(prefix)) {
				wordBreak(dict, str.substring(i), out + " " + prefix);
			}
		}
	}
}
