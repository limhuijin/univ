import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class Text extends JFrame 
{
	private MyActionListener listener = new MyActionListener();
	
    String[][] buttonName = {
    		{"", "월", "화", "수", "목", "금"},
    		{"9시", "", "", "", "", ""},
    		{"10시", "", "", "", "", ""},
    		{"11시", "", "", "", "", ""},
    		{"12시", "", "", "", "", ""},
    		{"1시", "", "", "", "", ""},
    		{"2시", "", "", "", "", ""},
    		{"3시", "", "", "", "", ""},
    		{"4시", "", "", "", "", ""},
    		{"5시", "", "", "", "", ""},
    		{"6시", "", "", "", "", ""}
    };
   
    String[] LabelName = {"강의명", "강의실", "교수이름"};    
    String[][] saveStr = {{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""},
				    		{"", "", ""}};
    
    String[] resetStr = {"", "", ""}; 
    
    String[] A_week = {"","images/MON.png", "images/TUE.png", "images/WEN.png", "images/THU.png", "images/FRI.png"};
    
    String[] bookmark = {"images/bookmark1.png","images/bookmark2.png","images/bookmark3.png","images/bookmark4.png","images/bookmark5.png",
    					"images/bookmark6.png","images/bookmark7.png","images/bookmark8.png","images/bookmark9.png","images/bookmark10.png"};
    String[] color = {"images/color1.png", "images/color2.png", "images/color3.png", "images/color4.png", "images/color5.png",
    		 			"images/color6.png", "images/color7.png", "images/color8.png", "images/color9.png", "images/color10.png"}; 
    
    
    JButton[][] button = new JButton[10][6];
    JButton[] countButton = new JButton[10];
    JButton resetButton = new JButton("책갈피 초기화");
    JButton TimetableResetButton = new JButton("시간표 초기화");
    JButton removeButton = new JButton("삭제");
    
    
    JLabel []ClassName = new JLabel[5];
    JTextField []ClassNameInput = new JTextField[5];
    
    int classSum = 0;
    int countNum = 0;
    String now_color = "images/color1.png";
    
    
    // 아이콘 생성
    //ImageIcon POST = new ImageIcon("images/POST.png");
    // 생성자 인수 → 현재클래스명.class.getResource("/패키지명/이미지폴더명/이미지파일명")
    // ※ 이미지파일명은 반드시 확장자까지 같이 적어줄 것
    
    Text() 
    {
        setTitle("test");
        setSize(1640, 865);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
        int buttonWidth = 180;
        int buttonHeight = 70;
        int xMargin = 5;
        int yMargin = 5;

        //버튼 관련 생성
        TimetableResetButton.setBounds(1125, 50, 140, 50);
        add(TimetableResetButton);
        TimetableResetButton.addActionListener(listener);
        TimetableResetButton.setFont(new Font("Batang", Font.BOLD, 14)); // 폰트, 스타일, 크기
        
        removeButton.setBounds(1125, 105, 80, 50);
        add(removeButton);
        removeButton.addActionListener(listener);
        removeButton.setFont(new Font("Batang", Font.BOLD, 14)); // 폰트, 스타일, 크기
        
        resetButton.setBounds(1425, 50, 140, 50);
        add(resetButton);
        resetButton.addActionListener(listener);
        
        
        //"강의명", "강의실", "교수이름"
        for(int i = 0; i < 3; i++) 
        {
        	ClassName[i] = new JLabel(LabelName[i]);
        	ClassName[i].setBounds(1205, i * 100 + 150, 100, 50);
        	add(ClassName[i]);
        	
        	ClassNameInput[i] = new JTextField("");
        	ClassNameInput[i].setBounds(1305, i * 100 + 150, 200, 50);
        	add(ClassNameInput[i]);
        }
        
        //"강의명", "강의실", "교수이름"
        //의 대한 정보를 각각의 번호에 저장가능하게 해줌
        //책갈피
        for(int i = 0; i < 10; i++) 
        {
        	countButton[i] = new JButton("" + (i+1));
        	countButton[i].setBorder(null);	//버튼 테두리 없애줌
        	
        	countButton[i].setBounds(1510, (i*50)+150, 90, 35);
        	countButton[i].setIcon(new ImageIcon(bookmark[i]));
        	
        	countButton[i].setFont(new Font("Arial", Font.BOLD, 16)); // 폰트, 스타일, 크기
        	countButton[i].setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
        	
        	add(countButton[i]);
            countButton[i].addActionListener(listener);
        }
        
        //시간표 쪽 생성
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
            	button[i][j] = new JButton(buttonName[i][j]);
            	button[i][j].setBackground(Color.WHITE);
            	button[i][j].setBounds(j * (buttonWidth + xMargin), i * (buttonHeight + yMargin)+72, buttonWidth, buttonHeight);
            	button[i][j].setBorder(null);
                
            	if(i == 0)
            	{
            		button[i][j].setIcon(new ImageIcon(A_week[j]));
            	}
            	
            	else if(i>= 1 && j >= 1)
            	{
            		// 아이콘(이미지) 설정
            		button[i][j].setIcon(new ImageIcon("images/base_color.png"));
            	}
            	else if (j == 0 )
            	{
            		button[i][j].setFont(new Font("Batang", Font.BOLD, 24)); // 폰트, 스타일, 크기
            	}
            	
            	add(button[i][j]);
                button[i][j].addActionListener(listener);
            }
        }
        
        //로고 설정
        button[0][0].setIcon(new ImageIcon("images/mokwon.png"));
        button[0][0].setBounds(28, 0, 124, 145);
        
        //시간표 타이틀 설정
        JLabel title = new JLabel("시간표");
        title.setIcon(new ImageIcon("images/title.png"));
        title.setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
        title.setBounds(185, 0, 900, 65);
        title.setFont(new Font("Batang", Font.BOLD, 40)); // 폰트, 스타일, 크기
        add(title);
        
    }
    
    //시간표 부분 초기화
  	public void timetableReset()
  	{
  		//베이스 포스트잇으로 초기화
  		for (int i = 1; i < 10; i++) 
        {
            for (int j = 1; j < 6; j++) 
            {
            	// 아이콘(이미지) 설정
            	button[i][j].setIcon(new ImageIcon("images/base_color.png"));
            }
        }
  		
  		//포스트잇 수업내용 초기화
  		for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
            		button[i][j].setText(buttonName[i][j]);
            }
        }
  	}
    
    class MyActionListener implements ActionListener 
    {
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == removeButton) 
			{ 
				for(int i = 0; i < 3; i++) 
				{
					ClassNameInput[i].setText(resetStr[i]);
					now_color = "images/base_color.png";
				}
			}

			
			//시간표 부분 초기화
			if(e.getSource() == TimetableResetButton) 
			{
				timetableReset();
			}
			
			//"강의명", "강의실", "교수이름", "학점(숫자만 입력)", "이번 학기 학점" 의 정보 초기화
			if(e.getSource() == resetButton) 
			{
				for(int i = 0; i < 3; i++) 
				{
					ClassNameInput[i].setText(resetStr[i]);
				}
			}
			
			//책갈피 
			for(int i = 0; i < 10; i++) 
			{
				if (e.getSource() == countButton[i]) 
				{
					for(int q = 0; q < 3; q++) 
					{
						saveStr[countNum][q] = ClassNameInput[q].getText();
					}
					
					now_color = color[i];
					
					countNum = i;
					
					for(int j = 0; j < 3; j++)
					{
						ClassNameInput[j].setText(saveStr[i][j]);
					}
					break;
				}
			}
			
			// 입력란에 적은 상태 일 때 시간표에 정보 제공
			for (int i = 0; i < 10; i++) 
			{
				for (int j = 0; j < 6; j++) 
				{
					if (e.getSource() == button[i][j]) 
					{
						//내부 텍스트 표기
						if (i != 0 && j != 0) //포스트잇 부분인 경우
						{
							for(int q = 0; q < 3; q++) 
							{
								saveStr[countNum][q] = ClassNameInput[q].getText();
							}
							String str = "<HTML>" + saveStr[countNum][0] + "<br>" + saveStr[countNum][1] + "<br>" + saveStr[countNum][2] + "</HTML>";					
							
							
							button[i][j].setHorizontalTextPosition(JButton.CENTER); // 텍스트 가운데
							
							
							button[i][j].setText(str);
							button[i][j].setIcon(new ImageIcon(now_color));
							
							break;
						}
					}
				}
			}
			
			
			
		}
	}
}

public class Ex_test 
{
	
	
    public static void main(String[] args) 
    {
        new Text();
    }
}
