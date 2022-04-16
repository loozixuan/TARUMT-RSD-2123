import time
import grovepi
from luma.core.interface.serial import i2c
from luma.core.render import canvas
from luma.oled.device import sh1106
from PIL import Image, ImageFont, ImageOps

pir_sensor = 8
motion = 8
grovepi.pinMode(pir_sensor, "INPUT")

ic2_comm = i2c(port=1, address=0x3c)
device = sh1106(ic2_comm, rotate=0, height=128)

img = Image.open('./images/paperless.jpg')
img = img.resize((128,128))
img = ImageOps.invert(img.convert('L'))
img = img.convert('1')


while True:
    try:
        #Sense motion, usually human, within the target range
        motion = grovepi.digitalRead(pir_sensor)
        #check if reads were 0 or 1 it can be 255 also because of IO Errors so remove those values

        if motion == 1:
            print('Motion Detected')
            with canvas (device, background=img) as draw:
                font = ImageFont.truetype("fonts\BebasNeue-Regular.ttf", 20) 
                draw.text((30,5), 'Paperless !', fill="white", font = font)
        elif motion == 0:
            print('-')
        #if you hold time is less than this, you might not see as many detections
        time.sleep(.2)
    except IOError:
        print("Error")