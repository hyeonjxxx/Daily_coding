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
    <pre class="test1">
        문제1.
        let s = 0;

        //pass

        console.log(s);
    </pre>
    <p id="answer1"></p>
    <script>
        let s = 0;
        for(let i = 1; i<= 100 ; i++){
            s += i;
        }
        document.getElementById("answer1").innerHTML = s
    </script>

    <pre class="test2">
        문제2
        데이터
        <여기에 class를 작성하세요.>

        const x = new Wizard(545, 210, 10);
        console.log(x.health, x.mana, x.armor);
        x.attack();


        출력
        545 210 10
        파이어볼
    </pre>
    <script>
        const Wizard = class Wizard{
            constructor (health, mana, armor){
                this.health = health;
                this.mana = mana;
                this.armor = armor;
            }
            attack(){
                console.log('파이어볼')
            }            
        }

        const x = new Wizard(545, 210, 10);
        console.log(x.health, x.mana, x.armor);
        x.attack();

    </script>
    <p>
       설명)
       const <br>
       - 키워드 const는 상수값을 정의하지 않음 <br>
       - 상수에 기본 값을 지정하면 기본 값을 변경할 수 없음 <br>
       <br><br>

       attack() <br>
       - aa <br>
       - aaa <br>
    </p>

    <pre class="test3">

    </pre>
    <script>
        
    </script>

    <pre class="test4">

    </pre>
    <script>
        
    </script>


</body>
</html>