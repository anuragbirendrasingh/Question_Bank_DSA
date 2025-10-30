// wrong code 

let arr = [10,20,30,40,50,10,20,30];

let ans = [];
let k = 0 ;
for(let i=0 ; i<arr.length;i++){
    let visited = false ;
    for(let j=i+1;j<=arr.length-1;j++){
            if(arr[i]==arr[j]){
                visited = true ;
                continue;
            }


    }

    if(!visited){
        ans[k] = arr[i];
        k++;
    }
    
}

console.log(ans);
