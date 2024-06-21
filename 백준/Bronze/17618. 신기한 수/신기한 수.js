let fs = require('fs');
let input = fs.readFileSync('/dev/stdin').toString().split('\n');

const n = Number(input[0]);
let ans = 0;
for (let i = 1; i <= n; i++) {
  let str = String(i);
  let v = str.split('');
  let temp = 0;

  v.forEach((each) => {
    temp += Number(each);
  });

  if (i % temp == 0) ans++;
}

console.log(ans);
