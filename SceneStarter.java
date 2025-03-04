/**
    The main class. Starts the whole program. Instantiates the scene frame class into an instance. Not much else to add here.
	
	Ethan L. Yap (244883), Ethan Lawrence Cimafranca (241172)
	March 05, 2025
	
	I have not discussed the Java language code in my program 
	with anyone other than my instructor or the teaching assistants 
	assigned to this course.

	I have not used Java language code obtained from another student, 
	or any other unauthorized source, either modified or unmodified.

	If any Java language code or documentation used in my program 
	was obtained from another source, such as a textbook or website, 
	that has been clearly noted with a proper citation in the comments 
	of my program.
**/

public class SceneStarter{

/** Creates the scene frame object and starts the whole program**/
    public static void main(String[] args) {
        SceneFrame scene = new SceneFrame();
        scene.setVisible(true);
    }
}
