import time
import grovepi

rotaryangle = 2
led = 6

grovepi.pinMode(rotaryangle, "INPUT")
grovepi.pinMode(led,  "OUTPUT")
val = 0

while True:
    try:
        time.sleep(1)
        val = grovepi.analogRead(rotaryangle)
        print(val)
        grovepi.analogWrite(led, val//4)
    except KeyboardInterrupt:
        digitalWrite(led, 0)
        break
    except IOError:
        print("I/O error occurs")
        break



















