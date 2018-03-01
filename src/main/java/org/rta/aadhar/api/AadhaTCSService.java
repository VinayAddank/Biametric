package org.rta.aadhar.api;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.rta.aadhar.api.model.AadharTCSResponseModel;

/**
 * AadharService provides details for aadhar
 * 
 * @author Sriram
 *
 */
public interface AadhaTCSService {

    public AadharTCSResponseModel AADHAAR_EKYC_FINGER_AUTHENTICATION(URL endpoint, String uid, String tid, String udc,
            String rdsId, String ip, String srt, String crt, String skey, String pid, String hmac, String ci, String bt,
            String pincode, String version, String scheme, String department, String service, String dpId,
            String rdsVer, String consentme, String attemptcount, String dc, String mi, String mc)
            throws RemoteException, FileNotFoundException, UnsupportedEncodingException, ServiceException,
            MalformedURLException;

}
