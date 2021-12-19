public class Parent {
    private String firstName;
    private String lestName;
    private String[] children;

    public Parent(String firstName, String lestName) {
        this.firstName = firstName;
        this.lestName = lestName;
        this.children = new String[0];
    }

    public String toString() {
        String output = "Full name: " + this.firstName
                + " " + this.lestName;
        //  "\n Children:";
        if (this.children.length > 0) {
            output += "" +
                    "\nChildren: ";
            for (int i = 0; i < this.children.length; i++) {
                output += this.children[i] + ", ";
            }
        } else {
            output += "\nNo children";
        }
        return output;
    }

    public String getFullName() {
        String fullName = "Full name is " + this.firstName + " " + this.lestName;
        return fullName;
    }

    public int getNumberOfChildren() {
        int numberOfChildren = this.children.length;
        return numberOfChildren;
    }

    public int numberOfChildren() {
        int numberOfChildren = this.children.length;
        return numberOfChildren;
    }

    public boolean childrenExists(String nameToCheck) {
        boolean exists = false;
        for (int i = 0; i < this.children.length; i++) {
            if (this.children[i].equals(nameToCheck)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public boolean addChild(String nameToAdd) {
        boolean exists = this.childrenExists(nameToAdd);
        if (!exists) {
            int currentTotalChildren = this.numberOfChildren();
            String[] newChildrenArray = new String[currentTotalChildren + 1];
            for (int i = 0; i < currentTotalChildren; i++) {
                newChildrenArray[i] = this.children[i];
            }
            newChildrenArray[currentTotalChildren] = nameToAdd;
            this.children = newChildrenArray;
        }
        return exists;
    }

    public boolean hasJunior() {
        boolean junior = false;
        for (int i = 0; i < this.children.length; i++) {
            if (this.children[i].equals(this.firstName)) {
                junior = true;
            }
        }
        return junior;
    }

    public float calculateTaxCredits() {
        float taxCredits = this.numberOfChildren() * Main.TAX_CREDIT_VALUE;
        return taxCredits;
    }
}
