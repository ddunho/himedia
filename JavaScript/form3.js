//console창에 event 리스트 나옴. event 대신 e만 써도 가능
let btnEl = document.querySelector("button");

btnEl.addEventListener("click", (event)=>{
    console.log(event.target);
}); //target으로 지정 > 자주 씀. event만 쓰면 리스트들 나옴

//기본적으로 가지고 있는 이벤트 제거
const formNode = document.forms[0];

formNode.addEventListener("submit", (e)=>{
    e.preventDefault();
});