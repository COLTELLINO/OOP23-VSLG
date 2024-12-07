package it.unibo.oops.controller;

import it.unibo.oops.view.DrawView;
import it.unibo.oops.view.DrawViewImpl;

final class MainApp {

    private MainApp(final DrawView window) {
        window.start();
    }
    public static void main(final String[] args) {
        new MainApp(new DrawViewImpl());
    }
}
