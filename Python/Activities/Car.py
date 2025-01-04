class Car:

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer+ " "+ self.model+ " is moving.")

    def stop(self):
        print(self.manufacturer + " "+self.model + " has stopped.")

c1 = Car("Honda", "H1", "2012", "Manual", "blue")
c1.accelerate()
c1.stop()
c2 = Car("Hyundai", "H2", "2018", "automatic", "black")
c2.accelerate()
c2.stop()
c3 = Car("Maruti", "H5", "2022", "Manual", "Red")
c3.accelerate()
c3.stop()