public class StringManipulatorTest {
    public static void main(String[] args) {
	StringManipulator manipulator1 = new StringManipulator();
	String str1 = "    Hola     ";
	String str2 = "     Mundo    ";
	String strr = manipulator1.trimAndConcat(str1,str2);
	System.out.println(strr);
	
	StringManipulator manipulator2 = new StringManipulator();
	char letter = 'n';
	String a = manipulator2.getIndexOrNull("Coding", letter);
	System.out.println(a); 

    StringManipulator manipulator3 = new StringManipulator();
	String word1 = "Hola";
	String subString = "la";
	String d = manipulator3.getIndexOrNull(word1, subString);
	System.out.println(d); 

	StringManipulator manipulator4 = new StringManipulator();
	String word2 = manipulator4.concatSubstring("Hola", 1, 2, "mundo");
	System.out.println(word2); 
    }
}

//javac StringManipulatorTest.java