from mfrc522 import SimpleMFRC522
import string

def trim(txt):
    return ''.join([c for c in txt if c in string.printable]).strip()

reader = SimpleMFRC522()

print(
'''This is a simple test script
for testing Mifare card reading\n'''
)

while True:

    while True:
        sector = input('Which sector number (0-3)>: ')
        sector = int(sector)
        if 0 <= sector < 4:
            break
        print('Error: the sector must be from 0 to 3 only')
    print('Tap card on RFID reader/writer')
    id, text = reader.read_sector(sector)
    text = trim(text)
    print(f'id: {id}, text: {text}\n')