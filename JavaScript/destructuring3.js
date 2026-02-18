//디스트럭처링 할당문법

const person = {
    name: 'John',
    age: 30,
};
//변수이름 변경
const {name:fullName,age:personAge,city} = person;

console.log(fullName);
console.log(personAge);