#!/usr/bin/env pybricks-micropython




from pybricks.hubs import EV3Brick
from pybricks.ev3devices import Motor
from pybricks.parameters import Port
from pybricks.robotics import DriveBase


# Initialize the EV3 Brick.
ev3 = EV3Brick()

# Initialize the motors.
left_motor = Motor(Port.A)
right_motor = Motor(Port.D)


# Initialize the drive base.
robot = DriveBase(left_motor, right_motor, wheel_diameter=54, axle_track=200)

ev3.screen.print("Hello world!")
#wait(5000)

# Go forward and backwards for one meter.
robot.straight(500)
ev3.speaker.beep()


robot.turn(170)
robot.straight(250)
ev3.speaker.beep()

robot.turn(170)
robot.straight(500)
ev3.speaker.beep()

robot.turn(170)
robot.straight(250)
ev3.speaker.beep()

ev3.screen.print("Have a good day!")
#ev3.wait(5000)

ev3.speaker.say("Hello, have a nice day!")