import qrcode

qr = qrcode.QRCode(
    version=1,
    error_correction=qrcode.constants.ERROR_CORRECT_L,
    box_size=10,
    border=4,
)

qr.add_data('P1004')
qr.make(fit=True)

img = qr.make_image(fill_color="black", back_color="white")
print(type(img))
img = img.get_image()
print(type(img))
img.show()