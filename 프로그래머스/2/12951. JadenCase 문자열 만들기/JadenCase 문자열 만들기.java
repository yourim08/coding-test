class Solution {
    public String solution(String s) {
        String part[] = s.split(" ", -1);
         for(int i=0; i<part.length; i++){
             if(part[i].isEmpty()){
                System.out.print(part[i]+"0");       
            }
            System.out.print(part[i]);
        }
        String answer = "";
        for(int l=0; l<part.length; l++){
            if(part[l].isEmpty()){
                continue;
            }
            else {
                part[l] = Character.toUpperCase(part[l].charAt(0)) + 
                    (part[l].substring(1)).toLowerCase();
            }
        }
        // 합치기
        for(int i=0; i<part.length; i++){
            if(i == part.length-1){
                answer+=part[i];
            }
            else {
                answer+=part[i]+" ";
            }
        }
        return answer;
    }
}