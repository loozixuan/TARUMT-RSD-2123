from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    gui.add(DHT(7, 'Sensor'))
    
    from test06 import *
except:
    log.exception('----------------Log----------------')