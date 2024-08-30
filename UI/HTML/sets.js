const alphabet = new Set(["a", "b", "c", "d"]); //create a set from an array

const letters = new Set();
const a = "a";
letters.add(a); //adding variable
letters.add("b"); //adding value
letters.add("c");
letters.add("d");
letters.add("d"); // not allowing duplicates

for (const element of letters) {
  console.log(element);
}

console.log(typeof letters);

console.log(letters instanceof Set);
// let val = "5";
// let value = new String(5);
// console.log(value instanceof String);
// console.log(val instanceof String);
// console.log(typeof val === "string");
// console.log(typeof 5 === "number");

console.log(alphabet.has("de"));

alphabet.forEach((val) => console.log(val));

console.log("***************************************************");

for (const element of alphabet.values()) {
    console.log(element);
    
}


console.log("***************************************************");

for (const element of alphabet.keys()) {
    console.log(element);
    
}

console.log("***************************************************");

for (const element of alphabet.entries()) {
    console.log(element);
    
}
console.log(letters);

letters.clear()
console.log(letters);
