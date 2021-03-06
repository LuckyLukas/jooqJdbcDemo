/*
 * This file is generated by jOOQ.
 */
package com.nohibernate.demo.jooq.tables.records;


import com.nohibernate.demo.jooq.tables.AccountToPolicy;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountToPolicyRecord extends UpdatableRecordImpl<AccountToPolicyRecord> implements Record3<Long, Long, Long> {

    private static final long serialVersionUID = 1429386876;

    /**
     * Setter for <code>public.account_to_policy.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.account_to_policy.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.account_to_policy.policy_id</code>.
     */
    public void setPolicyId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.account_to_policy.policy_id</code>.
     */
    public Long getPolicyId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.account_to_policy.account_id</code>.
     */
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.account_to_policy.account_id</code>.
     */
    public Long getAccountId() {
        return (Long) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Long, Long> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return AccountToPolicy.ACCOUNT_TO_POLICY.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return AccountToPolicy.ACCOUNT_TO_POLICY.POLICY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return AccountToPolicy.ACCOUNT_TO_POLICY.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getPolicyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountToPolicyRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountToPolicyRecord value2(Long value) {
        setPolicyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountToPolicyRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccountToPolicyRecord values(Long value1, Long value2, Long value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AccountToPolicyRecord
     */
    public AccountToPolicyRecord() {
        super(AccountToPolicy.ACCOUNT_TO_POLICY);
    }

    /**
     * Create a detached, initialised AccountToPolicyRecord
     */
    public AccountToPolicyRecord(Long id, Long policyId, Long accountId) {
        super(AccountToPolicy.ACCOUNT_TO_POLICY);

        set(0, id);
        set(1, policyId);
        set(2, accountId);
    }
}
