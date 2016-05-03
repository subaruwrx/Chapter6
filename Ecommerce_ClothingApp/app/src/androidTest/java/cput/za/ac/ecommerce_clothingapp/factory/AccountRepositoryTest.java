package cput.za.ac.ecommerce_clothingapp.factory;

import android.test.AndroidTestCase;


/**
 * Created by Admin on 2016-04-25.
 */
public class AccountRepositoryTest extends AndroidTestCase {
/**
    private static final String TAG = "ACCOUNT TEST";
    private Long id;

    public void testCreateReadUpdateDelete() throws Exception {
        Date date=new Date();
        Date date1=new Date();

        Address addr = new Address.Builder()
                .city("summer greens")
                .Street("24 tienkers road")
                .country("800,South africa")
                .build();

        AccountRepository repo = new AccountRepositoryImpl(this.getContext());
        // CREATE
        Account createEntity = new Account.Builder()
                .accountNumber("001234567")
                .open(date)
                .closed(date1)
                .is_Closed("open")
                .addressAccount(addr)
                .build();
        Account  insertedEntity = repo.save(createEntity);
        id=insertedEntity.getId();
        Assert.assertNotNull(TAG+" CREATE",insertedEntity);

        //READ ALL
        Set<Account> accounts = repo.findAll();
        Assert.assertTrue(TAG+" READ ALL",accounts.size()>0);

        //READ ENTITY
        Account entity = repo.findById(id);
        Assert.assertNotNull(TAG+" READ ENTITY",entity);



        //UPDATE ENTITY
        Address addr1 = new Address.Builder()
                .city("summer greens")
                .Street("24 tienkers road")
                .country("800,South africa")
                .build();

        Account updateEntity = new Account.Builder()
                .accountNumber("009019902")
                .open(date)
                .closed(date1)
                .is_Closed("open")
                .addressAccount(addr1)
                .build();
        repo.update(updateEntity);
        Account newEntity = repo.findById(id);
        Assert.assertEquals(TAG+ " UPDATE ENTITY","accountNumber",newEntity.getAccountNumber());

        // DELETE ENTITY
        repo.delete(updateEntity);
        Account deletedEntity = repo.findById(id);
        Assert.assertNull(TAG+" DELETE",deletedEntity);

    }

 **/
}
