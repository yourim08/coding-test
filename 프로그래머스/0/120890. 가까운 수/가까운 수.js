function solution(array, n) {
    var answer = 0;
    var minus = new Array(array);
    for(var i=0; i<array.length;i++){
        if((array[i]-n)<0) minus[i]=-(array[i]-n);
		else minus[i]=array[i]-n;
    }
    let m=100;
	let mi=0;
	for(var i=0; i<minus.length;i++) {
		if(minus[i]<m) {
			m=minus[i];
			mi=i;
		}
		else if(minus[i]==m) {
			if(array[i]<array[mi]) {
				mi=i;
            }
		}
	}
    answer=array[mi];
    return answer;
}