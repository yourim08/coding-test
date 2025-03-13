class Solution {
    public String solution(String s) {
        String small_s = s.toLowerCase();
        String part[] = small_s.split(" ", -1);
        for(int i=0; i<part.length ; i++){
            for(int j=0; j<part[i].length(); j++){
                if(j%2==0){
                    if(j != 0) {
                        part[i] = part[i].substring(0, j) + 
                                  Character.toUpperCase(part[i].charAt(j)) + 
                                  part[i].substring(j+1,part[i].length());
                    }
                    if(j == 0) {
                        part[i] = Character.toUpperCase(part[i].charAt(j)) +
                                  part[i].substring(j+1,part[i].length()); 
                    }
                }
                else {
                    part[i] = part[i].substring(0, j) + 
                              Character.toLowerCase(part[i].charAt(j)) + 
                              part[i].substring(j+1,part[i].length());
                }
            }
        }
        String answer = String.join(" ", part);
        return answer;
    }
}