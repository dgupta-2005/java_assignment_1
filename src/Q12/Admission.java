package Q12;

class Admission{
    private
    float P,C,M;
    public void setData(float p,float c,float m){
        this.P=p;
        this.C=c;
        this.M=m;
    }
    void checkMarks(){
        if(P>=50 && C>=40 && M>=60 && P+C+M>=200 && P+M>=150){
            System.out.println("Eligible for Admission.");
            System.out.println("Percentage of the student : "+((P+C+M)*100)/300+"%");
        }
        else{
            System.out.print("Not eligible for Admission");
        }
    }
}