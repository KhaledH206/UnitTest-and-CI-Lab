public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
	if(myString == null){
		return null;
	}
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
	String temp1 = myString.upperCase();
	String temp2 = myString.toLowerCase();
	if(temp2.equals(myString) || temp1.equals(myString)){
		return true;
	}
	for(int i = 0; i < myString; i++){
		if(myString.charAt(i) == temp.charAt(i)){
			return true;
		}
	}
        return false;
    }

}

