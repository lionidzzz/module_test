package myintproject;

import java.nio.charset.StandardCharsets;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.lang.Math;
import java.math.BigInteger;

public final class MyInt
{
	// todo: more tests, exceptions, getters
    String data = "";
	private int BigInteger;

    public MyInt(String data) {
        this.data = data;
    }
    
    public MyInt(Integer data) {
        this.data = "" + data;
    }
    
    public MyInt(Long data) {
        this.data = "" + data;
    }
    
    public MyInt(byte[] data) {
//        this.data = new String(data);
        
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(data);
        int b;
        String temp = "";
        BigInteger newBigInt;
        
        while ((b = byteStream1.read()) != -1){
        	temp += "" + b; 
        }
        
        if (temp.charAt(0) == '1')
        {
        	temp = temp.replaceFirst("1", "-");
        }
    	else {
    		newBigInt = new BigInteger(temp);
    		temp = newBigInt.toString();
    	}
        this.data = temp;
        
    }

    public String add(String string) {
    	// TODO Auto-generated method stub
    	BigInteger data = new BigInteger(this.data);
    	BigInteger to_calc = new BigInteger(string);
    	String ans = "" + data.add(to_calc);
    	MyInt myint = new MyInt(ans);
    	return myint.data;
    }

	public String subtract(String string) {
		// TODO Auto-generated method stub
		BigInteger data = new BigInteger(this.data);
    	BigInteger to_calc = new BigInteger(string);
		String ans = "" + data.subtract(to_calc);
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}
	
	public String multiply(String string) {
		// TODO Auto-generated method stub
		BigInteger data = new BigInteger(this.data);
    	BigInteger to_calc = new BigInteger(string);
		String ans = "" + data.multiply(to_calc);
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}
	
	public String divide(String string) {
		// TODO Auto-generated method stub
		BigInteger data = new BigInteger(this.data);
    	BigInteger to_calc = new BigInteger(string);
		String ans = "" + data.divide(to_calc);
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}
	
	public String max(String string) {
		// TODO Auto-generated method stub
		String ans = "" + Math.max(Integer.parseInt(this.data),Integer.parseInt(string));
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}
	
	public String min(String string) {
		// TODO Auto-generated method stub
		String ans = "" + Math.min(Integer.parseInt(this.data),Integer.parseInt(string));
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}

	public String abs(String string) {
		// TODO Auto-generated method stub
		String ans = "" + Math.abs(Integer.parseInt(string));
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}

	public String compareTo(String string) {
		// TODO Auto-generated method stub
		BigInteger data = new BigInteger(this.data);
    	BigInteger to_calc = new BigInteger(string);
		String ans = "" + data.compareTo(to_calc);
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}
	
	public String toString(Integer number_temp) {
		// TODO Auto-generated method stub
		String ans = "" + number_temp;
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}

	public String longValue(String string) {
		// TODO Auto-generated method stub
		BigInteger data = new BigInteger(string);
		long temp = data.longValue();
		MyInt myint = new MyInt(temp);
		return myint.data;
	}
	
	public int calc_gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
	
	public String gcd(String string) {
		String ans = "" + calc_gcd(Integer.parseInt(this.data),Integer.parseInt(string));
		MyInt myint = new MyInt(ans);
    	return myint.data;
	}

}
