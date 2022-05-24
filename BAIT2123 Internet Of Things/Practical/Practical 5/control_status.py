from time import *
from pyrebase import pyrebase
import logging

log = logging.getLogger(__name__)

config = {
    "apiKey": "AIzaSyDbXoMj-qU3do5gkwwzd8ED7JtJzI_8yww",
    "authDomain": "finalexam-a4f4c.firebaseapp.com",
    "databaseURL": "https://finalexam-a4f4c-default-rtdb.firebaseio.com/",
    "storageBucket": "gs://finalexam-a4f4c.appspot.com"
}

try:
    firebase = pyrebase.initialize_app(config)
    auth = firebase.auth()
    user = auth.sign_in_with_email_and_password("zixuan711804@gmail.com", "loozx1234")
    db = firebase.database()
except Exception as e:
   log.exception('-----------------log-----------------')
   exit(-1)
   
def write(control_name, state):
    db.child("HOME/KITCHEN").update({control_name: str(state)})

buzzer = 1
repeat = 3
try:
    while repeat:
        buzzer_state = 'on' if buzzer == 1 else 'off'
        write("buzzer", buzzer)
        print(f'buzzer {buzzer_state}')
        sleep(3)
        buzzer ^= 1
        repeat -= 1
        
except KeyboardInterrupt:
    setText("Program Exited")
except:
   log.exception('-----------------log-----------------')
   
print("Program terminated")



    #data = {"buzzer":"0", "camera": "0", "relay1":"1", "relay2":"0"}
    #db.child("HOME/KITCHEN").set(data)

