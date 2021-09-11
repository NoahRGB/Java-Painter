# Java-Painter
Painter is a Java project I made that is inspired by P5js and Processing. These are libraries that simplify the act of pushing various graphical elements to the user's screen and animating them through  a variety of functions. Although my version is very limited compared to the originals, I learnt lots about java developing it and I plan to update it in the future to increase its usefulness.

# Small 'bouncy ball' demo
![Bouncy ball demo gif](https://media.giphy.com/media/aOYzsrk8cbRzP70JTe/giphy.gif?cid=790b7611cf023b2165573f475aee77a3ffd9a9899837170f&rid=giphy.gif&ct=g)

The code for this demo is included in the repo. Here, painter is handling the window, background colour, ball colour, drawing the circles and the input.

# How it works
This has formed a part of my journey learning java, so there are probably a lot of optimisations and improvements that can be made.
A class can inherit from the Painter class, which means it now needs to implement the 'animationLoop' method. All the code written in this method will get called 60 times a second, thus creating animation.

![Animation loop example code](https://i.postimg.cc/nLL95qb2/image.png)

Right now there are only a few functions available, but it's surprising what you can make with basic shapes and colours
- circle(int x, int y, int width, int height)
  - draws a circle with the last colour set
- rect(int x, int y, int width, int height)
  - draws a rectangle with the last colour set
- background(Color newBgColor)
  - uses the java.awt.Color colours to set the background colour
- colour(Color newColour)
  - uses the java.awt.Color colours to set the painting colour
- isKeyDown(int keyCode)
  - returns a boolean value to describe if the key corresponding to the given java.awt.event.KeyEvent keycode is currently held down
  
  # Todo
  - [ ] Colours using hex/rgb codes instead of java.awt
  - [ ] Mouse input
  - [ ] Polygons with variable number of vertices/sides
  - [ ] Images
  - [ ] Sound (?)
