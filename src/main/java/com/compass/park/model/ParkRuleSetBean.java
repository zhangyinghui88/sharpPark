package com.compass.park.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParkRuleSetBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory
			.getLogger(ParkRuleSetBean.class);
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.PARK_RULE_SET_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String parkRuleSetId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.RULE_NAME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String ruleName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.VEHICLE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String vehicleType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.OUT_PARKING_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String outParkingId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.DAY_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal dayLimit;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String startHour;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String endHour;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.DATE_SET
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String dateSet;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String chargeType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long freeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal subCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal timeSlotLimit;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long startChargeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal startChargePrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long chargeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal chargePrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.STATUS
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String status;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.CREATE_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String createUserid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.MODIFY_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String modifyUserid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.CREATE_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Date createDatetime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.MODIFY_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Date modifyDatetime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String nChargeType;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long nFreeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal nSubCharge;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal nTimeSlotLimit;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long nStartChargeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal nStartChargePrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private Long nChargeTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private BigDecimal nChargePrice;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String nStartHour;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.N_END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String nEndHour;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column TB_PARK_RULE_SET.TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    private String type;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.PARK_RULE_SET_ID
     *
     * @return the value of TB_PARK_RULE_SET.PARK_RULE_SET_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getParkRuleSetId() {
        return parkRuleSetId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.PARK_RULE_SET_ID
     *
     * @param parkRuleSetId the value for TB_PARK_RULE_SET.PARK_RULE_SET_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setParkRuleSetId(String parkRuleSetId) {
        this.parkRuleSetId = parkRuleSetId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.RULE_NAME
     *
     * @return the value of TB_PARK_RULE_SET.RULE_NAME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.RULE_NAME
     *
     * @param ruleName the value for TB_PARK_RULE_SET.RULE_NAME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.VEHICLE_TYPE
     *
     * @return the value of TB_PARK_RULE_SET.VEHICLE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.VEHICLE_TYPE
     *
     * @param vehicleType the value for TB_PARK_RULE_SET.VEHICLE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.OUT_PARKING_ID
     *
     * @return the value of TB_PARK_RULE_SET.OUT_PARKING_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getOutParkingId() {
        return outParkingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.OUT_PARKING_ID
     *
     * @param outParkingId the value for TB_PARK_RULE_SET.OUT_PARKING_ID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setOutParkingId(String outParkingId) {
        this.outParkingId = outParkingId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.DAY_LIMIT
     *
     * @return the value of TB_PARK_RULE_SET.DAY_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getDayLimit() {
        return dayLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.DAY_LIMIT
     *
     * @param dayLimit the value for TB_PARK_RULE_SET.DAY_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setDayLimit(BigDecimal dayLimit) {
        this.dayLimit = dayLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.START_HOUR
     *
     * @return the value of TB_PARK_RULE_SET.START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getStartHour() {
        return startHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.START_HOUR
     *
     * @param startHour the value for TB_PARK_RULE_SET.START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.END_HOUR
     *
     * @return the value of TB_PARK_RULE_SET.END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getEndHour() {
        return endHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.END_HOUR
     *
     * @param endHour the value for TB_PARK_RULE_SET.END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.DATE_SET
     *
     * @return the value of TB_PARK_RULE_SET.DATE_SET
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getDateSet() {
        return dateSet;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.DATE_SET
     *
     * @param dateSet the value for TB_PARK_RULE_SET.DATE_SET
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setDateSet(String dateSet) {
        this.dateSet = dateSet;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.CHARGE_TYPE
     *
     * @return the value of TB_PARK_RULE_SET.CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.CHARGE_TYPE
     *
     * @param chargeType the value for TB_PARK_RULE_SET.CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.FREE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getFreeTime() {
        return freeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.FREE_TIME
     *
     * @param freeTime the value for TB_PARK_RULE_SET.FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setFreeTime(Long freeTime) {
        this.freeTime = freeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.SUB_CHARGE
     *
     * @return the value of TB_PARK_RULE_SET.SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getSubCharge() {
        return subCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.SUB_CHARGE
     *
     * @param subCharge the value for TB_PARK_RULE_SET.SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setSubCharge(BigDecimal subCharge) {
        this.subCharge = subCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.TIME_SLOT_LIMIT
     *
     * @return the value of TB_PARK_RULE_SET.TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getTimeSlotLimit() {
        return timeSlotLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.TIME_SLOT_LIMIT
     *
     * @param timeSlotLimit the value for TB_PARK_RULE_SET.TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setTimeSlotLimit(BigDecimal timeSlotLimit) {
        this.timeSlotLimit = timeSlotLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.START_CHARGE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getStartChargeTime() {
        return startChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.START_CHARGE_TIME
     *
     * @param startChargeTime the value for TB_PARK_RULE_SET.START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setStartChargeTime(Long startChargeTime) {
        this.startChargeTime = startChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.START_CHARGE_PRICE
     *
     * @return the value of TB_PARK_RULE_SET.START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getStartChargePrice() {
        return startChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.START_CHARGE_PRICE
     *
     * @param startChargePrice the value for TB_PARK_RULE_SET.START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setStartChargePrice(BigDecimal startChargePrice) {
        this.startChargePrice = startChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.CHARGE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getChargeTime() {
        return chargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.CHARGE_TIME
     *
     * @param chargeTime the value for TB_PARK_RULE_SET.CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setChargeTime(Long chargeTime) {
        this.chargeTime = chargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.CHARGE_PRICE
     *
     * @return the value of TB_PARK_RULE_SET.CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getChargePrice() {
        return chargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.CHARGE_PRICE
     *
     * @param chargePrice the value for TB_PARK_RULE_SET.CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setChargePrice(BigDecimal chargePrice) {
        this.chargePrice = chargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.STATUS
     *
     * @return the value of TB_PARK_RULE_SET.STATUS
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.STATUS
     *
     * @param status the value for TB_PARK_RULE_SET.STATUS
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.CREATE_USERID
     *
     * @return the value of TB_PARK_RULE_SET.CREATE_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getCreateUserid() {
        return createUserid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.CREATE_USERID
     *
     * @param createUserid the value for TB_PARK_RULE_SET.CREATE_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setCreateUserid(String createUserid) {
        this.createUserid = createUserid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.MODIFY_USERID
     *
     * @return the value of TB_PARK_RULE_SET.MODIFY_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getModifyUserid() {
        return modifyUserid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.MODIFY_USERID
     *
     * @param modifyUserid the value for TB_PARK_RULE_SET.MODIFY_USERID
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setModifyUserid(String modifyUserid) {
        this.modifyUserid = modifyUserid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.CREATE_DATETIME
     *
     * @return the value of TB_PARK_RULE_SET.CREATE_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Date getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.CREATE_DATETIME
     *
     * @param createDatetime the value for TB_PARK_RULE_SET.CREATE_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.MODIFY_DATETIME
     *
     * @return the value of TB_PARK_RULE_SET.MODIFY_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Date getModifyDatetime() {
        return modifyDatetime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.MODIFY_DATETIME
     *
     * @param modifyDatetime the value for TB_PARK_RULE_SET.MODIFY_DATETIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setModifyDatetime(Date modifyDatetime) {
        this.modifyDatetime = modifyDatetime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_CHARGE_TYPE
     *
     * @return the value of TB_PARK_RULE_SET.N_CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getnChargeType() {
        return nChargeType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_CHARGE_TYPE
     *
     * @param nChargeType the value for TB_PARK_RULE_SET.N_CHARGE_TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnChargeType(String nChargeType) {
        this.nChargeType = nChargeType;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_FREE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.N_FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getnFreeTime() {
        return nFreeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_FREE_TIME
     *
     * @param nFreeTime the value for TB_PARK_RULE_SET.N_FREE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnFreeTime(Long nFreeTime) {
        this.nFreeTime = nFreeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_SUB_CHARGE
     *
     * @return the value of TB_PARK_RULE_SET.N_SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getnSubCharge() {
        return nSubCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_SUB_CHARGE
     *
     * @param nSubCharge the value for TB_PARK_RULE_SET.N_SUB_CHARGE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnSubCharge(BigDecimal nSubCharge) {
        this.nSubCharge = nSubCharge;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_TIME_SLOT_LIMIT
     *
     * @return the value of TB_PARK_RULE_SET.N_TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getnTimeSlotLimit() {
        return nTimeSlotLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_TIME_SLOT_LIMIT
     *
     * @param nTimeSlotLimit the value for TB_PARK_RULE_SET.N_TIME_SLOT_LIMIT
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnTimeSlotLimit(BigDecimal nTimeSlotLimit) {
        this.nTimeSlotLimit = nTimeSlotLimit;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_START_CHARGE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.N_START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getnStartChargeTime() {
        return nStartChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_START_CHARGE_TIME
     *
     * @param nStartChargeTime the value for TB_PARK_RULE_SET.N_START_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnStartChargeTime(Long nStartChargeTime) {
        this.nStartChargeTime = nStartChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_START_CHARGE_PRICE
     *
     * @return the value of TB_PARK_RULE_SET.N_START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getnStartChargePrice() {
        return nStartChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_START_CHARGE_PRICE
     *
     * @param nStartChargePrice the value for TB_PARK_RULE_SET.N_START_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnStartChargePrice(BigDecimal nStartChargePrice) {
        this.nStartChargePrice = nStartChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_CHARGE_TIME
     *
     * @return the value of TB_PARK_RULE_SET.N_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public Long getnChargeTime() {
        return nChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_CHARGE_TIME
     *
     * @param nChargeTime the value for TB_PARK_RULE_SET.N_CHARGE_TIME
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnChargeTime(Long nChargeTime) {
        this.nChargeTime = nChargeTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_CHARGE_PRICE
     *
     * @return the value of TB_PARK_RULE_SET.N_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public BigDecimal getnChargePrice() {
        return nChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_CHARGE_PRICE
     *
     * @param nChargePrice the value for TB_PARK_RULE_SET.N_CHARGE_PRICE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnChargePrice(BigDecimal nChargePrice) {
        this.nChargePrice = nChargePrice;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_START_HOUR
     *
     * @return the value of TB_PARK_RULE_SET.N_START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getnStartHour() {
        return nStartHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_START_HOUR
     *
     * @param nStartHour the value for TB_PARK_RULE_SET.N_START_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnStartHour(String nStartHour) {
        this.nStartHour = nStartHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.N_END_HOUR
     *
     * @return the value of TB_PARK_RULE_SET.N_END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getnEndHour() {
        return nEndHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.N_END_HOUR
     *
     * @param nEndHour the value for TB_PARK_RULE_SET.N_END_HOUR
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setnEndHour(String nEndHour) {
        this.nEndHour = nEndHour;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column TB_PARK_RULE_SET.TYPE
     *
     * @return the value of TB_PARK_RULE_SET.TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column TB_PARK_RULE_SET.TYPE
     *
     * @param type the value for TB_PARK_RULE_SET.TYPE
     *
     * @ibatorgenerated Wed Nov 08 21:06:55 CST 2017
     */
    public void setType(String type) {
        this.type = type;
    }
    
    private Integer start;
   	private Integer end;
   	private String startHourAndEndHour;
   	private String ruleDesc;
   	private String chargeTypeDesc;
   	private Long subFreeTime;
   	private Long nSubFreeTime;
   	private List<String> dateSetList;
	public String getChargeTypeDesc() {
		StringBuffer desc = new StringBuffer();
		desc.append(mergeChargeType("1", chargeType));
		desc.append("</br>");
		desc.append(mergeChargeType("2", nChargeType));
		return desc.toString();
	}
	
	public String mergeChargeType(String type,String chargeType){
		StringBuffer desc = new StringBuffer();
		type = "1".equals(type)?"日间:":"夜间:";
		if("1".equals(chargeType)){
			desc.append(type+"按时长收费");
		}else if("2".equals(chargeType)){
			desc.append(type+"按次数收费");
		}else if("3".equals(chargeType)){
			desc.append(type+"免费");
		}
		return desc.toString();
	}

	public String getStartHourAndEndHour() {
		StringBuffer sb = new StringBuffer();
		sb.append("日间："+this.startHour+"~"+this.endHour);
		sb.append("</br>");
		sb.append("夜间："+this.nStartHour+"~"+this.nEndHour);
		return sb.toString();
	}
	
	public String getRuleDesc() {
		StringBuffer desc = new StringBuffer();
		desc.append(mergeRule("1", this.chargeType, this.freeTime, this.startChargeTime, this.startChargePrice, this.chargeTime, this.chargePrice, this.timeSlotLimit, this.subCharge));
		desc.append("</br>");
		desc.append(mergeRule("2", this.nChargeType, this.nFreeTime, this.nStartChargeTime, this.nStartChargePrice, this.nChargeTime, this.nChargePrice, this.nTimeSlotLimit, this.nSubCharge));
		return desc.toString();
	}

	public String mergeRule(String type,String chargeType,Long freeTime,Long startChargeTime,BigDecimal startChargePrice,Long chargeTime,BigDecimal chargePrice,BigDecimal timeSlotLimit,BigDecimal subCharge){
		StringBuffer desc = new StringBuffer();
		try {
			type = "1".equals(type)?"日间:":"夜间:";
			if("1".equals(chargeType)){
				desc.append(type+"免费停车"+freeTime+"分钟,前"+startChargeTime+"分钟收费"+startChargePrice+"元,以后每"+chargeTime+"分钟收费"+chargePrice+"元");
				if(timeSlotLimit!=null&&timeSlotLimit.compareTo(BigDecimal.ZERO)>0){
					desc.append("收费限额:"+timeSlotLimit+"元");
				}else{
					desc.append("收费限额:不限制");
				}
			}else if("2".equals(chargeType)){
				desc.append(type+"免费停车"+freeTime+"分钟,每次"+subCharge+"元");
			}else if("3".equals(chargeType)){
				desc.append(type+"停车免费");
			}
		} catch (Exception e) {
			log.error("mergeRule---异常",e);
		}
		return desc.toString();
	}
	
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public Long getSubFreeTime() {
		return subFreeTime;
	}

	public void setSubFreeTime(Long subFreeTime) {
		this.subFreeTime = subFreeTime;
	}

	public Long getnSubFreeTime() {
		return nSubFreeTime;
	}

	public void setnSubFreeTime(Long nSubFreeTime) {
		this.nSubFreeTime = nSubFreeTime;
	}

	public List<String> getDateSetList() {
		return dateSetList;
	}

	public void setDateSetList(List<String> dateSetList) {
		this.dateSetList = dateSetList;
	}

	public void setStartHourAndEndHour(String startHourAndEndHour) {
		this.startHourAndEndHour = startHourAndEndHour;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
	}

	public void setChargeTypeDesc(String chargeTypeDesc) {
		this.chargeTypeDesc = chargeTypeDesc;
	}
}