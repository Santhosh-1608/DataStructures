package POTD;
//You are given a perimeter & the area. Your task is to return the maximum volume that can be made in the form of a cuboid from the given perimeter and surface area.
// Note: Round off to 2 decimal places and for the given parameters, it is guaranteed that an answer always exists.
public class CuboidVolume {
    static double maxVolume(double p, double a) {
        // code here
        double length = (p-Math.sqrt(p*p-a*24))/12;
        double height = p/4-2*length;
        double volume = length*length*height;
        return volume;
    }
    public static void main(String[] args) {
        System.out.println(maxVolume(22, 15));
    }
}
