package Controller;

import Libraries.FileHandler;
import View.LyricHound;
import java.io.File;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class TableCreator {

    //Method to create metadata table for the given list of files    
    public static JTable getTable(File[] list){
       
        //Parsing input file
        FileHandler fp = new FileHandler();
        
        //Setting the table data
        String[] title = {"Files","Title","Artist","Album","Genre","Lyrics"};
        String[][] data = new String[list.length][title.length];
        
        //Initializing tag array in LyricHound class
        LyricHound.tags = new Tag[list.length];
        
        for(int i=0;i<list.length;i++){
                      
            //Reading the metadata
            LyricHound.tags[i] = fp.getMetaData(list[i]);
            
            //Setting table data
            try{
                data[i][0] = (i+1)+"> "+list[i].getName();
                data[i][1] = LyricHound.tags[i].getFirst(FieldKey.TITLE);
                data[i][2] = LyricHound.tags[i].getFirst(FieldKey.ARTIST);
                data[i][3] = LyricHound.tags[i].getFirst(FieldKey.ALBUM);
                data[i][4] = LyricHound.tags[i].getFirst(FieldKey.GENRE);
                data[i][5] = LyricHound.tags[i].getFirst(FieldKey.LYRICS);
            }catch(Exception e){
                System.out.println("Exception in reading tag with index "+ i);
            }
            
            //Setting status text with percentage done
            int perc = (int) ((double)(i+1)/(double)list.length*100);
            LyricHound.progressBar.setValue(perc);
            LyricHound.statusText.setText("Reading file "+(i+1)+" of "+list.length+" ("+perc+"% Done)");   
        }
        
        //Setting status text
        LyricHound.progressBar.setValue(0);
        LyricHound.statusText.setText("Ready!");
        
        //Table object creation
        JTable maintable = new JTable(data,title);
        
        //Setting column width of the table        
        maintable.getColumnModel().getColumn(0).setPreferredWidth(250);
        maintable.getColumnModel().getColumn(1).setPreferredWidth(220);
        maintable.getColumnModel().getColumn(2).setPreferredWidth(150);
        maintable.getColumnModel().getColumn(3).setPreferredWidth(240);
        maintable.getColumnModel().getColumn(4).setPreferredWidth(90);
        maintable.getColumnModel().getColumn(5).setPreferredWidth(700);
        
        //Setting other properties of the table
        maintable.putClientProperty("Quaqua.Table.style", "striped");
        maintable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        maintable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        maintable.setAutoCreateRowSorter(true);
        maintable.getTableHeader().setReorderingAllowed(false);
        
        //Return table object
        return maintable;
    }
}
