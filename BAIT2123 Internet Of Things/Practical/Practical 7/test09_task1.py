from time import *
from grovepi import *
from paho.mqtt import publish

MQTT_BROKER = "192.168.1.37"
#MQTT_BROKER = "broker.emqx.io" #using public mqtt broker to act as publisher
MQTT_TOPIC = "test"

while True:
    try:
        msgInput = input("Enter a message: ")
        publish.single(MQTT_TOPIC, msgInput, hostname=MQTT_BROKER)
    
    except KeyboardInterrupt:
        break
    