let s = "abcdef"
let k = 2 ;  // cbadef
let ans  = "";

// revrese the string till k
for(let i=k ;i>=0 ;i--){
     ans+=s[i];
}

//add the left part of the string
for(let i=k+1;i<s.length;i++){
    ans+=s[i];
}

console.log(ans);


