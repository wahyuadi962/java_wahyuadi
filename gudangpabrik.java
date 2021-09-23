class gudang{
    String NamaGudang;
    String NamaStokBarang;
    String KodeStokBarang;
    String RakStokBarang;
    int JumlahStokBarang;
    gudang(String inputNamaGudang,String inputNamaStokBarang, String inputKodeStokBarang, String inputRakStokBarang, int inputJumlahStokBarang){
    this.NamaGudang = inputNamaGudang;
    this.NamaStokBarang = inputNamaStokBarang;
    this.KodeStokBarang = inputKodeStokBarang;
    this.JumlahStokBarang = inputJumlahStokBarang;
    this.RakStokBarang = inputRakStokBarang;
    }
    void display(){
    System.out.println("NamaStokBarang : "+this.NamaStokBarang);
    System.out.println("KodeStokBarang : "+this.KodeStokBarang);
    System.out.println("JumlahStokBarang : "+this.JumlahStokBarang);
    System.out.println("RakStokBarang : "+this.RakStokBarang);
    }
    String getNamaGudang(){
    return this.NamaGudang;
    }
    String getNamaStokBarang(){
    return this.NamaStokBarang;
    }
    void setNamaStokBarang(String NamaStokBarang){
    this.NamaStokBarang = NamaStokBarang;
    }
    void setNamaGudang(String NamaGudang){
    this.NamaGudang = NamaGudang;
    }
    String getKodeStokBarang(){
    return this.KodeStokBarang;
    }
    void setKodeStokBarang(String KodeStokBarang){
    this.KodeStokBarang= KodeStokBarang;
    }
    int getJumlahStokBarang(){
    return this.JumlahStokBarang;
    }
    void setJumlahStokBarang(int JumlahStokBarang){
    this.JumlahStokBarang = JumlahStokBarang;
    }
    String getRakStokBarang(){
    return this.RakStokBarang;
    }
    void setRakStokBarang(String RakStokBarang){
    this.RakStokBarang = RakStokBarang;
    }
   }
   public class gudangpabrik {
    public static void main(String[] args) {
    gudang tempat1 = new gudang("peralatan","Palu", "AB 213", "A", 234);
    System.out.println("NamaGudang : "+ tempat1.getNamaGudang());
    System.out.println("NamaStokBarang : "+ tempat1.getNamaStokBarang());
    System.out.println("KodeStokBarang : "+ tempat1.getKodeStokBarang());
    System.out.println("JumlahStokBarang : "+ tempat1.getJumlahStokBarang());
    System.out.println("RakStokBarang : "+ tempat1.getRakStokBarang());
    System.out.println("=================");
    tempat1.setNamaStokBarang("Bor Daya ");
    tempat1.setKodeStokBarang("D13");
    tempat1.setJumlahStokBarang(10);
    tempat1.setRakStokBarang("D");
    tempat1.display();
    }
   }