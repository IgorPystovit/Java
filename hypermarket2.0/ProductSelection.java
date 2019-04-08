package com.epam.hypermarket;

public class ProductSelection {
    private RequestHandler requestHandler = new RequestHandler();
    public void selectProduct(){
        requestHandler.requestSelector();
    }
}
