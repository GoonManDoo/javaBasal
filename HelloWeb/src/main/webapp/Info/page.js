console.log(member1);

let field = 'fullName'; //요놈이 변수
console.log(member1.fullName)
console.log(member2['fullName'])
console.log(member3[field]); //변수를 하나 더 선언해서, 필드에 있는 풀네임 값을 불러오겠다. 복잡해도 이거 기억해


//배열요소를 반복적으로  for..of를 사용하세요
for(let member of members){
  console.log(`이름은 ${member['fullName']}이고 나이는 ${member['age']}살이고, 점수는 ${member['score']}점 입니다.`);
}

//오브젝트의 속성(필드)을 반복적으로 읽어 오겠다. for..in
for(let prop in member1) { 
  console.log(`${prop} => ${member1[prop]}`)
}

// 각 배열요소의 각 필드를 출력.
document.write('<table border=1>');
let fields = ['fullName', 'age', 'score']; //출력하고 싶은거랑 순서 고를 수 있음. 지우거나 순서 바꿔.
for (let member of members){
  // for (let prop in member){ //밑에꺼랑 동일
    document.write('<tr>');
    for (let prop of fields) { 
    console.log(`${prop} => ${member[prop]}`);
    document.write(`<td>${member[prop]}</td>`)
  }
  document.write('<td><button>클릭</button></td>')
  document.write('</tr>')
  console.log(`---------------------------`)
}
document.write('</table>')