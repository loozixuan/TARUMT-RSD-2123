from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(3, 'BUZZER', should_sound=True))
    
    from subscriber import *
except:
    log.exception('----------------Log----------------')



