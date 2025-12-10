public class Bus {
    private Penumpang[] penumpangBiasa = new Penumpang[16];
    private Penumpang[] penumpangPrioritas = new Penumpang[4];
    private Penumpang[] penumpangBerdiri = new Penumpang[20];

    public static final int ONGKOS_BUS = 2000;
    private int totalPendapatan = 0;

    public Penumpang[] getPenumpangBiasa() { return penumpangBiasa; }
    public Penumpang[] getPenumpangPrioritas() { return penumpangPrioritas; }
    public Penumpang[] getPenumpangBerdiri() { return penumpangBerdiri; }

    private int count(Penumpang[] arr){
        int c=0;
        for(Penumpang p:arr) if(p!=null)c++;
        return c;
    }

    public int getJumlahPenumpangBiasa(){ return count(penumpangBiasa); }
    public int getJumlahPenumpangPrioritas(){ return count(penumpangPrioritas); }
    public int getJumlahPenumpangBerdiri(){ return count(penumpangBerdiri); }

    private int totalPenumpang(){
        return getJumlahPenumpangBiasa()+getJumlahPenumpangPrioritas()+getJumlahPenumpangBerdiri();
    }

    public boolean naikkanPenumpang(Penumpang p){
        if(totalPenumpang()>=40) return false;
        if(p.getSaldo()<ONGKOS_BUS) return false;

        if(p.isPrioritas()){
            for(int i=0;i<4;i++){
                if(penumpangPrioritas[i]==null){
                    penumpangPrioritas[i]=p;
                    p.kurangiSaldo(ONGKOS_BUS);
                    totalPendapatan+=ONGKOS_BUS;
                    return true;
                }
            }
        }

        for(int i=0;i<16;i++){
            if(penumpangBiasa[i]==null){
                penumpangBiasa[i]=p;
                p.kurangiSaldo(ONGKOS_BUS);
                totalPendapatan+=ONGKOS_BUS;
                return true;
            }
        }

        for(int i=0;i<20;i++){
            if(penumpangBerdiri[i]==null){
                penumpangBerdiri[i]=p;
                p.kurangiSaldo(ONGKOS_BUS);
                totalPendapatan+=ONGKOS_BUS;
                return true;
            }
        }
        return false;
    }

    public boolean turunkanPenumpang(int id){
        for(int i=0;i<16;i++){
            if(penumpangBiasa[i]!=null && penumpangBiasa[i].getID()==id){
                penumpangBiasa[i]=null; return true;
            }
        }
        for(int i=0;i<4;i++){
            if(penumpangPrioritas[i]!=null && penumpangPrioritas[i].getID()==id){
                penumpangPrioritas[i]=null; return true;
            }
        }
        for(int i=0;i<20;i++){
            if(penumpangBerdiri[i]!=null && penumpangBerdiri[i].getID()==id){
                penumpangBerdiri[i]=null; return true;
            }
        }
        return false;
    }

    private String listPenumpang(Penumpang[] arr){
        String s="";
        for(Penumpang p:arr){
            if(p!=null) s+=p.getID()+" ";
        }
        return s.equals("")?"<kosong>":s;
    }

    public String toString(){
        return "===== BUS TRANS KOETARADJA =====\n"+
               "Biasa     : "+listPenumpang(penumpangBiasa)+"\n"+
               "Prioritas : "+listPenumpang(penumpangPrioritas)+"\n"+
               "Berdiri   : "+listPenumpang(penumpangBerdiri)+"\n"+
               "Total Pendapatan : "+totalPendapatan+"\n"+
               "=================================";
    }
}
