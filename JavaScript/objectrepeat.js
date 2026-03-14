let person = {
    name : {
        firstName : "Gildong",
        lastName : "Hong"
    },
    age : 20,
    isAdult : true,
    printInfo:function(){
        console.log("Hello");
    }
}

person.printInfo();


const people = {
    "phone number" : "010-0000-0000"
}
// 띄어쓰기를 사용할때는 ""로 감싸줘야함

let example = {
    fruits: ["apple", "orange", "banana"]
};

console.log(example.fruits[0]);
console.log(example.fruits[1]);
console.log(example.fruits[2]);

let example2 = {
    fruits : {
        fruit1 : "orange",
        fruit2 : "apple",
        fruit3 : "banana"
    }
}

console.log(example2.fruits.fruit1);
console.log(example2.fruits.fruit2);
console.log(example2.fruits.fruit3);

let example3 = {
    greet : function(){
        return "Hello";
    }
}
console.log(example.greet());


let example4 = {
    fruits: {
        fruit1: "orange",
        fruit2: "apple",
        fruit3: "banana",
    },
};

example.fruits.fruit1 = "pineapple";

console.log(example.fruits.fruit1);