package com.blz;

@FunctionalInterface
public interface UserValidate<T> {
	boolean validate(T param);
}
