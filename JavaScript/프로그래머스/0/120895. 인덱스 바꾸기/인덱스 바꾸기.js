function solution(my_string, num1, num2) {
    var answer = '';
    var arr = new Array(my_string.length);
    for(var i=0; i<my_string.length; i++){
        arr[i]= my_string.charAt(i);
    }
    var temp=arr[num1];
    arr[num1]=arr[num2];
    arr[num2]=temp;
    for(var i=0; i<arr.length; i++){
        answer+=arr[i];
    }
    return answer;
}