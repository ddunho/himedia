//js에서 id로 html 태그 선택
let node = document.getElementById("text1");
console.log(node);

//js에서 속성 컬러 바꾸기
node.style.color = "green";

//js에서 class로 html 태그 선택
let nodes = document.getElementsByClassName("text2");
console.log(nodes);
//배열의 형태로 나타남

//색을 바꿔줄때는 for문을 사용하는것이 편하고 좋음
nodes[0].style.color = "green";

//js에서 태그를 직접 선택
let nodes2 = document.getElementsByTagName("p");
console.log(nodes);
// 배열의 형태로 나타남
nodes2[3].style.color = "blue";

//선택된 태그중에 하나만 선택, 모두 선택하고싶으면 querySelectorAll 사용 > 배열(하나여도 배열로 담김)
let node3 = document.querySelector("p");
console.log(node3);
node3.style.color = "purple";
// "p" 대신 "#text1" 과 같이 css 문법으로 id 선택 가능, class로 할 경우 하나만 선택