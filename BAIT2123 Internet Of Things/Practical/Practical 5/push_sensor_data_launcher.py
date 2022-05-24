from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(2, 'Light Bulb (Relay)', should_sound=True))
    gui.add(Ultrasonic(3, 'Ultrasonic Sensor (mm)'))
    
    from push_sensor_data import *
except:
    log.exception('----------------Log----------------')
