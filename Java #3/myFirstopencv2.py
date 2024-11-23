import cv2

# Read an image from a file
img = cv2.imread('/Users/amakki/Documents/Coding-Design/FlaskPython.jpg')

# Check if the image was successfully loaded
if img is None:
    print('Error: Unable to load image.')
else:
    # Display the image
    cv2.imshow('Image', img)

    # Wait until a key is pressed
    cv2.waitKey(0)

    # Close the window
    cv2.destroyAllWindows()
