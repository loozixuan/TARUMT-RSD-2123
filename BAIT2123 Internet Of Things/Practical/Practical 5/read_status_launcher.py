from FakeDevices import *
import logging

log = logging.getLogger(__name__)

try:
    gui = Gui()
    
    from read_status import *
except:
    log.exception('----------------Log----------------')
