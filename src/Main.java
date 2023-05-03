import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Escritorios miEscritorio= new Escritorios("Manso",2000.00,22,210.0,180.0);
        Sillas miSilla= new Sillas("SillitaMansa",3200.0,99,false);
        Notebook miNotebook =new Notebook("LG PRO MAX",3220.00,2,"LG",400.00);
        Impresora miImpresora=new Impresora("LG HP426",999.00,10,"LG",32);
        ArrayList<Productos> misProductos=new ArrayList<>();
        misProductos.add(miEscritorio);
        misProductos.add(miSilla);
        misProductos.add(miImpresora);
        misProductos.add(miNotebook);

        for (Productos miProdu: misProductos) {
            if (miProdu instanceof Escritorios){
                System.out.println("Escritorios: "+ miProdu.toString());
            }else  if (miProdu instanceof Sillas){
                System.out.println("Sillas: "+ miProdu.toString());
            } else  if (miProdu instanceof Impresora){
                System.out.println("Impresora: "+ miProdu.toString());
            } else  if (miProdu instanceof Notebook){
                System.out.println("Notebooks: "+ miProdu.toString());
            }

            }


        Sillas pepeSilla = new Sillas("LaMasComoda",100.00,21,false);
        System.out.println("Cliente Pepe, tenes un descuento del 20% nuevo valor es:"+ pepeSilla.aplicarDescuento(20) );



        for (int i = 0; i<misProductos.size();i++){
            if (misProductos.get(i) instanceof Sillas){
                misProductos.get(i).aumentarPrecios(5);
            }else if (misProductos.get(i) instanceof Impresora){
                misProductos.get(i).aumentarPrecios(15);
            }else if (misProductos.get(i) instanceof Escritorios){
                misProductos.get(i).aumentarPrecios(10);
            }else if (misProductos.get(i) instanceof Notebook){
                misProductos.get(i).aumentarPrecios(20);
            }
        }
        for (Productos miProdu: misProductos) {
            if (miProdu instanceof Escritorios){
                System.out.println("Escritorios: "+ miProdu.toString());
            }else  if (miProdu instanceof Sillas){
                System.out.println("Sillas: "+ miProdu.toString());
            } else  if (miProdu instanceof Impresora){
                System.out.println("Impresora: "+ miProdu.toString());
            } else  if (miProdu instanceof Notebook){
                System.out.println("Notebooks: "+ miProdu.toString());
            }

        }

        }


        }




