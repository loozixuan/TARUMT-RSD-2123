from time import *
from grovepi import *
from grove_rgb_lcd import * 
from pyrebase import pyrebase

ultrasonic_port = 3
relay_port = 2
pinMode(relay_port,"OUTPUT")

config = {
    "apiKey": "AIzaSyBkGe8rwXaekDyGa68SN5BndPlN-6XYY-g",
    "authDomain": "bait2123-iot-12d48.firebaseapp.com",
    "databaseURL": "https://bait2123-iot-12d48-default-rtdb.firebaseio.com/",
    "storageBucket": "gs://bait2123-iot-12d48.appspot.com"
}

# Initialize the app
firebase = pyrebase.initialize_app(config)

# Get a reference to the auth service
auth = firebase.auth()

# Log the user in 
user = auth.sign_in_with_email_and_password("zixuan2001711@gmail.com", "loozx123")

# Get a reference to the database service
db = firebase.database()

while True:
    try:
        sleep(0.5)
        distance = ultrasonicRead(ultrasonic_port)
        print('Distance : ', distance, 'cm')
        if distance <= 10:
            digitalWrite(relay_port, 1)
        else:
            digitalWrite(relay_port, 0)
        
        data = {"distance":distance}
        results = db.child("PI_001").push(data, user['idToken'])
    except KeyboardInterrupt:
        setText("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break