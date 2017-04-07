import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Remove duplicate consecutive items from a list with no loop.
 * @author Supisara Chuthathumpitak
 *
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed. 
	 */
	public static List unique( List list ) {
		if ( list.size() <= 1 ) return list;
		if ( list.get(0).equals( list.get(1 ) )) {
			list.remove(0);
			unique( list.subList ( 0, list.size() ) );
		} else
			unique( list.subList ( 1, list.size() ) );
		return list;
	}
}
