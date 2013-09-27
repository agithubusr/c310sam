package com.google.gwt.sample.stockwatcher.server;

import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.users.User;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Stock {

  @PrimaryKey
  @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
  private Long id;
  @Persistent
  private User user;
  @Persistent
  private String symbol;
  @Persistent
  private Date createDate;

  public Stock() {
    this.createDate = new Date();
  }

  public Stock(User user, String symbol) {
    this();
    this.user = user;
    this.symbol = symbol;
  }

  public Long getId() {
    return this.id;
  }

  public User getUser() {
    return this.user;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public Date getCreateDate() {
    return this.createDate;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }
}
