// Annotations are just used to attach metadata
// Annotationso are implemented as special interfaces internally
import java.lang.annotation.Target;// Target is a meta annotation - used to annotate other anotation to specify how they are used ...
import java.lang.annotation.ElementType;

@Target(ElementType.TYPE_USE) // the custom annotation we are making can be applied anywhere where a type is used
@interface TypeAnnotationDemo{} // @interface is used to create custom annotations

class TypeAnnotations{
	public static void main(String args[]){
		@TypeAnnotationDemo String str = "niga";
		
	}

}
