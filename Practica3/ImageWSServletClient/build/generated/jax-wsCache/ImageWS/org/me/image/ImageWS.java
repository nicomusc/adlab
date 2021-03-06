
package org.me.image;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ImageWS", targetNamespace = "http://image.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ImageWS {


    /**
     * 
     * @param image
     * @return
     *     returns int
     */
    @WebMethod(operationName = "RegistrerImage")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "RegistrerImage", targetNamespace = "http://image.me.org/", className = "org.me.image.RegistrerImage")
    @ResponseWrapper(localName = "RegistrerImageResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.RegistrerImageResponse")
    @Action(input = "http://image.me.org/ImageWS/RegistrerImageRequest", output = "http://image.me.org/ImageWS/RegistrerImageResponse")
    public int registrerImage(
        @WebParam(name = "image", targetNamespace = "")
        Image image);

    /**
     * 
     * @param author
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "SearchbyAuthor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchbyAuthor", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyAuthor")
    @ResponseWrapper(localName = "SearchbyAuthorResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyAuthorResponse")
    @Action(input = "http://image.me.org/ImageWS/SearchbyAuthorRequest", output = "http://image.me.org/ImageWS/SearchbyAuthorResponse")
    public List<Object> searchbyAuthor(
        @WebParam(name = "author", targetNamespace = "")
        String author);

    /**
     * 
     * @param image
     * @return
     *     returns int
     */
    @WebMethod(operationName = "ModifyImage")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ModifyImage", targetNamespace = "http://image.me.org/", className = "org.me.image.ModifyImage")
    @ResponseWrapper(localName = "ModifyImageResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.ModifyImageResponse")
    @Action(input = "http://image.me.org/ImageWS/ModifyImageRequest", output = "http://image.me.org/ImageWS/ModifyImageResponse")
    public int modifyImage(
        @WebParam(name = "image", targetNamespace = "")
        Image image);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "ListImages")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListImages", targetNamespace = "http://image.me.org/", className = "org.me.image.ListImages")
    @ResponseWrapper(localName = "ListImagesResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.ListImagesResponse")
    @Action(input = "http://image.me.org/ImageWS/ListImagesRequest", output = "http://image.me.org/ImageWS/ListImagesResponse")
    public List<Object> listImages();

    /**
     * 
     * @param keywords
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "SearchbyKeywords")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchbyKeywords", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyKeywords")
    @ResponseWrapper(localName = "SearchbyKeywordsResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyKeywordsResponse")
    @Action(input = "http://image.me.org/ImageWS/SearchbyKeywordsRequest", output = "http://image.me.org/ImageWS/SearchbyKeywordsResponse")
    public List<Object> searchbyKeywords(
        @WebParam(name = "keywords", targetNamespace = "")
        String keywords);

    /**
     * 
     * @param image
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DeleteImage")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DeleteImage", targetNamespace = "http://image.me.org/", className = "org.me.image.DeleteImage")
    @ResponseWrapper(localName = "DeleteImageResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.DeleteImageResponse")
    @Action(input = "http://image.me.org/ImageWS/DeleteImageRequest", output = "http://image.me.org/ImageWS/DeleteImageResponse")
    public int deleteImage(
        @WebParam(name = "image", targetNamespace = "")
        Image image);

    /**
     * 
     * @param creaDate
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "SearchbyCreaDate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchbyCreaDate", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyCreaDate")
    @ResponseWrapper(localName = "SearchbyCreaDateResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyCreaDateResponse")
    @Action(input = "http://image.me.org/ImageWS/SearchbyCreaDateRequest", output = "http://image.me.org/ImageWS/SearchbyCreaDateResponse")
    public List<Object> searchbyCreaDate(
        @WebParam(name = "creaDate", targetNamespace = "")
        String creaDate);

    /**
     * 
     * @param title
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod(operationName = "SearchbyTitle")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchbyTitle", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyTitle")
    @ResponseWrapper(localName = "SearchbyTitleResponse", targetNamespace = "http://image.me.org/", className = "org.me.image.SearchbyTitleResponse")
    @Action(input = "http://image.me.org/ImageWS/SearchbyTitleRequest", output = "http://image.me.org/ImageWS/SearchbyTitleResponse")
    public List<Object> searchbyTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

}
