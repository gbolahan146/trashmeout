package com.bookstore.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {
	public final static String US = "US";

	public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
		{
			put("LA", "Lagos");
			put("AD", "Adamawa");
			put("KE", "Kebbi");
			put("KW", "Kwara");
			put("Ab", "Abuja");
			put("BA", "Bauchi");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
			put("LA", "Lagos");
		}
	};
	
	public final static List<String> ListOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
	public final static List<String> ListOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}

