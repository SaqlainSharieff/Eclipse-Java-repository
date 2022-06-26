package Day_28_01_2022_Annoatations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SmartPhone {
	String os() default "Symbian";

	int version() default 1;
}