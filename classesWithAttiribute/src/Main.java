public class Main {

    public static void main(String[] args) {
        Product product= new Product(   1,"LAPTOP","ASUS LAPTOP",5000,3,"Siyah");
       /* Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setStockAmount(3);
        product.setPrice(5000);
        product.setDescription("ASUS LAPTOP");
        product.setRenk("");
        System.out.println(product.getName());*/
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println("ürünün kodu: "+product.getKod());
    }
}
