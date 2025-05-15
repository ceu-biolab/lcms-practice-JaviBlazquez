package lipid;

import java.util.Objects;

public class Lipid {
    private final int compoundId;
    private final String name;
    private final String formula;
    private final String lipidType; // !! OPTIONAL TODO -> TRANSFORM INTO AN ENUMERATION
    private final int carbonCount;
    private final int doubleBondsCount;


    /**
     * @param compoundId
     * @param name
     * @param formula
     * @param lipidType
     * @param carbonCount
     * @param doubleBondCount
     */
    public Lipid(int compoundId, String name, String formula, String lipidType, int carbonCount, int doubleBondCount) {
        this.compoundId = compoundId;
        this.name = name;
        this.formula = formula;
        this.lipidType = lipidType;
        this.carbonCount = carbonCount;
        this.doubleBondsCount = doubleBondCount;
    }

    public int getCompoundId() {
        return compoundId;
    }

    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public String getLipidType() {
        return this.lipidType;
    }

    // TODO: Asigno valor numérico para poder COMPARAR los tipos en la RULE
    //PG < PE < PI < PA < PS << PC.
    public int getTypePriority() {
        if(this.lipidType.equalsIgnoreCase("PG")) {
            return 1;
        }
        else if(this.lipidType.equalsIgnoreCase("PE")) {
            return 2;
        }
        else if(this.lipidType.equalsIgnoreCase("PI")) {
            return 3;
        }
        else if(this.lipidType.equalsIgnoreCase("PA")) {
            return 4;
        }
        else if(this.lipidType.equalsIgnoreCase("PS")) {
            return 5;
        }
        else if(this.lipidType.equalsIgnoreCase("PC")) {
            return 6;
        }
        else {
            return 1000;
        }
    }


    public int getCarbonCount() {
        return carbonCount;
    }

    public int getDoubleBondsCount() {
        return doubleBondsCount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lipid)) return false;
        Lipid lipid = (Lipid) o;
        return compoundId == lipid.compoundId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(compoundId);
    }

    @Override
    public String toString() {
        return "Lipid{" +
                "compoundId=" + compoundId +
                ", name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                ", lipidType='" + lipidType + '\'' +
                ", carbonCount=" + carbonCount +
                ", doubleBondCount=" + doubleBondsCount +
                '}';
    }
}
