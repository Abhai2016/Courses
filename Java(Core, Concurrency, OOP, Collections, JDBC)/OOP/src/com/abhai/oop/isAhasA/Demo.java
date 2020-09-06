package com.abhai.oop.isAhasA;

public class Demo {
}

class Telega {
    int wheels = 4;
}
// is a - extends Telega(before to implement and extend - think if object has relationship __is__. Car is telega? No.
// has a - extends Radio(has an instance, no extends)
class MyCar {
    Radio radio = new Radio();
    void drive() {

    }

    void listen() {
        radio.listen();
    }
}

class Radio {
    void listen() {

    }
}