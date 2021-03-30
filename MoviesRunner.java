import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;

public class MoviesRunner extends JFrame implements ActionListener {
	
	JButton eight, nine, two, add, back, menu, seeAll, submit;
	JButton action, comedy, crime, drama, fantasy, history, romance, scifi, thriller;
	JLabel eltit, htgnel, raey, erneg, seen;
	static JTextField titl, gen, year, leng;
	boolean eght, nne, tw;
	static boolean sumbit;
	static JTextArea textArea;
	static JPanel contentPane = new JPanel();
	Color c = new Color(255, 0, 0, 100);
	CardLayout cardLayout = new CardLayout();
	static ArrayList<Movie> movies = new ArrayList<Movie>();
	static JFrame fr = new JFrame("Movie Database");
	static JPanel open, list, edit, genre = new JPanel();

	public MoviesRunner() {
		
		eight = new JButton("80's");
		nine = new JButton("90's");
		two = new JButton("00's");
		add = new JButton("add movie");
		back = new JButton("back");
		menu = new JButton("menu");
		seeAll = new JButton("see all");
		action = new JButton("action");
		comedy = new JButton("comedy");
		crime = new JButton("crime");
		drama = new JButton("drama");
		fantasy = new JButton("fantasy");
		history = new JButton("historical");
		romance = new JButton("romance");
		scifi = new JButton("sci-fi");
		thriller = new JButton("thriller");
		submit = new JButton("submit");

		textArea = new JTextArea();   
        textArea.setRows(20);   textArea.setColumns(30);
        textArea.setText("print here");
        textArea.setVisible(true);
        textArea.setBackground(Color.orange);
		
		eight.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.next(contentPane);
				eght = true;
			}
		});
		
		nine.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.next(contentPane);
				nne = true;
			}
		});
		
		two.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.next(contentPane);
				tw = true;
			}
		});
		
		add.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "add movie");
			}
		});
		
		back.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.previous(contentPane);
			}
		});
		
		menu.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.first(contentPane);
			}
		});
		
		seeAll.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printDecade(8);
				}
				else if (nne == true) {
					printDecade(9);
				}
				else if (tw == true) {
					printDecade(0);
				}
			}
		});
		
		action.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("action", 8);
				}
				else if (nne == true) {
					printGenre("action", 9);
				}
				else if (tw == true) {
					printGenre("action", 0);
				}
			}
		});
		
		comedy.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("comedy", 8);
				}
				else if (nne == true) {
					printGenre("comedy", 9);
				}
				else if (tw == true) {
					printGenre("comedy", 0);
				}
			}
		});
		
		crime.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("crime", 8);
				}
				else if (nne == true) {
					printGenre("crime", 9);
				}
				else if (tw == true) {
					printGenre("crime", 0);
				}
			}
		});
		
		drama.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("drama", 8);
				}
				else if (nne == true) {
					printGenre("drama", 9);
				}
				else if (tw == true) {
					printGenre("drama", 0);
				}
			}
		});
		
		fantasy.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("fantasy", 8);
				}
				else if (nne == true) {
					printGenre("fantasy", 9);
				}
				else if (tw == true) {
					printGenre("fantasy", 0);
				}
			}
		});
		
		history.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("historical", 8);
				}
				else if (nne == true) {
					printGenre("historical", 9);
				}
				else if (tw == true) {
					printGenre("historical", 0);
				}
			}
		});
		
		romance.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("romance", 8);
				}
				else if (nne == true) {
					printGenre("romance", 9);
				}
				else if (tw == true) {
					printGenre("romance", 0);
				}
			}
		});
		
		scifi.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("sci-fi", 8);
				}
				else if (nne == true) {
					printGenre("sci-fi", 9);
				}
				else if (tw == true) {
					printGenre("sci-fi", 0);
				}
			}
		});
		
		thriller.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.show(contentPane, "List");
				
				if (eght == true) {
					printGenre("thriller", 8);
				}
				else if (nne == true) {
					printGenre("thriller", 9);
				}
				else if (tw == true) {
					printGenre("thriller", 0);
				}
			}
		});
		
		submit.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cardLayout2 = (CardLayout) contentPane.getLayout();
				cardLayout2.first(contentPane);
				sumbit = true;
			}
		});
		
		displayGUI();
	}
    
    public static void main(String[] args) {
    	
    	ArrayList<String> titles = new ArrayList<String>();
		ArrayList<Integer> years = new ArrayList<Integer>();
		ArrayList<String> genres = new ArrayList<String>();
		ArrayList<Boolean> watched = new ArrayList<Boolean>();
		ArrayList<Integer> lengths = new ArrayList<Integer>();
		
		connectAndFill(titles, years, genres, watched, lengths);
		
		// put values into the movies array list
		for (int i = 0; i < watched.size(); i++) {
			Movie mov = new Movie();
			mov.setGenre( genres.get(i) );
			mov.setLength( lengths.get(i) );
			mov.setTitle( titles.get(i) );
			mov.setWatched( watched.get(i) );
			mov.setYear( years.get(i) );
			movies.add(mov);
		}
		
		MoviesRunner run = new MoviesRunner();
		saveMovie(titl, gen, year, leng);
	}
	
    public void actionPerformed(ActionEvent e) {}
    
    private static boolean checkAddedMovie(String title) {
    	boolean boo = false;
    	for (int i = 0; i < movies.size(); i++) {
    		String check = movies.get(i).getTitle();
    		if (check.equals(title)) {
    			boo = true;
    		}
    	}
    	return boo;
    }
	
	// connects to the database, fills all the array lists, closes the connection
	private static void connectAndFill(ArrayList<String> titles, ArrayList<Integer> years, ArrayList<String> genres,
			ArrayList<Boolean> watched, ArrayList<Integer> lengths) {
		
		String url = "jdbc:mysql://localhost:3306/world";
		String username = "root";
		String password = "Schooldaze1!";
		Connection con = null;
		
		try {
			//connecting to database  
			con = DriverManager.getConnection(url, username, password);
		      
		} catch (SQLException ex) {
		        throw new Error("Error ", ex);
		  }
		
		try {
		    // get result set containing all data from the database
			Statement statement = con.createStatement();
			ResultSet results = statement.executeQuery("select * from movies");
			
			while (results.next()) {
				
				// get data from the current row
				// fill all array lists
				String ttl = results.getString("title");
				titles.add(ttl);
				
				int yr = results.getInt("year");
				years.add(yr);
				
				String gnr = results.getString("genre");
				genres.add(gnr);
				
				boolean wtchd = results.getBoolean("watched");
				watched.add(wtchd);
				
				int mins = results.getInt("length");
				lengths.add(mins);
			}	
		} catch (SQLException e) {
			throw new Error("Error ", e);
		}
		
		try {
			if (con != null) {
				con.close();
		    }
		}
		catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}

	// creates JButton with text, gives it dimensions and color, adds it to a JPanel, adds an ActionListener
	private static void createButton(JButton b, String name, int x, int y, int wid, int height, Color col, JPanel pan) {
	    
	    b.setName(name);
	    b.setBounds(x, y, wid, height);
	    b.setBackground(col);
	    pan.add(b);
	}
	
	// creates JTextField
	private static void createTextField(JTextField tf, String text, int col, JPanel pan, int x, int y) {
		tf = new JTextField(text, col);
		pan.add(tf);
		tf.setLocation(x, y);
	}
	
	// displays the GUI
	private void displayGUI() {
		
		contentPane.setBorder( BorderFactory.createEmptyBorder(5, 5, 5, 5) );
		contentPane.setLayout( new CardLayout() );
		
		open = new JPanel(); open.setBackground(Color.gray);
		// filling the 'open' panel'
		createButton(eight, "80's", 20, 40, 80, 30, Color.green, open);
		createButton(nine, "90's", 50, 40, 80, 30, Color.cyan, open);
		createButton(two, "00's", 80, 40, 80, 30, Color.magenta, open);
		createButton(add, "add movie", 45, 200, 100, 30, Color.white, open);
		contentPane.add(open, "Movies Database");
		
		genre = new JPanel(); genre.setBackground(Color.orange);
		// filling the 'genre' panel'
		createButton(action, "action", 10, 20, 80, 30, Color.green, genre);
	    createButton(comedy, "comedy", 10, 30, 80, 30, Color.yellow, genre);
	    createButton(crime, "crime", 10, 40, 80, 30, Color.red, genre);
	    createButton(drama, "drama", 30, 20, 80, 30, Color.lightGray, genre);
	    createButton(fantasy, "fantasy", 30, 30, 80, 30, Color.pink, genre);
	    createButton(history, "history", 30, 40, 80, 30, Color.orange, genre);
	    createButton(romance, "romance", 50, 20, 80, 30, Color.magenta, genre);
	    createButton(scifi, "sci-fi", 50, 30, 80, 30, Color.cyan, genre);
	    createButton(thriller, "thriller", 50, 40, 80, 30, Color.white, genre);
	    createButton(seeAll, "see all", 20, 80, 80, 30, c, genre);
	    contentPane.add(genre, "Genre");
	    
	    list = new JPanel(); list.setBackground(Color.red);
	    list.setLayout( new FlowLayout() );
	    textArea.setLocation(50, 50);
	    list.add(textArea);
	    // filling the 'list' panel'
	    createButton(back, "back", 80, 20, 80, 30, c, list);
	    contentPane.add(list, "List");
	    
	    edit = new JPanel(); edit.setBackground(Color.gray);
		// filling the 'edit' panel'
		createButton(menu, "menu", 10, 20, 80, 30, Color.cyan, edit);
		createTextField(titl, "title: no apostrophes", 15, edit, 30, 20);
		createTextField(year, "year: last 2 digits", 15, edit, 50, 40);
		createTextField(gen, "genre: space b/t each", 15, edit, 70, 60);
		createTextField(leng, "length in minutes", 15, edit, 90, 80);
		createButton(submit, "submit", 100, 20, 80, 30, Color.green, edit);
		contentPane.add(edit, "add movie");
	    
	    fr.setContentPane(contentPane);
	    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    fr.setPreferredSize( new Dimension(400, 500) );
	    fr.pack();
	    fr.setLocationByPlatform(true); //makes window appear at default location
	    fr.setVisible(true);
	}
	
	// returns the first digit of an integer
	private static int firstDigit(int num) {
			
		if (num <= 10) {
			return 0;
		}
		else {
			while (num >= 10)
				num /= 10;
			return num;
		}
	}
	
	// converts all the movies with a certain decade to a String
	private static void printDecade(int dec) {
		String movi = "";
		for (int i = 0; i < movies.size(); i++) {
			int yr = movies.get(i).getYear();
			
			if (firstDigit(yr) == dec) {
				if (i == 0)
					movi = toString( movies.get(i) );
				else
					movi += "\n" + toString( movies.get(i) );
			}
		}
		textArea.setText(" ");
		textArea.setText(movi);
	}
	
	// converts all the movies with a certain genre and decade to a String
	private static void printGenre(String g, int dec) {
		String movi = "";
		for (int i = 0; i < movies.size(); i++) {
			String gnr = movies.get(i).getGenre();
			int yr = movies.get(i).getYear();
			
			if (gnr.contains(g) && firstDigit(yr) == dec) {
				if (i == 0)
					movi = toString( movies.get(i) );
				else
					movi += "\n" + toString( movies.get(i) );
			}
		}
		textArea.setText(" ");
		textArea.setText(movi);
		
	}
	
	// rewrote the toString method so that it will make sense to humans
	private static String toString(Movie mov) {
		
		if (mov.getWatched() == false) {
			
			return mov.getTitle() + " || " + mov.getYear() + " || " + mov.getGenre() + " || " + mov.getLength() + " minutes"
					+ " || " + "seen: no \n";
		}
		else {
			return mov.getTitle() + " | " + mov.getYear() + " || " + mov.getGenre() + " || " + mov.getLength() + " minutes"
					+ " || " + "seen: yes \n";
		}
	}
	
	// puts values from text fields into movies (both the array list & table from database)
	private static void saveMovie(JTextField t, JTextField y, JTextField g, JTextField l) {
		
		if (sumbit == true) {
			String url = "jdbc:mysql://localhost:3306/world";
			String username = "root";
			String password = "Schooldaze1!";
			String title, genre = "";
			int year, length = 0;
			Connection con = null;
			
			title = t.getText();
			genre = g.getText();
			year = Integer.parseInt(y.getText());
			length = Integer.parseInt(l.getText());
			
			if (checkAddedMovie(title) == false) {
				Movie m = new Movie(title, year, genre, false, length);
				movies.add(m);
			}
			else {
				System.out.println("Error: movie already exists");
			}
			
			try {
				con = DriverManager.getConnection(url, username, password);
				Statement statement = con.createStatement();
				statement.executeQuery("insert into movies\r\n"
						+ "(title, year, genre, watched, length)\r\n" + 
						" values ('" + title + "', " + year + ", '" + genre + "', false, " + length +  ");\r\n" );
				con.close();
				t.setText("Movie added!");
			}
			catch (SQLException e) {
				throw new Error("Error ", e);
			}
		}
	}
}