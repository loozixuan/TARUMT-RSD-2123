from time import *
from grovepi import *
from paho.mqtt import publish

MQTT_BROKER = "192.168.56.1"
#MQTT_BROKER = "broker.emqx.io" #using public mqtt broker to act as publisher
MQTT_TOPIC = "HOME/KITCHEN"

data = input("Message Payload: ")
publish.single(MQTT_TOPIC, data, hostname=MQTT_BROKER)