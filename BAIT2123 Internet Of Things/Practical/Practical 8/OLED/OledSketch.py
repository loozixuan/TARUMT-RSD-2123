from luma.core.interface.serial import i2c
from luma.core.render import canvas
from luma.oled.device import sh1106
from PIL import ImageFont

ic2_comm = i2c(port=1, address=0x3c)
oled = sh1106(ic2_comm, rotate=0, height=128)

font = ImageFont.truetype(r"c:\windows\fonts\castelar.ttf", 13)

with canvas (oled) as draw:
    draw.rectangle(oled.bounding_box, outline="white", fill="black")
    draw.text((8,40), 'Hello, world!', fill="white", font = font)