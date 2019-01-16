void progression() {
  if (niveau1) {
    if (a<300) dX=2;    //Arrivée du sprite
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
    if (a<300) dX=2;    //Arrivée du sprite
    if (x==200) dX=0;    //Sprite stop
    if (a<-6800 && dA!=0) dX=5; 
    if (x>1100 && niveau2 && dA!=0) {        //Fin du niveau 2
      dX=0;
      niveau2=false;
      fin2=true;
    }
  }
}

