let exampleSet = new Set();
//Set() : 중복x, 순서 x > 중복된 데이터 제거하고싶을때 사용

exampleSet.add(1);
exampleSet.add(2);
exampleSet.add(3);
exampleSet.add(4);
exampleSet.add(5);

exampleSet.delete(3); //3 삭제


console.log(exampleSet);

let result = exampleSet.has(3); //3이 있는지 없는지 > true 반환
let result2 = exampleSet.size; //몇개있는지 > 5 반환
let result3 = Array.from(exampleSet); //배열로 반환
console.log(result); 