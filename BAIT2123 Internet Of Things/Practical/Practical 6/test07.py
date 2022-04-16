from time import *
from grovepi import *
from grove_rgb_lcd import *
from random import *
from urllib.request import *

led = 3
soundsensor = 0
lightsensor = 1
dhtsensor = 4
pinMode(led, "OUTPUT")
pinMode(soundsensor, "INPUT")
pinMode(lightsensor, "INPUT")
pinMode(dhtsensor, "INPUT")
apiKey = "U2DTD6F2C6KE1HLT"

while True:
    try:
        sleep(10)
        [temp, hum] = dht(dhtsensor, 0)
        light = analogRead(lightsensor)
        sound = analogRead(soundsensor)
        print("Temp = %.2f, hum = %d, light = %d, sound = %d" % (temp, hum, light, sound))
        t = str(temp)
        h = str(hum)
        l = str(light)
        s = str(sound)
        setText("Temp = " + t + '\337' + "C  Hum = " + h + " %")
        # analogWrite(led, light) # LED brightness responses with light sensor input
        r = randint(0,255)
        g = randint(0,255)
        b = randint(0,255)
        setRGB(r, g, b)
        content = urlopen("https://api.thingspeak.com/update?api_key=" + apiKey + "&field1=" + t + "&field2=" + h+ "&field3=" + l+ "&field4=" + s).read()
        if(content):
            print("Updated Thingspeak")
        #break
    except KeyboardInterrupt:
        setText("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break