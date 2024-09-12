package com.etiya;

import com.etiya.business.ProductManager;
import com.etiya.core.logging.DatabaseLogger;
import com.etiya.core.logging.FileLogger;
import com.etiya.core.logging.Logger;
import com.etiya.core.logging.MailLogger;
import com.etiya.dataAccess.JdbcProductDao;
import com.etiya.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "IPhone XR", 10000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
}