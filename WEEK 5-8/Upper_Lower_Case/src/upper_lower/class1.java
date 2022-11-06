package upper_lower;

public class class1 {
//Declare Variables 
private char letter;

//declare public
public class1(char let) {
letter=let;
}

//Converting the public letter
public char Convert(char letter) {
int a;
a=(int)letter+32;
letter=(char)a;
return letter;
}
}