package org.rta.aadhar.api;

import java.io.FileNotFoundException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Objects;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;

import org.apache.axis.message.MessageElement;
import org.apache.log4j.Logger;
import org.rta.aadhar.api.model.AadharTCSResponse;
import org.rta.aadhar.api.model.AadharTCSResponseModel;
import org.rta.aadhar.api.model.ResponseType;
import org.tempuri.AADHAAR_EKYC_FINGER_AUTHENTICATIONResponseAADHAAR_EKYC_FINGER_AUTHENTICATIONResult;
import org.tempuri.EKYC;
import org.tempuri.EKYCLocator;
import org.tempuri.EKYCSoap;
import org.w3c.dom.NodeList;

/**
 * Implementation for the AadharService. Class calls aadhar api and get
 * response. As per the aadhar api response is xml and it is parsed to get
 * object.
 * 
 * @author Raviteja
 *
 */
public class AadharTCSServiceImpl implements AadhaTCSService {
//
    private static final Logger log = Logger.getLogger(AadharTCSServiceImpl.class);
    private EKYC services = null;

    public AadharTCSServiceImpl() {
        services = new EKYCLocator();
    }

    @Override
    public AadharTCSResponseModel AADHAAR_EKYC_FINGER_AUTHENTICATION(URL endpoint, String uid, String tid, String udc, String rdsId,
            String ip, String srt, String crt, String skey, String pid, String hmac, String ci, String bt,
            String pincode, String version, String scheme, String department, String service, String dpId,
            String rdsVer, String consentme,String attemptcount, String dc, String mi,String mc)
            throws RemoteException, FileNotFoundException, UnsupportedEncodingException, ServiceException, MalformedURLException {

        if ( Objects.isNull(endpoint) || Objects.isNull(uid) || Objects.isNull(tid) || Objects.isNull(udc) || Objects.isNull(rdsId)
                || Objects.isNull(ip) || Objects.isNull(srt) || Objects.isNull(crt) || Objects.isNull(skey)
                || Objects.isNull(pid) || Objects.isNull(hmac) || Objects.isNull(ci) || Objects.isNull(bt)
                || Objects.isNull(pincode) || Objects.isNull(version) || Objects.isNull(scheme)
                || Objects.isNull(department) || Objects.isNull(service) || Objects.isNull(dpId)
                || Objects.isNull(rdsVer) || Objects.isNull(consentme)|| Objects.isNull(attemptcount)
                || Objects.isNull(dc) || Objects.isNull(mi)|| Objects.isNull(mc)) {
            log.info("*************** ERROR Some Required params are missing *****************");
            throw new IllegalArgumentException(
                    "Endpoint, uid,  tid,  udc,  rdsId,  ip,  srt,  crt,  skey,  pid,hmac,  ci,  bt,  pincode,  version,  scheme,  department, service,  dpId,  rdsVer, consentme and attemptcount  can't be null");
        }
        
        EKYCSoap ekycSoapStub = null;
        try {
            ekycSoapStub = services.getEKYCSoap(endpoint);
            log.info("*************** USING ekyc stub generated from:"+endpoint);
        }catch (ServiceException se) {
            ekycSoapStub = null;
            log.info("*************** Error generating ekyc stub, reason:"+se.getMessage());
        }
       
        if(null == ekycSoapStub) {
            //Use default production ekyc url
            log.info("*************** USING Default production ekyc stub *****************");
            ekycSoapStub = services.getEKYCSoap();
        }

        return handleResponse(
                ekycSoapStub.AADHAAR_EKYC_FINGER_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode,
                        version, scheme, department, service, consentme, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc));
    }

    private AadharTCSResponseModel handleResponse(
            AADHAAR_EKYC_FINGER_AUTHENTICATIONResponseAADHAAR_EKYC_FINGER_AUTHENTICATIONResult resp)
            throws FileNotFoundException, UnsupportedEncodingException {
        AadharTCSResponse ad = null;
        StringBuffer sb = new StringBuffer();
        sb.setLength(0);
        try {
            MessageElement[] messageElements = resp.get_any();
            SOAPElement test1 = messageElements[1];
            NodeList nl21 = test1.getElementsByTagName("DATA");
            for (int x = 0; x < nl21.getLength(); x++) {
                if (nl21.item(x) != null) {
                    sb.append(nl21.item(x));
                    NodeList nl2111 = nl21.item(x).getChildNodes();
                    for (int x1 = 0; x1 < nl2111.getLength(); x1++) {
                        if (nl2111.item(x1) != null) {
                        }
                    }
                }
            }
            ad = (AadharTCSResponse) getUnmarshaller(AadharTCSResponse.class)
                    .unmarshal(new StringReader(sb.toString()));
            log.info("TCS1 Aadhaar Response message:" + ad.getMsg());

            if (null != ad.getUid() && !ad.getUid().trim().isEmpty()) {
                return new AadharTCSResponseModel(ResponseType.SUCCESS, sb.toString(), ad);
            } else {
                return new AadharTCSResponseModel(ResponseType.ERROR, sb.toString(), ad);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new AadharTCSResponseModel(ResponseType.ERROR, sb.toString(), ad);
        }
    }

    private Unmarshaller getUnmarshaller(Class<?> clazz) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
        return jaxbContext.createUnmarshaller();
    }

}