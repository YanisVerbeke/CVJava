int xInk=5100, dInk=0, indSquid=0, xSquid=150, ySquid=300;
int b=5400, c=5400, d=5600, e=5450, f=5150, g=5700, h=5340;

void niveau2() {
  if (niveau2) {
    background(100);
    fill(0);
    textSize(25);
    text("Yanis Verbeke", 10, 40);
    textSize(15);
    text("Touches : P pour pause, R pour reculer, A pour accelerer", 480, 30);
    text("(Attention, ne pas laisser une touche appuyee a la fin d'un niveau)", 380, 40);
    textSize(50);
    text("Niveau 2 - Hobbies", a+300, 200);
    textSize(20);
    text("Experience " + lvl, 20, 560);
    fill(0, 255, 0);
    strokeWeight(3);
    rect(220, 22, heal, 20);    //Barre de vie remplie
    rect(20, 570, xp, 10);    //Barre d'xp remplie
    fill(0, 255, 0, 0);
    rect(220, 22, 100, 20);      //barre de vie vide
    rect(20, 570, 300, 10);    //Barre d'xp vide

    textSize(30);
    fill(80, 60, 240);
    text("Game design en Java sous Processing", a+1290, 200, 200, 300);
    image(ISNp1, a+1500, 80);
    textSize(15);
    fill(0);
    text("Jeu de tir", a+1650, 70);
    image(ISNp2, a+2000, 80);
    text("Snake", a+2200, 70);
    image(ISNp3, a+2500, 80, 600, 400);

    text("Projet final ISN 1ere", a+2700, 70);

    image(PC, a+3500, 80);
    textSize(30);
    fill(0);
    text("Montage de PC", a+3750, 150);

    image(ink, a+xInk, 100, 1500, 500);
    xInk=xInk+dInk;
    if (a<-5200) {
      image(squids[indSquid], xSquid, ySquid);
      if (frameCount%10==0 && indSquid<10) {
        indSquid++;
      }
      if (xSquid<400 && a>-6200) xSquid+=4;
      if (a<-5500) {
        xSquid-=4;
        if (frameCount%5==0 && indSquid>0) indSquid--;
      }
      if (ySquid>250 && a>-6250) ySquid--;
      if (a<-5800) ySquid++;
    }

    if (a<-3300) {
      image(aero, a+b, 450, 200, 100);
      image(bbs, a+c, 50, 200, 200);
      image(ledzep, a+d, 120, 200, 100);
      image(muse, a+e, 160, 200, 120);
      image(stones, a+f, 250, 200, 200);
      image(teacup, a+g, 250, 200, 200);
      image(yeye, a+h, 300, 200, 200); 
      b-=2;
      c-=3;
      d-=5;
      e-=2;
      f-=2;
      g-=6;
      h-=1;
    }
    image(guitares, a+4200, 50, 500, 350);

    sprites();
    a=a-dA;                                  //Déplacement
    if (keyPressed) {
      switch(key) {
      case 'p': 
        dA=0;
        break;
      case 'r' :
        dA=-10;
        break;
      case 'a' :
        dA=10;
        break;
      }
    } else dA=3;

    animation();
    progression();
  }
}

