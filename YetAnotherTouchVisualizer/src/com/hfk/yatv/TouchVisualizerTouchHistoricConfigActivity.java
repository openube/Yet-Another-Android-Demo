package com.hfk.yatv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class TouchVisualizerTouchHistoricConfigActivity extends Activity {
	
	public static final String HANDLE_HISTORICEVENT = "HANDLE_HISTORICEVENT";

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.history_config_dialog);

		m_chkHandleHistoricEvents = (CheckBox)findViewById(R.id.checkBoxHandleHistoricEvents);
		
        Bundle data = getIntent().getExtras();
        if(data != null){
        	if(data.containsKey(TouchVisualizerTouchHistoricConfigActivity.HANDLE_HISTORICEVENT)) {
        		m_chkHandleHistoricEvents.setChecked(data.getBoolean(TouchVisualizerTouchHistoricConfigActivity.HANDLE_HISTORICEVENT));
        	}
        }
		
	}

	@Override
	public void onBackPressed() {
	    Intent result = new Intent();

	    Bundle b = new Bundle();
	    b.putBoolean(TouchVisualizerTouchHistoricConfigActivity.HANDLE_HISTORICEVENT, m_chkHandleHistoricEvents.isChecked());

	    result.putExtras(b);

	    setResult(Activity.RESULT_OK, result);
	    
	    super.onBackPressed();
	}

	private CheckBox m_chkHandleHistoricEvents;

}
