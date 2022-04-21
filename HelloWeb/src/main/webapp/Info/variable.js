var myName = '이창호'; // string
var yourName; //undefined
myName = 100; //number
myName = true; //boolean
myName = null; // object


console.log(typeof yourName);
yourName = '치와와';
console.log(typeof yourName);

// 전역변수(스크립트 변수), 지역번수(함수 안에서의 변수)

function checkInfo(){
 var myName = 'LeeChangHo'; //함수가 사라지면 var도 사라지겠다.
  console.log(myName);
}
checkInfo()
  console.log(myName);

// ES6 (ES2015) => let, const
// let 블럭레벨 변수선언.

function info(){
let myName = 'Hong'; //let는 중복 불가
}
info();

{
    let myName = 'Hong';
    console.log(myName);
}

{
    let myName = 'Hwang'
    console.log(myName);
}c

const otherName = 'Hong';

// var, let => 변수선언.
// const => 상수선언.

