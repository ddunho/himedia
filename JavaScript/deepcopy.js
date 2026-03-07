//기본 데이터 타입은 영향을 미치지 않음(숫자,문자,undefined,null)

let num = 10;
let copyNum = num;

num = 20;

console.log(num);  //20
console.log(copyNum); //10