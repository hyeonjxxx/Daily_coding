<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>

<style>
	.explanation{
        font-family: 맑은고딕;
        font-size: 11pt;
        margin-left: -50px;
    }
</style>
<body>
    <div class="test1">
        <h3>문제1</h3>
        <pre class="explanation">
            우리 태양계를 이루고 있는 행성은 **수성, 금성, 지구, 화성, 목성, 토성, 천왕성, 해왕성**으로 총 8개 입니다.
            저희는 우리 태양계의 n번째 행성이 무엇인지 알고 싶습니다.

            입력으로 행성의 순서를 나타내는 숫자 n이 입력됩니다. 
            출력으로 그 순서에 해당하는 행성의 이름을 출력해 주세요.

            예를들어 1이 입력되면, 첫번째 행성인 수성이 출력됩니다.
            입력 : 1
            출력 : 수성
        </pre>
        <label for=""><b>답)</b></label>
        <button class="answer1" onclick="plant()">행성의 순서는?</button>
    </div>
    <!-- 행성에게 넘버링 배열에 순차적으로 담아서 indexOf로 출력 -->
    <script>
        function plant(){
            
            const plants = ['수성', '금성', '지구', '화성', '목성', '토성', '천왕성', '해왕성'];
            const n = prompt('몇번째 행성인가요?');
    
            //document.getElementById("answer1").innerHTML=indexOf(plants[n-1]);
            console.log(plants[n-1])
        }

    </script>

    <br><br>

    <div class="test2">
        <h3>문제2</h3>
        <pre class="explanation">
            여기도 문제지
        </pre>
        <label for=""><b>답)</b></label>
        <p class="answer2"></p>
    </div>
    <script>

    </script>
    
</body>
</html>