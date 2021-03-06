/*
 * Copyright 2012 Fundació Barcelona Media
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *      http://www.apache.org/licenses/LICENSE-2.0

 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.barcelonamedia.uima.consumer.utils;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;


public class CollectionUtils{

	private CollectionUtils() {}

	public static String join (AbstractCollection<String> s) {
	    
		return CollectionUtils.join(s, "");
	}

	public static String join (AbstractCollection<String> s, String delimiter){
		
		if (s == null || s.isEmpty()) return "";
	    
		Iterator<String> iter = s.iterator();
	    StringBuilder builder = new StringBuilder(iter.next());
	    
	    while( iter.hasNext() ) {
	      builder.append(delimiter).append(iter.next());
	    }
	    
	    return builder.toString();
	}
	
	public static ArrayList<String> stringArrayToArrayList(String[] data){
       
        //create new ArrayList object
        ArrayList<String> array_data = new ArrayList<String>();
       
        //add individual numbers to the ArrayLists
        for(int i=0; i< data.length; i++){
        	array_data.add(data[i]);
        }
       
        return array_data;
    }
}
