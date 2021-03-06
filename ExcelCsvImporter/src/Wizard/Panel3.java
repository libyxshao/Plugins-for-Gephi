/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Wizard;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static Wizard.Panel2.firstConnector;
import static Wizard.Panel2.secondConnector;

/**
 *
 * @author C. Levallois
 */
public class Panel3 extends javax.swing.JPanel {

    public static String firstConnectorDelimiter;
    public static String secondConnectorDelimiter;

    public Panel3() {
        initComponents();
        jListDelimiterFirstAgent.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (((JList) e.getSource()).getSelectedValue() != null) {
                    firstConnectorDelimiter = (String) ((JList) e.getSource()).getSelectedValue();
                }
            }
        });
        jListDelimiterSecondAgent.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (((JList) e.getSource()).getSelectedValue() != null) {
                    secondConnectorDelimiter = (String) ((JList) e.getSource()).getSelectedValue();
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFirstConnectedAgent = new javax.swing.JLabel();
        jLabelSecondConnectedAgent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelSecondAgentAlso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDelimiterFirstAgent = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListDelimiterSecondAgent = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabelFirstConnectedAgent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabelFirstConnectedAgent, org.openide.util.NbBundle.getMessage(Panel3.class, "Panel3.jLabelFirstConnectedAgent.text")); // NOI18N

        jLabelSecondConnectedAgent.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabelSecondConnectedAgent, org.openide.util.NbBundle.getMessage(Panel3.class, "Panel3.jLabelSecondConnectedAgent.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Panel3.class, "Panel3.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabelSecondAgentAlso, org.openide.util.NbBundle.getMessage(Panel3.class, "Panel3.jLabelSecondAgentAlso.text")); // NOI18N

        jListDelimiterFirstAgent.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "comma", "semicolon", "tab", "space", "|", "-", "_" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListDelimiterFirstAgent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListDelimiterFirstAgent);

        jListDelimiterSecondAgent.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "comma", "semicolon", "tab", "space", "|", "-", "_" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListDelimiterSecondAgent.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jListDelimiterSecondAgent);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(org.openide.util.NbBundle.getMessage(Panel3.class, "Panel3.jTextArea1.text")); // NOI18N
        jTextArea1.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabelFirstConnectedAgent)
                            .addComponent(jLabelSecondAgentAlso)
                            .addComponent(jLabelSecondConnectedAgent))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFirstConnectedAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabelSecondConnectedAgent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelSecondAgentAlso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JList getjListDelimiterFirstAgent() {
        return jListDelimiterFirstAgent;
    }

    public JList getjListDelimiterSecondAgent() {
        return jListDelimiterSecondAgent;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabelFirstConnectedAgent;
    public javax.swing.JLabel jLabelSecondAgentAlso;
    public javax.swing.JLabel jLabelSecondConnectedAgent;
    private javax.swing.JList jListDelimiterFirstAgent;
    private javax.swing.JList jListDelimiterSecondAgent;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getName() {
        return "Subfields in agents";   //this will be the title of the panel in the wizard
    }


}
