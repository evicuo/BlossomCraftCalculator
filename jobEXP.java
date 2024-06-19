public class jobEXP {
    int level;
    String job;
    double exp;
    int targetLevel;

    jobEXP(String job, int level, int targetLevel){
        this.job = job;
        this.level = level;
        this.exp = exp;
        this.targetLevel = targetLevel;
    }

     public double calculate(){
        double targetExp = 0;
        double currentExp = 0;

        if(job.equalsIgnoreCase("miner")){
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((5*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((5*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("smither")){
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((5*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((5*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("digger")){
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((5*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((5*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("fisher")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("farmer")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("woodcutter")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("breeder")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("florist")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        else if(job.equalsIgnoreCase("hunter")) {
            for(int i = 0; i<targetLevel; i++){
                targetExp = targetExp+((4*(i*i))+(50*i));
            }
            for(int j = 0; j<level; j++){
                currentExp = currentExp+((4*(j*j))+(50*j));
            }
            exp = targetExp - currentExp;
        }
        System.out.println(currentExp);
        System.out.println(targetExp);
        return exp;
     }

}
