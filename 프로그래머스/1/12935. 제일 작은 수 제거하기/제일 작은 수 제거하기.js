function solution(arr) {
    let answer=[];
    if(arr.length==1){
        answer=[-1]
    }else{
        let min = arr[0];
        for (let i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        for (let i = 0; i < arr.length; i++) {
            if(min<arr[i]){
                answer.push(arr[i]);
            }
        }
    }
    
    return answer;
}