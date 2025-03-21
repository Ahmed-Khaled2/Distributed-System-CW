package IntermediateServer;

import ClientSide.WelcomePage;
import java.io.File;
import java.util.*;
import javax.swing.*;

public class StorePage extends javax.swing.JFrame {

    private MiddleServer MS = new MiddleServer();
    private ArrayList<ProductsIntermediate> ProductList = new ArrayList<>();
    private boolean IsSelected;
    private int SelectedProduct;

    public StorePage() {
    }

    public StorePage(MiddleServer MS, ArrayList<ProductsIntermediate> ProductList) {
        initComponents();
        setLocation(584, 298);
        setSize(640, 480);
        setVisible(true);
        setDefaultCloseOperation(StorePage.EXIT_ON_CLOSE);
        this.MS = MS;
        this.ProductList = ProductList;
        BuildStorePage();
    }

    public void BuildStorePage() {
        
        ShirtText.setText(ProductList.get(0).getProductName());
        ShirtPrice.setText("Price: " + ProductList.get(0).getProductPrice());
        ShirtStock.setText("In Stock: " + ProductList.get(0).getProductStockLevel() + "");
        ShirtImage.setIcon(new ImageIcon(ProductList.get(0).getProductImage()));

        HatText.setText(ProductList.get(1).getProductName());
        HatPrice.setText("Price: " + ProductList.get(1).getProductPrice());
        HatStock.setText("In Stock: " + ProductList.get(1).getProductStockLevel() + "");
        HatImage.setIcon(new ImageIcon(ProductList.get(1).getProductImage()));

        ShoeText.setText(ProductList.get(2).getProductName());
        ShoePrice.setText("Price: " + ProductList.get(2).getProductPrice());
        ShoeStock.setText("In Stock: " + ProductList.get(2).getProductStockLevel() + "");
        ShoeImage.setIcon(new ImageIcon(ProductList.get(2).getProductImage()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        ShoeText = new javax.swing.JLabel();
        ShirtText = new javax.swing.JLabel();
        HatText = new javax.swing.JLabel();
        HatImage = new javax.swing.JLabel();
        ShoeImage = new javax.swing.JLabel();
        ShirtImage = new javax.swing.JLabel();
        HatStock = new javax.swing.JLabel();
        ShirtStock = new javax.swing.JLabel();
        ShoeStock = new javax.swing.JLabel();
        Selected = new javax.swing.JLabel();
        ShirtPrice = new javax.swing.JLabel();
        ShoePrice = new javax.swing.JLabel();
        ContinueButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        HatPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        Title.setText("Halem Store");
        Title.setAlignmentY(0.0F);

        ShoeText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShoeText.setText("Fancy Shoe");

        ShirtText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShirtText.setText("Cool Shirt");

        HatText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HatText.setText("Stylish Hat");

        HatImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\gosta\\Documents\\NetBeansProjects\\DistributedProject\\src\\main\\java\\icons\\Hat.jpg")); // NOI18N
        HatImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HatImageMouseClicked(evt);
            }
        });

        ShoeImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\gosta\\Documents\\NetBeansProjects\\DistributedProject\\src\\main\\java\\icons\\Shoe.jpg")); // NOI18N
        ShoeImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShoeImageMouseClicked(evt);
            }
        });

        ShirtImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\gosta\\Documents\\NetBeansProjects\\DistributedProject\\src\\main\\java\\icons\\TShirt.jpg")); // NOI18N
        ShirtImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShirtImageMouseClicked(evt);
            }
        });

        HatStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HatStock.setText("Stock: 5");

        ShirtStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShirtStock.setText("Stock: 5");

        ShoeStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShoeStock.setText("Stock: 5");

        Selected.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Selected.setText("Selected: Nothing");

        ShirtPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShirtPrice.setText("Price: $100");

        ShoePrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ShoePrice.setText("Price: $120");

        ContinueButton.setText("Continue");
        ContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        HatPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HatPrice.setText("Price: $50");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShirtImage)
                    .addComponent(ShirtText)
                    .addComponent(ShirtStock)
                    .addComponent(ShirtPrice)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(HatText)
                                .addComponent(HatStock)
                                .addComponent(HatImage, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Title))
                            .addComponent(HatPrice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShoeImage)
                            .addComponent(ShoeText)
                            .addComponent(ShoeStock)
                            .addComponent(ShoePrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Selected, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Title)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HatImage)
                    .addComponent(ShirtImage)
                    .addComponent(ShoeImage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShirtText)
                            .addComponent(ShoeText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShirtStock)
                            .addComponent(ShoeStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShirtPrice)
                            .addComponent(ShoePrice)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HatText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HatStock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HatPrice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selected))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueButtonActionPerformed
        if (IsSelected) {
            if (ProductList.get(SelectedProduct).getProductStockLevel() >= 1) {
                ProductList.get(SelectedProduct).setProductStockLevel(ProductList.get(SelectedProduct).getProductStockLevel() - 1);
                MS.EnterBuyPage();
                ProductPage PP = new ProductPage(this, MS, SelectedProduct, ProductList);
                this.setVisible(false);
                MS.UpdateStorePages();
            } else {
                JOptionPane.showMessageDialog(this, "This product is out of stock, Please check later.", "Input Error", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please, select a product.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ContinueButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        WelcomePage WP = new WelcomePage();
        WP.setVisible(true);
        MS.ExitStorePage();
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void HatImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HatImageMouseClicked
        Selected.setText("Selected: " + ProductList.get(1).getProductName());
        IsSelected = true;
        SelectedProduct = 1;
    }//GEN-LAST:event_HatImageMouseClicked

    private void ShoeImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoeImageMouseClicked
        Selected.setText("Selected: " + ProductList.get(2).getProductName());
        IsSelected = true;
        SelectedProduct = 2;
    }//GEN-LAST:event_ShoeImageMouseClicked

    private void ShirtImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShirtImageMouseClicked
        Selected.setText("Selected: " + ProductList.get(0).getProductName());
        IsSelected = true;
        SelectedProduct = 0;
    }//GEN-LAST:event_ShirtImageMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ContinueButton;
    private javax.swing.JLabel HatImage;
    private javax.swing.JLabel HatPrice;
    private javax.swing.JLabel HatStock;
    private javax.swing.JLabel HatText;
    private javax.swing.JLabel Selected;
    private javax.swing.JLabel ShirtImage;
    private javax.swing.JLabel ShirtPrice;
    private javax.swing.JLabel ShirtStock;
    private javax.swing.JLabel ShirtText;
    private javax.swing.JLabel ShoeImage;
    private javax.swing.JLabel ShoePrice;
    private javax.swing.JLabel ShoeStock;
    private javax.swing.JLabel ShoeText;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
