//Program to Demonstrate User Define Annotation - SmartTV
package com.tnsif.daytwentyone.userdefinedannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface SmartTV {
	String os();

	int width();

	int height();
}