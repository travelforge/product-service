/*
* The Travelforge Project
* http://www.travelforge.org
*
* Copyright (c) 2015 - 2017 Matthias Deck
*
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to
* deal in the Software without restriction, including without limitation the
* rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
* sell copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
*
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
*
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
*
*/
package org.travelforge.product.service.response;

import org.travelforge.product.model.PackageProduct;

import java.util.List;

/**
 * @author Matthias Deck
 */
public class PackageProductResponse implements PackageResponse {

    private static final long serialVersionUID = 1L;

    private ResponseContext context;
    private PageInfo pageInfo;
    private List<PackageProduct> products;

    @Override
    public ResponseContext getContext() {
        return context;
    }

    @Override
    public void setContext(ResponseContext context) {
        this.context = context;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<PackageProduct> getProducts() {
        return products;
    }

    public void setProducts(List<PackageProduct> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PackageProductResponse that = (PackageProductResponse) o;

        if (context != null ? !context.equals(that.context) : that.context != null) return false;
        if (pageInfo != null ? !pageInfo.equals(that.pageInfo) : that.pageInfo != null) return false;
        return products != null ? products.equals(that.products) : that.products == null;
    }

    @Override
    public int hashCode() {
        int result = context != null ? context.hashCode() : 0;
        result = 31 * result + (pageInfo != null ? pageInfo.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PackageProductResponse{" +
                "context=" + context +
                ", pageInfo=" + pageInfo +
                ", products=" + products +
                '}';
    }
}
