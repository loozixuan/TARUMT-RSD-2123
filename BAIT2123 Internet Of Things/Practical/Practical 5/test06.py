from time import *
from grovepi import *
from grove_rgb_lcd import * 
from pyrebase import pyrebase

dhtsensor = 7
pinMode(dhtsensor, "INPUT")

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
        sleep(2)
        [temp, hum] = dht(dhtsensor, 0)
        print("Temp = ", temp, '\u00b0C', " Hum = ", "%")
        t = str(temp)
        h = str(hum)
        setRGB(0,255,0)
        setText("Temp = "+ t + '\337'+ "C Hum = "+ h + "%")
        data1 = {"temperature":t}
        data2 = {"humidity":h}
        # Pass the user's idToken to the push method
        #results = db.child("PI_001").push(data1, user['idToken'])
        #results = db.child("PI_001").push(data2, user['idToken'])
#         results = db.child('PI_001').set({
#                     'temperature': data1,
#                     'humidity': data2
#                     })

        results = db.child("PI_001").set({
            'Sensor Values': {
                'temperature': data1,
                'humidity': data2,
            }
        })
    except KeyboardInterrupt:
        setText("Program Exited")
        break
    except TypeError:
        print("Type error occurs")
        break
    except IOError:
        print("I/O error occurs")
        break
