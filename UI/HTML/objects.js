let car = "tata";

const carDetails = {
  model: "nano",
  color: "white",
  secondHand: false,
  price: 100000,
};

// console.log(car);
// console.log(carDetails.model);
// console.log(carDetails.color);
// console.log(typeof car);
// console.log(typeof carDetails.secondHand);

function nameOfFunction(p1, p2) {
  return p1 + p2;
}

let print = function nameOfFunction1() {
  console.log("From normal function");
};

// console.log(nameOfFunction(4,3));
// console.log(nameOfFunction("hi ","welcome"));

// console.log(print());

let person = {
  fName: "John",
  lName: "Jill",
  fName : "ahdb",
  age: 26,
  isMarried: false,
  company: {
    name: "TCS",
    salary: 100000,
    experienced: true,
  },
  function (){
    return this.fName + " " + this.lName + " " + this.company.experienced
  }
};

console.log(person.function());
