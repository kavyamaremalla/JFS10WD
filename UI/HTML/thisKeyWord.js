
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
    completeName : function (){
      return this.fName + " " + this.lName 
    }
  };
  
//   console.log(person.function());

const person1 = {
    fName : "Peter",
    lName : "Parker"
}
  
// const person2 = {
//     fullName : function (city, country) {
//         return this.fName + " " + this.lName;
//     }
// }


const person2 = {
    fullName: function (city, country) {
        return this.fName + " " + this.lName + " from " + city + ", " + country;
    }
};

// console.log(person2.fullName.call(person1));
// console.log(person2.fullName.call(person));

const bindedName = person.completeName.bind(person1);
console.log(bindedName()); 



const appliedName = person.completeName.apply(person1);
console.log(appliedName); 

console.log(person2.fullName.apply(person, ["City" , "India"]));
