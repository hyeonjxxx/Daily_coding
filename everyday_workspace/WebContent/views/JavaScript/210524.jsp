<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.24 (월)</title>
</head>

<style>
	
</style>

<body>
  오늘은 배열(아직 진행중) - https://www.w3schools.com/js/js_arrays.asp 
	<h2>문제1 : 배열의 삭제</h2>
	<p>
	다음 배열에서 400, 500을 삭제 <br>
	
	var nums = [100, 200, 300, 400, 500];
	
	<p>

	답 :
	<button type="button" onclick="delArray()">배열 삭제</button>
	<p id="outputBox"></p>
	
	ㅇㅖ제1: 
	<p id="demo"></p>
	console.log(nums.length);
	
	<script>
		var nums = [100, 200, 300, 400, 500];
		
		function delArray(){
			nums.pop();
			nums.pop();
			document.getElementById("outputBox").innerHTML = nums;
		}
	
	</script>
	
	<br><br>
	<pre>
	- pop() : 배열의 마지막 요소를 제거하고 해당 요소를 반환하는 메소드      	-- 문제1
	- 메소드의 길이도 변경되는가?									-- 예제1
	- shift() : 배열의 첫 번째 요소를 제거하는 메소드					-- 예제2
	- toString() : 배열을 쉼표로 구분된 배열 값의 문자열로 반환
	- join() : 모든 배열 요소를 문자열로 결합하는 메소드
	</pre>

	<h2>문제2 : 배열의 내장함수</h2>
	<p>
	데이터
	var arr = [200, 100, 300]; <br>
	출력 <br>
	[200, 100, 1000, 300]	
	<p>
	
	<script>
		var arr = [200, 100, 300];
		arr.splice(2, 0, 1000);
		console.log(arr);

		var arr = [100, 200, 300];
		console.log(typeof(arr));
	</script>
	
	- arr의 타입은 object

</body>
</html>