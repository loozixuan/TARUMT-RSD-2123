from grovepi import *
from paho.mqtt.client import *
import json

buzzer = 3
pinMode(buzzer, "OUTPUT")

MQTT_BROKER = "192.168.56.1" 
MQTT_TOPIC = "HOME/KITCHEN"

def on_connect(client, userdata, flags, rc):
    print("Connected with result code " + str(rc))
    client.subscribe(MQTT_TOPIC)
    
def on_message(client, userdata, msg):
    print(msg.topic + " " + str(msg.payload.decode("utf-8")))
    data = json.loads(msg.payload)
    
    print("Message received : " + data["buzzer"] + "  2: " + data["led"])
    try:
        if data["buzzer"] == "on":
            digitalWrite(buzzer, 1)
        else:
            digitalWrite(buzzer, 0)
    except:
        digitalWrite(buzzer, 0)
        
client = Client()
client.on_connect = on_connect
client.on_message = on_message
client.connect(MQTT_BROKER, 1883, 60)
client.loop_forever()
