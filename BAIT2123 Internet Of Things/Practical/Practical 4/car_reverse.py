from time import *
from grovepi import *

ultrasonic_port = 3
relay_port = 2

pinMode(relay_port,"OUTPUT")

while True:
    try:
        distance = ultrasonicRead(ultrasonic_port)
        print('Distance : ', distance, 'cm')
        
        if distance >= 0 and distance <= 10:
            sleep(0.1)
            digitalWrite(relay_port, 1)
            sleep(0.1)
            digitalWrite(relay_port, 0)
            
        elif distance >= 10 and distance <= 20:
            sleep(0.2)
            digitalWrite(relay_port, 1)
            sleep(0.2)
            digitalWrite(relay_port, 0)
            
        elif distance >= 20 and distance <= 30:
            sleep(0.35)
            digitalWrite(relay_port, 1)
            sleep(0.35)
            digitalWrite(relay_port, 0)
            
        elif distance >= 30 and distance <= 40:
            sleep(0.5)
            digitalWrite(relay_port, 1)
            sleep(0.5)
            digitalWrite(relay_port, 0)
            
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