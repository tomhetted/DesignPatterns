package org.example.structural.facade;

public class HomeTheaterFacade {

    private Projector projector;
    private DvdPlayer dvdPlayer;
    private SoundSystem soundSystem;
    private Light light;
    private Screen screen;

    public HomeTheaterFacade(Projector projector, DvdPlayer dvdPlayer, SoundSystem soundSystem, Light light, Screen screen) {
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
        this.light = light;
        this.screen = screen;
    }

    public void startMovie() {
        System.out.println("Starting movie...");
        screen.down();
        light.dim(10);
        projector.on();
        soundSystem.setVolume(5);
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Ending movie...");
        dvdPlayer.stop();
        projector.off();
        light.dim(100);
        screen.up();
    }

    public static void main(String[] args) {

        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Light light = new Light();
        Screen screen = new Screen();

        HomeTheaterFacade theater = new HomeTheaterFacade(projector, dvdPlayer, soundSystem, light, screen);
        theater.startMovie();
        System.out.println("...");
        theater.endMovie();
    }

}
