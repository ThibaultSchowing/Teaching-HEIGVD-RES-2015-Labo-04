/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.labs.http.interfaces;

/**
 *
 * @author Thibault
 */
public interface IHttpResponse {
    public int getStatusCode();
    public String getReasonPhrase();
}
