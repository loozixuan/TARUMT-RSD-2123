import time
from grovepi import *

led = 4
pinMode(led, "OUTPUT")
while True:
    try:
        time.sleep(1)
        digitalWrite(led, 1)
        time.sleep(1)
        digitalWrite(led, 0)
    except KeyboardInterrupt:
        digitalWrite(led, 0)
        break
    except IOError:
        print("IO Error occurs")