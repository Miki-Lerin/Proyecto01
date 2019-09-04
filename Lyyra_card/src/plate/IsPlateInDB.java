package plate;

public class IsPlateInDB {
	
	   public static boolean isPlateInDB(Plate plate, PlateDB db) {
		   
	         // Check for empty array 
			 // _____________________________  
			    if (db.arraySize() == 0) {
			       System.out.println("No existe ningun plato en el ArrayList");	
				   return true;
			    }
			    
			    for( Plate dbPlate : db.getArray()) {
			      if (plate.getPlate().equals(dbPlate.getPlate())) {
					    return false;		    	  
			      }
	            }
			    
			    return true;
	   }
	   
	   
	   public static boolean isPlateInDB(String plate, PlateDB db) {
	
		   for (int i=0; i < db.arraySize(); i++) {
		 		  
 		   if (db.getPlate(i).getPlate().contentEquals(plate))
 			   return true;
	 		  }
		   return false;
	   }
}
