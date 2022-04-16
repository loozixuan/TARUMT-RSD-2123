from FakeDevices import *
import logging

log = logging.getLogger(__name__)

# Modify only the code between try-except. Please leave the rest
# as it is.
try:
    gui = Gui()
    gui.add(AnalogReadPin(2, 'Rotary Angle', min=1, max=1023))
    gui.add(DigitalPin(6, 'Sound to demo LED blinking', should_sound=True))
    
    from test02 import *
except:
    # Generate exception traceback to help debugging
    log.exception('----------------Log----------------')
    
# Make sure to call gui.quit(). Otherwise the GUI will not be closed
# after the program terminated.
gui.quit()
# Inform the user that the program has terminated
print('Program terminated.')
