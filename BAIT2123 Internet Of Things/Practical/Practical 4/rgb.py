from grove_rgb_lcd import *

while True:
    val = input(“Enter RGB values: ”)
    rgb = val.split(‘,’)
    num = len(rgb)
    
    if num < 3 or num > 3:
        print('Three values needed, but you gave {}', format(len(rgb)))
        continue
    
        setRGB(int(rgb[0], int(rgb[1], int(rgb[2]))))
        text = 'R:{},G:{},B:{}'.format(rgb[0], rgb[1], rgb[2])
        setText(text)











