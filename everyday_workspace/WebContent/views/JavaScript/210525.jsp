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

	<h2>문제3 : for문 계산</h2>
	<script>
		var a = 10;
		var b = 2;
	
		for(var i=1; i<5; i+=2){
		    a += i; /* a+i=a */
		}
	
		console.log(a+b);
	</script>
	<pre>
		var a = 10; 
		var b = 2; 
	
		for(var i=1; i<5; i+=2){ 
		    a += i; <
		} 
	    
	    이때,  a+b의 값은?
	    <br>
       	답) 16
    </pre>  
     
   <br><hr>
   
   <h2>문제4 : False</h2>
   <pre>
   	  자바스크립트 문법 중 에서 False가 아닌 true 취급하는 것은? <br>
   	  1)  NaN  |  2)  1  |  3)  ""  |  4)  0  |  5)  undefined
   	  <br>
   	  답) JavaScript 에서는 null, undefined, 0, 빈 문자열, NaN, false 를 제외하고는 모두 참인 값
   </pre>   

   <br><hr>
   
   <h2>문제5: concat()</h2>
   <pre>
	 데이터
	var year = '2019';
	var month = '04';
	var day = '26';
	var hour = '11';
	var minute = '34';
	var second = '27';
	
	var result = 답
	
	
	출력
	2019/04/26 11:34:27  
	
	</pre>

	<br>
	답)

	<script>
		var year = '2019';
		var month = '04';
		var day = '26';
		var hour = '11';
		var minute = '34';
		var second = '27';
		
		var result = year.concat('/' , month, '/', day, '/',  hour, ':', minute, ':', second )
		
		console.log(result);
	</script>

</body>
</html>