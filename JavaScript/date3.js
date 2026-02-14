const date1 = new Date(2023,3,23);
const date2 = new Date(2023,3,26);
// getTime() : 밀리초로 반환
const dateDiff = date2.getTime() - date1.getTime();
const interval = dateDiff / (24 * 60 * 60 * 1000);

console.log(interval + "일전");