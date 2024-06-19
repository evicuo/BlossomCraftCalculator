import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to evicuo's BC job calculator!\nPlease select your job below.\nNOTE: All block requirements are based on resource world values.");


        Object[] possibleValues = { "Miner", "Smither", "Digger", "Fisher", "Farmer", "Woodcutter", "Florist", "Breeder"  };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);


        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter your current level."));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter your target level."));

        String job = selectedValue.toString();
        jobEXP jobexp = new jobEXP(job, x, y);
        double z = jobexp.calculate();

        switch(job){
            case "Miner" :
                Object[] possibleValues2 = { "Deepslate Diamond Ore", "Deepslate Gold Ore", "Deepslate Lapis Ore", "Emerald Ore"  };
                Object selectedValue2 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues2, possibleValues2[0]);
                if(selectedValue2.toString().equalsIgnoreCase("Deepslate Diamond Ore")){
                    double k = z/19.25;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" deepslate diamond ores mined to reach!");}
                else if(selectedValue2.toString().equalsIgnoreCase("Deepslate Gold Ore")){
                    double k = z/7.26;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" deepslate gold ores mined to reach!");}
                else if(selectedValue2.toString().equalsIgnoreCase("Deepslate Lapis Ore")){
                    double k = z/9.86;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" deepslate lapis ores mined to reach!");}
                else if(selectedValue2.toString().equalsIgnoreCase("Emerald Ore")){
                    double k = z/110.0;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" emerald ores mined to reach!");}
            break;
            case "Smither" :
                Object[] possibleValues3 = { "Ancient Debris", "Raw Gold", "Raw Iron", "Raw Copper"  };
                Object selectedValue3 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues3, possibleValues3[0]);
                if(selectedValue3.toString().equalsIgnoreCase("Ancient Debris")){
                    double k = z/80.00;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" ancient debris smelted to reach!");}
                else if(selectedValue3.toString().equalsIgnoreCase("Raw Gold")){
                    double k = z/1.65;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" raw gold smelted to reach!");}
                else if(selectedValue3.toString().equalsIgnoreCase("Raw Iron")){
                    double k = z/0.28;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" raw iron smelted to reach!");}
                else if(selectedValue3.toString().equalsIgnoreCase("Raw Copper")){
                    double k = z/0.22;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" raw copper smelted to reach!");}
                break;
            case "Digger" :
                Object[] possibleValues4 = { "Dirt", "Mud", "Gravel", "Soul Sand", "Clay"  };
                Object selectedValue4 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues4, possibleValues4[0]);
                if(selectedValue4.toString().equalsIgnoreCase("Dirt")){
                    double k = z/0.08;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" dirt dug up to reach!");}
                else if(selectedValue4.toString().equalsIgnoreCase("Mud")){
                    double k = z/0.22;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" mud dug up smelted to reach!");}
                else if(selectedValue4.toString().equalsIgnoreCase("Gravel")){
                    double k = z/0.16;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" gravel dug up smelted to reach!");}
                else if(selectedValue4.toString().equalsIgnoreCase("Soul Sand")){
                    double k = z/0.11;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" soul sand dug up smelted to reach!");}
                else if(selectedValue4.toString().equalsIgnoreCase("Clay")){
                    double k = z/0.28;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" clay dug up smelted to reach!");}

                break;
            case "Farmer" :
                Object[] possibleValues5 = { "All basic crops"  };
                Object selectedValue5 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues5, possibleValues5[0]);
                if(selectedValue5.toString().equalsIgnoreCase("All basic crops")){
                    double k = z/0.22;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" crops farmed to reach!");}
                break;
            case "Fisher" :
                Object[] possibleValues6 = { "Raw Cod", "Raw Salmon", "Pufferfish", "Tropical Fish"  };
                Object selectedValue6 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues6, possibleValues6[0]);
                if(selectedValue6.toString().equalsIgnoreCase("Raw Cod")){
                    double k = z/6.60;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" raw cod fished to reach!");}
                else if(selectedValue6.toString().equalsIgnoreCase("Raw Salmon")){
                    double k = z/16.5;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" raw salmon fished to reach!");}
                else if(selectedValue6.toString().equalsIgnoreCase("Pufferfish")){
                    double k = z/22.0;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" pufferfish fished to reach!");}
                else if(selectedValue6.toString().equalsIgnoreCase("Tropical Fish")){
                    double k = z/33.0;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" tropical fish fished to reach!");}
                break;
            case "Woodcutter" :
                Object[] possibleValues7 = { "Jungle Log", "Cherry Log", "All other logs", "Mangrove Log"  };
                Object selectedValue7 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues7, possibleValues7[0]);
                if(selectedValue7.toString().equalsIgnoreCase("Jungle Log")){
                    double k = z/0.28;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" jungle logs chopped to reach!");}
                else if(selectedValue7.toString().equalsIgnoreCase("Cherry Log")){
                    double k = z/0.44;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" cherry logs chopped to reach!");}
                else if(selectedValue7.toString().equalsIgnoreCase("All other logs")){
                    double k = z/0.33;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" logs chopped to reach!");}
                else if(selectedValue7.toString().equalsIgnoreCase("Mangrove Log")){
                    double k = z/0.55;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" mangrove logs chopped to reach!");}
                break;
            case "Hunter" :
                Object[] possibleValues8 = { "Wither", "Creeper"  };
                Object selectedValue8 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues8, possibleValues8[0]);
                if(selectedValue8.toString().equalsIgnoreCase("Wither")){
                    double k = z/33;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" withers slain to reach!");}
                else if(selectedValue8.toString().equalsIgnoreCase("Creeper")){
                    double k = z/6;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" creepers slain to reach!");}
                break;
            case "Breeder" :
                Object[] possibleValues9 = { "Wolves", "Axolotls"  };
                Object selectedValue9 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues9, possibleValues9[0]);
                if(selectedValue9.toString().equalsIgnoreCase("Wolves")){
                    double k = z/8.80;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" wolves bred to reach!");}
                else if(selectedValue9.toString().equalsIgnoreCase("Axolotls")){
                    double k = z/22.0;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" axolotls bred to reach!");}
                break;
            case "Florist" :
                Object[] possibleValues10 = { "Moss Block", "Mushroom"  };
                Object selectedValue10 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null,
                        possibleValues10, possibleValues10[0]);
                if(selectedValue10.toString().equalsIgnoreCase("Moss Block")){
                    double k = z/0.33;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" moss blocks harvested to reach!");}
                else if(selectedValue10.toString().equalsIgnoreCase("Mushroom")){
                    double k = z/0.275;
                    JOptionPane.showMessageDialog(null, "You require " + Math.round(z) + " exp to reach your target level of " + y + ".\n This would require "+Math.round(k)+" mushrooms harvested to reach!");}
                break;
        }





    }
}