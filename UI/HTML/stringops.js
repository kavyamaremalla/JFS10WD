let x = 1;
let y = "1";

// console.log(x === y);

let z = new String(1);
// console.log(z);

console.log( y === z);

let text = "ABCDEFGHIJKLMNOPQRSTUVWXYZC   ";
let length =text.length;
console.log(text.charAt(27));
console.log(text[40]);
console.log(text.charCodeAt(40));


console.log(text.indexOf("C"));
console.log(text.lastIndexOf("C"));
console.log(text.repeat(2));

console.log(1/0);


console.log(text.replaceAll("C", "1234"));

let str = 56;
let string = str.toString();
console.log(string.padEnd(4, "0"));

let pe = '56';
console.log(pe.padStart(3,0));
 

let carName = 'tata';
let carModel = '2024';

let note = `We have brand new
 ${carName}, ${carModel}`

// InterPolation, backticks

console.log(note);

let alphabet = "a, b c | d";
console.log(alphabet.split("|"));

let welcome = "Hello World";
welcome["H"] = "A";

console.log(welcome);


let fruit = "apple, banana, mango";
let part = fruit.slice(7);
let part1 = fruit.slice(7, 9); //end position is not included
let part3 = fruit.slice(-6, -1); //position is counted from end

console.log(part);
console.log(part1);
console.log(part3);
console.log(fruit);

console.log(fruit.substring(7));

console.log(fruit.substr(7,4));













