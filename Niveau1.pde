void niveau1() {
  if (niveau1) {
    background(100);
    fill(0);
    textSize(25);
    text("Yanis Verbeke", 10, 40);
    textSize(15);
    text("Touches : P pour pause, R pour reculer, A pour accelerer", 480, 20);
    text("(Attention, ne pas laisser une touche appuyee a la fin d'un niveau)", 380, 40);
    textSize(50);
    text("Niveau 1 - Formations", a+300, 200);
    textSize(20);
    text("Experience " + lvl, 20, 560);
    fill(0, 255, 0);
    strokeWeight(3);
    rect(220, 22, heal, 20);    //Barre de vie remplie
    rect(20, 570, xp, 10);    //Barre d'xp remplie
    fill(0, 255, 0, 0);
    rect(220, 22, 100, 20);      //barre de vie vide
    rect(20, 570, 300, 10);    //Barre d'xp vide

    image(carte, a+1200, 50, 500, 400);
    fill(0);
    textSize(20);
    text("Franconville", a+1400, 120);

    image(college, a+2000, 50); 
    textSize(20);  
    text("College Epine Guyon", a+2250, 150);
    textSize(30);
    text(".2014 - 2015", a+2550, 150);
    text(".Brevet des colleges", a+2600, 250);
    text(".Mention tres bien", a+2650, 300);
    fill(0, 0);
    rect(a+2520, 100, 500, 250);

    image(lycee, a+3200, 80);
    fill(0);
    textSize(20);
    text("Lycee Jean Monnet", a+3370, 180);
    textSize(30);
    text(".2017 - 2018", a+3750, 150);
    text(".Terminale S SVT", a+3800, 250);
    fill(255, 0, 0);
    text(".Specialite ISN", a+3850, 300);
    fill(0, 0);
    rect(a+3720, 100, 500, 250);

    fill(0, 255, 0);
    text("Informatique et Science du Numerique", a+4400, 80);
    textSize(20);
    text("(2016 - 2018)", a+4600, 120);
    image(HTML, a+4300, 130, 500, 400);
    image(ISN3, a+4850, 130, 500, 400);
    image(ISN1, a+5400, 130, 500, 400);
    image(ISN2, a+5950, 130, 500, 400);

    textSize(30);
    fill(255, 0, 0);
    text("Experiences professionnelles", a+6600, 100);
    fill(255);
    text("-Benevolat dans une association pour un evenement musical une fois par an", a+6550, 150, 500, 500);
    text("-Stage de 3eme dans un magasin de musique", a+6550, 350, 500, 500);
    fill(0, 0);
    rect(a+6520, 70, 650, 400);

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

