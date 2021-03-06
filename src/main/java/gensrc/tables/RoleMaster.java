/*
 * This file is generated by jOOQ.
 */
package gensrc.tables;


import gensrc.DefaultSchema;
import gensrc.Keys;
import gensrc.tables.records.RoleMasterRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleMaster extends TableImpl<RoleMasterRecord> {

    private static final long serialVersionUID = -263646178;

    /**
     * The reference instance of <code>ROLE_MASTER</code>
     */
    public static final RoleMaster ROLE_MASTER = new RoleMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleMasterRecord> getRecordType() {
        return RoleMasterRecord.class;
    }

    /**
     * The column <code>ROLE_MASTER.ROLE_ID</code>.
     */
    public final TableField<RoleMasterRecord, Integer> ROLE_ID = createField(DSL.name("ROLE_ID"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>ROLE_MASTER.ROLE</code>.
     */
    public final TableField<RoleMasterRecord, String> ROLE = createField(DSL.name("ROLE"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>ROLE_MASTER.CREATED_ON</code>.
     */
    public final TableField<RoleMasterRecord, LocalDateTime> CREATED_ON = createField(DSL.name("CREATED_ON"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>ROLE_MASTER.UPDATED_ON</code>.
     */
    public final TableField<RoleMasterRecord, LocalDateTime> UPDATED_ON = createField(DSL.name("UPDATED_ON"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * Create a <code>ROLE_MASTER</code> table reference
     */
    public RoleMaster() {
        this(DSL.name("ROLE_MASTER"), null);
    }

    /**
     * Create an aliased <code>ROLE_MASTER</code> table reference
     */
    public RoleMaster(String alias) {
        this(DSL.name(alias), ROLE_MASTER);
    }

    /**
     * Create an aliased <code>ROLE_MASTER</code> table reference
     */
    public RoleMaster(Name alias) {
        this(alias, ROLE_MASTER);
    }

    private RoleMaster(Name alias, Table<RoleMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleMaster(Name alias, Table<RoleMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> RoleMaster(Table<O> child, ForeignKey<O, RoleMasterRecord> key) {
        super(child, key, ROLE_MASTER);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<RoleMasterRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<UniqueKey<RoleMasterRecord>> getKeys() {
        return Arrays.<UniqueKey<RoleMasterRecord>>asList(Keys.CONSTRAINT_4);
    }

    @Override
    public RoleMaster as(String alias) {
        return new RoleMaster(DSL.name(alias), this);
    }

    @Override
    public RoleMaster as(Name alias) {
        return new RoleMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleMaster rename(String name) {
        return new RoleMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleMaster rename(Name name) {
        return new RoleMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
