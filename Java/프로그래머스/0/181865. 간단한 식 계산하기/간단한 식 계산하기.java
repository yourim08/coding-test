class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int index=0;
        char sign=' ';
        char ch[] = binomial.toCharArray();
        String a="";
        String b="";
        // 기호 찾기
        for(int i=0; i<ch.length;i++){
            if(ch[i]==' ') {
                index=i+1;
                sign=ch[i+1];
                break;
            }
        }
        // 수 찾기
        for(int i=0; i<ch.length ;i++){
            if(i<index-1)
                a+=ch[i];
            else if(i>index+1)
                b+=ch[i];
        }
        int a1=Integer.parseInt(a);
        int b1=Integer.parseInt(b);
        switch(sign){
            case '+': answer=a1+b1;
                      break;
            case '-': answer=a1-b1;
                      break;
            case '*': answer=a1*b1;
                      break;
        }
        return answer;
    }
}