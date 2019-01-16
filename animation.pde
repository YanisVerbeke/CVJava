void animation() {
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

