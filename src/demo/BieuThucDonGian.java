/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author Lân
 */
public class BieuThucDonGian extends BieuThuc{
    private float toanHang;

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return this.toanHang;
    }

    @Override
    public String bieuThuc() {
        return Float.toString(toanHang);
    }
    
}
