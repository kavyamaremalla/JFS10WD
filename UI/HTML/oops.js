class Car {
     constructor(brand) {
        this.carName = brand
    }
    present(){
        return 'Car brand is ' + this.carName
    }
}

class Model extends Car {
    constructor(brand, mod){
        super(brand)
        this.model = mod;
    }
    show(){
        return this.present() + " is of " + this.model +  " " + this.carName;
    }
    static display(){
        console.log("From Static Method of Model");   
    }
}

const car = new Model("Tata", 2024)
// console.log(car.display());
console.log(car.show());
console.log(Car.display);



