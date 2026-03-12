import time
import adafruit_dht
import board
import json
import requests

dhtDevice = adafruit_dht.DHT11(board.D4)

SERVER_URL= "http://localhost:8080/sensor"

while True:
    try:
        temperature = dhtDevice.temperature
        humidity = dhtDevice.humidity

        data = {
            "temperature": temperature,
            "humidity": humidity
        }

        print(data)

        response = requests.post(SERVER_URL, json=data)

        print("Server response:", response.status_code)

    except RuntimeError as error:
        print("Sensor error:", error)
        time.sleep(2)
        continue

    time.sleep(5)
