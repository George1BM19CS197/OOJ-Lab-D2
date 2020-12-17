import java.util.*;
import java.lang.*;

public class WrongAge extends Exception {
	int x;
	WrongAge(int x){
		this.x = x;		
	}
	public String toString(){
		return "Error..Son's age cannot be greater than the father's age.. ";
	}
}