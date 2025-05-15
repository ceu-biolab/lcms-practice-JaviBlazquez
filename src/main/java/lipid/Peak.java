package lipid;

// !TODO New attribute name which indicates the name of the peak which you use
//   pass to the function GetMonoIsotopicMass, when creating a new peak, the name of that exact peak
//   should be passed to the constructor
public class Peak implements Comparable<Peak> {

    private final double mz;
    private final double intensity;
    private final String adductName;

    /**
     *
     * @param mz
     * @param intensity
     * @param name
     */
    public Peak(double mz, double intensity,String name) {
        this.mz = mz;
        this.intensity = intensity;
        this.adductName = name;
    }

    public double getMz() {
        return mz;
    }

    public double getIntensity() {
        return intensity;
    }
    public String getAdductName(){ return adductName;}

    @Override
    public String toString() {
        return String.format("Peak(mz=%.4f, intensity=%.2f)", mz, intensity);
    }
    public String Tostring(){
        return "(the name is: )" + adductName;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(mz) * 31;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        else return false;
        // if (!(obj instanceof Peak other)) return false;
       //  return Double.compare(mz, other.mz) == 0;
    }

    @Override
    public int compareTo(Peak other) {
        return Double.compare(this.mz, other.mz);
    }
}