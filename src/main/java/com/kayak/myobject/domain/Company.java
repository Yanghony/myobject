package com.kayak.myobject.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author yangyy
 * @version 1.0
 * @date 2021/8/5 8:32
 * @projectName:
 * @Description: 公司实体类
 */
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 60)
    private String comname;

    @Column(length = 120)
    private String comaddress;

    @Column(length = 30)
    private String comurl;

    @Column(length = 30)
    private String comtelphone;

    @Column(columnDefinition = "char(7)")
    private String establishdate;

    @Column
    private int employeenumber;

    @Column(columnDefinition = "float(20,4) default '0.0000'")
    private String totaloutput;

    @Column(columnDefinition = "text")
    private String comdesc;

    @Column(columnDefinition = "char(4)")
    private String comstatus;

    @Column(length = 20)
    private String contactname;

    @Column(columnDefinition = "char(11)")
    private String contactmobile;

    @Column(length = 30)
    private String contactemail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComaddress() {
        return comaddress;
    }

    public void setComaddress(String comaddress) {
        this.comaddress = comaddress;
    }

    public String getComurl() {
        return comurl;
    }

    public void setComurl(String comurl) {
        this.comurl = comurl;
    }

    public String getComtelphone() {
        return comtelphone;
    }

    public void setComtelphone(String comtelphone) {
        this.comtelphone = comtelphone;
    }

    public String getEstablishdate() {
        return establishdate;
    }

    public void setEstablishdate(String establishdate) {
        this.establishdate = establishdate;
    }

    public int getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(int employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getTotaloutput() {
        return totaloutput;
    }

    public void setTotaloutput(String totaloutput) {
        this.totaloutput = totaloutput;
    }

    public String getComdesc() {
        return comdesc;
    }

    public void setComdesc(String comdesc) {
        this.comdesc = comdesc;
    }

    public String getComstatus() {
        return comstatus;
    }

    public void setComstatus(String comstatus) {
        this.comstatus = comstatus;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactmobile() {
        return contactmobile;
    }

    public void setContactmobile(String contactmobile) {
        this.contactmobile = contactmobile;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }
}
