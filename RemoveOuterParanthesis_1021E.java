public class RemoveOuterParanthesis_1021E {
    public static void main(String[] args) {
        String s = "(()())";
        RemoveOuterParanthesis_1021E rop = new RemoveOuterParanthesis_1021E();
        System.out.println(rop.removeOuterParentheses(s));
    }
    public String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder str = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(counter != 0) str.append(ch);
                counter++;
            }
            else {
                counter--;
                if(counter != 0) str.append(ch);

            }
        }
        return str.toString();
    }
}
