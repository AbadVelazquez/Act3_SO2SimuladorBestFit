public class Instruction 
{
  public String inst;
  public long addr;

  public Instruction( String inst, long addr ) 
  {
    this.inst = inst;
    this.addr = addr;
  } 	


  //////===========================================//////////
  //Metodo agregado
  public String toString(){
    return(inst+" "+addr);
  }
}
