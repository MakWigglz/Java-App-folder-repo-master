import cv2

# Read an image
image = cv2.imread('path/to/image.jpg')

# Display the image
cv2.imshow('Image', image)
cv2.waitKey(0)
cv2.destroyAllWindows()
