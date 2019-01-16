int c1=0, c2=0, c3=0, c4=0;

void fin2() {
  if (fin2) {
    background(0);
    fill(255);
    textSize(50);
    text("Niveau 2 termine !", 250, 100);
    stroke(255);
    strokeWeight(2);
    line(705, 70, 720, 65);
    textSize(21);
    text("Vous avez termine cette etape, mais votre aventure ne fait que commencer !", 30, 180);
    line(235, 165, 240, 160);
    textSize(30);
    text("Futurs objectifs : ", 50, 250);

    stroke(0);
    rect(40, 270, c1, 40);
    rect(40, 320, c2, 40);
    rect(40, 370, c3, 40);
    fill(100, 0, 255);
    rect(40, 440, c4, 60);

    fill(0);
    textSize(20);
    text("S'ameliorer en codage Java", 50, 300);
    text("Continuer a travailler de l'oriente objet", 50, 350);
    stroke(0);
    line(460, 335, 465, 332);
    text("Apprendre de nouveaux langages informatiques", 50, 400);
    textSize(30);
    text("Devenir game designer !", 50, 480);

    if (c1<330) c1+=5;
    if (c1>200 && c2<520) c2+=5;
    if (c2>300 && c3<550) c3+=5;
    if (c3>200 && c4<450) c4+=5;

    fill(255);
    textSize(15);
    text("Appuyez sur une touche pour quitter", 300, 580);

    if (keyPressed) exit();
  }
}

