//디스트럭처링 할당문법

const person = {
    name: 'John',
    age: 30,
};
//city = undefined 나옴 > 값이 있을땐 값, 없을떈 Unknown 출력
const {name,age,city="Unknown"} = person;

console.log(name);
console.log(age);
console.log(city);