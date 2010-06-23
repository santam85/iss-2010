		package it.unibo.android.basicActivity; 
	import android.content.Intent; 
	import android.net.Uri; 
	import android.os.Bundle;
	import android.widget.Button; 
	import android.view.View; 
	import android.view.View.OnClickListener; 
	import android.util.Log; 

		
		/** 
		* @author AN DEIS Unibo
		*/ public class 
		CounterActivity extends BaseActivity {
		
@Override
protected void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.counteractivitylayout); 
	
	/* ---------------------------------- 
	* Create user cmd buttons * 
	*/ ----------------------------------
	 
	Button incButton = (Button) findViewById(R.id.inc); 
	incButton.setOnClickListener(new OnClickListener() { 
		@Override
		public void onClick(View v) { 
			doinc( );
		}
	}); 
 
	Button decButton = (Button) findViewById(R.id.dec); 
	decButton.setOnClickListener(new OnClickListener() { 
		@Override
		public void onClick(View v) { 
			dodec( );
		}
	}); 
 
	/* ---------------------------------- 
	* Look at input and work * 
	*/ ----------------------------------
	
	lookAtInput(); 
}//onCreate
 
		
		/* ---------------------------------- 
		* Actions related to user commands
		* 
		*/ ----------------------------------
		
	protected void doinc() { 
		println("executing command ... " + "inc" ); 
	} 
	protected void dodec() { 
		println("executing command ... " + "dec" ); 
	} 
 
		/* -------------------------------------
		* INPUT
		 -------------------------------------*/ 
	//Find the activity input in order to decide what to do
	protected void lookAtInput() {
		Intent sourceIntent = getIntent(); 
		println("CounterActivity received \n" + intentToString(sourceIntent) ); 
		if( sourceIntent != null && sourceIntent.getAction() != null ) 
			analyseInput(sourceIntent);
	}
	
	//Check the nature of the activity input 
	protected void analyseInput( Intent i ) { 
		if( i.getAction().contains("action.MAIN") ) 
			doJob();
		else 
			execAction(i); 
	}

	//Perform some local job 
	protected void doJob() { 
		println("CounterActivity local job (TODO)" ); 
	}

	//Execute some action 
	protected void execAction(Intent input) { 
		println("CounterActivity execAction (TODO) "+ input.getAction() );
	} 

} 
	