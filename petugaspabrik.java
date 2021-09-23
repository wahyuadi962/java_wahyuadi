class petugas{
    String Nama;
    String Umur;
    String Shift;
    petugas(String inputNama,String inputUmur, String inputShift){
    this.Nama = inputNama;
    this.Umur = inputUmur;
    this.Shift = inputShift;
    }
    void display(){
    System.out.println("Nama : "+this.Nama);
    System.out.println("Usia : "+this.Umur);
    System.out.println("Shift : "+this.Shift);
    }
    String getNama(){
    return this.Nama;
    }
    void setNama(String Nama){
    this.Nama = Nama;
    }
    String getUmur(){
    return this.Umur;
    }
    void setUmur(String Umur){
    this.Umur = Umur;
    }
    String getShift(){
    return this.Shift;
    }
    void setShift(String Shift){
    this.Shift = Shift;
    }
   }
   public class petugaspabrik {
    public static void main(String[] args) {
    petugas tempat1 = new petugas("Joko Hernanda","28 tahun", "Malam");
    System.out.println("Nama : "+ tempat1.getNama());
    System.out.println("Umur : "+ tempat1.getUmur());
    System.out.println("Shift : "+ tempat1.getShift());
    System.out.println("=================");
    tempat1.setNama("lila saskia ");
    tempat1.setUmur("25 tahun");
    tempat1.setShift("Siang");
    tempat1.display();
    }
   }