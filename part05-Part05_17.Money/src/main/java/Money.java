
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int totalEuros = this.euros + addition.euros;
        int totalCents = this.cents + addition.cents;

        if (totalCents >= 100) {
            totalEuros += totalCents / 100;
            totalCents = totalCents % 100;

        }
        Money newMoney = new Money(totalEuros, totalCents);

        return newMoney;
    }

    public Money minus( Money decreaser){
    int totalCents = this.euros * 100 + this.cents;
    int totalDecreaser = decreaser.euros * 100 + decreaser.cents;
     
    int difference = totalCents - totalDecreaser;
    
    if(difference < 0){return new Money(0,0);}
    
    int resultEuros = difference / 100;
    int resultCents = difference % 100;
    
    
    
   Money newMoney = new Money(resultEuros,resultCents);
    
    return newMoney;
    
    }
    
    
    
    
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public boolean lessThan(Money compared) {

        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

  
    
}
