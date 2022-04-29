/**
 *  ajax.js
 */
//비동기

let val = 10;
setTimeout(function() {
	val += 5;
	console.log('hello -> ' + val);

	setTimeout(function() {
		val += 3;
		console.log('hello2 -> ' + val);

		setTimeout(function() {
			val += 4;
			console.log('hello3 -> ' + val);

		}, 1000);

	}, 1000);

}, 2000);

let success = false;
let promise = new Promise(function(resolve, reject){ //성공하면 첫번째 함수, 실패하면 두번째 함수
	if(success){
		resolve('success');
	}else{
	reject('error');		
	}
});

promise.then(function(result){ //성공했을때는 then에 정의, 실패하면 catch에 정의
			console.log(result);
		})
		.then(function (result){
			console.log(result)
		})
		.then(function (result){
			console.log(result)
		})
		.catch(function(err){
			console.log(err);
		});
