import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TongHieuTichThuong_QuocBao {

    
    public static void main(String[] args) {
       
    Frame fr = new Frame("Bai1 AWT") ;
        fr.setBounds(100, 100, 160, 300);
        FlowLayout lay = new FlowLayout();
        //GridLayout lay = new GridLayout(4,2);
        fr.setLayout(lay);
        
        //tạo đk hộp văn bản
        la = new Label("A= ");
        fr.add(la);
        txta = new TextField(10);                
        fr.add(txta);
        lb = new Label("B= ");
        fr.add(lb);
        txtb = new TextField(10);
        fr.add(txtb);
        //Tổng
//        Panel p = new Panel();
//        p.setLayout(new fr);
//        p.add(btTong);
//        p.add(btHieu);
//        p.add(btTich);
//        p.add(btThuong);
        btTong = new Button("+");
        btTong.addActionListener(new LangNgheCongTong());
        fr.add(btTong);
        //Hiệu
        btHieu = new Button("-");
        btHieu.addActionListener(new LangNgheCongHieu());
        fr.add(btHieu);
        //Tích
        btTich = new Button("*");
        btTich.addActionListener(new LangNgheCongTich());
        fr.add(btTich);
        //Thương
        btThuong = new Button("/");
        btThuong.addActionListener(new LangNgheCongThuong());
        fr.add(btThuong);
        kq = new Label("KQ= ");
        fr.add(kq);
        txtkq = new TextField(10);
        fr.add(txtkq);
        btDong = new Button("Đóng");
        btDong.addActionListener(new LangNgheCongDong());
        fr.add(btDong);
        fr.setVisible(true); 
         
    }
    public static class LangNgheCongTong  implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {           
           int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Tong = a+b;          
           txtkq.setText(String.valueOf(Tong));
       }
    }
    public static class LangNgheCongHieu  implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {           
           int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Hieu = a-b;          
           txtkq.setText(String.valueOf(Hieu));
       }
    }
    public static class LangNgheCongTich  implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {           
           int a = Integer.parseInt(txta.getText());           
           int b = Integer.parseInt(txtb.getText());           
           int Tich = a*b;          
           txtkq.setText(String.valueOf(Tich));
       }
    }
    public static class LangNgheCongThuong  implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {           
           float a = Float.parseFloat(txta.getText());           
           float b = Float.parseFloat(txtb.getText());             
           float Thuong = a/b;     
           if(a==0)
           {txtkq.setText("Không thực hiện được phép chia!");    }
           else{
           txtkq.setText(String.valueOf(Thuong));
           }
    }
    }
    public static class LangNgheCongDong  implements ActionListener {
           @Override
           public void actionPerformed(ActionEvent e) {           
            System.exit(0);
            }
    }
    static Label la, lb, kq;
    static TextField txta, txtb, txtkq;
    static Button btTong,btHieu,btTich,btThuong,btDong; 
    //xây dựng lớp nội (bộ lắng nghe) xử lý các sự kiện cửa sổ
    
}
