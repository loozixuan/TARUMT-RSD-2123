#from time import *
from grovepi import *
from paho.mqtt.client import *

buzzer = 3
pinMode(buzzer, "OUTPUT")

MQTT_BROKER = "192.168.56.1" #The ip address will be vary based on where and how you connect to the Internet
#MQTT_BROKER = "broker.emqx.io" #using public mqtt broker to act as subsriber
MQTT_TOPIC = "test"

def on_connect(client, userdata, flags, rc):
    print("Connected with result code " + str(rc))
    client.subscribe(MQTT_TOPIC)
    
def on_message(client, userdata, msg):
    print(msg.topic + " " + str(msg.payload))
    try:
        i = int(msg.payload)
        print(i)
        if i > 0 and i < 256:
            analogWrite(buzzer, i)
    except:
        analogWrite(buzzer, 0)
        
client = Client()
client.on_connect = on_connect
client.on_message = on_message
client.connect(MQTT_BROKER, 1883, 60)
client.loop_forever()