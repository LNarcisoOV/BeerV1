package br.com.models;

import java.util.ArrayList;
import java.util.List;

public class Beers {
	
	public List<String> retornaCervejas(String cor){
		List<String> listBeer = new ArrayList();
		
		if(cor.equals("red")){
			listBeer.add("Baden Baden");
			listBeer.add("Devassa");
		}
		
		if(cor.equals("green")){
			listBeer.add("Skol");
			listBeer.add("Brahma");
		}
		
		if(cor.equals("yellow")){
			listBeer.add("Heineken");
			listBeer.add("bud light");
		}
		
		return listBeer;
	}
}
