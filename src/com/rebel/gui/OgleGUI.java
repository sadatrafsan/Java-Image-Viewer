package com.rebel.gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class CustomFilter extends javax.swing.filechooser.FileFilter {

    @Override
    public boolean accept(File file){
    
        return file.isDirectory() || 
               file.getAbsolutePath().endsWith(".jpg") ||
               file.getAbsolutePath().endsWith(".png") ||
               file.getAbsolutePath().endsWith(".gif") ||
               file.getAbsolutePath().endsWith(".bmp") ||
               file.getAbsolutePath().endsWith(".tiff");
    }
    
    @Override
    public String getDescription(){
    
        return "*.jpg, png, gif, bmp, tiff";
    }
}


public class OgleGUI extends javax.swing.JFrame {
    
    private File file;
    private File path;
    private BufferedImage image;
    private String filename,ext;
    private int width,height;

    public OgleGUI() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/com/rebel/icon/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        imageLabel = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openItem = new javax.swing.JMenuItem();
        clearItem = new javax.swing.JMenuItem();
        deleteItem = new javax.swing.JMenuItem();
        jSeparator = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        effectMenu = new javax.swing.JMenu();
        grayscaleItem = new javax.swing.JMenuItem();
        sepiaItem = new javax.swing.JMenuItem();
        rgbSeparator = new javax.swing.JPopupMenu.Separator();
        redItem = new javax.swing.JMenuItem();
        greenItem = new javax.swing.JMenuItem();
        blueItem = new javax.swing.JMenuItem();
        negativeSeparator = new javax.swing.JPopupMenu.Separator();
        negativeItem = new javax.swing.JMenuItem();

        fileChooser.setCurrentDirectory(new java.io.File("C:\\"));
            fileChooser.setDialogTitle("Open File");
            fileChooser.setFileFilter(new CustomFilter());

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Ogle Image Viewer");

            scrollPane.setBorder(null);

            fileMenu.setText("File");

            openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
            openItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/open.png"))); // NOI18N
            openItem.setText("Open");
            openItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    openItemActionPerformed(evt);
                }
            });
            fileMenu.add(openItem);

            clearItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
            clearItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/clear.png"))); // NOI18N
            clearItem.setText("Clear");
            clearItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    clearItemActionPerformed(evt);
                }
            });
            fileMenu.add(clearItem);

            deleteItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
            deleteItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/delete.png"))); // NOI18N
            deleteItem.setText("Delete");
            deleteItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    deleteItemActionPerformed(evt);
                }
            });
            fileMenu.add(deleteItem);
            fileMenu.add(jSeparator);

            exitItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
            exitItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/exit.png"))); // NOI18N
            exitItem.setText("Exit");
            exitItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitItemActionPerformed(evt);
                }
            });
            fileMenu.add(exitItem);

            menuBar.add(fileMenu);

            effectMenu.setText("Effect");

            grayscaleItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/grayscale.png"))); // NOI18N
            grayscaleItem.setText("Grayscale");
            grayscaleItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    grayscaleItemActionPerformed(evt);
                }
            });
            effectMenu.add(grayscaleItem);

            sepiaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/sepia.png"))); // NOI18N
            sepiaItem.setText("Sepia");
            sepiaItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    sepiaItemActionPerformed(evt);
                }
            });
            effectMenu.add(sepiaItem);
            effectMenu.add(rgbSeparator);

            redItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/red.png"))); // NOI18N
            redItem.setText("Red");
            redItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    redItemActionPerformed(evt);
                }
            });
            effectMenu.add(redItem);

            greenItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/green.png"))); // NOI18N
            greenItem.setText("Green");
            greenItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    greenItemActionPerformed(evt);
                }
            });
            effectMenu.add(greenItem);

            blueItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/blue.png"))); // NOI18N
            blueItem.setText("Blue");
            blueItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    blueItemActionPerformed(evt);
                }
            });
            effectMenu.add(blueItem);
            effectMenu.add(negativeSeparator);

            negativeItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/rebel/icon/negative.png"))); // NOI18N
            negativeItem.setText("Negative");
            negativeItem.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    negativeItemActionPerformed(evt);
                }
            });
            effectMenu.add(negativeItem);

            menuBar.add(effectMenu);

            setJMenuBar(menuBar);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed

        if(fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            
            file = fileChooser.getSelectedFile();
            path = fileChooser.getCurrentDirectory();
            filename = fileChooser.getSelectedFile().getName();
            String t = filename.substring(filename.lastIndexOf('.'),filename.length());
            ext = t.substring(1,t.length());
            filename = filename.substring(0, filename.lastIndexOf("."));
            
            setView(file);
        }
    }//GEN-LAST:event_openItemActionPerformed

    private void clearItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearItemActionPerformed
        
        imageLabel.setIcon(null);
    }//GEN-LAST:event_clearItemActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        
        Object [] options = {"Delete it!","Cancel"};
        int i = JOptionPane.showOptionDialog(null, "Are you sure?", 
                "Question",JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
        
        if(i==0){
        
            if(file.delete()){
                imageLabel.setIcon(null);
                JOptionPane.showMessageDialog(null,"File Deleted!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error!","File could not be Deleted!", JOptionPane.ERROR_MESSAGE);
            }   
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_exitItemActionPerformed

    private void imageInfo(){
    
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            Logger.getLogger(OgleGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        width = image.getWidth();
        height = image.getHeight();
    }
    
    private void renderImage(String format){
    
        File f = new File(path + "\\" + filename + format);
        
        try {
            ImageIO.write(image, ext, f);
        } catch (IOException ex) {
            Logger.getLogger(OgleGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setView(f);
    }
    
    private void grayscaleItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grayscaleItemActionPerformed
        
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int red = (pixel >> 16) & 0xFF;
                int green = (pixel >> 24) & 0xFF;
                int blue = pixel & 0xFF;
                
                int average = (red + green + blue) / 3;
                
                pixel = (alpha << 24) | (average << 16) | (average << 8) | average;
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-grayscale." + ext);
    }//GEN-LAST:event_grayscaleItemActionPerformed

    private void sepiaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sepiaItemActionPerformed
        
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int red = (pixel >> 16) & 0xFF;
                int green = (pixel >> 8) & 0xFF;
                int blue = pixel & 0xFF;
                
                int tr = (int) (0.393*red + 0.769*green + 0.189*blue);
                int tg = (int) (0.349*red + 0.686*green + 0.168*blue);
                int tb = (int) (0.272*red + 0.534*green + 0.131*blue);
                
                red = (tr > 255) ? 255 : tr;
                green = (tg > 255) ? 255 : tg;
                blue = (tb > 255) ? 255 : tb;
                
                pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-sepia." + ext);
    }//GEN-LAST:event_sepiaItemActionPerformed

    private void redItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redItemActionPerformed
    
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int red = (pixel >> 16) & 0xFF;
                
                pixel = (alpha << 24) | (red << 16);
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-red." + ext);
    }//GEN-LAST:event_redItemActionPerformed

    private void greenItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenItemActionPerformed
    
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int green = (pixel >> 8) & 0xFF;
                
                pixel = (alpha << 24) | (green << 8);
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-green." + ext);
    }//GEN-LAST:event_greenItemActionPerformed

    private void blueItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueItemActionPerformed
        
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int blue = pixel & 0xFF;
                
                pixel = (alpha << 24) | blue;
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-blue." + ext);
    }//GEN-LAST:event_blueItemActionPerformed

    private void negativeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negativeItemActionPerformed
    
        imageInfo();
        
        for(int y=0; y<height; y++){
            for(int x=0; x<width; x++){
                int pixel = image.getRGB(x, y);
                
                int alpha = (pixel >> 24) & 0xFF;
                int red = (pixel >> 16) & 0xFF;
                int green = (pixel >> 8) & 0xFF;
                int blue = pixel & 0xFF;
                
                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;
                
                pixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
                image.setRGB(x,y,pixel);
            }
        }
        
        renderImage("-negative." + ext);
    }//GEN-LAST:event_negativeItemActionPerformed

    private void setView(File object){
        
        imageLabel.setIcon(new ImageIcon(object.toString()));
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        scrollPane.getViewport().add(imageLabel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem blueItem;
    private javax.swing.JMenuItem clearItem;
    private javax.swing.JMenuItem deleteItem;
    private javax.swing.JMenu effectMenu;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem grayscaleItem;
    private javax.swing.JMenuItem greenItem;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPopupMenu.Separator jSeparator;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem negativeItem;
    private javax.swing.JPopupMenu.Separator negativeSeparator;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JMenuItem redItem;
    private javax.swing.JPopupMenu.Separator rgbSeparator;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JMenuItem sepiaItem;
    // End of variables declaration//GEN-END:variables
}
