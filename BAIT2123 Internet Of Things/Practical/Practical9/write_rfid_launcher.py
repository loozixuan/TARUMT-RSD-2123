from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    
    gui.add(MifareRfid('testcards.json'))
    
    from write_rfid import *
except:
    log.exception('----------------Log----------------')




