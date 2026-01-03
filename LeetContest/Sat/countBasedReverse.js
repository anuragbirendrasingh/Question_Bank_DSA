let s = "abcdef";
let k = 2;  //bacdef
let ans = "";

for (let i = k - 1; i >= 0; i--) {
  ans = ans + s[i];
}

for (let i = k; i < s.length; i++) {
  ans += s[i];
}

console.log(ans);
