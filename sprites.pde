int indDio=0, indMario=0, indFrisk=0, indVador=0, indL=0, indIzuku=0;

void sprites() {
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

