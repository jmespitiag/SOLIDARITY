import  java.util.Scanner;
import java.util.ArrayList;
public class Principal {
    public static void Ejecuccion() {
        ArrayList<Solicitud> solicitudes = new ArrayList<>();
        ArrayList<Solicitante> solicitantes = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        outerloop0:
        do {
            System.out.println("________!Hola, Bienvedido a Solidarity!________");
            System.out.println("");
            System.out.println("* Ingrese 1 para iniciar sesión");
            int num2 = sc.nextInt();
            if (num2 == 1) {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("________!Solidarity!________");
                System.out.println("");
                System.out.println("* Ingrese 1 para Iniciar sesión como Usuario");
                System.out.println("* Ingrese 2 para Iniciar sesión como Solicitante");
                System.out.println("* Ingrese 3 para Iniciar sesión como Administrador");

                System.out.println("");
                System.out.println("¿No tienes una cuenta? Ingresa 4 para crear una");
                System.out.println("");
                System.out.println("Si necesitas ayuda o más información, ingresa 9 para ello. POR FAVOR leala antes de crear una cuenta");
                System.out.println("Si quieres cerrar la app, ingresa 0");
                outerloop1:
                do {
                    int num = sc.nextInt();
                    if (num == 1) {
                        System.out.println("");
                        System.out.println("Ingrese por favor su código de usuario");
                        Usuario currentUser = new Usuario();
                        boolean confirmacionUsuario = false;
                        outerloopUser:
                        do {
                            String code = sc.next();
                            int countU = 0;
                            for (int i = 0; i < usuarios.size(); i++) {
                                if (code.equals(usuarios.get(i).getCodigo())) {
                                    confirmacionUsuario = true;
                                    currentUser = new Usuario(usuarios.get(i).getNombre(), usuarios.get(i).getCodigo(), usuarios.get(i).getIdentificacion());
                                    break outerloopUser;


                                }
                            }
                            System.out.println("Codigo de usuario incorrecto ,por favor intente de nuevo");


                        } while (!confirmacionUsuario);
                        System.out.println("");
                        System.out.println("________Bienvenido " + currentUser.getNombre() + "________ ");


                        do {
                            System.out.println("");
                            System.out.println("* Ingrese 1 para donar dinero");
                            System.out.println("* Ingrese cualquier otro numero para salir del programa");
                            int num4 = sc.nextInt();
                            if (num4 == 1) {
                                System.out.println("");
                                System.out.println("________¡Hola, gracias por apoyar este proyecto ¿cuanto dinero desea donar?______");
                                currentUser.donarDinero(sc.nextLong());
                                Bonificacion.recibirBonificacion(currentUser);


                            }else
                                break outerloop1;
                        }while(1>0);



                    } else if (num == 0) {
                        break outerloop0;
                    } else if (num == 2) {
                        System.out.println("");
                        System.out.println("Ingrese por favor su código de solicitante");
                        Solicitante currentSolic = new Solicitante();
                        boolean confirmacionSolicitante = false;
                        outerloopSolic:
                        do {
                            String code = sc.next();
                            int countU = 0;
                            for (int i = 0; i < solicitantes.size(); i++) {
                                if (code.equals(solicitantes.get(i).getCodigo())) {
                                    confirmacionSolicitante = true;
                                    currentSolic = new Solicitante(solicitantes.get(i).getNombre(), solicitantes.get(i).getCodigo(), solicitantes.get(i).getIdentificacion(), solicitantes.get(i).getDiscapacidad());
                                    break outerloopSolic;


                                }
                            }
                            System.out.println("Codigo de solicitante incorrecto ,por favor intente de nuevo");


                        } while (!confirmacionSolicitante);
                        System.out.println("");
                        System.out.println("________Bienvenido " + currentSolic.getNombre() + "________ ");
                        System.out.println("");
                        do {
                            System.out.println("");
                            System.out.println("* Ingrese 1 para hacer una solicitud");
                            System.out.println("* Ingrese 2 para ver el estado tus solicitudes");
                            System.out.println("* Ingrese cualquier otro digito para salir del programa");
                            int num4 = sc.nextInt();
                            if (num4 == 1) {
                                System.out.println("");
                                System.out.println("________¡Hola, la solicitud se ha realizado con exito!______");
                                solicitudes.add(Solicitud.crearSolicitud(currentSolic));
                            }else if(num4 == 2){
                                for(int i = 0; i<solicitudes.size();i++){
                                    System.out.println("");
                                    System.out.println("____Solicitud numero #"+(i+1)+"____");
                                    System.out.println("Estado: "+solicitudes.get(i).getEstado());
                                    System.out.println("Tipo: "+solicitudes.get(i).getTipo());
                                    System.out.println("");
                                }
                            }else
                                break outerloop1;
                        }while(1>0);




                    } else if (num == 3) {
                        System.out.println("");
                        System.out.println("________Usted esta intentando ingresar como administrador________ ");
                        System.out.println("Ingrese por favor la contraseña de seguridad");
                        String password = sc.next();
                        if (!password.equals("Solidarity2022")) {
                            System.out.println("Contraseña incorrecta, por razones der seguridad el programa se cerrará");
                            break outerloop0;

                        }
                        System.out.println("_________Bienvenido Administrador________");
                        System.out.println("");
                        do {
                            System.out.println("");
                            System.out.println("* Ingrese 1 para modificar estado de las solicitudes");
                            System.out.println("* Ingrese 2 para para modificar el tipo de las solicitudes");
                            System.out.println("* Ingrese cualquier otro digito para salir del modo administrador ");
                            int num4 = sc.nextInt();
                            if (num4 == 1) {
                                for(int i = 0; i<solicitudes.size();i++){
                                    System.out.println("");
                                    System.out.println("____Solicitud numero #"+(i+1)+"____");
                                    System.out.println("Nombre solicitante: "+solicitudes.get(i).getNombre());
                                    System.out.println("Discapacidad: "+solicitudes.get(i).getDiscapacidad());
                                    System.out.println("Estado: "+solicitudes.get(i).getEstado());
                                    System.out.println("Tipo: "+solicitudes.get(i).getTipo());
                                    System.out.println("");
                                }
                                System.out.println("Ingrese la solicitud que desea aprobar");
                                int elecc = sc.nextInt();
                                solicitudes.get(elecc-1).setEstado(true);
                                System.out.println("________Solicitud #"+(elecc)+" aprobada________");


                            }else if(num4 == 2){
                                for(int i = 0; i<solicitudes.size();i++){
                                    System.out.println("");
                                    System.out.println("____Solicitud numero #"+(i+1)+"____");
                                    System.out.println("Nombre solicitante: "+solicitudes.get(i).getNombre());
                                    System.out.println("Discapacidad: "+solicitudes.get(i).getDiscapacidad());
                                    System.out.println("Estado: "+solicitudes.get(i).getEstado());
                                    System.out.println("Tipo: "+solicitudes.get(i).getTipo());
                                    System.out.println("");
                                }
                                System.out.println("Ingrese la solicitud a la cual desea clasificar");
                                int elecc = sc.nextInt();
                                System.out.println("Ingrese el tipo en el cual la desea clasificar (1-3)");
                                int type = sc.nextInt();
                                solicitudes.get(elecc-1).setTipo(type);
                                System.out.println("________Solicitud #"+(elecc)+" clasificada________");
                            }else
                                break outerloop0;
                        }while(1>0);

                        }
                     else if (num == 4) {
                        System.out.println("");
                        System.out.println("* Ingrese 1 para Crear una cuenta como Usuario");
                        System.out.println("* Ingrese 2 para Crear una como Solicitante");
                        System.out.println("* Ingrese otro numero para volver a la pantalla inicial");
                        int num3 = sc.nextInt();
                        if (num3 == 1) {
                            System.out.println("Ingrese su nombre");
                            String name = sc.next();
                            System.out.println("Ingrese un código con numeros y letras de 4 caracteres con el cual quiera ser identificado");
                            String cod = sc.next();
                            while (cod.length() != 4) {
                                System.out.println("Por favor ingrese un codigo de solo 4 digitos");
                                cod = sc.next();
                            }
                            System.out.println("Ingrese su numerpo de identificación");
                            int id = sc.nextInt();


                            usuarios.add(Usuario.crearUsuario(name, cod, id));
                            System.out.println("");
                            System.out.println("________Usuario creado________");
                            usuarios.get(usuarios.size() - 1).imprimirUsuario();
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");

                            break;
                        } else if (num3 == 2) {
                            System.out.println("Ingrese su nombre");
                            String name = sc.next();
                            System.out.println("Ingrese un código con numeros y letras de 4 caracteres con el cual quiera ser identificado");
                            String cod = sc.next();
                            while (cod.length() != 4) {
                                System.out.println("Por favor ingrese un codigo de solo 4 digitos");
                                cod = sc.next();
                            }
                            System.out.println("Ingrese su numerpo de identificación");
                            int id = sc.nextInt();
                            System.out.println("Ingrese su tipo de discapacidad, por favor sea especifico");
                            String dis = sc.next();
                            solicitantes.add(Solicitante.crearSolicitante(name, cod, id, dis));
                            System.out.println("");
                            System.out.println("________Solicitante creado________");
                            solicitantes.get(solicitantes.size() - 1).imprimirSolicitante();
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            break;
                        } else
                            break;
                    } else if (num == 9) {
                        Principal.masInformacion();
                    }

                } while (1 < 2);


            }else if (num2 == 0) {
                    System.out.println(" ");
                    System.out.println("________Hasta pronto, gracias por usar nuestra app________");
                    break;
                } else {
                    System.out.println("Valor incorrecto,por favor ingrese el valor requerido");
                }



        } while (1 < 2);
        System.out.println(" ");
        System.out.println("________Hasta pronto, gracias por usar nuestra app________");

    }
            public static void masInformacion () {
                System.out.println(" ");
                System.out.println("Solidarity es una aplicación que busca ayudar a las personas con discapacoidades físicas a" +
                        "tener acceso a proptesis bionicas por medio de donaciones por parte de los usuarios");
                System.out.println(" ");
                System.out.println("En nuestra app las fdiscapacidades estan catalogadas en 3 tipos:");
                System.out.println("Tipo 3, una dispacaidad que sin protesis le permite vivir una vida normal y funcional en sociedad");
                System.out.println("Tipo 2, una dispacaidad que sin protesis le permite vivir una vida normal mas no muy funcional en sociedad");
                System.out.println("Tipo 1, una dispacaidad que sin protesis no le permite vivir una vida normal y mucho menos funcional en sociedad");
                System.out.println(" ");
                System.out.println("Los administradores tienen un código especial para entrar a sus cuentas, este es por ahora global.");
            }


        }





