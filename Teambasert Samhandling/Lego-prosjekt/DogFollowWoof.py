#!/usr/bin/env pybricks-micropython
from pybricks.ev3devices import Motor, UltrasonicSensor, TouchSensor
from pybricks.parameters import Port
from pybricks.tools import wait
from pybricks.media.ev3dev import SoundFile
from pybricks.robotics import DriveBase
from pybricks.hubs import EV3Brick
import random
import time


# Initialize the motors and sensors.
headMotor = Motor(Port.C)
touchSensor = TouchSensor(Port.S1)
sonicSensor = UltrasonicSensor(Port.S4)
left_motor = Motor(Port.A)
right_motor = Motor(Port.D)

# Initialize the EV3 Brick.
ev3 = EV3Brick()
ev3.speaker.set_volume(100)

robot = DriveBase(left_motor, right_motor, wheel_diameter=54, axle_track=105)

bark_sounds = ["Sound_Recordings/Ida.wav","Sound_Recordings/Ulrik.wav","Sound_Recordings/Eilif.wav","Sound_Recordings/Cecilie.wav" ]
dog_sounds = [SoundFile.DOG_BARK_1, SoundFile.DOG_BARK_2, SoundFile.DOG_GROWL, SoundFile.DOG_SNIFF, SoundFile.DOG_WHINE]
def turnHead(angle):
    headMotor.run_target(100, angle)

def resetHead():
    headMotor.run_target(100, 0)
    wait(1000)
    headMotor.run_target(100, 0)

def headScan():
    for i in range(2):
        turnHead(80)
        distance = sonicSensor.distance()
        bark()
        print("Avstand på 80 grader:", distance, "mm")
        wait(500)

        turnHead(-80)
        bark()
        distance = sonicSensor.distance()
        print("Avstand på -80 grader:", distance, "mm")
        wait(500)

    resetHead()

def bark():

    sound_file = random.choice(bark_sounds)
    ev3.speaker.play_file(sound_file)
def spin():
    left_motor.run(500)
    right_motor.run(-500)
    wait (9500)



while True:
    if touchSensor.pressed():
        robot.stop()
        start_time = time.time()
        while touchSensor.pressed():
            wait(10)
        elapsed_time = time.time() - start_time
        print("Button was pressed for", elapsed_time, "seconds")
        if elapsed_time > 4:
            spin()
        elif elapsed_time > 2:
            headScan()
        else: 
            for i in range(4):
                robot.drive(100, 0)
                #bark()
                wait(500)
                robot.stop()
                robot.drive(-100,0)
                wait(500)
                robot.stop()
            robot.stop()
    if sonicSensor.distance() < 500:
        bark()
        robot.stop()
        wait(100)
    else: 
        robot.drive(-100, 0)
        wait(100)
