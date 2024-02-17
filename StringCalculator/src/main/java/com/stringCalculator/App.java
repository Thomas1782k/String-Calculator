package com.stringCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
/*	step 1:
	public int add(String numbers) {
        return 0;
    }
	
  step 2:	
	public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] nums = numbers.split(",");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
	
	step: 3
	public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String[] nums = numbers.split("[,\n]");
        int sum = 0;
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
	
	step: 4
	
	public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        
        step: 5*/
	    public int add(String numbers)  {
	        if (numbers.isEmpty()) {
	            return 0;
	        }
	        String delimiter = ",";
	        if (numbers.startsWith("//")) {
	            int delimiterIndex = numbers.indexOf("\n");
	            delimiter = numbers.substring(2, delimiterIndex);
	            numbers = numbers.substring(delimiterIndex + 1);
	        }
	        String[] nums = numbers.split("[" + delimiter + "\n]");
	        int sum = 0;
	        StringBuilder negativeNumbers = new StringBuilder();
	        for (String num : nums) {
	            int n = Integer.parseInt(num);
	            if (n < 0) {
	                if (negativeNumbers.length() > 0) {
	                    negativeNumbers.append(", ");
	                }
	                negativeNumbers.append(n);
	            }
	            sum += n;
	        }
	        if (negativeNumbers.length() > 0) {
	            throw new IllegalArgumentException("Negatives are not allowed: " + negativeNumbers);
	        }
	        return sum;
	    }
	

}
