public class Moneda {
        private String base_code;
        private String target_code;
        private double conversion_rate;
        private double conversion_result;

         public String getBase_code() {
            return base_code;
         }

         public void setBase_code(String base_code) {
            this.base_code = base_code;
        }

        public String getTarget_code() {
            return target_code;
         }

        public void setTarget_code(String base_target) {
            this.target_code = base_target;
        }

        public double getConversion_rate() {
             return conversion_rate;
        }

        public double getConversion_result() {
             return conversion_result;
        }

    @Override
    public String toString() {
        return "Moneda{" +
                "base_code='" + base_code + '\'' +
                ", base_target='" + target_code + '\'' +
                ", conversion_rate=" + conversion_rate +
                ", conversion_result=" + conversion_result +
                '}';
    }
}


