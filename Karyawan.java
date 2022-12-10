public class Karyawan extends Data{

    @Override
    public void displayData() {
        System.out.println("\t\t\t\t\t\t\tKaryawan : "+getNama()+"["+getId()+"]");
    }

    public int id_cust;

    public int getId_cust() {
        return id_cust;
    }


}
