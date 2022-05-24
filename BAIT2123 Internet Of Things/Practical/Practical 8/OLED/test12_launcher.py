from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(8, 'MOTION SENSOR', should_sound=False))
    
    from test12 import *
except:
    log.exception('----------------Log----------------')



