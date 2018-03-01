package org.tempuri;

public class EKYCSoapProxy implements org.tempuri.EKYCSoap {
  private String _endpoint = null;
  private org.tempuri.EKYCSoap eKYCSoap = null;
  
  public EKYCSoapProxy() {
    _initEKYCSoapProxy();
  }
  
  public EKYCSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEKYCSoapProxy();
  }
  
  private void _initEKYCSoapProxy() {
    try {
      eKYCSoap = (new org.tempuri.EKYCLocator()).getEKYCSoap();
      if (eKYCSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eKYCSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eKYCSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eKYCSoap != null)
      ((javax.xml.rpc.Stub)eKYCSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.EKYCSoap getEKYCSoap() {
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap;
  }
  
  public org.tempuri.AADHAAR_EKYC_FINGER_AUTHENTICATION_PDFResponseAADHAAR_EKYC_FINGER_AUTHENTICATION_PDFResult AADHAAR_EKYC_FINGER_AUTHENTICATION_PDF(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String consent, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_FINGER_AUTHENTICATION_PDF(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, consent, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResponseAADHAAR_EKYC_IRIS_AUTHENTICATION_PDFResult AADHAAR_EKYC_IRIS_AUTHENTICATION_PDF(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String consent, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_IRIS_AUTHENTICATION_PDF(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, consent, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATION_PDFResponseAADHAAR_EKYC_OTP_AUTHENTICATION_PDFResult AADHAAR_EKYC_OTP_AUTHENTICATION_PDF(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String requesttype, java.lang.String consent, java.lang.String attemptcount, java.lang.String oldtid) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_OTP_AUTHENTICATION_PDF(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, requesttype, consent, attemptcount, oldtid);
  }
  
  public org.tempuri.AADHAAR_EKYC_FINGER_AUTHENTICATIONResponseAADHAAR_EKYC_FINGER_AUTHENTICATIONResult AADHAAR_EKYC_FINGER_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String consent, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_FINGER_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, consent, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.AADHAAR_EKYC_IRIS_AUTHENTICATIONResponseAADHAAR_EKYC_IRIS_AUTHENTICATIONResult AADHAAR_EKYC_IRIS_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String consent, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_IRIS_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, consent, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.AADHAAR_EKYC_OTP_AUTHENTICATIONResponseAADHAAR_EKYC_OTP_AUTHENTICATIONResult AADHAAR_EKYC_OTP_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String requesttype, java.lang.String consent, java.lang.String attemptcount, java.lang.String oldtid) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.AADHAAR_EKYC_OTP_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, requesttype, consent, attemptcount, oldtid);
  }
  
  public org.tempuri.EAADHAAR_PDF_EKYC_FINGER_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_FINGER_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_FINGER_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String consent, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.EAADHAAR_PDF_EKYC_FINGER_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, consent, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.EAADHAAR_PDF_EKYC_IRIS_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_IRIS_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_IRIS_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String fdc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String pidtimestamp, java.lang.String consent, java.lang.String consentme, java.lang.String attemptcount, java.lang.String rdsId, java.lang.String rdsVer, java.lang.String dpId, java.lang.String dc, java.lang.String mi, java.lang.String mc) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.EAADHAAR_PDF_EKYC_IRIS_AUTHENTICATION(uid, tid, udc, fdc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, pidtimestamp, consent, consentme, attemptcount, rdsId, rdsVer, dpId, dc, mi, mc);
  }
  
  public org.tempuri.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResponseEAADHAAR_PDF_EKYC_OTP_AUTHENTICATIONResult EAADHAAR_PDF_EKYC_OTP_AUTHENTICATION(java.lang.String uid, java.lang.String tid, java.lang.String udc, java.lang.String ip, java.lang.String srt, java.lang.String crt, java.lang.String skey, java.lang.String pid, java.lang.String hmac, java.lang.String ci, java.lang.String bt, java.lang.String pincode, java.lang.String version, java.lang.String scheme, java.lang.String department, java.lang.String service, java.lang.String requesttype, java.lang.String consent, java.lang.String attemptcount, java.lang.String oldtid) throws java.rmi.RemoteException{
    if (eKYCSoap == null)
      _initEKYCSoapProxy();
    return eKYCSoap.EAADHAAR_PDF_EKYC_OTP_AUTHENTICATION(uid, tid, udc, ip, srt, crt, skey, pid, hmac, ci, bt, pincode, version, scheme, department, service, requesttype, consent, attemptcount, oldtid);
  }
  
  
}