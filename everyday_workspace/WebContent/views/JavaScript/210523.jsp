<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5.23 (일)</title>
</head>

<style>
	#color_change_ram{
		margin-top: 50px;
		border:2px solid black;
		height: 300px;
		width: 450px;
		position: relative;
	}
	.click_btn{
		width: 90px;
		height: 35px;
		border: 3px solid dimgray(211, 211, 211, 0.507);
		border-radius: 5px;
		background-color: rgba(255, 255, 255, 0);
		color:dimgray;
		position: absolute;
		top: 40%;
    	left: 40%;

	}
	.click_btn:hover{
		border: 3px solid rgba(211, 211, 211, 0.507);
		border-radius: 5px;
		background-color: dimgray;
		color: white;
		cursor: pointer;
	}
	.content{
	font-size: 15px;
	font-family:"나눔고딕";
	line-height: 26px;
	}
</style>

<body>

	<h1>요구사항</h1>
	<p>
	버튼을 클릭할 때 마다 배경색이 바뀜<br>
	버튼에 마우스를 올려놓지 않으면 버튼에 배경색이 없고 라인은 회색<br>
	마우스를 버튼위에 올려놓으면 버튼 배경식은 회색, 글씨는 흰색으로 바뀜<br>
	단, 배경색은 랜덤으로 바뀜

	<p>

	<div id="color_change_ram">
		<button class="click_btn" type="button" onclick="color_change()">Click Me!</button>
	</div>

	<script>
		// JavaScript 함수는 항상 최소와 최대 사이의 임의의 숫자를 반환합니다 (둘 다 포함됨).
		function get_random_integer ( min, max ) { 	
			return Math.floor ( Math.random() * (max - min + 1) ) + min; 
		} 
		function color_change(){
			//alert("잘 구동되는가?")
			
			// RGB코드로 색상 변경-------------
			//1) R,G,B값을 각각 0~255 사이로 얻기
			var R = get_random_integer(0,255);  // 최소=0, 최대= 255
			var G = get_random_integer(0, 255);
			var B = get_random_integer(0, 255);
			
			//2) 위에서 얻은 값을 합쳐서 색상코드로 
			var rgbColor = "rgb("+ R + ", " + G + ", " + B +")";
			
			document.getElementById("color_change_ram").style.backgroundColor = rgbColor;
		}

	</script>
	
	<h3>Math.random()</h3>
	<pre class="content">
	- Math.random() : 0(포함)과 1(제외) 사이의 난수를 반환
	- Math.floor()와 같이 사용하면 임의의 정수를 반환할 수 있음      --예제1
	- <b>최소 (min)&lt;= &nbsp;랜덤 출력 숫자&nbsp; &gt;최대(max)</b>  --예제2
		function getRndInteger(min, max) {
  	     	return Math.floor(Math.random() * (max - min) ) + min;
		}
	- <b>최소 (min)&lt;= &nbsp;랜덤 출력 숫자&nbsp; =&gt;최대(max)</b> (둘 다 포함)  --예제3	
	
	</pre>
	
	<pre class="">
	예제1)<br>
	0부터 10까지 랜덤 숫자 반환<br> 
	Math.foor(Math.random()* 11) 
	<button type="button" onclick="test1()">랜덤숫자 출력</button>
	<p id="num1"></p>
	<!-- min=0*11 , max=1*11  따라서 랜덤으로 출력될수 있는 숫자들은  0,1,2,3,4,5,6,7,8,9,10 -->
	
	
	예제2) 랜덤범위 0부터 9
	<button type="button" onclick="test2()">랜덤숫자 출력</button>
	<p id="num2"></p>
	
	
	예제3) 랜덤범위 0부터 10
	<button type="button" onclick="test3()">랜덤숫자 출력</button>
	<p id="num3"></p>
	
	<script>
		/* 예제1 */
		function test1(){
			document.getElementById("num1").innerHTML=Math.floor(Math.random()*11);
			
		}
	
		/* 예제2 */
		function getRndInteger(min, max) {
	     	return Math.floor(Math.random() * (max - min) ) + min;
		} 	
		function test2(){
			document.getElementById("num2").innerHTML=getRndInteger(0,10);
			
		}
		
		/* 예제3 */
		function getRndInteger(min, max) {
			  return Math.floor(Math.random() * (max - min + 1) ) + min;
		}
		function test3(){
			document.getElementById("num3").innerHTML=getRndInteger(0,10);
			
		}
	
	</script>
	</pre>
	

</body>
</html>