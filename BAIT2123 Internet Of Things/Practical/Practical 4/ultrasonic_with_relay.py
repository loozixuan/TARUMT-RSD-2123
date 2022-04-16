from time import *
from grovepi import *

ultrasonic_port = 3
relay_port = 2

pinMode(relay_port,"OUTPUT")

while True:
    try:
        sleep(0.5)
        distance = ultrasonicRead(ultrasonic_port)
        print('Distance : ', distance, 'cm')
        if distance <= 10:
            digitalWrite(relay_port, 1)
        else:
            digitalWrite(relay_port, 0)
    except KeyboardInterrupt:
        digitalWrite(relay_port, 0)
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break
























