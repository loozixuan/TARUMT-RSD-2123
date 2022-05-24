from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(3, 'LED', should_sound=True))
    gui.add(AnalogReadPin(0, 'Sound Sensor (A0)'))
    gui.add(AnalogReadPin(1, 'Light Sensor (A1)'))
    gui.add(DHT(4, 'DHT Sensor'))
    
    from test08 import *
except:
    log.exception('----------------Log----------------')

