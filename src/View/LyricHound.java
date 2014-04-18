package View;

import Controller.OpenFileDialogHandler;
import Controller.TableCreator;
import Database.DatabaseInsert;
import Database.DatabaseSelect;
import Libraries.FileFilter;
import Libraries.FileHandler;
import Libraries.WebServiceHandler;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;

public class LyricHound extends javax.swing.JFrame implements Runnable {

    Thread MainThread;
    Thread SingleLyricThread;
    Thread MultiLyricThread;
    Thread SingleSaveThread;
    Thread MultiSaveThread;
    JTable MainTable;
    public static File[] files;
    public static Tag[] tags;

    public LyricHound() {
        initComponents();
        Logger.getLogger("org.jaudiotagger").setLevel(Level.OFF);
        statusText.setText("Ready!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        StatusPanel = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        separator1 = new javax.swing.JPopupMenu.Separator();
        ExitMenuItem = new javax.swing.JMenuItem();
        HelpMenu = new javax.swing.JMenu();
        HelpMenuItem = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        AboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LyricHound");
        setResizable(false);

        MainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        jButton1.setText("Search Lyrics for selected Song");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search Lyrics for All Songs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save changes for current Song");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save changes for all Songs");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        StatusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Status"));

        statusText.setText("               ");
        statusText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(statusText, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
            .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StatusPanelLayout.createSequentialGroup()
                .addComponent(statusText, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FileMenu.setText("File");

        OpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenMenuItem.setText("Open File or Folder");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenuItem);

        SaveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveMenuItem.setText("Save changes to disk");
        FileMenu.add(SaveMenuItem);
        FileMenu.add(separator1);

        ExitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(ExitMenuItem);

        MenuBar.add(FileMenu);

        HelpMenu.setText("Help");

        HelpMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        HelpMenuItem.setText("Help");
        HelpMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(HelpMenuItem);
        HelpMenu.add(separator2);

        AboutMenuItem.setText("About");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        HelpMenu.add(AboutMenuItem);

        MenuBar.add(HelpMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(StatusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HelpMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuItemActionPerformed

        String message = "NOTE : Please make sure that your MP3 file tags for Title of the song"
                + " and Artist Name are accurate as this application searches"
                + " Lyrics based on Title of song and Artist Name. You can"
                + " manually edit the tags in this application or download this"
                + " software - MusicBrainz Picard which can be downloaded for"
                + " free here - http://musicbrainz.org/doc/MusicBrainz_Picard\n\n\n"
                + "• Step 1 : Click on File>Open File or Folder and select MP3 file(s) or"
                + " Folders which contain MP3 files.\n\n"
                + "• Step 2 : Check the Title of the song and Artist Name, and edit"
                + " manually if they are wrong, or use MusicBrainz Picard. If you"
                + " edit the tags manually, make sure to click the Save all Files"
                + " button before searching for lyrics.\n\n"
                + "• Step 3 : You can select one song and search for lyrics individually,"
                + " or can search for lyrics of all the songs at once. Due to"
                + " table size limitation, the whole lyrics will not be displayed"
                + " in the table, but you can select the particular song and"
                + " click on Search Lyrics for selected Song to display its lyrics.\n\n"
                + "• Step 4 : After searching for lyrics or editing any field of the table"
                + " make sure that you press the save button to save the data"
                + " permanently to the MP3 file. If you do not press the save"
                + " button, the lyrics which you searched will not be saved.";

        JOptionPane.showMessageDialog(rootPane, message, "Help", JOptionPane.PLAIN_MESSAGE, null);
    }//GEN-LAST:event_HelpMenuItemActionPerformed

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        try {
            startMainThread();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error occured with opening file dialog.", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            startSingleLyricThread();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error occured with finding lyric.", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            startMultiLyricThread();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error occured with finding lyric.", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            startSingleSaveThread();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error occured with saving file.", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            startMultiSaveThread();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error occured with saving file.", "ERROR", JOptionPane.ERROR_MESSAGE, null);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
        String message = "Application Version 1.0\n"
                + "Application made by Akshat Patel\n\n"
                + "If you find any bugs, or if you have any suggestions or problems, mail to akshat@gopikunj.com";

        JOptionPane.showMessageDialog(rootPane, message, "About", JOptionPane.PLAIN_MESSAGE, null);
    }//GEN-LAST:event_AboutMenuItemActionPerformed

    public void startMainThread() throws InterruptedException {
        MainThread = new Thread(this, "MainThread");
        MainThread.start();
    }

    public void startSingleLyricThread() throws InterruptedException {
        SingleLyricThread = new Thread(this, "SingleLyricThread");
        SingleLyricThread.start();
    }

    public void startMultiLyricThread() throws InterruptedException {
        MultiLyricThread = new Thread(this, "MultiLyricThread");
        MultiLyricThread.start();
    }

    public void startSingleSaveThread() throws InterruptedException {
        SingleSaveThread = new Thread(this, "SingleSaveThread");
        SingleSaveThread.start();
    }

    public void startMultiSaveThread() throws InterruptedException {
        MultiSaveThread = new Thread(this, "MultiSaveThread");
        MultiSaveThread.start();
    }


    public void run() {

        if (Thread.currentThread().equals(MainThread)) {
            try {
                statusText.setText("Opening file(s)...");
                JFileChooser filedialog = new JFileChooser();

                filedialog.setFileFilter(new FileFilter());
                filedialog.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                filedialog.setMultiSelectionEnabled(true);
                int condition = filedialog.showOpenDialog(rootPane);

                if (condition == JFileChooser.APPROVE_OPTION) {
                    files = filedialog.getSelectedFiles();
                    Thread.sleep(100);
                    files = OpenFileDialogHandler.getFiles(files);
                    MainTable = TableCreator.getTable(files);
                    ScrollPane.setViewportView(MainTable);
                    Thread.sleep(100);
                }
                statusText.setText("Ready!");
            } catch (Exception e) {

                statusText.setText("Error!!!");
            }
        }

        if (Thread.currentThread().equals(SingleLyricThread)) {
            try {
                WebServiceHandler wsh = new WebServiceHandler();
                FileHandler fp = new FileHandler();

                int row = MainTable.getSelectedRow();
                String temp = (String) MainTable.getValueAt(row, 0);
                String temparr[] = temp.split("> ");
                row = Integer.parseInt(temparr[0]);
                row--;

                statusText.setText("Searching lyrics for " + tags[row].getFirst(FieldKey.TITLE) + "...");

                String mytitle = (String) MainTable.getValueAt(row, 1);
                String myartist = (String) MainTable.getValueAt(row, 2);
                String myalbum = (String) MainTable.getValueAt(row, 3);

                String mylyric = DatabaseSelect.getLyricsForSong(mytitle, myartist, myalbum);
                String lyric = "";

                if (mylyric.equals("")) {
                    lyric = wsh.findLyric(fp.getArtistTitleString(tags[row]));
                    MainTable.getModel().setValueAt(lyric, row, 5);
                } else {
                    MainTable.getModel().setValueAt(mylyric, row, 5);
                }

                statusText.setText("Ready!");

                if (!lyric.equals("")) {
                    new ShowLyric(lyric).setVisible(true);
                } else if (!mylyric.equals("")) {
                    new ShowLyric(mylyric).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Lyric was not found for this song.", "Lyric Not Found", JOptionPane.PLAIN_MESSAGE, null);
                }
                ScrollPane.setViewportView(MainTable);
            } catch (Exception e) {
                System.out.println(e);
                statusText.setText("Error!!!");
            }
        }

        if (Thread.currentThread().equals(MultiLyricThread)) {
            try {
                WebServiceHandler wsh = new WebServiceHandler();
                FileHandler fp = new FileHandler();

                int failcounter = 0;
                for (int row = 0; row < MainTable.getRowCount(); row++) {

                    String mytitle = (String) MainTable.getValueAt(row, 1);
                    String myartist = (String) MainTable.getValueAt(row, 2);
                    String myalbum = (String) MainTable.getValueAt(row, 3);

                    String mylyric = DatabaseSelect.getLyricsForSong(mytitle, myartist, myalbum);
                    String lyric = "";

                    if (mylyric.equals("")) {
                        lyric = wsh.findLyric(fp.getArtistTitleString(tags[row]));
                        MainTable.getModel().setValueAt(lyric, row, 5);
                    } else {
                        MainTable.getModel().setValueAt(mylyric, row, 5);
                    }

                    int perc = (int) ((double) (row + 1) / (double) MainTable.getRowCount() * 100);
                    progressBar.setValue(perc);
                    statusText.setText("Searching lyrics: Song " + (row + 1) + " of " + MainTable.getRowCount() + " (" + perc + "% Done)");

                    if (lyric.equals("")) {
                        failcounter++;
                    }
                    ScrollPane.setViewportView(MainTable);
                }
                int successpercentage = (int) ((double) (MainTable.getRowCount() - failcounter) / (double) MainTable.getRowCount() * 100);
                JOptionPane.showMessageDialog(rootPane, "Lyrics of " + (MainTable.getRowCount() - failcounter) + " songs found.\nLyrics of " + failcounter + " songs not found.\nSuccess percentage → " + successpercentage + "%");
                progressBar.setValue(0);
                statusText.setText("Ready!");

            } catch (Exception e) {

                statusText.setText("Error!!!");
            }
        }

        if (Thread.currentThread().equals(SingleSaveThread)) {
            try {
                FileHandler fp = new FileHandler();
                int row = MainTable.getSelectedRow();

                statusText.setText("Saving file " + tags[row].getFirst(FieldKey.TITLE) + "...");

                tags[row].setField(FieldKey.TITLE, MainTable.getModel().getValueAt(row, 1).toString());
                tags[row].setField(FieldKey.ARTIST, MainTable.getModel().getValueAt(row, 2).toString());
                tags[row].setField(FieldKey.ALBUM, MainTable.getModel().getValueAt(row, 3).toString());
                tags[row].setField(FieldKey.GENRE, MainTable.getModel().getValueAt(row, 4).toString());
                tags[row].setField(FieldKey.LYRICS, MainTable.getModel().getValueAt(row, 5).toString());

                String mytitle = (String) MainTable.getValueAt(row, 1);
                String myartist = (String) MainTable.getValueAt(row, 2);
                String myalbum = (String) MainTable.getValueAt(row, 3);
                String mylyric = (String) MainTable.getValueAt(row, 5);

                DatabaseInsert.insertIntoDatabase(mytitle, myartist, myalbum, mylyric);

                fp.saveTag(files[row], tags[row]);

                statusText.setText("Ready!");

                JOptionPane.showMessageDialog(rootPane, "File " + files[row].getName() + " successfully saved.");
            } catch (Exception e) {

                statusText.setText("Error!!!");
            }
        }

        if (Thread.currentThread().equals(MultiSaveThread)) {
            try {
                FileHandler fp = new FileHandler();

                for (int row = 0; row < MainTable.getRowCount(); row++) {

                    tags[row].setField(FieldKey.TITLE, MainTable.getModel().getValueAt(row, 1).toString());
                    tags[row].setField(FieldKey.ARTIST, MainTable.getModel().getValueAt(row, 2).toString());
                    tags[row].setField(FieldKey.ALBUM, MainTable.getModel().getValueAt(row, 3).toString());
                    tags[row].setField(FieldKey.GENRE, MainTable.getModel().getValueAt(row, 4).toString());
                    tags[row].setField(FieldKey.LYRICS, MainTable.getModel().getValueAt(row, 5).toString());

                    String mytitle = (String) MainTable.getValueAt(row, 1);
                    String myartist = (String) MainTable.getValueAt(row, 2);
                    String myalbum = (String) MainTable.getValueAt(row, 3);
                    String mylyric = (String) MainTable.getValueAt(row, 5);

                    DatabaseInsert.insertIntoDatabase(mytitle, myartist, myalbum, mylyric);

                    fp.saveTag(files[row], tags[row]);

                    int perc = (int) ((double) (row + 1) / (double) MainTable.getRowCount() * 100);
                    progressBar.setValue(perc);
                    statusText.setText("Saving file " + (row + 1) + " of " + MainTable.getRowCount() + " (" + perc + "% Done)");
                }
                statusText.setText("Ready!");
                JOptionPane.showMessageDialog(rootPane, MainTable.getRowCount() + " files successfully saved.");

            } catch (Exception e) {

                statusText.setText("Error!!!");
            }
        }
    }

    public static void main(String args[]) {

        System.setProperty("Quaqua.tabLayoutPolicy", "wrap");

        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel(ch.randelshofer.quaqua.QuaquaManager.getLookAndFeel());
        } catch (Exception e) {
            System.out.println(e);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new LyricHound().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuItem HelpMenuItem;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JProgressBar progressBar;
    private javax.swing.JPopupMenu.Separator separator1;
    private javax.swing.JPopupMenu.Separator separator2;
    public static javax.swing.JLabel statusText;
    // End of variables declaration//GEN-END:variables
}
