import time
from grovepi import *

buzzer = 3
pinMode(buzzer, "OUTPUT")
while True:
    val = input("Enter a value between 0 - 255: ")
    val = int(val)
    if val > 255:
        val = 255
    elif val < 0:
        val = 0
    analogWrite(buzzer, val)