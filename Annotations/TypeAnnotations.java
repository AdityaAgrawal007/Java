// Annotationso are implemented as special interfaces internally
import java.lang.annotation.Target // Target is a meta annotation - used to annotate other anotation to specify how they are used ...
import java.lang.annotation.ElementType

@Target(ElementType.TYPE_USE)

@interface TypeAnnotationDemo;

class TypeAnnotations{
	public static void main(String args[]){
		
	}

}
