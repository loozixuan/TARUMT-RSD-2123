from FakeDevices import *
import logging

log = logging.getLogger(__name__)

# Modify only the code between try-except. Please leave the rest
# as it is.
try:
    gui = Gui()
    gui.add(DigitalPin(4, 'Button'))
    gui.add(DigitalPin(2, 'Buzzer', should_sound=True))
    
    from test03 import *
except:
    # Generate exception traceback to help debugging
    log.exception('----------------Log----------------')
    
# Make sure to call gui.quit(). Otherwise the GUI will not be closed
# after the program terminated.
gui.quit()
# Inform the user that the program has terminated
print('Program terminated.')
