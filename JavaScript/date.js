let result = Date();

console.log(result);

// 현재 날짜와 시간을 출력

let result2 = new Date();  //생성자 문법(new, 앞대문자)

console.log(result2);

// 출력은 위와 같지만 객체타입 > 표준내장객체 사용 가능

let result3 = new Date(2024,0,1,1,1,1,1); //년,월,일,시,분,초,밀리초/ 1초는 1000밀리초

console.log(result2);

let date = new Date();

console.log(date.getFullYear()); //년
console.log(date.getMonth()); //월 > 인덱스로 나옴 7이 뜨면 8월인것
console.log(date.getDate()); //일
console.log(date.getHours()); //시
console.log(date.getMinutes()); //분
console.log(date.getSeconds()); //초
console.log(date.getMilliseconds()); //밀리초