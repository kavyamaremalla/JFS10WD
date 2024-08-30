let numbers = new Array(11, 2, 4, 7, 9);

for (let index = 0; index < numbers.length; index++) {
  const element = numbers[index];
  console.log(element);
}

console.log("**********************************");

for (let element in numbers) {
  console.log(numbers[element]);
}

const person = { fName: "John", lName: "Jill", age: 25 };
let text = "    ";
for (let x in person) {
  //   console.log((text += person[x]));
  console.log((text += x));
  //   console.log((text += person.x));
}

console.log("**********************************");

for (let num of numbers) {
  console.log(num);
  console.log(numbers[num]);
}

console.log("**********************************");

let str = "Hello,Everyone";
for (let char of str) {
  console.log(char);
}

console.log("**********************************");

let i = 1;

while (i <= 10) {
    console.log(i++);
    
}

console.log("**********************************");

do {
   console.log("Executing do-while loop");
    i++
} while (i < 10) ;