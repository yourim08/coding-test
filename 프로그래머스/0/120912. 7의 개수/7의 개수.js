function solution(array) {
    var count=0;
    for(var i=0;i<array.length ;i++){
        var a=(String)(array[i]);
        for(var j=0;j<a.length;j++){
            if(a.charAt(j)=='7') count++;
        }
    }
    var answer = count;
    return answer;
}