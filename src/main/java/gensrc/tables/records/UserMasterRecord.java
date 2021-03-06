/*
 * This file is generated by jOOQ.
 */
package gensrc.tables.records;


import gensrc.tables.UserMaster;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserMasterRecord extends UpdatableRecordImpl<UserMasterRecord> implements Record9<Integer, String, String, String, String, Boolean, LocalDateTime, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1120108506;

    /**
     * Setter for <code>USER_MASTER.USER_ID</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>USER_MASTER.USER_ID</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>USER_MASTER.FIRST_NAME</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>USER_MASTER.FIRST_NAME</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>USER_MASTER.LAST_NAME</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>USER_MASTER.LAST_NAME</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>USER_MASTER.USER_NAME</code>.
     */
    public void setUserName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>USER_MASTER.USER_NAME</code>.
     */
    public String getUserName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>USER_MASTER.PASSWORD</code>.
     */
    public void setPassword(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>USER_MASTER.PASSWORD</code>.
     */
    public String getPassword() {
        return (String) get(4);
    }

    /**
     * Setter for <code>USER_MASTER.IS_DELETED</code>.
     */
    public void setIsDeleted(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>USER_MASTER.IS_DELETED</code>.
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>USER_MASTER.CREATED_ON</code>.
     */
    public void setCreatedOn(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>USER_MASTER.CREATED_ON</code>.
     */
    public LocalDateTime getCreatedOn() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>USER_MASTER.UPDATED_ON</code>.
     */
    public void setUpdatedOn(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>USER_MASTER.UPDATED_ON</code>.
     */
    public LocalDateTime getUpdatedOn() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>USER_MASTER.ROLE_ID</code>.
     */
    public void setRoleId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>USER_MASTER.ROLE_ID</code>.
     */
    public Integer getRoleId() {
        return (Integer) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, String, Boolean, LocalDateTime, LocalDateTime, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, String, String, Boolean, LocalDateTime, LocalDateTime, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return UserMaster.USER_MASTER.USER_ID;
    }

    @Override
    public Field<String> field2() {
        return UserMaster.USER_MASTER.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return UserMaster.USER_MASTER.LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return UserMaster.USER_MASTER.USER_NAME;
    }

    @Override
    public Field<String> field5() {
        return UserMaster.USER_MASTER.PASSWORD;
    }

    @Override
    public Field<Boolean> field6() {
        return UserMaster.USER_MASTER.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return UserMaster.USER_MASTER.CREATED_ON;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return UserMaster.USER_MASTER.UPDATED_ON;
    }

    @Override
    public Field<Integer> field9() {
        return UserMaster.USER_MASTER.ROLE_ID;
    }

    @Override
    public Integer component1() {
        return getUserId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public String component4() {
        return getUserName();
    }

    @Override
    public String component5() {
        return getPassword();
    }

    @Override
    public Boolean component6() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime component7() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime component8() {
        return getUpdatedOn();
    }

    @Override
    public Integer component9() {
        return getRoleId();
    }

    @Override
    public Integer value1() {
        return getUserId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public String value4() {
        return getUserName();
    }

    @Override
    public String value5() {
        return getPassword();
    }

    @Override
    public Boolean value6() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime value7() {
        return getCreatedOn();
    }

    @Override
    public LocalDateTime value8() {
        return getUpdatedOn();
    }

    @Override
    public Integer value9() {
        return getRoleId();
    }

    @Override
    public UserMasterRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserMasterRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public UserMasterRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public UserMasterRecord value4(String value) {
        setUserName(value);
        return this;
    }

    @Override
    public UserMasterRecord value5(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserMasterRecord value6(Boolean value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public UserMasterRecord value7(LocalDateTime value) {
        setCreatedOn(value);
        return this;
    }

    @Override
    public UserMasterRecord value8(LocalDateTime value) {
        setUpdatedOn(value);
        return this;
    }

    @Override
    public UserMasterRecord value9(Integer value) {
        setRoleId(value);
        return this;
    }

    @Override
    public UserMasterRecord values(Integer value1, String value2, String value3, String value4, String value5, Boolean value6, LocalDateTime value7, LocalDateTime value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserMasterRecord
     */
    public UserMasterRecord() {
        super(UserMaster.USER_MASTER);
    }

    /**
     * Create a detached, initialised UserMasterRecord
     */
    public UserMasterRecord(Integer userId, String firstName, String lastName, String userName, String password, Boolean isDeleted, LocalDateTime createdOn, LocalDateTime updatedOn, Integer roleId) {
        super(UserMaster.USER_MASTER);

        set(0, userId);
        set(1, firstName);
        set(2, lastName);
        set(3, userName);
        set(4, password);
        set(5, isDeleted);
        set(6, createdOn);
        set(7, updatedOn);
        set(8, roleId);
    }
}
