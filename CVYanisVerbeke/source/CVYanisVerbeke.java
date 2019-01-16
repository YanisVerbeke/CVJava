import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class CVYanisVerbeke extends PApplet {

//CV r\u00e9alis\u00e9 pendant environ 1 mois

Minim minim;
AudioPlayer Dummy;
AudioPlayer Menu;
int x=-200, dX=0, a=300, lvl=12, xp=50, heal=100, dA=3;
PImage carte, college, lycee, save, heart, ISN1, ISN2, ISN3, ISNp1, ISNp2, ISNp3, ISNp4, HTML, PC, guitares;
PImage aero, bbs, ledzep, muse, stones, teacup, yeye;
PImage sprite, ink, squid, spDio, blanco, spMario, spFrisk, spVador, spL, spIzuku;
PImage anim[] = new PImage[4];
PImage squids[] = new PImage[11];
PImage Dio[] = new PImage[16];
PImage Mario[] = new PImage[4];
PImage Frisk[] = new PImage[2];
PImage Vador[] = new PImage[4];
PImage L[] = new PImage[7];
PImage Izuku[] = new PImage[8];
int index=0;
PFont Pixel;
boolean niveau1=false, fin1=false, niveau2=false, fin2=false, menu=true;    //Selection des \u00e9crans affich\u00e9s

public void setup() {
  size(1000, 600);
  carte = loadImage("carte.png");
  sprite=loadImage("SpriteCV.png");
  Pixel = loadFont("PixelFont.vlw");
  college = loadImage("college.png");
  lycee = loadImage("lycee.png");
  save=loadImage("save.png");
  heart=loadImage("heart.png");
  ISN1=loadImage("ISN1.PNG");
  ISN2=loadImage("ISN2.PNG");
  ISN3=loadImage("ISN3.PNG");
  ISNp1=loadImage("ISNp1.PNG");
  ISNp2=loadImage("ISNp2.PNG");
  ISNp3=loadImage("ISNp3.PNG");
  HTML=loadImage("HTML.png");
  PC=loadImage("Pc.png");
  guitares=loadImage("guitare.png");
  ink = loadImage("ink.png");
  squid = loadImage("squid.png");
  aero = loadImage("Aerosmith.png");
  bbs = loadImage("BBS.png");
  ledzep = loadImage("LedZeppelin.png");
  muse = loadImage("muse.png");
  stones = loadImage("RollingStones.png");
  teacup = loadImage("Teacup.png");
  yeye = loadImage("Yeye.png");
  spDio = loadImage("spDio.png");
  blanco = loadImage("Blanco.png");
  spMario = loadImage("spMario.png");
  spFrisk = loadImage("spFrisk.png");
  spVador = loadImage("spVador.png");
  spL = loadImage("spL.png");
  spIzuku = loadImage("Izuku.png");

  minim = new Minim(this);
  Dummy = minim.loadFile("Dummy.mp3");
  Menu = minim.loadFile("Menu.mp3");
  Menu.play();
  Menu.loop();
}

public void draw() {
  textFont(Pixel);
  menu();
  niveau1();
  fin1();
  niveau2();
  fin2();
}

int J=0, H=0, W=0, A=0;
public void fin1() {
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

int c1=0, c2=0, c3=0, c4=0;

public void fin2() {
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

public void menu() {
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

public void niveau1() {
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

    a=a-dA;                                  //D\u00e9placement
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

int xInk=5100, dInk=0, indSquid=0, xSquid=150, ySquid=300;
int b=5400, c=5400, d=5600, e=5450, f=5150, g=5700, h=5340;

public void niveau2() {
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
    a=a-dA;                                  //D\u00e9placement
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

public void animation() {
  for (int i=0; i<4; i++) {        //animation de mon personnage
    anim[i]=sprite.get(250*i, 0, 250, 275);
  }
  sprite.loadPixels();
  image(anim[index], x, 300);
  x=x+dX;
  if (frameCount%15==0 && dA!=0) {
    index++;
    if (index>3)index=0;
  }

  squids[0] = squid.get(0, 0, 0, 0);      //animation de l'inkling (Splatoon)
  for (int j=0; j<5; j++) {
    squids[j+1] = squid.get(142*j, 0, 142, 141);
  }
  for (int h=0; h<5; h++) {
    squids[h+6] = squid.get(142*h, 142, 142, 141);
  }
  squid.loadPixels();
}

public void progression() {
  if (niveau1) {
    if (a<300) dX=2;    //Arriv\u00e9e du sprite
    if (x==200) dX=0;    //Sprite stop
    if (a<-6500 && dA!=0) dX=5;    //Sprite part
    if (x>1100 && niveau1 && dA!=0) {        //Fin du niveau 1
      dX=0;
      niveau1=false;
      fin1=true;
    }

    if (a<-2300 && lvl<13) xp+=5;
    if (a<-3400 && lvl<16) xp+=5;
    if (a<-4600 && lvl<18) xp+=5;

    if (xp>300) {
      lvl++;
      xp=0;
    }

    if (a<-3000 && heal>40) {
      heal-=5;
    }
  }

  if (niveau2) {
    if (a<300) dX=2;    //Arriv\u00e9e du sprite
    if (x==200) dX=0;    //Sprite stop
    if (a<-6800 && dA!=0) dX=5; 
    if (x>1100 && niveau2 && dA!=0) {        //Fin du niveau 2
      dX=0;
      niveau2=false;
      fin2=true;
    }
  }
}

int indDio=0, indMario=0, indFrisk=0, indVador=0, indL=0, indIzuku=0;

public void sprites() {
  for (int i=0; i<16; i++) {
    Dio[i] = spDio.get(94*i, 0, 94, 115);
  }
  image(Dio[indDio], a+6500, 240, 300, 300);
  if (frameCount%7==0) indDio--;
  if (indDio<0) indDio=15;

  image(blanco, a+6600, 20);

  for (int i=0; i<4; i++) {
    Mario[i] = spMario.get(57*i, 0, 57, 43);
  }
  image(Mario[indMario], a+6700, 440, 100, 100);
  if (frameCount%15==0) indMario++;
  if (indMario>3) indMario=0;

  Frisk[0] = spFrisk.get(0, 0, 35, 58);
  Frisk[1] = spFrisk.get(35, 0, 35, 58);
  image(Frisk[indFrisk], a+6850, 390, 100, 150);
  if (frameCount%15==0) indFrisk++;
  if (indFrisk>1) indFrisk=0;

  for (int i=0; i<4; i++) {
    Vador[i] = spVador.get(150*i, 0, 150, 150);
  }
  image(Vador[indVador], a+7120, 300, 250, 250);
  if (frameCount%15==0) indVador++;
  if (indVador>3) indVador=0;

  for (int i=0; i<7; i++) {
    L[i] = spL.get(42*i, 0, 42, 80);
  }
  image(L[indL], a+6900, 300, 150, 250);
  if (frameCount%15==0) indL++;
  if (indL>6) indL=0;

  for (int i=0; i<8; i++) {
    Izuku[i] = spIzuku.get(121*i, 0, 121, 154);
  }
  image(Izuku[indIzuku], a+7350, 250, 200, 350);
  if (frameCount%12==0) indIzuku++;
  if (indIzuku>7) indIzuku=0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "CVYanisVerbeke" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
