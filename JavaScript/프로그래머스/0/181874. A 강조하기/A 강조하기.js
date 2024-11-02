function solution(myString) {
    var answer = '';
    var arr ='';
    for(var i=0; i<myString.length; i++){
        arr+=myString.charAt(i).toLowerCase();
    }
    for(var i=0; i<arr.length ; i++){
        if(arr.charAt(i)=='a'){
            answer+=arr.charAt(i).toUpperCase();
        }
        else {
            answer+=arr.charAt(i)
        }
    }
    return answer;
}