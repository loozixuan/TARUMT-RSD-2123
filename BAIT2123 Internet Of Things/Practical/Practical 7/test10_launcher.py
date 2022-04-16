from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(3, 'BUZZER', should_sound=True))
    
    from test10 import *
except:
    log.exception('----------------Log----------------')


