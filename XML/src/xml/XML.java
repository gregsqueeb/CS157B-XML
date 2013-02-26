/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;
import java.io.File;
import java.util.List;
import javax.xml.bind.*;
import xml.generated.ThreadType;
import xml.generated.ForumType;
import xml.generated.ObjectFactory;

/**
 *
 * @author Greg
 */
public class XML {

    /**
     * @param args the command line arguments
     */
    public void unMarshall(File xmlDocument) 
    {
        Class klasses[] = {Forum.class, Thread.class, MyForumPost.class};
        HibernateContext.addClasses(klasses);
        HibernateContext.createSchema();
        File forumXML = new File("forum.xml");
        
	try {
            JAXBContext jaxbContext = 
                JAXBContext.newInstance("xml.generated");
            Unmarshaller unMarshaller = jaxbContext.createUnmarshaller();
            
            JAXBElement<ForumType> forumElement = 
                (JAXBElement<ForumType>) unMarshaller.unmarshal(xmlDocument);
            ForumType forum = forumElement.getValue();
            List<ThreadType> threadList = forum.getThreads();
                
            for (ThreadType thread : threadList) {
                Thread.addThread(thread.getName().trim(), thread.getForum());
					System.out.printf("\n    THREAD name = '%s'\n",
                                      thread.getName().trim());
					System.out.printf("            user = '%s'\n",
                                      thread.getUser());
					System.out.printf("            date = '%s'\n",
                                      thread.getDate());
					System.out.printf("            forum = '%d'\n",
                                      thread.getForum());
				}
	} 
        catch (JAXBException ex) {
            ex.printStackTrace();
	}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        File xmlDocument = new File("thread.xml");
        XML jaxbUnmarshaller = new XML();
        jaxbUnmarshaller.unMarshall(xmlDocument);
        
    }
}
