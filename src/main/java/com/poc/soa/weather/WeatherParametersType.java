package com.poc.soa.weather;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de weatherParametersType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="weatherParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="maxt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="temp" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dew" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pop12" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="qpf" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sky" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="snow" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wspd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wdir" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wx" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="waveh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="icons" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="rh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="appt" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incw34" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incw50" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="incw64" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cumw34" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cumw50" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="cumw64" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="critfireo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dryfireo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="conhazo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ptornado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ptstmwinds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pxtornado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pxhail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pxtstmwinds" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ptotsvrtstm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="pxtotsvrtstm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpabv14d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpblw14d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpabv30d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpblw30d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpabv90d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tmpblw90d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpabv14d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpblw14d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpabv30d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpblw30d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpabv90d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prcpblw90d" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="precipa_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sky_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="td_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="temp_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wdir_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wspd_r" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wwa" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tstmprb" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tstmcat" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="wgust" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="iceaccum" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="maxrh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minrh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weatherParametersType", propOrder = {

})
public class WeatherParametersType {

    protected boolean maxt;
    protected boolean mint;
    protected boolean temp;
    protected boolean dew;
    protected boolean pop12;
    protected boolean qpf;
    protected boolean sky;
    protected boolean snow;
    protected boolean wspd;
    protected boolean wdir;
    protected boolean wx;
    protected boolean waveh;
    protected boolean icons;
    protected boolean rh;
    protected boolean appt;
    protected boolean incw34;
    protected boolean incw50;
    protected boolean incw64;
    protected boolean cumw34;
    protected boolean cumw50;
    protected boolean cumw64;
    protected boolean critfireo;
    protected boolean dryfireo;
    protected boolean conhazo;
    protected boolean ptornado;
    protected boolean phail;
    protected boolean ptstmwinds;
    protected boolean pxtornado;
    protected boolean pxhail;
    protected boolean pxtstmwinds;
    protected boolean ptotsvrtstm;
    protected boolean pxtotsvrtstm;
    @XmlElement(name = "tmpabv14d")
    protected boolean tmpabv14D;
    @XmlElement(name = "tmpblw14d")
    protected boolean tmpblw14D;
    @XmlElement(name = "tmpabv30d")
    protected boolean tmpabv30D;
    @XmlElement(name = "tmpblw30d")
    protected boolean tmpblw30D;
    @XmlElement(name = "tmpabv90d")
    protected boolean tmpabv90D;
    @XmlElement(name = "tmpblw90d")
    protected boolean tmpblw90D;
    @XmlElement(name = "prcpabv14d")
    protected boolean prcpabv14D;
    @XmlElement(name = "prcpblw14d")
    protected boolean prcpblw14D;
    @XmlElement(name = "prcpabv30d")
    protected boolean prcpabv30D;
    @XmlElement(name = "prcpblw30d")
    protected boolean prcpblw30D;
    @XmlElement(name = "prcpabv90d")
    protected boolean prcpabv90D;
    @XmlElement(name = "prcpblw90d")
    protected boolean prcpblw90D;
    @XmlElement(name = "precipa_r")
    protected boolean precipaR;
    @XmlElement(name = "sky_r")
    protected boolean skyR;
    @XmlElement(name = "td_r")
    protected boolean tdR;
    @XmlElement(name = "temp_r")
    protected boolean tempR;
    @XmlElement(name = "wdir_r")
    protected boolean wdirR;
    @XmlElement(name = "wspd_r")
    protected boolean wspdR;
    protected boolean wwa;
    protected boolean tstmprb;
    protected boolean tstmcat;
    protected boolean wgust;
    protected boolean iceaccum;
    protected boolean maxrh;
    protected boolean minrh;

    /**
     * Obtém o valor da propriedade maxt.
     * 
     */
    public boolean isMaxt() {
        return maxt;
    }

    /**
     * Define o valor da propriedade maxt.
     * 
     */
    public void setMaxt(boolean value) {
        this.maxt = value;
    }

    /**
     * Obtém o valor da propriedade mint.
     * 
     */
    public boolean isMint() {
        return mint;
    }

    /**
     * Define o valor da propriedade mint.
     * 
     */
    public void setMint(boolean value) {
        this.mint = value;
    }

    /**
     * Obtém o valor da propriedade temp.
     * 
     */
    public boolean isTemp() {
        return temp;
    }

    /**
     * Define o valor da propriedade temp.
     * 
     */
    public void setTemp(boolean value) {
        this.temp = value;
    }

    /**
     * Obtém o valor da propriedade dew.
     * 
     */
    public boolean isDew() {
        return dew;
    }

    /**
     * Define o valor da propriedade dew.
     * 
     */
    public void setDew(boolean value) {
        this.dew = value;
    }

    /**
     * Obtém o valor da propriedade pop12.
     * 
     */
    public boolean isPop12() {
        return pop12;
    }

    /**
     * Define o valor da propriedade pop12.
     * 
     */
    public void setPop12(boolean value) {
        this.pop12 = value;
    }

    /**
     * Obtém o valor da propriedade qpf.
     * 
     */
    public boolean isQpf() {
        return qpf;
    }

    /**
     * Define o valor da propriedade qpf.
     * 
     */
    public void setQpf(boolean value) {
        this.qpf = value;
    }

    /**
     * Obtém o valor da propriedade sky.
     * 
     */
    public boolean isSky() {
        return sky;
    }

    /**
     * Define o valor da propriedade sky.
     * 
     */
    public void setSky(boolean value) {
        this.sky = value;
    }

    /**
     * Obtém o valor da propriedade snow.
     * 
     */
    public boolean isSnow() {
        return snow;
    }

    /**
     * Define o valor da propriedade snow.
     * 
     */
    public void setSnow(boolean value) {
        this.snow = value;
    }

    /**
     * Obtém o valor da propriedade wspd.
     * 
     */
    public boolean isWspd() {
        return wspd;
    }

    /**
     * Define o valor da propriedade wspd.
     * 
     */
    public void setWspd(boolean value) {
        this.wspd = value;
    }

    /**
     * Obtém o valor da propriedade wdir.
     * 
     */
    public boolean isWdir() {
        return wdir;
    }

    /**
     * Define o valor da propriedade wdir.
     * 
     */
    public void setWdir(boolean value) {
        this.wdir = value;
    }

    /**
     * Obtém o valor da propriedade wx.
     * 
     */
    public boolean isWx() {
        return wx;
    }

    /**
     * Define o valor da propriedade wx.
     * 
     */
    public void setWx(boolean value) {
        this.wx = value;
    }

    /**
     * Obtém o valor da propriedade waveh.
     * 
     */
    public boolean isWaveh() {
        return waveh;
    }

    /**
     * Define o valor da propriedade waveh.
     * 
     */
    public void setWaveh(boolean value) {
        this.waveh = value;
    }

    /**
     * Obtém o valor da propriedade icons.
     * 
     */
    public boolean isIcons() {
        return icons;
    }

    /**
     * Define o valor da propriedade icons.
     * 
     */
    public void setIcons(boolean value) {
        this.icons = value;
    }

    /**
     * Obtém o valor da propriedade rh.
     * 
     */
    public boolean isRh() {
        return rh;
    }

    /**
     * Define o valor da propriedade rh.
     * 
     */
    public void setRh(boolean value) {
        this.rh = value;
    }

    /**
     * Obtém o valor da propriedade appt.
     * 
     */
    public boolean isAppt() {
        return appt;
    }

    /**
     * Define o valor da propriedade appt.
     * 
     */
    public void setAppt(boolean value) {
        this.appt = value;
    }

    /**
     * Obtém o valor da propriedade incw34.
     * 
     */
    public boolean isIncw34() {
        return incw34;
    }

    /**
     * Define o valor da propriedade incw34.
     * 
     */
    public void setIncw34(boolean value) {
        this.incw34 = value;
    }

    /**
     * Obtém o valor da propriedade incw50.
     * 
     */
    public boolean isIncw50() {
        return incw50;
    }

    /**
     * Define o valor da propriedade incw50.
     * 
     */
    public void setIncw50(boolean value) {
        this.incw50 = value;
    }

    /**
     * Obtém o valor da propriedade incw64.
     * 
     */
    public boolean isIncw64() {
        return incw64;
    }

    /**
     * Define o valor da propriedade incw64.
     * 
     */
    public void setIncw64(boolean value) {
        this.incw64 = value;
    }

    /**
     * Obtém o valor da propriedade cumw34.
     * 
     */
    public boolean isCumw34() {
        return cumw34;
    }

    /**
     * Define o valor da propriedade cumw34.
     * 
     */
    public void setCumw34(boolean value) {
        this.cumw34 = value;
    }

    /**
     * Obtém o valor da propriedade cumw50.
     * 
     */
    public boolean isCumw50() {
        return cumw50;
    }

    /**
     * Define o valor da propriedade cumw50.
     * 
     */
    public void setCumw50(boolean value) {
        this.cumw50 = value;
    }

    /**
     * Obtém o valor da propriedade cumw64.
     * 
     */
    public boolean isCumw64() {
        return cumw64;
    }

    /**
     * Define o valor da propriedade cumw64.
     * 
     */
    public void setCumw64(boolean value) {
        this.cumw64 = value;
    }

    /**
     * Obtém o valor da propriedade critfireo.
     * 
     */
    public boolean isCritfireo() {
        return critfireo;
    }

    /**
     * Define o valor da propriedade critfireo.
     * 
     */
    public void setCritfireo(boolean value) {
        this.critfireo = value;
    }

    /**
     * Obtém o valor da propriedade dryfireo.
     * 
     */
    public boolean isDryfireo() {
        return dryfireo;
    }

    /**
     * Define o valor da propriedade dryfireo.
     * 
     */
    public void setDryfireo(boolean value) {
        this.dryfireo = value;
    }

    /**
     * Obtém o valor da propriedade conhazo.
     * 
     */
    public boolean isConhazo() {
        return conhazo;
    }

    /**
     * Define o valor da propriedade conhazo.
     * 
     */
    public void setConhazo(boolean value) {
        this.conhazo = value;
    }

    /**
     * Obtém o valor da propriedade ptornado.
     * 
     */
    public boolean isPtornado() {
        return ptornado;
    }

    /**
     * Define o valor da propriedade ptornado.
     * 
     */
    public void setPtornado(boolean value) {
        this.ptornado = value;
    }

    /**
     * Obtém o valor da propriedade phail.
     * 
     */
    public boolean isPhail() {
        return phail;
    }

    /**
     * Define o valor da propriedade phail.
     * 
     */
    public void setPhail(boolean value) {
        this.phail = value;
    }

    /**
     * Obtém o valor da propriedade ptstmwinds.
     * 
     */
    public boolean isPtstmwinds() {
        return ptstmwinds;
    }

    /**
     * Define o valor da propriedade ptstmwinds.
     * 
     */
    public void setPtstmwinds(boolean value) {
        this.ptstmwinds = value;
    }

    /**
     * Obtém o valor da propriedade pxtornado.
     * 
     */
    public boolean isPxtornado() {
        return pxtornado;
    }

    /**
     * Define o valor da propriedade pxtornado.
     * 
     */
    public void setPxtornado(boolean value) {
        this.pxtornado = value;
    }

    /**
     * Obtém o valor da propriedade pxhail.
     * 
     */
    public boolean isPxhail() {
        return pxhail;
    }

    /**
     * Define o valor da propriedade pxhail.
     * 
     */
    public void setPxhail(boolean value) {
        this.pxhail = value;
    }

    /**
     * Obtém o valor da propriedade pxtstmwinds.
     * 
     */
    public boolean isPxtstmwinds() {
        return pxtstmwinds;
    }

    /**
     * Define o valor da propriedade pxtstmwinds.
     * 
     */
    public void setPxtstmwinds(boolean value) {
        this.pxtstmwinds = value;
    }

    /**
     * Obtém o valor da propriedade ptotsvrtstm.
     * 
     */
    public boolean isPtotsvrtstm() {
        return ptotsvrtstm;
    }

    /**
     * Define o valor da propriedade ptotsvrtstm.
     * 
     */
    public void setPtotsvrtstm(boolean value) {
        this.ptotsvrtstm = value;
    }

    /**
     * Obtém o valor da propriedade pxtotsvrtstm.
     * 
     */
    public boolean isPxtotsvrtstm() {
        return pxtotsvrtstm;
    }

    /**
     * Define o valor da propriedade pxtotsvrtstm.
     * 
     */
    public void setPxtotsvrtstm(boolean value) {
        this.pxtotsvrtstm = value;
    }

    /**
     * Obtém o valor da propriedade tmpabv14D.
     * 
     */
    public boolean isTmpabv14D() {
        return tmpabv14D;
    }

    /**
     * Define o valor da propriedade tmpabv14D.
     * 
     */
    public void setTmpabv14D(boolean value) {
        this.tmpabv14D = value;
    }

    /**
     * Obtém o valor da propriedade tmpblw14D.
     * 
     */
    public boolean isTmpblw14D() {
        return tmpblw14D;
    }

    /**
     * Define o valor da propriedade tmpblw14D.
     * 
     */
    public void setTmpblw14D(boolean value) {
        this.tmpblw14D = value;
    }

    /**
     * Obtém o valor da propriedade tmpabv30D.
     * 
     */
    public boolean isTmpabv30D() {
        return tmpabv30D;
    }

    /**
     * Define o valor da propriedade tmpabv30D.
     * 
     */
    public void setTmpabv30D(boolean value) {
        this.tmpabv30D = value;
    }

    /**
     * Obtém o valor da propriedade tmpblw30D.
     * 
     */
    public boolean isTmpblw30D() {
        return tmpblw30D;
    }

    /**
     * Define o valor da propriedade tmpblw30D.
     * 
     */
    public void setTmpblw30D(boolean value) {
        this.tmpblw30D = value;
    }

    /**
     * Obtém o valor da propriedade tmpabv90D.
     * 
     */
    public boolean isTmpabv90D() {
        return tmpabv90D;
    }

    /**
     * Define o valor da propriedade tmpabv90D.
     * 
     */
    public void setTmpabv90D(boolean value) {
        this.tmpabv90D = value;
    }

    /**
     * Obtém o valor da propriedade tmpblw90D.
     * 
     */
    public boolean isTmpblw90D() {
        return tmpblw90D;
    }

    /**
     * Define o valor da propriedade tmpblw90D.
     * 
     */
    public void setTmpblw90D(boolean value) {
        this.tmpblw90D = value;
    }

    /**
     * Obtém o valor da propriedade prcpabv14D.
     * 
     */
    public boolean isPrcpabv14D() {
        return prcpabv14D;
    }

    /**
     * Define o valor da propriedade prcpabv14D.
     * 
     */
    public void setPrcpabv14D(boolean value) {
        this.prcpabv14D = value;
    }

    /**
     * Obtém o valor da propriedade prcpblw14D.
     * 
     */
    public boolean isPrcpblw14D() {
        return prcpblw14D;
    }

    /**
     * Define o valor da propriedade prcpblw14D.
     * 
     */
    public void setPrcpblw14D(boolean value) {
        this.prcpblw14D = value;
    }

    /**
     * Obtém o valor da propriedade prcpabv30D.
     * 
     */
    public boolean isPrcpabv30D() {
        return prcpabv30D;
    }

    /**
     * Define o valor da propriedade prcpabv30D.
     * 
     */
    public void setPrcpabv30D(boolean value) {
        this.prcpabv30D = value;
    }

    /**
     * Obtém o valor da propriedade prcpblw30D.
     * 
     */
    public boolean isPrcpblw30D() {
        return prcpblw30D;
    }

    /**
     * Define o valor da propriedade prcpblw30D.
     * 
     */
    public void setPrcpblw30D(boolean value) {
        this.prcpblw30D = value;
    }

    /**
     * Obtém o valor da propriedade prcpabv90D.
     * 
     */
    public boolean isPrcpabv90D() {
        return prcpabv90D;
    }

    /**
     * Define o valor da propriedade prcpabv90D.
     * 
     */
    public void setPrcpabv90D(boolean value) {
        this.prcpabv90D = value;
    }

    /**
     * Obtém o valor da propriedade prcpblw90D.
     * 
     */
    public boolean isPrcpblw90D() {
        return prcpblw90D;
    }

    /**
     * Define o valor da propriedade prcpblw90D.
     * 
     */
    public void setPrcpblw90D(boolean value) {
        this.prcpblw90D = value;
    }

    /**
     * Obtém o valor da propriedade precipaR.
     * 
     */
    public boolean isPrecipaR() {
        return precipaR;
    }

    /**
     * Define o valor da propriedade precipaR.
     * 
     */
    public void setPrecipaR(boolean value) {
        this.precipaR = value;
    }

    /**
     * Obtém o valor da propriedade skyR.
     * 
     */
    public boolean isSkyR() {
        return skyR;
    }

    /**
     * Define o valor da propriedade skyR.
     * 
     */
    public void setSkyR(boolean value) {
        this.skyR = value;
    }

    /**
     * Obtém o valor da propriedade tdR.
     * 
     */
    public boolean isTdR() {
        return tdR;
    }

    /**
     * Define o valor da propriedade tdR.
     * 
     */
    public void setTdR(boolean value) {
        this.tdR = value;
    }

    /**
     * Obtém o valor da propriedade tempR.
     * 
     */
    public boolean isTempR() {
        return tempR;
    }

    /**
     * Define o valor da propriedade tempR.
     * 
     */
    public void setTempR(boolean value) {
        this.tempR = value;
    }

    /**
     * Obtém o valor da propriedade wdirR.
     * 
     */
    public boolean isWdirR() {
        return wdirR;
    }

    /**
     * Define o valor da propriedade wdirR.
     * 
     */
    public void setWdirR(boolean value) {
        this.wdirR = value;
    }

    /**
     * Obtém o valor da propriedade wspdR.
     * 
     */
    public boolean isWspdR() {
        return wspdR;
    }

    /**
     * Define o valor da propriedade wspdR.
     * 
     */
    public void setWspdR(boolean value) {
        this.wspdR = value;
    }

    /**
     * Obtém o valor da propriedade wwa.
     * 
     */
    public boolean isWwa() {
        return wwa;
    }

    /**
     * Define o valor da propriedade wwa.
     * 
     */
    public void setWwa(boolean value) {
        this.wwa = value;
    }

    /**
     * Obtém o valor da propriedade tstmprb.
     * 
     */
    public boolean isTstmprb() {
        return tstmprb;
    }

    /**
     * Define o valor da propriedade tstmprb.
     * 
     */
    public void setTstmprb(boolean value) {
        this.tstmprb = value;
    }

    /**
     * Obtém o valor da propriedade tstmcat.
     * 
     */
    public boolean isTstmcat() {
        return tstmcat;
    }

    /**
     * Define o valor da propriedade tstmcat.
     * 
     */
    public void setTstmcat(boolean value) {
        this.tstmcat = value;
    }

    /**
     * Obtém o valor da propriedade wgust.
     * 
     */
    public boolean isWgust() {
        return wgust;
    }

    /**
     * Define o valor da propriedade wgust.
     * 
     */
    public void setWgust(boolean value) {
        this.wgust = value;
    }

    /**
     * Obtém o valor da propriedade iceaccum.
     * 
     */
    public boolean isIceaccum() {
        return iceaccum;
    }

    /**
     * Define o valor da propriedade iceaccum.
     * 
     */
    public void setIceaccum(boolean value) {
        this.iceaccum = value;
    }

    /**
     * Obtém o valor da propriedade maxrh.
     * 
     */
    public boolean isMaxrh() {
        return maxrh;
    }

    /**
     * Define o valor da propriedade maxrh.
     * 
     */
    public void setMaxrh(boolean value) {
        this.maxrh = value;
    }

    /**
     * Obtém o valor da propriedade minrh.
     * 
     */
    public boolean isMinrh() {
        return minrh;
    }

    /**
     * Define o valor da propriedade minrh.
     * 
     */
    public void setMinrh(boolean value) {
        this.minrh = value;
    }

}
