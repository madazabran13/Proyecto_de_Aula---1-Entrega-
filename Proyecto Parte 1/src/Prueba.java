import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0, NEL = 0,NEL1 = 0,NEL2 = 0,NEL3 = 0;
        Radicacion rad []= new Radicacion[1];
        Parte_Procesal pa[]=new Parte_Procesal[1];
        Serie SE[] = new Serie[5];
        Subserie SU[] = new Subserie[5];
        Despacho_Judicial DES[] = new Despacho_Judicial[5];
        Tipo_Documental tp[]=new Tipo_Documental[5];
        Departamento D[] = new Departamento[1];
        Ciudad C[] = new Ciudad[1];
        boolean slirsub = false;
        int cod,rr;

        String text, nom,dep,ciu, cat, serie, subserie, tipodoc;
        char mas = 's';
        int var = 0;
        int var15 = 0,var2=0,var3=0;
        int codx, CODD;
        String DESc, DESS,TPD;
        do {
            System.out.println("\n     PROCESO DE DIGITALIZACION EXPEDIENTE   ");
            System.out.println("\n1.Ingrese la localidad ");
            System.out.println("2.Agragar serie , sub serie, tipo documental");
            System.out.println("3.Informacion del despacho judicial");
            System.out.println("4.Mostrar informacion del despacho judicial ");
            System.out.println("5.Ingrese No Radicacion");
            System.out.println("6.Ingrese Parte procesal");
            System.out.println("7.informacion completa digitada");
            System.out.println("8.Salir");

            System.out.println("Escoja una opcion");
            opcion = sn.nextInt();

            switch (opcion){
                case 1:
                    Scanner read = new Scanner(System.in);
                    System.out.println("Agregue el departamento");
                    dep = read.nextLine();
                    System.out.println("Agregue la ciudad o municipio");
                    ciu = read.nextLine();
                    D[0]= new Departamento(dep);
                    C[0]=new Ciudad(ciu);
                    break;
                case 2:
                    do {
                        System.out.println("  AGREGAR INFORMACION DE SERIE , SUBERIE Y TIPO DE DOCUMENTO  \n");
                        System.out.println("\n1.Digite serie: ");
                        System.out.println("2.Digite subserie");
                        System.out.println("3.Digite tipo de documento");
                        System.out.println("4.Salir ");
                        System.out.println("Escribe una de las opciones");
                        opcion = sn.nextInt();
                        switch (opcion) {
                            case 1:
                                do {
                                System.out.println("  AGREGAR INFORMACION DE SERIE  \n");
                                    if ((NEL < 5)) {
                                        Scanner re = new Scanner(System.in);
                                        System.out.println(" Digite el codigo:   ");
                                        codx = sn.nextInt();
                                        System.out.println(" Digite la decripion ");
                                        DESc = re.nextLine();
                                        SE[NEL] = new Serie(codx, DESc);

                                        System.out.println("desea seguir ingresando informacion S/N");
                                        mas = sn.next().charAt(0);
                                        NEL = NEL + 1;
                                        var = NEL;
                                    }

                                } while ((mas == 'S' || mas == 's') && (NEL < 5));
                                break;
                            case 2:
                                do {
                                    System.out.println("  AGREGAR INFORMACION DE SUBSERIE  \n");
                                    if ((NEL1 < 5)) {
                                        Scanner reade = new Scanner(System.in);
                                        System.out.println(" Digite el codigo:   ");
                                        CODD = sn.nextInt();
                                        System.out.println(" Digite la decripion ");
                                        DESS = reade.nextLine();
                                        SU[NEL1] = new Subserie(CODD, DESS);
                                        System.out.println("desea seguir ingresando informacion S/N");
                                        mas = sn.next().charAt(0);
                                        NEL1 = NEL1 + 1;
                                        var15 = NEL1;
                                    }

                                } while ((mas == 'S' || mas == 's') && (NEL1 < 5));
                                break;
                            case 3:
                                do {
                                    System.out.println("  AGREGAR INFORMACION DE TIPO DOCUMENTO \n");
                                    if ((NEL2 < 5)) {
                                        Scanner readi = new Scanner(System.in);
                                        System.out.println(" Digite el tipo de documento  ");
                                        TPD = readi.nextLine();
                                        tp[NEL2] = new Tipo_Documental(TPD);
                                        System.out.println("desea seguir ingresando informacion S/N");
                                        mas = sn.next().charAt(0);
                                        NEL2 = NEL2 + 1;
                                        var2 = NEL2;

                                    }

                                } while ((mas == 'S' || mas == 's') && (NEL2 < 5));
                                break;

                            case 4:
                            slirsub = true;
                            break;
                            default:
                            System.out.println("Solo opciones entre 1 y 4");

                        }
                    }while (!slirsub) ;
                    break;


                case 3:
                    do {
                        System.out.println("  AGREGAR INFORMACION DEl DESPACHO JUDICIAL \n");
                        if ((NEL3 < 5)) {
                            Scanner rea = new Scanner(System.in);
                            System.out.println(" Digite el NOMBRE:   ");
                            nom = rea.nextLine();
                            System.out.println(" Digite el codigo ");
                            cod = sn.nextInt();
                            System.out.println(" Digite la categoria (muniCipal o circuito ");
                            cat = rea.nextLine();
                            DES[NEL3] = new Despacho_Judicial(nom, cod, cat);
                            System.out.println("desea seguir ingresando informacion S/N");
                            mas = sn.next().charAt(0);
                            NEL3 = NEL3 + 1;
                            var3 = NEL3;
                        }
                    } while ((mas == 'S' || mas == 's') && (NEL3 < 5));
                    break;
                case 4:
                    System.out.println("    INFORMACION DEl DESPACHO   ");

                    for (int i = 0; i < var3; i++) {
                        System.out.println("El nombre es: " + DES[i].getNombre());
                        System.out.println("El codigo es: " + DES[i].getCodigo());
                        System.out.println("La categoria es :" + DES[i].getCategoria());
                    }
                break;
                case 5:
                    System.out.println(" numero de radicacion");
                    rr= sn.nextInt();
                    rad[0]= new Radicacion(rr);
                break;
                case 6:
                    String tipoper,nomd,nomde;
                    Scanner ra = new Scanner(System.in);
                    System.out.println("Tipo de persona(natural o juridica):");
                    tipoper= ra.nextLine();
                    System.out.println("Nombre del demandado");
                    nomd=ra.nextLine();
                    System.out.println("Nombre del demandante");
                    nomde=ra.nextLine();
                    pa[0]=new Parte_Procesal(tipoper,nomd,nomde);
                break;
                case 7:
                    System.out.println("Departamento: "+D[0].getDepartamento());
                    System.out.println("Ciduad : "+D[0].getDepartamento());
                    for (int i = 0; i < var; i++) {
                        System.out.println("  SERIE  ");
                        System.out.println("Codigo: "+SE[i].getCodigo_());
                        System.out.println("Descripcion: "+SE[i].getDescripcion());
                    }
                    System.out.println("");
                    for (int i = 0; i < var; i++) {
                        System.out.println("  SUBSERIE  ");
                        System.out.println("Codigo: "+SU[i].getCodig());
                        System.out.println("Descripcion: "+SU[i].getDescripcion());
                    }
                    System.out.println("");
                    for (int i = 0; i < var; i++) {
                        System.out.println("  TIPODOCUMETAL  ");
                        System.out.println("Codigo: "+tp[i].getTipo());

                    }
                    System.out.println("");
                    for (int i = 0; i < var3; i++) {
                        System.out.println("     Despacho judicial    ");
                        System.out.println("El nombre es: " + DES[i].getNombre());
                        System.out.println("El codigo es: " + DES[i].getCodigo());
                        System.out.println("La categoria es :" + DES[i].getCategoria());

                    }
                    System.out.println("");
                    System.out.println("No de radicacion : "+rad[0].getRad());
                    System.out.println("Tipo de persona:"+pa[0].getTipop());
                    System.out.println("Nombre del demandante:"+pa[0].getPersonadema());
                    System.out.println("Nombre del demandado:"+pa[0].getPersonademandada());

                case 8:
                    salir = true;
                break;
                default:
                    System.out.println("Solo opciones entre 1 y 4");
            }
        } while (!salir) ;
    }
}


