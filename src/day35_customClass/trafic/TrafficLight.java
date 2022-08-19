package day35_customClass.trafic;

public class TrafficLight {



        String color;
        public TrafficLight(String inputColor){
            boolean isValid = inputColor.equals("red")
                || inputColor.equalsIgnoreCase("yellow")|| inputColor.equalsIgnoreCase("green");
                if(isValid){
                    color = inputColor;
                }
            }

        }



