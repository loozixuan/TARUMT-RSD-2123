import time
import math
from grovepi import *

buzzer = 2
button = 4

pinMode(buzzer, "OUTPUT")
pinMode(button, "INPUT")

while True:
    try:
        time.sleep(0.25)
        bStatus = digitalRead(button)
        if(bStatus):
            digitalWrite(buzzer, 1)
        else:
            digitalWrite(buzzer, 0)
    except KeyboardInterrupt:
        digitalWrite(buzzer, 0)
        break
    except IOError:
        print("I/O error occurs")
        break





















