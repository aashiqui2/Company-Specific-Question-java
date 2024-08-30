public class FindNoWheel {
    public static void main(String[] args) {
        int V = 200;
        int W = 540;
        int Tw=((V*4)-W)/2;
        System.out.println(Tw);
        System.out.println(V-Tw);

    }

}

/*
An automobile company manufactures both a two-wheeler (TW) and a four-wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:1st data, Total number of vehicles (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.

Input :
 200  -> Value of V
 540  -> Value of W
Output :
TW =130
 FW=70

 */