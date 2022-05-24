from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DigitalPin(3, 'Buzzer', should_sound=True))
    gui.add(DigitalPin(1, 'Door'))
    gui.add(MifareRfid('access_cards.json'))
    
    from door_lock import *
except:
    log.exception('----------------Log----------------')






