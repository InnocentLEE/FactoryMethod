public class LuxuryCarPolicy implements PolicyProducer {

    public AutoInsurance getInsurObj() {
       return new LuxuryCarInsurance();
    }  
}
