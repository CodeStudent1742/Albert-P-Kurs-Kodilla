package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        Product product3 = new Product("product3");

        Item item1 = new Item(new BigDecimal(111), 1, new BigDecimal(111));
        Item item2 = new Item(new BigDecimal(222), 2, new BigDecimal(444));
        Item item3 = new Item(new BigDecimal(333), 3, new BigDecimal(999));

        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
//        itemDao.saveAll(Arrays.asList(item1,item2,item3));
        Invoice invoice = new Invoice("20221101");

        invoice.getItems().add(item3);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
//        List<Invoice> readInvoice = invoiceDao.findByNumber("20221101");
//        int itemsInInvoice = readInvoice.get(0).getItems().size();

        //Then
        assertNotEquals(0, invoiceId);
//        assertEquals(3, itemsInInvoice);

        //CleanUp
        try {
            invoiceDao.deleteByNumber("20221101");
            itemDao.deleteByValue(new BigDecimal(111));
            itemDao.deleteByValue(new BigDecimal(222));
            itemDao.deleteByValue(new BigDecimal(333));
            productDao.deleteByName("product1");
            productDao.deleteByName("product2");
            productDao.deleteByName("product2");
        } catch (Exception e) {
            //do nothing
        }

    }
}
