package com.example.simple4calc;
import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calc extends Activity implements View.OnClickListener{
	
	Button bksp,one,addsub,inverse,decimal,mod,root,ce, two, three, four, five, six, seven, eight, nine, zero, add, sub, mul, div, cancel, equal;
	EditText disp;
	double op1;
double op2;
	String op3;
	String optr;
	int k=0;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.calc);
        addsub=(Button) findViewById(R.id.addsub);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        decimal=(Button) findViewById(R.id.decimal);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        cancel = (Button) findViewById(R.id.C);
        equal = (Button) findViewById(R.id.equal);
        bksp=(Button) findViewById(R.id.Bk);
        disp = (EditText) findViewById(R.id.display);
        inverse=(Button) findViewById(R.id.inverse);
        mod=(Button) findViewById(R.id.mod);
        root=(Button) findViewById(R.id.root);
        ce=(Button)findViewById(R.id.ce);
        try{
        	one.setOnClickListener(this);
        	ce.setOnClickListener(this);
        	bksp.setOnClickListener(this);
        	two.setOnClickListener(this);
        	root.setOnClickListener(this);
        	three.setOnClickListener(this);
        	addsub.setOnClickListener(this);
        	four.setOnClickListener(this);
        	decimal.setOnClickListener(this);
        	five.setOnClickListener(this);
        	
        	six.setOnClickListener(this);
        	
        	seven.setOnClickListener(this);
        	
        	eight.setOnClickListener(this);
        	
        	nine.setOnClickListener(this);
        	
        	zero.setOnClickListener(this);
        	
        	cancel.setOnClickListener(this);
        	
        	add.setOnClickListener(this);
  
        	sub.setOnClickListener(this);
        	mod.setOnClickListener(this);
        	mul.setOnClickListener(this);
        	inverse.setOnClickListener(this);
        	div.setOnClickListener(this);
       equal.setOnClickListener(this);
        	Log.w("myapp","zzzzzzzzzzzzzzzzzzzzz");
        }
        catch(Exception e){
        	
        }
    }
	public void operation(){
		if(k!=1)
		{
		if(optr.equals("+")){
			op2 = Double.parseDouble(disp.getText().toString());
            k=1;
			op1 = op1 + op2;
			disp.setText(op1+"");
		
		}
		else if(optr.equals("-")){
			op2 =Double.parseDouble(disp.getText().toString());
			k=1;
			op1 = op1 - op2;
			disp.setText("" +op1);
		}
		else if(optr.equals("%")){
			op2 = Double.parseDouble(disp.getText().toString());
			k=1;
			op1 = op1 % op2;
			disp.setText(""+ op1);
		}
		else if(optr.equals("*")){
			op2 = Double.parseDouble(disp.getText().toString());
			k=1;
			op1 = op1 * op2;
			disp.setText(""+ op1);
		}
		else if(optr.equals("/")){
			op2 = Double.parseDouble(disp.getText().toString());
			k=1;
			op1 = op1 / op2;
			disp.setText(""+ op1);
		}}
	}
	@Override
	public void onClick(View arg0) {
		Editable str =  disp.getText();
		switch(arg0.getId()){
			case R.id.one:
				if(op2 != 0){
					op2 = 0;
					
					
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(one.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(one.getText());
				}
			break;
			case R.id.decimal:
				if(op2 != 0){
					op2 = 0;
					
					
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(decimal.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(decimal.getText());
				}
			break;
			case R.id.addsub:
				str=disp.getText();
				Log.w("appppppppppp",str.toString());
				if(str.length()>0)
				{
				try
				{
				
			Log.w("appppppppppp",str.toString());
			Double v=(double) (Double.parseDouble(str.toString()));
			if(v>0)
			{
				disp.setText("-"+(v).toString());	
			}
			else if(v<0)
			{
				disp.setText((v).toString().substring(1));	
			}
			Log.w("appppppppppp",v.toString());
			
				
				}
				catch(Exception e)
				{
					disp.setText("");
				}}

		
		str=str.append(one.getText());
			
			break;
			
			
			case R.id.root:

				str=disp.getText();
				Log.w("appppppppppp",str.toString());
				if(str.length()>0)
				{
				try
				{
				
			Log.w("appppppppppp",str.toString());
			Double v=(double) (Math.sqrt(Double.parseDouble(str.toString())));
			Log.w("appppppppppp",v.toString());
			
				disp.setText((v).toString());
				}
				catch(Exception e)
				{
					disp.setText("");
				}}

		
		str=str.append(one.getText());
			
		break;
			
		
			case R.id.inverse:

					str=disp.getText();
					Log.w("appppppppppp",str.toString());
					if(str.length()>0)
					{
					try
					{
					
				Log.w("appppppppppp",str.toString());
				Double v=(double) (1/(Double.parseDouble(str.toString())));
				Log.w("appppppppppp",v.toString());
				
					disp.setText((v).toString());
					}
					catch(Exception e)
					{
						disp.setText("");
					}}

			
			str=str.append(one.getText());
				
			break;
			case R.id.ce:
				if(op1==0)
				{
					disp.setText("");
					

				}else if(op2 == 0)
				{
			
					disp.setText("");
				}else
				{
					
				}
			break;
			case R.id.zero:
				if(op2 != 0){
					op2 = 0;
					
					
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(zero.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(zero.getText());
				}
			break;
			case R.id.two:
				if(op2 != 0){
					op2 = 0;
					
					
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(two.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(two.getText());
				}
			break;
			case R.id.three:
				if(op2 != 0){
					op2 = 0;
				
				}			

				if(k==1)
				{
					disp.setText("");
					disp.setText(three.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(three.getText());
				}
			
			break;
			case R.id.four:
				if(op2 != 0){
					op2 = 0;
		
				}
		
				if(k==1)
				{
					disp.setText("");
					disp.setText(four.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(four.getText());
				}
			
		
			break;
			case R.id.five:
				if(op2 != 0){
					op2 = 0;
			
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(five.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(five.getText());
				}
			break;
			case R.id.six:
				if(op2 != 0){
					op2 = 0;
					
				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(six.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(six.getText());
				}
			break;
			case R.id.seven:
				if(op2 != 0){
					op2 = 0;

				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(seven.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(seven.getText());
				}
			break;
			case R.id.eight:
				if(op2 != 0){
					op2 = 0;

				}
				if(k==1)
				{
					disp.setText("");
					disp.setText(eight.getText());
					str=disp.getText();
					k=0;
				}else
				{
			
			str=str.append(eight.getText());
				}
		
			break;
			case R.id.nine:
				if(op2 != 0){
					op2 = 0;

				}
				if(k==1)
				{
				
					disp.setText("");
					disp.setText(nine.getText());
					str=disp.getText();
					
					k=0;
				}else
				{
			
			str=str.append(nine.getText());
				}
		
			break;
			case R.id.C:
				op1 = 0;
				op2 = 0;
				disp.setText("");
				break;
			case R.id.Bk:
				Editable str1=disp.getText();
				String str3=str1.toString();
				if(str3.length()>0)
				{
				Log.w("appname",str3);
				Integer h=str3.length()-1;
				Log.w("appname",h.toString());
				
				
				disp.setText(str3.substring(0,str1.length()-1));
                    				
				
				}
		
			    break;
			case R.id.add:
				optr = "+";
				if(op1 == 0){
					try
					{
						op1 =Double.parseDouble(disp.getText().toString());
					
					}
					catch(Exception e)
					{
					op1=0;
					}
k=1;
		
				}
				else if(op2 != 0){
					op2 = 0;
                  k=1;

					
				}
				else{
					op2 = Double.parseDouble(disp.getText().toString());
		
					op1 = op1 + op2;
					disp.setText(""+ op1);
				}
			break;
			case R.id.sub:
				optr = "-";
				if(op1 == 0){
					try
					{
						op1 = Double.parseDouble(disp.getText().toString());
					
					}
					catch(Exception e)
					{
					op1=0;
					}
					k=1;
				}
				else if(op2 != 0){
					op2 = 0;
					k=1;
				}
				else{
					op2 =Double.parseDouble(disp.getText().toString());
			
					op1 = op1 - op2;
		
				}
			break;
			
			case R.id.mod:
				optr = "%";
				if(op1 == 0){
					try
					{
						op1 = Double.parseDouble(disp.getText().toString());
					
					}
					catch(Exception e)
					{
					op1=0;
					}
					k=1;
				}
				else if(op2 != 0){
					op2 = 0;
					k=1;
				}
				else{
					op2 = Double.parseDouble(disp.getText().toString());
			
					op1 = op1 % op2;
		
				}
			break;
			case R.id.mul:
				optr = "*";
				if(op1 == 0){
					try
					{
						op1 = Double.parseDouble(disp.getText().toString());
					
					}
					catch(Exception e)
					{
					op1=0;
					}
					k=1;
				}
				else if(op2 != 0){
					op2 = 0;
				k=1;	
				}
				else{
					op2 = Double.parseDouble(disp.getText().toString());
					
					op1 = op1 * op2;
					disp.setText(""+ (op1));
				}
			break;
			case R.id.div:
				optr = "/";
				if(op1 == 0){
				try
				{
					op1 = Double.parseDouble(disp.getText().toString());
				
				}
				catch(Exception e)
				{
				op1=0;
				}	k=1;
				}
				else if(op2 != 0){
				
					op2 = 0;
					k=1;
				}
				else{
					op2 = Double.parseDouble(disp.getText().toString());
			
					op1 = op1 / op2;
					disp.setText(""+ op1);
				}
			break;
			case R.id.equal:
				
				if(!optr.equals(null)){
					if(op2 != 0){
						Log.w("myapp",optr);
						if(optr.equals("+")){
							disp.setText(""+ op1);
						}
						else if(optr.equals("-")){
	
							disp.setText(""+ op1);
						}
						else if(optr.equals("*")){
					
							disp.setText(""+op1);
						}
						else if(optr.equals("/")){
				
							disp.setText(""+op1);
						}
						else if(optr.equals("%")){
							
							disp.setText(""+op1);
						}
					}
					else{
						operation();
					}
				}
			break;
		}
	}
} 

