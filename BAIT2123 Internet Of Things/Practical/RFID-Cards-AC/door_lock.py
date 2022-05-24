from getpass import getpass
from mysql.connector import connect, Error
from FakeDevices import *
from mfrc522 import SimpleMFRC522
import string

buzzer = 3
door_lock = 1;
pinMode(buzzer, "OUTPUT")
pinMode(door_lock, "OUTPUT")
reader = SimpleMFRC522()

def compact(txt):
    return ''.join([c for c in txt if c in string.printable]).strip()

def trim(txt):
    disallowed_characters = "()',"
    for character in disallowed_characters:
        txt = txt.replace(character, "")
    return txt

def openDoor(id):
        print("STORAGE ROOM DOOR OPEN")
        digitalWrite(buzzer, 1)
        digitalWrite(door_lock, 1)
        time.sleep(0.5)
        digitalWrite(buzzer, 0)
        digitalWrite(door_lock, 0)
        print("STORAGE ROOM DOOR LOCKED")

try:
    with connect(
        host="localhost",
        user="root",
        password="",
        database="iot",
    ) as connection:
        print("Database Connection Successful : " + str(connection))
        
        # Get card id from access_card.json
        id, text = reader.read_sector(1)

        count = 0
        select_administrators_query = "SELECT card_id FROM administrators"
        with connection.cursor() as cursor:
            cursor.execute(select_administrators_query)
            result = cursor.fetchall()
            for card_id in result:
                card_id = trim(str(card_id))
                if card_id == compact(str(id)):
                    count+=1
                    print("ACCESS GRANTED")
                    openDoor(card_id);

            if count == 0:
                print("ACCESS DENIED")
except Error as e:
    print(e)