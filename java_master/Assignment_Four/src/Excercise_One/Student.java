
/**
 * Created by Leonardo on 11/15/16.
 */


package Excercise_One;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;


public class Student extends JFrame
{

    JPanel[] p2 = new JPanel[5];

    // form elements
    private final JLabel Name;
    private final JTextField NameBox;

    private final JLabel Address;
    private final JTextField AddressBox;

    private final JLabel Province;
    private final JTextField ProvinceBox;

    private final JLabel City;
    private final JTextField CityBox;

    private final JLabel Postal;
    private final JTextField PostalBox;

    private final JLabel Phone;
    private final JTextField PhoneBox;

    private final JLabel Email;
    private final JTextField EmailBox;



    // output box
    private final JTextField textField1;
    private final JButton plainJButton;

    // checkbox
    private final JCheckBox SC;
    private final JCheckBox VW;

    //radio Buttons
    private JRadioButton Computer;
    private JRadioButton Business;


    //private final JComboBox<String> box; // hold icon names

    private ArrayList<String> selectedCourses = new ArrayList<String>();
    private final JList<String> list;

    private static final String[] names =
            {"Java", "Python",  "C#"};
    private static final String[] names2 =
            {"Finance", "Accounting",  "Marketing"};


    private final BorderLayout layout;

    // set up GUI and event handling
    public Student()
    {
        super("Student");

        layout = new BorderLayout(5, 5); // 5 pixel gaps
        setLayout(layout);

        // initializing JPanel
        for(int i = 0; i < 5; i++){
            p2[i] = new JPanel();
        }


        // initializing the form

        Name = new JLabel("Name:");
        NameBox = new JTextField(10);

        Address = new JLabel("Address:");
        AddressBox = new JTextField(10);

        Province = new JLabel("Province:");
        ProvinceBox = new JTextField(10);

        Postal = new JLabel("Postal:");
        PostalBox = new JTextField(10);

        Phone = new JLabel("Phone:");
        PhoneBox = new JTextField(10);

        Email = new JLabel("Email:");
        EmailBox = new JTextField(10);

        City = new JLabel("Address:");
        CityBox = new JTextField(10);



        // initilize button
        plainJButton = new JButton("Plain Button");

        //initialize checkbox
        SC = new JCheckBox("Student Council");
        VW = new JCheckBox("Volunteer Work");


        //initialize combo box and Jlist

        list = new JList<>();
        list.setVisibleRowCount(10);

        JComboBox<String> Courses = new JComboBox<>(names);
        Courses.setMaximumRowCount(3);
        Courses.setSelectedIndex(-1);
        Courses.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent event)
            {
                if (event.getStateChange() == ItemEvent.SELECTED && !selectedCourses.contains(event.getItem().toString()))
                {
                    selectedCourses.add(event.getItem().toString());
                    list.setListData(selectedCourses.toArray(new String[0]));
                }
            }
        });


        //initialize radiobuttons
        Computer = new JRadioButton("Computer",true);
        Business = new JRadioButton("Business", false);

        // making one selection only
        ButtonGroup group = new ButtonGroup();
        group.add(Computer);
        group.add(Business);



        Computer.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    selectedCourses.clear();
                    //list.setListData(selectedCourses.toArray(new String[0]));
                    list.setListData(new String[0]);
                    Courses.setModel(new DefaultComboBoxModel<>(names));
                    Courses.setSelectedIndex(-1);
                }
            }
        });


        Business.addItemListener(new ItemListener() {

        @Override
        public void itemStateChanged(ItemEvent e)
        {
            if (e.getStateChange() == ItemEvent.SELECTED)
            {
                selectedCourses.clear();
                list.setListData(new String[0]);
                Courses.setModel(new DefaultComboBoxModel<>(names2));
                Courses.setSelectedIndex(-1);
        }
    }
    });


        //initialize output textfield
        textField1 = new JTextField(50);
        textField1.setPreferredSize( new Dimension( 50, 100 ) );



        // Put respective Jpanels into Jframe
        for (int count = 0; count < 5; count++)
        {

            // button in Jpanel
            p2[0].add(plainJButton);

            // create new ButtonHandler for button event handling
            Student.ButtonHandler handler = new Student.ButtonHandler();
            plainJButton.addActionListener(handler);

            //Display Text field
            p2[1].add(textField1);

            //radio button Jpanel container
            p2[2].setLayout(new GridLayout(4,2));
            p2[2].add(Computer);
            p2[2].add(Business);
            p2[2].add(Courses);
            p2[2].add(list);

            //form
            p2[3].setLayout(new GridLayout(7,2));
            p2[3].add(Name);
            p2[3].add(NameBox);
            p2[3].add(Address);
            p2[3].add(AddressBox);
            p2[3].add(Province);
            p2[3].add(ProvinceBox);
            p2[3].add(Postal);
            p2[3].add(PostalBox);
            p2[3].add(City);
            p2[3].add(CityBox);
            p2[3].add(Phone);
            p2[3].add(PhoneBox);
            p2[3].add(Email);
            p2[3].add(EmailBox);


            // checkbox Jpanel container
            p2[4].setLayout(new GridLayout(2,1));
            p2[4].add(SC);
            p2[4].add(VW);


        }

        add(p2[0], BorderLayout.NORTH);
        add(p2[1], BorderLayout.SOUTH);
        add(p2[2], BorderLayout.EAST);
        add(p2[3], BorderLayout.WEST);
        add(p2[4], BorderLayout.CENTER);
    } // end BorderLayoutFrame constructor

    //button click event handling
    private class ButtonHandler implements ActionListener
    {
        // handle button event
        @Override
        public void actionPerformed(ActionEvent event)
        {
            //form output
            String a = NameBox.getText() + "  " + AddressBox.getText() +  "  " + ProvinceBox.getText() +  "  " + PostalBox.getText() +  "  " + CityBox.getText() +  "  " + PhoneBox.getText() +  "  " + EmailBox.getText();

            //right list output
            String b = Computer.isSelected() ? " Computer" : " Business";
            for (String c : selectedCourses)
            {
                b += "  " + c;
            }

            //store value from checkbox
            String sc = " ";
            String vw = " ";


            // for check boxes
            if (SC.isSelected()) {
                sc = "  Student Council";
            }

            if (VW.isSelected()) {
                vw = "  Volunteer Work";
            }

            //final output
            textField1.setText(a + b + sc + vw);


        }

    }


}





