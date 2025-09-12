package org.tvp.kirikiri2n;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

public class Kirikiroid2 extends KR2Activity {

	@Override
	public int get_res_sd_operate_step() { return R.drawable.sd_operate_step; }
	
	
	
	
	//------------------
	//FIXME:added
	
    private int stateStarted_ = 0;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int stateStarted = 0;
        if (savedInstanceState != null) {
            stateStarted = savedInstanceState.getInt(STATE_STARTED, 0);
            stateStarted_ = stateStarted;
        }

        if (stateStarted == 0) {
            checkPermission();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_STARTED, 1);
    }

    private static final String STATE_STARTED = "STATE_STARTED";
    //https://blog.csdn.net/zuo_er_lyf/article/details/82659426
    //https://www.dev2qa.com/android-read-write-external-storage-file-example/
    private final int REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION = 100;
    private void checkPermission() {
    	if (Build.VERSION.SDK_INT >= 23) { //for Android 6.0
	        // Check whether this app has write external storage permission or not.
	    	int writeExternalStoragePermission = this.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
	        // If do not grant write external storage permission.
	        if (writeExternalStoragePermission!= PackageManager.PERMISSION_GRANTED) {
	            // Request user to grant write external storage permission.
	            this.requestPermissions(new String[]{
	                    Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION);
	        } else {
	        }
    	} else {
    	}
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CODE_WRITE_EXTERNAL_STORAGE_PERMISSION) {
            int grantResultsLength = grantResults.length;
            if (grantResultsLength > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            	if (false) {
	            	Toast.makeText(getApplicationContext(), "You grant write external storage permission. Please restart to continue.", Toast.LENGTH_LONG).show();
	                finish();
            	} else {
	                //https://blog.csdn.net/Blue3Red1/article/details/108586320
	                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
	                alertDialog.setTitle("Tips");
	                alertDialog.setMessage("You grant write external storage permission. Please restart to continue.");
	                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        finish();
	                    }
	                });
	                alertDialog.setNegativeButton("Cancel", null);
	                alertDialog.show();
            	}
            } else {
            	if (false) {
            		Toast.makeText(getApplicationContext(), "You denied write external storage permission.", Toast.LENGTH_LONG).show();
            	} else {
	                //https://blog.csdn.net/Blue3Red1/article/details/108586320
	                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
	                alertDialog.setTitle("Tips");
	                alertDialog.setMessage("You denied write external storage permission. Please retry or reinstall it.");
	                alertDialog.setPositiveButton("OK", null);
	                alertDialog.setNegativeButton("Cancel", null);
	                alertDialog.show();            		
            	}
            }
        }
    }    
}
