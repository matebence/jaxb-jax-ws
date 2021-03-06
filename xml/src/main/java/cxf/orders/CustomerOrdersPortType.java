package cxf.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-07-05T14:09:28.081+02:00
 * Generated source version: 3.5.3
 *
 */
@WebService(targetNamespace = "http://orders.cxf/", name = "CustomerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod
    @WebResult(name = "getOrdersResponse", targetNamespace = "http://orders.cxf/", partName = "parameters")
    public GetOrdersResponse getOrders(

        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "http://orders.cxf/")
        GetOrdersRequest parameters
    );

    @WebMethod
    @WebResult(name = "createOrdersResponse", targetNamespace = "http://orders.cxf/", partName = "parameters")
    public CreateOrdersResponse createOrders(

        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "http://orders.cxf/")
        CreateOrdersRequest parameters
    );
}
