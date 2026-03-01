//form에서만 쓰이는 문법이라 생각
//배열로 반환
console.log(document.forms[0]);

//name을 통해 선택 가능
console.log(document.forms["frm1"]);
console.log(document.frm1);

//form 밑에 요소 선택
console.log(document.frm1.elements["uname"]);
console.log(document.frm1[0]); //input 출력, label은 요소 x

//id값으로 선택 가능, id 값을 입력해야함
console.log(document.frm1.uname);

//value값 선택 가능, placeholder는 지워지지만 value는 안지워짐
console.log(document.frm1.uname.value);

//value값 변경 가능
document.frm1.uname.value = "change!";

/*파일첨부 > 파일 첨부하고 콘솔창에 입력해야함
console.log(documnet.frm.upload.files); > 객체로 생성 : 파일 정보를 db에 넣을때*/

//이벤트 넣기
//프로퍼니 리스너 방식 : html에 속성이 없고 js에서 속성 부여
function clickEvent(){
    alert("Hello");
}

//이벤트 넣기 가장 추천 방식:
const btnE1 = document.querySelector("button");
btnE1.addEventListener("click", function(){
    alert("HELLO");
})

/*  한번 클릭 : click
    두번 클릭 : dblclick
    마우스 올리면 : mouseover
    마우스 움직일때 : mousemove
    마우스 휠 올리거나 내릴때 : wheel
    키보드 누를때 : keydown  > 중괄호 console.log로
    키보드 누른 후 손을 뗐을떄 : keyup*/
