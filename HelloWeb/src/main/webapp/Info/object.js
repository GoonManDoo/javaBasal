let member1 = {
  fullName: 'Hong',
  age: 20,
  score: 80
};

let member2 = {
  fullName: 'Hwang',
  age: 22,
  score: 88
}

let member3 = {
  fullName: 'Park',
  age: 25,
  score: 92
}
member1.fullName = '홍';
console.log(member1.fullName)
console.log(member2.age)
console.log(member1.age + member2.age);
// {key: value}, {key: value}
// console.log(member2.fullName + '의 나이는 ' + member2.age + '이고, 점수는 ' + member2.score + '점 입니다')
// console.log(member3.fullName + '의 나이는 ' + member3.age + '이고, 점수는 ' + member3.score + '점 입니다')


const members = [member1, member2, member3];
//홍의 나이는 20이고 변수는 80입니다.
//Hwang의 나이는 22이고 점수는 92점입니다.
//Park의 나이는 25이고 점수는 92입니다.
document.write('<ul>');
for (let i = 0; i < members.length; i++) {
// document.write('<li>'+ members[i].fullName + '</li>' + members[i].age + members[i].score)
// }
document.write(`<li>${members[i].fullName}, ${members[i].age} ${members[i].score}</li>`)
}
document.write('</ul>');
let welcome = `안녕하세요.
               반갑습니다`;
console.log(welcome)

