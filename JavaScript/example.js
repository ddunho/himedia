let post1 = {
    제목 : "안녕하세요.",
    내용 : "내용입니다.",
    작성자 : "안재홍"
};
let post2 = {
    제목 : "하루",
    내용 : "좋은 하루 보내세요",
    작성자 : "이하늘"
};
let post3 = {
    제목 : "날씨",
    내용 : "하늘이 맑아요",
    작성자 : "오정수"
};
// 변수가 많아져서 별로/ 배열로 담아두면 반복이 쉽지만, 변수로 담아두면 반복이 어려움
let array = [post1, post2, post3];

console.log(array);


// 선생님 답 > 현업에서 이런 형태로 많이 나옴

let posts = [
    {
    title : "안녕하세요.",
    content : "내용입니다.",
    writer : "안재홍"
},
{
    title : "하루",
    content : "좋은 하루 보내세요",
    writer : "이하늘"
},
{
    title : "날씨",
    content : "하늘이 맑아요",
    writer : "오정수"
}
];