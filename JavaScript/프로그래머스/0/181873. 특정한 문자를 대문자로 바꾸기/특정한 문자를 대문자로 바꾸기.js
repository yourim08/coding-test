function solution(my_string, alp) {
    var answer = '';
    var arr = new Array(my_string.length);
    for(var i=0; i<arr.length;i++){
        if(my_string.charAt(i)==alp){
            arr[i]=alp.toUpperCase();
        }
        else {
            arr[i]=my_string.charAt(i);
        }
    }
    for(var i=0; i<arr.length; i++){
        answer+= arr[i];
    }
    return answer;
}