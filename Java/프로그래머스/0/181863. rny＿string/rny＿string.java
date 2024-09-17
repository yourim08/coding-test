class Solution {
public String solution(String rny_string) {
        // String answer = "";
        // int count=0;
        // int n=0;
        // char ch[] = rny_string.toCharArray();
        // for(int i=0; i<ch.length;i++){
        //     if(ch[i]=='m') count++;
        // }   
        // char sh[] = new char[ch.length+count];
        // for(int i=0; i<sh.length ;i++){
        //     if(ch[n]=='m') {
        //         sh[i]='r';
        //         i++;
        //         sh[i]='n';
        //         n++;
        //     }
        //     else {
        //         sh[i]=ch[n];
        //             n++;
        //     }
        // }
        // answer = String.valueOf(sh);
        // return answer;
     return rny_string.replace("m", "rn");
    }
}