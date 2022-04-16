import time
from grovepi import *

buzzer = 3
pinMode(buzzer, "OUTPUT")

while True:
    val = input("Enter a value between 0 - 255: ")
    val = int(val)
    
    if val > 255:
        val = 1
    elif val < 255:
        val = 0
    digitalWrite(buzzer, val) # I change to digitalWrite to be used in fake device












