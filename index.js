 function findLargest() {

   
        let n1 = Number(document.getElementById("num1").value);
        let n2 = Number(document.getElementById("num2").value);
        let n3 = Number(document.getElementById("num3").value);
        let n4 = Number(document.getElementById("num4").value);
        let n5 = Number(document.getElementById("num5").value);

        let largest = Math.max(n1, n2, n3, n4, n5);
        document.getElementById("result").innerText = "Largest Number is: " + largest;
    }