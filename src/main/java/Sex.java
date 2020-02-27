public class Sex {
    private int gender;
    private int length;

    public Sex(int gender, int length){
        this.gender = gender;
        this.length = length;
    }
    public int getGender(){
        return this.gender;
    }
    public int getLength(){
        return this.length;
    }
    public void setLength(int setLength){
        if (setLength>100){
            this.length = setLength;
        }else {
            this.length = -1;
        }
    }
    public void setGender(int setGender){
        if (setGender == 1 || setGender == 0){
            this.gender = setGender;
        }else {
            this.gender = -1;
        }
    }
}
