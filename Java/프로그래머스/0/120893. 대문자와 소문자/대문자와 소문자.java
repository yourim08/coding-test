class Solution {
    public String solution(String my_string) {
        char sc[]=new char[my_string.length()];
        for(int i=0; i<sc.length;i++){
            if (my_string.charAt(i)>=65 && my_string.charAt(i)<=90) 
                sc[i]=Character.toLowerCase(my_string.charAt(i));
            else if(my_string.charAt(i)>=97 && my_string.charAt(i)<=122)
               sc[i]=Character.toUpperCase(my_string.charAt(i));
                }
        String answer=String.valueOf(sc);
        return answer;
    }
}