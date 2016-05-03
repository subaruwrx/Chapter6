package cput.za.ac.ecommerce_clothingapp.repository.dom.Impl;

/**
import cput.za.ac.ecommerce_clothingapp.config.databases.DBConstants;
import cput.za.ac.ecommerce_clothingapp.domain.Sale;
import cput.za.ac.ecommerce_clothingapp.repository.dom.AddressRepository;

/**
 * Created by Admin on 2016-04-25.

public class SaleRepositoryImpl extends SQLiteOpenHelper implements AddressRepository {

    public static final String TABLE_NAME="sale";
    private SQLiteDatabase db;


    public static final String COLUMN_ID="id";
    public static final String COLUMN_SALE_DOCUMENT_NUMBER="saledocumentnum";
    public static final String COLUMN_CREDIT_TYPE="credit_type";
    public static final String COLUMN_ORDERSTATUS="orderstatus";
    public static final String COLUMN_INVOICENUMBER="invoicenumber";
    public static final String COLUMN_QUANTITY="quantity";


    // Database creation sql statement
    private static final String DATABASE_CREATE = " CREATE TABLE "
            +TABLE_NAME +"("
            +COLUMN_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, "
            +COLUMN_SALE_DOCUMENT_NUMBER+ " TEXT  NOT NULL , "
            +COLUMN_INVOICENUMBER + " INTEGER  NOT NULL  ,"
            +COLUMN_QUANTITY + " INTEGER  NOT NULL  ,"
            +COLUMN_CREDIT_TYPE+"TEXT NOT NULL,"
            +COLUMN_ORDERSTATUS+ "TEXT NOT NULL";

    public  SaleRepositoryImpl(Context context) {
        super(context, DBConstants.DATABASE_NAME, null, DBConstants.DATABASE_VERSION);
    }

    public void open() throws SQLException {
        db = this.getWritableDatabase();
    }

    public void close() {
        this.close();
    }

    @Override
    public Sale findById(Long id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(
                TABLE_NAME,
                new String[]{
                        COLUMN_ID,
                        COLUMN_SALE_DOCUMENT_NUMBER,
                        COLUMN_INVOICENUMBER,
                        COLUMN_QUANTITY,
                        COLUMN_CREDIT_TYPE,
                        COLUMN_ORDERSTATUS,},
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(id)},
                null,
                null,
                null,
                null);

        if (cursor.moveToFirst()) {

            final Sale sale = new Sale.Builder()
                    .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                    .documentNumber(cursor.getString(cursor.getColumnIndex(COLUMN_SALE_DOCUMENT_NUMBER)))
                    .invoiceNumber(cursor.getInt(cursor.getColumnIndex(COLUMN_INVOICENUMBER)))
                    .quantity(cursor.getInt(cursor.getColumnIndex(COLUMN_QUANTITY)))
                    .creditType(cursor.getString(cursor.getColumnIndex(COLUMN_CREDIT_TYPE)))
                    .orderStatus(cursor.getString(cursor.getColumnIndex(COLUMN_ORDERSTATUS)))
                    .build();
            return sale;
        }else {
            return null;
        }

    }

    @Override
    public Sale save(Sale entity){

        open();
        ContentValues values = new ContentValues();
        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_SALE_DOCUMENT_NUMBER, entity.getSaleDocumentNum());
        values.put(COLUMN_INVOICENUMBER, entity.getInvoiceNumber());
        values.put(COLUMN_QUANTITY, entity.getQuantity());
        values.put(COLUMN_CREDIT_TYPE,entity.getCreditType());
        values.put(COLUMN_ORDERSTATUS,entity.getOrderstatus());


        long id = db.insertOrThrow(TABLE_NAME, null, values);
        Sale insertedEntity = new Sale.Builder()
                .copy(entity)
                .id(new Long (id))
                .build();
        return insertedEntity;
    }


    @Override
    public Sale update(Sale entity){
        open();
        ContentValues values = new ContentValues();

        values.put(COLUMN_ID, entity.getId());
        values.put(COLUMN_SALE_DOCUMENT_NUMBER, entity.getSaleDocumentNum());
        values.put(COLUMN_INVOICENUMBER, entity.getInvoiceNumber());
        values.put(COLUMN_QUANTITY, entity.getQuantity());
        values.put(COLUMN_CREDIT_TYPE,entity.getCreditType());
        values.put(COLUMN_ORDERSTATUS,entity.getOrderstatus());
        db.update(
                TABLE_NAME,
                values,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())}
        );
        return entity;

    }

    @Override
    public Sale delete(Sale entity) {
        open();
        db.delete(
                TABLE_NAME,
                COLUMN_ID + " =? ",
                new String[]{String.valueOf(entity.getId())});
        return entity;
    }

    @Override
    public Set<Sale> findAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Set<Sale> sales = new HashSet<>();
        open();
        Cursor cursor = db.query(TABLE_NAME, null,null,null,null,null,null);
        if (cursor.moveToFirst()) {
            do {

                final Sale sale = new Sale.Builder()
                        .id(cursor.getLong(cursor.getColumnIndex(COLUMN_ID)))
                        .documentNumber(cursor.getString(cursor.getColumnIndex(COLUMN_SALE_DOCUMENT_NUMBER)))
                        .invoiceNumber(cursor.getInt(cursor.getColumnIndex(COLUMN_INVOICENUMBER)))
                        .quantity(cursor.getInt(cursor.getColumnIndex(COLUMN_QUANTITY)))
                        .creditType(cursor.getString(cursor.getColumnIndex(COLUMN_CREDIT_TYPE)))
                        .orderStatus(cursor.getString(cursor.getColumnIndex(COLUMN_ORDERSTATUS)))
                        .build();
                sales.add(sale);
            } while (cursor.moveToNext());
        }
        return sales;
    }

    @Override
    public int deleteAll() {

        open();
        int rowsDeleted = db.delete(TABLE_NAME,null,null);
        close();
        return rowsDeleted;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        Log.w(this.getClass().getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }



}
 */
