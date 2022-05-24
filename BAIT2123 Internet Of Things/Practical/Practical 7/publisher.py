from paho.mqtt.client import *
import json

MQTT_BROKER = "192.168.56.1"
MQTT_TOPIC = "HOME/KITCHEN"

client = Client();
client.connect(MQTT_BROKER, 1883, 60)
#data = {
#  "buzzer": "on",
#  "led": "off",
#}
data = input("Message Payload: ")
client.publish(MQTT_TOPIC, data) #json.dumps(data)

client.disconnect() 
