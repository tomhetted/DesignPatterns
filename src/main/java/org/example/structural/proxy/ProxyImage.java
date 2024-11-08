package org.example.structural.proxy;

public class ProxyImage implements Image {

    private String name;
    private RealImage image;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(name);
        }
        image.display();
    }

    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Изображение загружается при первом отображении
        image1.display();
        System.out.println();
        // Изображение не загружается снова, так как оно уже загружено
        image1.display();
        System.out.println();
        // Второе изображение загружается при первом отображении
        image2.display();
    }
}
