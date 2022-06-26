package Day_28_01_2022_Annoatations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MyRepeatedAnnos.class)
@interface Words {
	String word() default "Hello";

	int value() default 0;
}

@interface MyRepeatedAnnos {
	Words[] value();
}