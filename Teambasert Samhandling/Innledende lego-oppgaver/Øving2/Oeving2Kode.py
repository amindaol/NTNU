#Forskjellige ting som blir brukt i løpet av koden
import time 
from pybricks.hubs import EV3Brick
from pybricks.robotics import DriveBase
import pybricks.ev3devices as pbe
import pybricks.parameters as pbp

# Initialize the EV3 Brick.
ev3 = EV3Brick()

# Initialize the motors and sensors
# Port A-D er for motorer, og Port S1-S4 er til sensorer
left_motor = pbe.Motor(pbp.Port.A) 
right_motor = pbe.Motor(pbp.Port.D)
grass_motor = pbe.Motor(pbp.Port.C)
touch_sensor = pbe.TouchSensor(pbp.Port.S1)
ultra_sensor = pbe.UltrasonicSensor(pbp.Port.S3)

robot = DriveBase(left_motor,right_motor,wheel_diameter=50,axle_track=100) #Slik at venstre og høyre motor kjøres på likt


pressed = False # Variabel som gjør at forskjellige ting skjer når man trykker på på-knappen
#touch_sensor.pressed() gir bare True når knappen er nedtrykt


while True: 

    if touch_sensor.pressed() == True and pressed == False: # Siden "pressed" starter som "False" vil denne løkken kjøres første gang man trykker på touch_sensoren
        ev3.speaker.say("Initializing Excercise 2") # roboten snakker
        time.sleep(2) # time.sleep(x) gjør at koden tar en kjapp nap i x antall sekunder
        robot.drive(-100, 0) # robot.drive(x,y) gjør at roboten kjører x fort og svinger y-grader
        grass_motor.run(1000) 
        pressed = True # Siden pressed = True vil elif-løkken kjøres neste gang touch_sensoren trykkes på
        time.sleep(0.5)

    elif touch_sensor.pressed() and pressed == True:
        robot.stop() # Stopper robot
        grass_motor.stop() # stopper grass_motor
        pressed = False # Gjør at den andre løkken kjøres neste gang touch_sensoren trykkes på
        time.sleep(0.5)
        ev3.speaker.say("Excercise done") 

    if ultra_sensor.distance() < 50: 
        robot.straight(200) # roboten kjører bakover (positiv verdi er bakover og negativ verdi er forover)
        time.sleep(0.5)
        robot.turn(250) # svinger til venstre
        time.sleep(0.5)
        robot.drive(-100,0)
