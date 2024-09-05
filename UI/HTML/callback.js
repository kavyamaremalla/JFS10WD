function display(val) {
  // called call back
  console.log(val);
}

function add(a, b, func) {
  let sum = a + b;
  func(sum);
}

add(4, 5, display);

function welcomeNote() {
  console.log("Welcome to the game !");
}

// setTimeout(welcomeNote(), 3000)

// setTimeout(() => {
//   welcomeNote();
// }, 3000);

setTimeout(() => welcomeNote(), 3000);

console.log("From other piece of code");

