# Java-Painter
A Java project I am working on that essentially mimics the behaviour of Processing and P5.js, which are libraries that simplify the process of creating graphical elements by providing a set of functions that let you display shapes and animate.

I am still learning, and I understand the code is not perfect and the repo isn't set up well

# Small 'bouncy ball' demo
![Bouncy ball demo gif](https://media.giphy.com/media/aOYzsrk8cbRzP70JTe/giphy.gif?cid=790b7611cf023b2165573f475aee77a3ffd9a9899837170f&rid=giphy.gif&ct=g)

The code for this demo is included in the repo. Here, painter is handling the window, background colour, ball colour, drawing the circles and the input.

# How it works
A class can inherit from the Painter class, which means it now needs to implement the 'animationLoop' method. All the code written in this method will get called 60 times a second, thus creating animation.

Within the files of the repo, the PainterDemo file is the one that inherits from the Painter class and has the code for the demonstration

![Animation loop example code](https://i.postimg.cc/nLL95qb2/image.png)

Right now there are only a few functions available, and I'm hoping to add more soon
- circle(int x, int y, int width, int height)
	- draws a circle with the last colour set
- rect(int x, int y, int width, int height)
	- draws a rectangle with the last colour set
- background(Color newBgColor)
	- uses the java.awt.Color colours to set the background colour
- background(int r, int g, int b, int a)
	- takes rgba values and sets the background colour (a is optional)
- colour(Color newColour)
	- uses the java.awt.Color colours to set the painting colour
- colour(int r, int g, int b, int a)
	- takes rgba values and sets the painting colour (a is optional)
- fps(int newFps)
	- sets the current fps (this is initally done in the Painter constructor)
- isKeyDown(int keyCode)
	- returns a boolean value to describe if the key corresponding to the given java.awt.event.KeyEvent keycode is currently held down
	
	
	
  
# Todo
- [x] Colours using hex/rgb codes instead of java.awt
- [ ] Text
- [ ] Input without using java.awt.event.KeyEvent
- [ ] Mouse input
- [ ] Polygons with variable number of vertices/sides
- [ ] Images
- [ ] Sound (?)
