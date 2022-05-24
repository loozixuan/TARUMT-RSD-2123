from mfrc522 import SimpleMFRC522

writer = SimpleMFRC522()

print(
'''This is a simple test script
for testing Mifare card writting\n'''
)

while True:
    text = input('Please provide to store in card: ')
    while True:
        sector = input('Write to which sector number (0-3)>: ')
        sector = int(sector)
        if 0 <= sector < 4:
            break
        print('Error: the sector must be from 0 to 3 only')
    print('Tap card on RFID reader/writer')
    
    writer.write_sector(text, sector)
    print('Successfully written!\n')