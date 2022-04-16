from time import *
from grovepi import *
from paho.mqtt import publish

MQTT_BROKER = "192.168.1.37"
#MQTT_BROKER = "broker.emqx.io" #using public mqtt broker to act as publisher
MQTT_TOPIC = "test"

publish.single(MQTT_TOPIC, "this is a testing for publishing", hostname=MQTT_BROKER)