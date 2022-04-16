from time import *
from grovepi import *
from grove_rgb_lcd import *
from random import *
from urllib.request import *
from beebotte import *

led = 3
soundsensor = 0
lightsensor = 1
dhtsensor = 4
pinMode(led, "OUTPUT")
pinMode(soundsensor, "INPUT")
pinMode(lightsensor, "INPUT")
pinMode(dhtsensor, "INPUT")
apiKey = "hiISTRrZCrP5oEQZCe7s4nkf"
secretkey = "H0s80ebHZRbiG9lO4Ox1TA77wMtnRHft"
bclient = BBT(apiKey, secretkey)

while True:
    try:
        sleep(5)
        [temp, hum] = dht(dhtsensor, 0)
        light = analogRead(lightsensor)
        sound = analogRead(soundsensor)
        print("Temp = %.2f, hum = %d, light = %d, sound = %d" % (temp, hum, light, sound))
        t = str(temp)
        h = str(hum)
        setText("Temp = " + t + '\337' + "C  Hum = " + h + " %")
        bclient.write('bait2123', 'temperature', temp)
        bclient.write('bait2123', 'humidity', hum)
    except KeyboardInterrupt:
        setText("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break
        