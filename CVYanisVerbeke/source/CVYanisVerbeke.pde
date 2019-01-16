//CV réalisé pendant environ 1 mois
import ddf.minim.*;
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
boolean niveau1=false, fin1=false, niveau2=false, fin2=false, menu=true;    //Selection des écrans affichés

void setup() {
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

void draw() {
  textFont(Pixel);
  menu();
  niveau1();
  fin1();
  niveau2();
  fin2();
}

