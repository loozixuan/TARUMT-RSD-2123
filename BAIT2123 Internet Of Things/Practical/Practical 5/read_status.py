from time import *
from pyrebase import pyrebase
import logging
import json

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
   
try:
    data = db.child("HOME/KITCHEN").get()
    
    #Display 1 (JSON Format)
    status = data.val()
    print(json.dumps(status, indent = 2))
    
    # Display 2 (using For loop)
    for value in data.each():
        print(value.key() + "   " + value.val())
    
except KeyboardInterrupt:
    setText("Program Exited")
except:
    print("Unexpected error:")
    log.exception('-----------------log-----------------')
   
print("Program terminated")


