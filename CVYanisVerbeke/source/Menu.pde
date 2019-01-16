void menu() {
  if (menu) {
    background(0);
    fill(255);
    textSize(50);
    text("CV Yanis Verbeke", 250, 200);
    textSize(30);
    fill(255);
    text("Appuyez sur une touche pour commencer", 150, 400);

    if (keyPressed) {
      Menu.pause();
      menu=false;
      niveau1=true;
      Dummy.play();
      Dummy.loop();
    }
  }
}

