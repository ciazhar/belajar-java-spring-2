package com.ciazhar.spring;

import java.util.Date;

public class Person {
  private Integer id;
  private String nama;
  private Date tanggalLahir;
  private Address alamat;

  public Integer getId(){
    return id;
  }
  public void setId(Integer id){
    this.id = id;
  }
  public String getNama(){
    return  nama;
  }
  public  void setNama(String nama){
    this.nama = nama;
  }
  public Date getTanggalLahir(){
    return tanggalLahir;
  }
  public void setTanggalLahir(Date tanggalLahir){
    this.tanggalLahir=tanggalLahir;
  }
  public Address getAlamat(){
    return alamat;
  }
  public void setAlamat(Address alamat){
    this.alamat=alamat;
  }

}
