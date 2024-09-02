class Solution {
    public String[] solution(String[] names) {
        int count=0;
        if(names.length%5!=0 && names.length>5) count=names.length/5+1;
        else if(names.length%5!=0 && names.length<5) count=1;
        else if (names.length%5==0) count=names.length/5;
        String[] answer = new String[count];
        int n=0;
        for(int i=0; i<names.length;i++){
            if(i%5==0) {
                answer[n]=names[i];
                n++;
            }
        }
        return answer;
    }
}