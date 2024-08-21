class Solution {
    public String solution(String my_string) {
        String answer = "";
        int index=0;
        String a[]=new String[my_string.length()];
        for(int i=0;i<a.length ;i++){
            a[i]=String.valueOf(my_string.charAt(i));
        }
        for(int i=0 ; i<a.length ;i++){
            for(int j=i+1; j<a.length; j++){
            if(a[i].equals(a[j])) { 
                a[j]="";
                }
            }
        }
        for(int i=0; i<a.length; i++)
            answer+=a[i];
        return answer;
    }
}