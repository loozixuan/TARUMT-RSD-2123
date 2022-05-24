from luma.core.interface.serial import i2c
from luma.core.render import canvas
from luma.oled.device import sh1106
from PIL import Image, ImageFont, ImageOps

ic2_comm = i2c(port=1, address=0x3c)
device = sh1106(ic2_comm, rotate=0, height=128)

img = Image.open('./images/paperless.jpg')
img = img.resize((128,128))
img = ImageOps.invert(img.convert('L'))
img = img.convert('1')

with canvas (device, background=img) as draw:
    font = ImageFont.truetype("fonts\BebasNeue-Regular.ttf", 20) # after download google font online
    draw.text((30,5), 'Paperless !', fill="white", font = font)
    