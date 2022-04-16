from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(2, 'Light Bulb (Relay)', should_sound=True))
    gui.add(Ultrasonic(3, 'Car Reverse Sensor (mm)'))
    
    from car_reverse import *
except:

    log.exception('----------------Log----------------')
    
gui.quit()
print('Program terminated.')