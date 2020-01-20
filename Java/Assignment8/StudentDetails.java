
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;


public class StudentDetails extends JFrame 
{
	private JTextField idTextField, nameTextField, emailidTextField;
	private JButton addStudent;
	private JLabel id, name, gender;
	private Font font;
	private JRadioButton genderFemale;
	private JRadioButton genderMale;
	private JTable studentsTable;
	private JLabel emailid;
	Students studsObject;
	
	
	public static void main(String[] args) 
	{

		Students studs = new Students();
		StudentDetails student = new StudentDetails(studs);
		student.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public StudentDetails(Students students)
	{
		studsObject = students;
		setTitle("Student Portal");
		createComponents();
		setLayout();
		addComponents(students);
		addBehaviors();
		display();
	}

	class OperationListener implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == addStudent) 
			{
				String gender = null;
				if(genderFemale.isSelected())
					gender = "Female";
				else if(genderMale.isSelected())
					gender = "Male";
				Student s = new Student(idTextField.getText(), nameTextField.getText(), gender, emailidTextField.getText());
				studsObject.addStudent(s);
				studentsTable.updateUI();

			}

			idTextField.setText("");
			nameTextField.setText("");
			emailidTextField.setText("");
		}
	}

	private void addBehaviors() 
	{		
		OperationListener ol = new OperationListener();
		addStudent.addActionListener(ol);
	}

	private void display() 
	{
		setSize(400, 400);
		setVisible(true);
	}

	private void addComponents(Students students) 
	{
		Container c = getContentPane();
		JPanel panel = new JPanel();
		panel.add(id);
		panel.add(idTextField);
		c.add(panel);
		
		panel = new JPanel();
		panel.add(name);
		panel.add(nameTextField);
		c.add(panel);
		
		JPanel p = new JPanel();
		p.add(gender);
		p.add(genderFemale);
		p.add(genderMale);
		c.add(p);
		
		p = new JPanel();
		p.add(emailid);
		p.add(emailidTextField);
		c.add(p);
		
		p = new JPanel();
		p.add(addStudent);		
		c.add(p);
		
		StudentsTableModel model = new StudentsTableModel(students);
		studentsTable = new JTable(model);
		
		JScrollPane jsp = new JScrollPane(studentsTable);
		Container con = getContentPane();
		con.add(jsp);
		setVisible(true);
	}

	private void setLayout() 
	{
		Container c = this.getContentPane();
		BoxLayout gl = new BoxLayout(c,BoxLayout.Y_AXIS);
		c.setLayout(gl);
	}

	private void createComponents() 
	{
		font = new Font("TimesRoman", Font.BOLD, 21);
		idTextField = new JTextField(10);
		idTextField.setFont(font);
		nameTextField = new JTextField(10);
		nameTextField.setFont(font);
		addStudent = new JButton("ADD");
		addStudent.setFont(font);
		id = new JLabel("Student ID");
		id.setFont(font);
		name = new JLabel("First Name");
		name.setFont(font);
		gender = new JLabel("Gender");
		gender.setFont(font);
		genderFemale = new JRadioButton("Female");
		genderFemale.setFont(font);
		genderMale = new JRadioButton("Male");
		genderMale.setFont(font);
		emailid = new JLabel("Email ID");
		emailid.setFont(font);
		emailidTextField = new JTextField(10);
		emailidTextField.setFont(font);
	}
}
class Student 
{
	String id;
	String name;
	String gender ;
	String email;
	public Student(String id, String name, String gender, String email) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
}


class Students 
{
	private Collection<Student> students = new ArrayList<Student>();
	public Collection<Student> getStudents() {
		return students;
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public int getNumberOfStudents() {
		return getStudents().size();
	}
}



class StudentsTableModel implements TableModel 
{
	private Students students;
	public StudentsTableModel(Students students) {
		this.students = students;
	}
	@Override
	public int getRowCount() {
		return students.getNumberOfStudents();
	}
	@Override
	public int getColumnCount() {
		return 4;
	}
	@Override
	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "ID";
		}
		if (columnIndex == 1) {
			return "NAME";
		}
		if (columnIndex == 2)
			return "GENDER";
		if (columnIndex == 3)
			return "Email ID";
		return null;
	}
	
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Collection<Student> s = students.getStudents();
		int row = -1;
		for (Student student : s) {
			row++;
			if (row == rowIndex) {
				if (columnIndex == 0) {
					return student.id + "";
				}
				if (columnIndex == 1) {
					return student.name;
				}
				if (columnIndex == 2) {
					return student.gender;
				}
				if (columnIndex == 3) {
					return student.email;
				}
			}
		}
		return null;
	}
	
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
	}
	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
	}
	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
	}
}