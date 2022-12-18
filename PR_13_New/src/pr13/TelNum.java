package pr13;

public class TelNum {
    private int countryCode;
    private String telephoneNumber;

    public TelNum(String fullTelephoneNumber) {
        if (fullTelephoneNumber.charAt(0) == '+') {
            this.countryCode = Integer.parseInt(fullTelephoneNumber.substring(1, fullTelephoneNumber.length() - 10));
            this.telephoneNumber = fullTelephoneNumber.substring(fullTelephoneNumber.length() - 10);
        }
        else {
            this.countryCode = Integer.parseInt(String.valueOf(fullTelephoneNumber.charAt(0))) - 1;
            this.telephoneNumber = fullTelephoneNumber.substring(fullTelephoneNumber.length() - 10);
        }
//        this.telephoneNumber = fullTelephoneNumber.substring(fullTelephoneNumber.length() - 9);

    }

    public void printNumber(){
        int i = 0, j = 0;
        System.out.print("+" + countryCode);
        for (int i1 = 0; i1 < telephoneNumber.length(); i1++) {
            System.out.print(telephoneNumber.charAt(i1));
            if (i1 % 3 == 2 && i1 < 7) System.out.print("-");
        }
    }
}