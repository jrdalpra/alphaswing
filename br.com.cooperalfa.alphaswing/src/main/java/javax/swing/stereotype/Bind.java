package javax.swing.stereotype;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
         ElementType.TYPE,
         ElementType.FIELD,
         ElementType.METHOD
})
@Documented
@IsManaged
public @interface Bind {
   String property() default "?";

   String value();

   /**
    * Two-way binding
    * 
    * @return
    */
   boolean mutual() default false;

}
