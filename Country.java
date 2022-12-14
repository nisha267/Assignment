package assignment;

import java.util.HashSet;
import java.util.Iterator;

class Country1 {
	
	HashSet<String>H1=new HashSet<String>();
	public HashSet<String> storeCountryNames(String CountryName){
	H1.add(CountryName);
	return H1;
	}
	public String retrieveCountry(String CountryName) {
		 Iterator<String>itr=H1.iterator();
		while(itr.hasNext()) {
			  
			if(itr.next().equals(CountryName)) { 
			return CountryName;}}
			
			return null;}
	
	public static void main(String[] args) {
		Country1 c=new Country1();
		c.storeCountryNames("India");
		c.storeCountryNames("Australia");
		c.storeCountryNames("USA");
		c.storeCountryNames("England");
		String s=c.retrieveCountry("India");
		System.out.println(s);
		String s1=c.retrieveCountry("Srilanka");
		System.out.println(s1);
		}}
	
