package com.minis.beans;

import com.sun.jdi.connect.Connector;

import java.util.*;

/**
 * @program: MicroSpring
 * @description:
 * @author: Max Wu
 * @create: 2023-07-11 11:09
 **/
public class ArgumentValues {
	//private final Map<Integer, ArgumentValue> indexedArgumentValues = new HashMap<>();
	private final List<ArgumentValue> argumentValues = new ArrayList<>();
	public ArgumentValues(){
	}

	public void addArgumentValue(ArgumentValue argumentValue){
		this.argumentValues.add(argumentValue);
	}

	public ArgumentValue getIndexedArgumentValue(int index) {
		ArgumentValue argumentValue = this.argumentValues.get(index);
		return argumentValue;
	}

	public int getArgumentCount(){
		return (this.argumentValues.size());
	}

	public boolean isEmpty(){
		return (this.argumentValues.isEmpty());
	}
	
	/*public void addArgumentValue(Integer key, ArgumentValue newValue){
		this.indexedArgumentValues.put(key, newValue);
	}

	public boolean hasIndexedArgumentValue(int index){
		return this.indexedArgumentValues.containsKey(index);
	}

	public void addGenericArgumentValue(Object value, String type){
		this.genericArgumentValues.add(new ArgumentValue(value, type));
	}

	public boolean isEmpty(){
		return this.genericArgumentValues.isEmpty();
	}

	public ArgumentValue getIndexedArgument(int index){
		ArgumentValue argumentValue = indexedArgumentValues.get()
	}
	public void addGenericArgumentValue(ArgumentValue newValue){
		if(newValue.getName()!=null) {
			for(Iterator<ArgumentValue> it = this.genericArgumentValues.iterator(); it.hasNext();){
				ArgumentValue currentValue = it.next();
				if(newValue.getName().equals(currentValue.getName())){
					it.remove();
				}
			}
		}
		this.genericArgumentValues.add(newValue);
	}

	public ArgumentValue getGenericArgumentValue(String requiredName){
		for(ArgumentValue value : this.genericArgumentValues){
			if(value.getName() != null && (requiredName == null || value.getName() == null)){
				continue;
			}
			return value;
		}
		return null;
	}*/
}

