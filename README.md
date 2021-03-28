# GeometricObject
UL Java Assignment - CS6402

## Part 1
Create a circleBase class (possibly off of GeometricObject?). It should have a private colour and protected radius. It should have get/set methods for radius and colour and an abstract method for calculating surface area.
- It should have a default constructor (radius=1) and a constructor that takes an int, specifying the radius
- Create 2 sub-classes: Cone and Cylinder
- They should have an additional field: height, with get/set methods. They should have a method for calculating volume
- They should have 2 constructors: default (radius =1, height=1) and a constructor that takes 2 ints, specifying the radius and the height
- There should be a driver class that makes a cone and a cylinder (of whatever radius, height you wish) and reports back on their volume and surface area. (staging goal: week 1)
- (Note: not all the fields may have been specified)

## Part 2
- Each of the sub-classes should implement the comparable interface
- The compareTo method should compare the shapes based on their surface area
- Use this to compare the 2 shapes you made last week, to see which is bigger (Staging goal week 2)

## Part 3
- Create an array of 5 elements. Populate it with 5 cylinders/cones of your user’s choice (whether they are cones or cylinders and they can also specify the height, radius)
- Sort this array so that you can report on the biggest and smallest
(Final goal week 3)
