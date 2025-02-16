class Solution {
    public boolean isPalindrome(String s) {
        String ms ="";
        for(char ch :s.toLowerCase().toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <='9')){
                ms += ch;
            }
        }
        int i = 0, j = ms.length()-1;
    
        while(i<j){
            if(ms.charAt(i) == ms.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
