from time import *
from grovepi import *
from grove_rgb_lcd import * 
from pyrebase import pyrebase

ultrasonic_port = 3
relay_port = 2
pinMode(relay_port,"OUTPUT")

config = {
    "apiKey": "AIzaSyDbXoMj-qU3do5gkwwzd8ED7JtJzI_8yww",
    "authDomain": "finalexam-a4f4c.firebaseapp.com",
    "databaseURL": "https://finalexam-a4f4c-default-rtdb.firebaseio.com/",
    "storageBucket": "finalexam-a4f4c.appspot.com"
}

# Initialize the app
firebase = pyrebase.initialize_app(config)

# Get a reference to the auth service
auth = firebase.auth()

# Log the user in 
user = auth.sign_in_with_email_and_password("zixuan2001711@gmail.com", "loozx711804")

# Get a reference to the database service
db = firebase.database()

while True:
    try:
        sleep(1)
        distance = ultrasonicRead(ultrasonic_port)
        print('Distance : ', distance, 'cm')
        if distance <= 10:
            digitalWrite(relay_port, 1)
        else:
            digitalWrite(relay_port, 0)
        
        data = {"distance":distance, "name":"zi xuan"}
        results = db.child("Sensors").child("InnerSensors").push(data, user['idToken'])
        db.child("Sensors").child("InnerSensors").set(data, user['idToken'])
        #results = db.child("Sensors").child("InnerSensors").set({"distance":distance, "name":"zi xuan"}, user['idToken'])
    except KeyboardInterrupt:
        setText("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break