package Day_28_01_2022_Annoatations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
//Make words annotation repeatable

public class AnnoatationsDemo {
	// Repeat words on newMethod
	@Words(word = "First", value = 1)
	@Words(word = "Second", value = 3)
	public static void newMethod() {
		AnnoatationsDemo obj = new AnnoatationsDemo();

		try {
			Class<?> c = obj.getClass();
			// Obtain the annotation for newMethod
			Method m = c.getMethod("newMethod");
			// Display the repeated annotation
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		newMethod();
	}
}
