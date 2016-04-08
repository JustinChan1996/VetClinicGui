
import java.text.SimpleDateFormat;
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
 * Table model for implementing a Jtable to display all the dosage class of a Pet object
 */
public class DoseTableModel extends AbstractTableModel
{
    /* Define column names */
    final static private int COLUMN_NAME_OF_DRUG = 0;
    final static private int COLUMN_DATE = 1;
    final static private int COLUMN_DOSE = 2;
    
    /* Define table header */
    private final String[] colHeader = {"Name of drug","Date administered","Dosage (mg)"};
    /* Define collection of dose objects */
    private ArrayList<Dose> doses = new ArrayList();
    
    /* Constructor with arguments */
    public DoseTableModel(ArrayList<Dose> doses)
    {
        this.setDoses(doses);
    }
    
    /**
     * Get row count
     * @return number of rows in the table
     */
    public int getRowCount()
    {
        return this.getDoses().size();
    }
    
    /**
     * Get number of columns
     * @return the number of columns in the table
     */
    public int getColumnCount()
    {
        return colHeader.length;
    }
    
    /**
     * Get column name
     * @param ColumnIndex the column position
     * @return name the column header
     */
    public String getColumnName(int ColumnIndex)
    {
        return colHeader[ColumnIndex];
    }
    
    /**
     * Fill table row and column based on attributes of Dose object
     * @param row Row selected
     * @param column Column selected
     * @return the attribute of the object based on the column selected
     */
    public Object getValueAt(int row, int column)
    {
        /* select Dose object based on row */
        Dose dose = this.getDoses().get(row);
        /* Return attribute based on selected row */
        switch (column)
        {
            case 0:
                
                /* return name of drug */
                return dose.getNameOfDrug();
                
            case 1:
                
                /* return date when drug is administered */
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                String date = format.format(dose.getDate());
                return date;
                
            case 2:
                
                /* forrmat decimal output to 2 decimal places */
                /* return drug dosage */
                return dose.getDoseInGrams();
                
                
            default:
                
                return "";
        }
        
    }
    
    /**
     * Method to add the dose object to the table and update the display
     * @param dose The dose object
     */
    public void add(Dose dose)
    {
        this.getDoses().add(dose);
        fireTableStructureChanged();
    }
    
    /**
     * Method to remove the dose object from the table and update the display
     * @param row The row of the dose object
     * @return 
     */
    public Dose remove(int row)
    {
        /* remove dose from collection */
        Dose dose  = getDoses().remove(row);
        fireTableStructureChanged();
        return dose;
    }
    
    
    /**
     * @return the doses
     */
    public ArrayList<Dose> getDoses() {
        return doses;
    }

    /**
     * @param doses the doses to set
     */
    public void setDoses(ArrayList<Dose> doses) {
        this.doses = doses;
    }
    
    
    
}
