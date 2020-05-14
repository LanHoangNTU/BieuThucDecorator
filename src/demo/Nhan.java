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
public class Nhan extends BieuThucDecorator{
    private final float toanHang;

    public Nhan(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        if(this.bieuThuc.giaTri() != Float.NaN)
            return this.bieuThuc.giaTri() * this.toanHang;
        return Float.NaN;
    }

    @Override
    public String bieuThuc() {
        StringBuilder b = new StringBuilder();
        b.append(this.bieuThuc.bieuThuc())
                .append(" * ")
                .append(toanHang);
        return b.toString();
    }
}
