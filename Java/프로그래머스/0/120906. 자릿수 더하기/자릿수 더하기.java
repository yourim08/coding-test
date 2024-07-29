class Solution {
    public int solution(int n) {
        String st=Integer.toString(n);
        char ch[]=new char[st.length()];
        int a[]= new int[st.length()];
        int answer=0;
    
        for(int i=0; i<ch.length ;i++){
            ch[i]=st.charAt(i);
        }
         for(int i=0; i<a.length ;i++){
            a[i]=(int)ch[i]-48;
        }
        for(int i=0; i<a.length ; i++){
            answer+=a[i];
        }
        return answer;
    }
}