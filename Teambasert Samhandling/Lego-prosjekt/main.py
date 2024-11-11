#!/usr/bin/env pybricks-micropython
from pybricks.hubs import EV3Brick
from pybricks.ev3devices import (Motor, TouchSensor, ColorSensor,
                                 InfraredSensor, UltrasonicSensor, GyroSensor)
from pybricks.parameters import Port, Stop, Direction, Button, Color
from pybricks.tools import wait, StopWatch, DataLog
from pybricks.robotics import DriveBase
from pybricks.media.ev3dev import SoundFile, ImageFile

ev3 = EV3Brick()

left_motor = Motor(Port.B)
right_motor = Motor(Port.C)

robot = DriveBase(left_motor,right_motor,wheel_diameter=50,axle_track=100)
global direction
def sharpRight:
    if direction == 2:
        turn_motor.run_angle(-300,180)
    elif direction == 0:
        turn_motor.run_angle(-300,90)
    direction = 1

def sharpRight:
    if direction == 1:
        turn_motor.run_angle(300,180)
    elif direction == 0:
        turn_motor.run_angle(300,90)
    direction = 2

def straighten():
    if direction == 1:
        turn_motor.run_angle(300,90)
    elif direction ==2:
        turn_motor.run_angle(-300,90)
    direction = 0

while running == True:
    robot.drive(1000,0)


# Initialiser ultralydsensor
ultrasonic_sensor = UltrasonicSensor(Port.S4)

# Initialiser DriveBase
robot = DriveBase(left_motor, right_motor, wheel_diameter=56, axle_track=114)

# Definer ønsket avstand (i mm) til objektet (deg)
desired_distance = 300

while True:
    # Les avstanden til objektet foran
    distance = ultrasonic_sensor.distance()

    # Hvis avstanden er større enn ønsket avstand, kjør fremover
    if distance > desired_distance:
        robot.drive(100, 0)  # Kjør fremover med hastighet 100 mm/s
    # Hvis avstanden er mindre enn ønsket avstand, stopp
    elif distance < desired_distance:
        robot.stop()
    
    # Vent litt før neste måling
    wait(100)
    