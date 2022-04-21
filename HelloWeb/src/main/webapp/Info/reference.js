const names = ['조수연', '황진주', '권가희', '이유빈'];

for (let i = 0; i < names.length; i++) {
  console.log((i + 1) + '번째 이름:' + names[i]);
}

//enhanced for
for (let name of names) {
  console.log(name);
}

const numbers = [23, 44, 38, 12, 56];
for (let num of numbers) {
  if (num > 40) {
    console.log(num);
  }
}

const inputs = [];
for (let i = 0; i < numbers.length; i++) {
  var inputVal = prompt('값을 입력하세요..');
  console.log(typeof inputVal, inputVal);
  inputs[i] = parseInt(inputVal)
}
let sum = 0, avg;
for (let i = 0; i < inputVal.length; i++) {
  sum += inputs[i];
}
avg = sum / inputs.length;
//합계와 평균을 구해보자
console.log(sum, avg);