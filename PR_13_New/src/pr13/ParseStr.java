package pr13;

import java.util.*;

public class ParseStr {
    private LinkedList<String> enteredString;
    private StringBuilder stringBuilder;

    public ParseStr(String enteredFullString) {
        enteredString = new LinkedList<String>();
        stringBuilder = new StringBuilder();
        this.enteredString.addAll(Arrays.asList(enteredFullString.toLowerCase(Locale.ROOT).split("-")));
    }
    public void sortList(){
        for (int i = 0; i < enteredString.size(); i++) {
            for (int j = i; j < enteredString.size() - 1; j++) {
                if (enteredString.get(i).charAt(enteredString.get(i).length() - 1) == enteredString.get(j).charAt(0)){
                    Collections.swap(enteredString, i + 1, j);
                }
                else if (enteredString.get(i).charAt(0) == enteredString.get(j).charAt(enteredString.get(j).length() - 1)){
                    enteredString.add(i,enteredString.get(j));
                    enteredString.remove(j + 1);
                }
            }

        }
    }

    public void createBuilder(){
        for (String str: enteredString) {
            this.stringBuilder.append(str).append(" ");
        }
    }

    public void printBuilder (){
        System.out.println(stringBuilder);
    }


    @Override
    public String toString() {
        return "ParseStr{" +
                "enteredString=" + enteredString +
                '}';
    }
}