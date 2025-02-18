public class PracticeProblem {

	public static void main(String args[]) {

	}

public static String pluralize(String word){
	String end;
	word = word.toLowerCase();
	if (word.endsWith ("y")){
	
		if (word.endsWith("ey")){
			end = "eys";
	}
		else{
				end = "ies";
		}
	}
	else if (word.endsWith("ife")){
		end = "ives";
	}
	else{
		end = "s";
	}
	return end;
}

public static int min(int num1, int num2, int num3){
int smallest;
if (num1 < num2){
	if (num3<num1)
	{
		smallest = num3;
	}
	else{
		smallest = num1;
	}
}
else{
	if (num2 < num3){
		smallest = num2;
	}
	else{
		smallest = num3;
	}
}


return smallest;
}

public static boolean isLeapYear(int year){
boolean isLeapYear;
if (year%4 ==0){
	if (year%100 ==0){
		if (year %400 ==0){
			isLeapYear = true;
		}
		else {
			isLeapYear = false;
		}
	}
	else{
		isLeapYear = true;
	}

}
else{
	isLeapYear = false;
}

return isLeapYear;
}
}
