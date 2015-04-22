/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.labs.http.interfaces;

import ch.heigvd.res.labs.http.impl.HttpRequest;

/**
 *
 * @author Thibault
 */
public interface IHttpClient {

    public IHttpResponse sendRequest(HttpRequest request);

    
}
