
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 * Table model for implementing a Jtable display of pet objects from the collection in the VetClinic class
 */

public class VetClinicTableModel extends AbstractTableModel 
{
    /* Define column headers position */
    final static private int COLUMN_PET_ID = 0;
    final static private int COLUMN_NAME = 1;
    final static private int COLUMN_TYPE = 2;
    final static private int COLUMN_BREED = 3;
    final static private int COLUMN_ALLERGY = 4;
    final static private int COLUMN_WEIGHT = 5;
    final static private int COLUMN_DATE_OF_BIRTH = 6;
    final static private int COLUMN_ACCUMULATED_DOSE = 7;
    
    /* Define column header names */
    private final String[] colHeader = {"Pet Id","Name","Pet type","Breed","Allergy","Weight(kg)","Date of birth","Accumulated Dose(mg)"};
    /* Define collection of pets */
    private ArrayList<Pet> pets = new ArrayList();
    
    /* constructor */
    public VetClinicTableModel(VetClinic clinic)
    {
        setClinic(clinic);
    }
    
   /**
    * Get row count
    * @return number of rows in the table
    */
    public int getRowCount()
    {
        return getClinic().size();
    }
    
    /**
     * Get number of columns
     * @return number of columns in the table
     */
    public int getColumnCount()
    {
        return colHeader.length;
    }
    
    /**
     * Get name of column header
     * @param columnIndex
     * @return column header
     */
    public String getColumnName(int columnIndex)
    {
        return colHeader[columnIndex];
    }
    
    
    /**
     * Fill table row and column based on the attributes of the Pet object
     * @param row Row selected
     * @param column Column selected
     * @return the attribute of the object based on the column selected
     */
    public Object getValueAt(int row, int column)
    {
        /* Select pet object based on row */
        Pet pet = this.getClinic().get(row);
        /* Return attribute based on selected row */
        switch (column)
        {
            case 0:
                
                /* return pet Id */
                return pet.getPetID();
                
            case 1:
                
                /* return name of the pet */
                return pet.getName();

            case 2:

                /* return runtime class of the pet object */
                if(pet instanceof Dog)
                {
                    return "Dog";
                }
                else
                {
                    return "Cat";
                }
 
            case 3:
      
                /* return breed of dog if pet is a dog */
                if(pet instanceof Dog)
                {
                    return ((Dog) pet).getBreed();
                }
                else
                {
                    return "n/a";
                }
       
            case 4:
           
                /* return allergy status if pet is cat */
                if(pet instanceof Cat)
                {
                    return ((Cat) pet).isAllergic();
                }
                else
                {
                    return "n/a";
                }

            
            case 5:
            
                /* return pet weight */
                return pet.getWeight();
            
            case 6:
            
                /* return date of birth of pet */
                return pet.getDob();
           
            case 7:
           
                /* return accumulated dose of pet */
                return pet.getAccumulatedDose();
            
            default:
           
                return "";       
          
        }
    }
    

    /**
     * @return the pets
     */
    public ArrayList<Pet> getClinic() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setClinic(VetClinic clinic) {
        this.pets = clinic.getPets();
    }
    
    /**
     * Method to return the class of the attribute based on the column position in the table
     * @param columnindex column index
     * @return the class of the attribute
     */
    public Class<?> getColumnClass(int columnindex)
    {
        if (getClinic().isEmpty()) 
        {
            return Object.class;
        }
        return getValueAt(0, columnindex).getClass();
    }
    
    /**
     * Method to add a Pet object to the array and update the display
     * @param pet The pet object
     */
    public void add(Pet pet)
    {
        getClinic().add(pet);
        fireTableDataChanged();
    }
    
    /**
     * Method to remove a pet object from the array based on the table row and update the display
     * @param row row of the pet object
     * @return the pet object to be deleted
     */
    public Pet remove(int row)
    {
        /* remove pet from collection */
        Pet pet = getClinic().remove(row);
        fireTableDataChanged();
        return pet;
    }
}
