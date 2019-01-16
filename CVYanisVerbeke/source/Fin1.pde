int J=0, H=0, W=0, A=0;
void fin1() {
  if (fin1) {
    background(0);
    fill(255);
    textSize(50);
    text("Niveau 1 termine !", 250, 100);
    stroke(255);
    strokeWeight(2);
    line(705, 70, 720, 65);
    textSize(30);
    text("Java", 100, 200);
    text("HTML/CSS", 100, 250);
    text("Word/Powerpoint", 100, 300);
    text("Anglais", 100, 350);
    fill(0, 0, 255);
    stroke(0);
    rect(500, 180, J, 30);
    if (J<300) J+=5;
    rect(500, 230, H, 30);
    if (H<200) H+=5;
    rect(500, 280, W, 30);
    if (W<250) W+=5;
    rect(500, 330, A, 30);
    if (A<320) A+=5;

    textSize(20);
    fill(255);
    text("<< Knowing that you could join ITESCIA fills you with              . >>", 70, 500);
    fill(255, 0, 0);
    text("                                                      DETERMINATION", 70, 500);
    image(save, 10, 520, 50, 50);
    image(heart, 950, 530, 30, 30);

    fill(255);
    textSize(15);
    text("Appuyez sur une touche pour continuer", 300, 580);

    if (keyPressed) {
      a=300;
      x=-200;
      heal=100;
      fin1=false;
      niveau2=true;
    }
  }
}

