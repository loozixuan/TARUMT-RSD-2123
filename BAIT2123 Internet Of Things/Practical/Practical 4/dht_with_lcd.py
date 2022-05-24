# Because im using fake device, hence I cannot use grove_rgb_lcd library (no real lcd)

from time import *
from grovepi import *
from grove_rgb_lcd import *

DHT11 = 0
dht_sensor = 3

pinMode(dht_sensor,"INPUT")
setRGB(5, 15, 10)

while True:
    try:
        sleep(0.5)
        [temp, hum] = dht(dht_sensor, DHT11)
        print('Temp: ', temp, '\u00b0', 'Hum: ', hum, '%') 
        t = str(temp)
        h = str(hum)
        setText("Temp = " + t + '\337' + "C  Hum = " + h + " %")
    except KeyboardInterrupt:
        print("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break
























