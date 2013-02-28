//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.18 at 06:45:17 PM PST 
//


package xml.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the jaxbdemo.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ThreadList_QNAME = new QName("", "threadList");
    private final static QName _Thread_QNAME = new QName("", "thread");
    private final static QName _ForumList_QNAME = new QName("", "forumList");
    private final static QName _Forum_QNAME = new QName("", "forum");
    private final static QName _ForumPostList_QNAME = new QName("", "forumPostList");
    private final static QName _ForumPost_QNAME = new QName("", "forumPost");
    private final static QName _UserList_QNAME = new QName("", "userList");    
    private final static QName _User_QNAME = new QName("", "user");
    private final static QName _UserDetailsList_QNAME = new QName("", "userDetailsList");    
    private final static QName _UserDetails_QNAME = new QName("", "userDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: jaxbdemo.generated
     * 
     */
    public ObjectFactory() {
    }

    public ThreadListType creatThreadListType() {
        return new ThreadListType();
    }

    public ThreadType createThreadType() {
        return new ThreadType();
    }
    
    public ForumListType creatForumListType() {
        return new ForumListType();
    }

    public ForumType createForumType() {
        return new ForumType();
    }
    public ForumPostListType creatForumPostListType() {
        return new ForumPostListType();
    }

    public ForumPostType createForumPostType() {
        return new ForumPostType();
    }
    public UserListType createUserListType(){
        return new UserListType();
    }
    public UserType createUserType(){
        return new UserType();
    }
     public UserDetailsListType createUserDetailsListType(){
        return new UserDetailsListType();
    }
    public UserDetailsType createUserDetailsType(){
        return new UserDetailsType();
    }
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "threadList")
    public JAXBElement<ThreadListType> createThreadList(ThreadListType value) {
        return new JAXBElement<ThreadListType>(_ThreadList_QNAME, ThreadListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArticleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thread")
    public JAXBElement<ThreadType> createThread(ThreadType value) {
        return new JAXBElement<ThreadType>(_Thread_QNAME, ThreadType.class, null, value);
    }
    
    @XmlElementDecl(namespace = "", name = "forumList")
    public JAXBElement<ForumListType> createForumList(ForumListType value) {
        return new JAXBElement<ForumListType>(_ForumList_QNAME, ForumListType.class, null, value);
    }
    
    @XmlElementDecl(namespace = "", name = "forum")
    public JAXBElement<ForumType> createForum(ForumType value) {
        return new JAXBElement<ForumType>(_Forum_QNAME, ForumType.class, null, value);
    }
    @XmlElementDecl(namespace = "", name = "forumPostList")
    public JAXBElement<ForumPostListType> createForumPostList(ForumPostListType value) {
        return new JAXBElement<ForumPostListType>(_ForumPostList_QNAME, ForumPostListType.class, null, value);
    }
    
    @XmlElementDecl(namespace = "", name = "forumPost")
    public JAXBElement<ForumPostType> createForumPost(ForumPostType value) {
        return new JAXBElement<ForumPostType>(_ForumPost_QNAME, ForumPostType.class, null, value);
    }
    
     @XmlElementDecl(namespace = "", name = "userList")
    public JAXBElement<UserListType> createUserList(UserListType value) {
        return new JAXBElement<UserListType>(_UserList_QNAME, UserListType.class, null, value);
    }
      @XmlElementDecl(namespace = "", name = "user")
    public JAXBElement<UserType> createUser(UserType value) {
        return new JAXBElement<UserType>(_User_QNAME, UserType.class, null, value);
    }
@XmlElementDecl(namespace = "", name = "userDetailsList")
    public JAXBElement<UserDetailsListType> createUserDetailsList(UserDetailsListType value) {
        return new JAXBElement<UserDetailsListType>(_UserDetailsList_QNAME, UserDetailsListType.class, null, value);
    }
      @XmlElementDecl(namespace = "", name = "userDetails")
    public JAXBElement<UserDetailsType> createUserDetails(UserDetailsType value) {
        return new JAXBElement<UserDetailsType>(_UserDetails_QNAME, UserDetailsType.class, null, value);
    }
}
