public class Autobus
{
    private String kennzeichen;
    private int sitzplaetze;
    private boolean anhaenger;
    
    public String getKennzeichen()
    {return kennzeichen;
    }
    
    public int getSitzplaetze()
    {return sitzplaetze;
    }
    
    public boolean getAnhaenger()
    {return anhaenger;
    }
    
    public void setKennzeichen(String newKennzeichen)
    {kennzeichen = newKennzeichen;
    }
    
    public void setSitzplaetze(int newSitzplaetze)
    {sitzplaetze = newSitzplaetze;
    }
    
    public void setAnhaenger(boolean newAnhaenger)
    {anhaenger = newAnhaenger;
    }
    
    public Autobus(String newKennzeichen, int newSitzplaetze, boolean newAnhaenger)
    {setKennzeichen(newKennzeichen);
     setSitzplaetze(newSitzplaetze);
     setAnhaenger(newAnhaenger);
    }
    
    public Autobus()
    {setKennzeichen("W-1234A");
     setSitzplaetze(29);
     setAnhaenger(false);
    }
    
        
    
}