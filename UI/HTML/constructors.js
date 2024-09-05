class Car {
    constructor(name, year) {
        this.name = name
        this.year = year
    }
    age(param){
        return param - this.year
    }

    // constructor(isMarried, gender, study) {
    //     this.isMarried = isMarried
    //     this.gender = gender
    // }
    // gender(param){
    //     return param - this.year
    // }
}

const car = new Car("Tata", 2023);
console.log(car.age(2024));


const person = {
    firstName : "Peter",
    lastName : "Parker",
    language : "",
    set lang(value){
        this.language = value
    },
    setLang :function  lang(value){
        this.language = value
    }
}

console.log("Before setting " + person.language);
person.lang = "English";
console.log("After setting " + person.language);
person.setLang("svdje")
person.language = "French"
console.log("After setting French " + person.language);








