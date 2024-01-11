package com.tofek.example.spring.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

@SpringBootApplication
public class SpringExampleDemoPracticeApplication {

	public static void main(String[] args) {
		System.out.println("This is tofek khan with all my passion to finish this coding");
		SpringApplication.run(SpringExampleDemoPracticeApplication.class, args);
		//findWordsContaining();
		//findArray();
		//countPairs();
		//findMaximumNUmberOfWords();
		//reversWordsInStringIII();
		//reversWordsInStringIII_UsingStringBuilder();
		//checkIfStringIsAAcronymOfWords();
		uniqueMorseCodeWords();
	}



	public  static List<Integer> findWordsContaining() {
		String[] words = new String[]{"leet", "saman","code", "arham"};
		char x = 'e';
		List<Integer> result = new ArrayList<>();
		for(int i=0; i<words.length; i++) {
			int index = words[i].toString().indexOf(x);
			if (index >= 0) {
				result.add(i);
			}

		}
		return result;
	}

	public static boolean[] findArray(){
		int[] input  = new int[]{2,3,5,1,3};
		boolean[] output  = new boolean[input.length];
		int extraCandies = 3;

		OptionalInt max = Arrays.stream(input).sorted().max();
		System.out.println("Max - "+max);
		for(int i =0; i<input.length; i++){
			if((input[i]+extraCandies)>=max.getAsInt()){
				output[i] = true;
			}else{
				output[i] = false;
			}
		}
		//System.out.println(output);
		for(int i =0; i<output.length; i++){
			System.out.println(output[i]);
		}
		return output;
	}

	public static int countPairs() {
		int count = 0;
		List<Integer> nums = new ArrayList<>();
		//[-6,2,5,-2,-7,-1,3]
		nums.add(-6); nums.add(2); nums.add(5); nums.add(-2); nums.add(-7); nums.add(-1); nums.add(3);
		int target = -2;
		for(int i=0; i<nums.size();i++){
			for(int j=i+1; j<nums.size()-i-1; j++){
				if(nums.get(i)+nums.get(j) < target){
					count++;
				}
			}
		}
		System.out.println(count);
		return count;
	}

	//2114. Maximum Number of Words Found in Sentences
	public static int findMaximumNUmberOfWords() {
		int size = 0;
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		for(int i=0; i<sentences.length;i++){
			String[] sentenceSplit =  sentences[i].split(" ");
			if(size<sentenceSplit.length){
				size = sentenceSplit.length;
			}
		}
		System.out.println(size);
		return size;
	}

	public static String reversWordsInStringIII() {
		String s = "Let's take leetcode";
		StringBuilder finalResult = new StringBuilder("");
		String[] sentences = s.split(" ");
		for(int i=0; i<sentences.length;i++){
			char[] charArray = sentences[i].toCharArray();
			StringBuilder res = new StringBuilder("");
			for(int j = charArray.length-1; j>=0; j--){
				res = res.append(charArray[j]);
			}
			finalResult = finalResult.append(res.toString()).append(" ");
		}
		return finalResult.toString().trim();
	}
	public static String reversWordsInStringIII_UsingStringBuilder() {
		String s = "Let's take leetcode";
		StringBuilder finalResult = new StringBuilder("");
		String[] sentences = s.split(" ");
		for (int i = 0; i < sentences.length; i++) {
			StringBuilder res = new StringBuilder(sentences[i]);
			finalResult = finalResult.append(res.reverse()).append(" ");
		}
		return finalResult.toString().trim();
	}

	/**
	 * 2828
	 * Check if a String Is an Acronym of Words
	 * @return
	 */
	public static boolean checkIfStringIsAAcronymOfWords() {
		List<String> words = new ArrayList<>();
		words.add("Let's"); words.add("take");words.add("leetcode"); //words.add("terst");
		String s = "Ltl";
		if(s.length() != words.size()){
			return false;
		}
		StringBuilder res = new StringBuilder("");
		words.stream().forEach(n->{
			res.append(n.charAt(0));
		});
		System.out.println("----"+res.toString());
		if(s.equalsIgnoreCase(res.toString())){
			return true;
		}else{
			return false;
		}
	}

	/**'
	 * 804. Unique Morse Code Words
	 * @return
	 */
	public static int uniqueMorseCodeWords() {
		String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String[] inputString = new String[]{"a"};
		Set<String> strSet = new HashSet<>();
		for(int i = 0; i<inputString.length; i++){
			char[] t = inputString[i].toCharArray();
			StringBuilder stringBuilder = new StringBuilder("");
			for(int j =0 ; j<t.length; j++){
				stringBuilder.append(morseCode[(int) t[j] - 97]);
			}
			strSet.add(stringBuilder.toString());
		}
		System.out.println(strSet.size());
			return strSet.size();
	}

	public int countConsistentStrings() {
		String allowed = "ab";
		String[] words = new String[]{"ad","bd","aaab","baa","badab"};
		Arrays.stream(words).forEach(word -> {
				char[] charArray = word.toCharArray();
		});

		return 0;
	}
}
