class Solution {
    public String solution(String my_string, int n) {
        char ch[] = my_string.toCharArray();
        char sc[]= new char[ch.length*n];
        int count=0;
        int count1=0;
        for(int i=0;i<sc.length ;i++){   
           sc[i]=ch[count];
            count1++;
            if(count1%n==0){
                count++;
            }
        }
        String answer = String.valueOf(sc);
        return answer;
    }
}