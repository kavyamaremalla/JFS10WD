// let counter = 0;

// function add() {
//     // let counter = 0;
//     counter +=1;
//     console.log(counter);
//     return counter
// }

// add()
// add()
// add()

// function sub() {
//     counter -=1;
// }

// sub()

// console.log(counter);

function add() {
  let counter = 0; //global
  function plus() {
    counter += 1; //local
  }
  plus();
  console.log(counter);
  return counter;
}

// closure
const sum = (function () {
  let counter = 0; //global
  console.log(counter);
  return function () {
    counter += 1; //local
    console.log(counter);
    return counter;
  };
})(); // self invoking function

sum();
sum();
sum();

function outerFunction() {
  let outerVariable = 10;
  function innerFunction() {
    console.log(++outerVariable);
  }
  return innerFunction;
}

const closure = outerFunction();
console.log(outerFunction);
console.log(outerFunction());

closure();
