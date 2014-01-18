package com.fox.util;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;

/**
 *
 * @author Dvr
 */
public class CadCli extends javax.swing.JApplet {

    @Override
    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCpfCnpj = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboxUf = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFone = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Solicitação de licença");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fox/icones/logo.png"))); // NOI18N

        jLabel3.setText("Empresa:");

        txtNome.setDocument(new FixedLengthDocument(100));

        jLabel4.setText("CPF/CNPJ:");

        txtCpfCnpj.setDocument(new FixedLengthDocument(14));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("* Somente números");

        jLabel6.setText("Endereço:");

        txtEnd.setDocument(new FixedLengthDocument(100));

        jLabel7.setText("Bairro:");

        txtBairro.setDocument(new FixedLengthDocument(45));

        txtCidade.setDocument(new FixedLengthDocument(45));

        jLabel8.setText("Cidade:");

        jLabel9.setText("UF:");

        cboxUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        cboxUf.setSelectedIndex(25);

        jLabel10.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setText("Fone:");

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel12.setText("e-mail:");

        txtEmail.setDocument(new FixedLengthDocument(100));

        jLabel13.setText("Contato:");

        txtContato.setDocument(new FixedLengthDocument(45));

        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/fox/icones/mail-icon.png"))); // NOI18N
        btnEnviar.setText("Enviar solicitação");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cboxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtContato, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                    .addComponent(txtEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEnviar)
                                .addGap(0, 372, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 316, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(34, 34, 34))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBairro, txtCidade});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
    String nome = txtNome.getText().trim().toUpperCase();
    String cpfCnpj = txtCpfCnpj.getText().trim();
    boolean vCpfCnpj = false;

    if (cpfCnpj.length() == 11) {
        try {
            cpfCnpj = new CPFFormatter().format(cpfCnpj);
            new CPFValidator().assertValid(cpfCnpj);
            vCpfCnpj = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "CPF Inválido");
            vCpfCnpj = false;
        }
    } else {
        if (cpfCnpj.length() == 14) {
            try {
                cpfCnpj = new CNPJFormatter().format(cpfCnpj);
                new CNPJValidator().assertValid(cpfCnpj);
                vCpfCnpj = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "CNPJ Inválido");
                vCpfCnpj = false;
            }
        }
    }

    String end = txtEnd.getText().trim().toUpperCase();
    String bairro = txtBairro.getText().trim().toUpperCase();
    String cid = txtCidade.getText().trim().toUpperCase();
    String uf = cboxUf.getSelectedItem().toString();

    String cep = "";
    try {
        cep = txtCep.getValue().toString();
    } catch (NullPointerException e) {
        cep = "00000-000";
    }

    String fone = "";
    try {
        fone = txtFone.getValue().toString();
    } catch (NullPointerException e) {
    }

    String contato = txtContato.getText().trim().toUpperCase();
    String email = txtEmail.getText().trim();

    Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@([\\w-]+\\.)+[a-zA-Z]{2,7}$");
    Matcher m = p.matcher(email);
    boolean matchFound = m.matches();

    if (nome.length() < 5) {
        JOptionPane.showMessageDialog(this, "Digite o nome da sua empresa");
    } else {
        if (end.length() < 3) {
            JOptionPane.showMessageDialog(this, "Digite seu endereço");
        } else {
            if (bairro.length() < 3) {
                JOptionPane.showMessageDialog(this, "Digite o nome do bairro");
            } else {
                if (cid.length() < 3) {
                    JOptionPane.showMessageDialog(this, "Digite o nome da cidade");
                } else {
                    if (fone.length() == 0) {
                        JOptionPane.showMessageDialog(this, "Digite um telefone para contato");
                    } else {
                        if (!matchFound) {
                            JOptionPane.showMessageDialog(this, "Digite seu email");
                        } else {
                            if (!vCpfCnpj) {
                                JOptionPane.showMessageDialog(this, "Digite o CPF/CNPJ");
                            } else {
                                //Capturando Mac address 
                                try {
                                    InetAddress address = InetAddress.getLocalHost();
                                    NetworkInterface ni = NetworkInterface.getByInetAddress(address);
                                    byte[] mac = ni.getHardwareAddress();
                                    StringBuilder sbMac = new StringBuilder();

                                    for (int i = 0; i < mac.length; i++) {
                                        sbMac.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
                                    }

                                    MailJava mj = new MailJava();
                                    mj.setTypeTextMail(MailJava.TYPE_TEXT_HTML);
                                    //mj.setSmtpHostMail("smtp.live.com");
                                    //mj.setSmtpPortMail("25");
                                    //mj.setSmtpAuth("true");
                                    //mj.setSmtpStarttls("true");
                                    //mj.setUserMail("felipek9999@hotmail.com");
                                    //mj.setPassMail("admin1015skate!");
                                    

                                    mj.setSmtpHostMail("mail.grupofox.com.br");
                                    mj.setSmtpPortMail("25");
                                    mj.setSmtpAuth("true");
                                    mj.setSmtpStarttls("false");
                                    mj.setUserMail("licenca@grupofox.com.br");
                                    mj.setPassMail("lic2325");                                    
                                    
                                    mj.setSubjectMail("Solicitação de licença");

                                    mj.setBodyMail(
                                            "<html> "
                                            + "MAC Address: " + sbMac   + "<br />"
                                            + "Cliente:     " + nome    + "<br />"
                                            + "CPF/CNPJ:    " + cpfCnpj + "<br />"
                                            + "Endereco:    " + end     + "<br />"
                                            + "Bairro:      " + bairro  + "<br />"
                                            + "Cidade:      " + cid     + "<br />"
                                            + "CEP:         " + cep     + "<br />"
                                            + "UF:          " + uf      + "<br />"
                                            + "Fone:        " + fone    + "<br />"
                                            + "Contato:     " + contato + "<br />"
                                            + "Email:       " + email   + "<br />"
                                            + "</html>");

                                    HashMap<String, String> listDest = new HashMap<String, String>();
                                    listDest.put("foxseg@grupofox.com.br", "grupofox");

                                    mj.setToMailsUsers(listDest);

                                    MailJavaSender sender = new MailJavaSender();
                                    sender.senderMail(mj);

                                    JOptionPane.showMessageDialog(this, "Solicitação enviada com sucesso");
                                    stop();
                                    
                                } catch (UnsupportedEncodingException ex) {
                                    Logger.getLogger(CadCli.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (MessagingException ex) {
                                    Logger.getLogger(CadCli.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (UnknownHostException ex) {
                                    Logger.getLogger(CadCli.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SocketException ex) {
                                    Logger.getLogger(CadCli.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}//GEN-LAST:event_btnEnviarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JComboBox cboxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtCpfCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
