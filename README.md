# N-body

Hwi Ram Jeong
CSC 144 : Software Architecture
3/24/2016

This project is for my CSC 144 : Software Architecture class<br>
I started my project from the basic N-body simulation file(you can also find this file in this github)<br>

<br>
<br> Learn about a scientific computing application.<br>
Learn about reading input using the StdIn library<br> printing formatted output using the StdOut library<br> Learn about plotting graphics using the StdDraw library<br> Learn about using the command line to redirect standard input to read from a file<br> Learn to build up complex results using a sequence of simple statements Use nested loops Use arrays<br>

Background for this N-body simulation:<br> In 1687 Sir Isaac Newton formulated the principles governing the the motion of two particles under the influence of their mutual gravitational attraction in his famous Principia. However, Newton was unable to solve the problem for three particles. Indeed, in general, systems of three or more particles can only be solved numerically. Your challenge is to write a program to simulate the motion of N particles in the plane, mutually affected by gravitational forces, and animate the results. Such methods are widely used in cosmology, semiconductors, and fluid dynamics to study complex physical systems. Scientists also apply the same techniques to other pairwise interactions including Coulombic, Biot-Savart, and van der Waals.
<br><br>
Changes I made from the basic N-body simulation<br>
-Input format <br>
The input format is a text file that contains the information for a particular universe. 
The basic input included the initial position, the initial velocity, and the mass.
I added image input. <br> String image = inputStream.readString();<br>
-Trails<br>
For this function, i used ArrayList function. Also, I made the trace removed if the length is over certain number i set.<br>
I added Math.Random to make the width of trail keep changing and getHSBColor to make the color keep changing randomly. <br>
-Bouncing <br>
I added bouncing function that if the objects hit the edges it bounces back. <br> if(x >= boundary  && v.cartesian(0) > 0) {
            v.xBouncing(); <br>
-Background <br>
i added the background picture by using stdDraw.picture 
