package net.redlinesoft.app.ktouch;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;

public class KtouchActivity extends Activity {

	public String finalfrom="" ;	
	private MediaPlayer mMediaPlayer = null;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//menu.add(R.string.menu_mobile);
		//menu.add(R.string.menu_donate);
		//menu.add(R.string.menu_about);
		//menu.add(R.string.menu_exit);
		menu.add(Menu.NONE,1,Menu.NONE,R.string.menu_mobile);
		//menu.add(Menu.NONE,2,Menu.NONE,R.string.menu_donate);
		menu.add(Menu.NONE,3,Menu.NONE,R.string.menu_about);
		menu.add(Menu.NONE,4,Menu.NONE,R.string.menu_exit);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		/*
		 * exit
		 */
		if(item.getItemId() == 4){
    		this.finish();
    		return true;
    	}
		
		/*
		 * load about activity
		 */
		if(item.getItemId() == 3){
			Intent intent = new Intent(KtouchActivity.this,KtouchAboutActivity.class);
            startActivity(intent);
    		return true;
    	}
		/*
		 * load number diskplay mode
		 */
		if(item.getItemId() == 1){
			Intent intent = new Intent(KtouchActivity.this,KtouchMobileActivity.class);
            startActivity(intent);
    		return true;
    	}
		
    	return false;
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		// play openning sound
		playSound(R.raw.opening);
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// play openning sound
		playSound(R.raw.pull);
	}
	
	/*
	 *	Kuga 
	 */
	public void onClickButton1(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.kuga);
		this.finalfrom=this.finalfrom.concat("x1");
	}

	/*
	 * Blade
	 */
	public void onClickButton2(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.blade);
		this.finalfrom=this.finalfrom.concat("x2");
	}
	
	/*
	 * Fiaz
	 */
	public void onClickButton3(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.five);
		this.finalfrom=this.finalfrom.concat("x3");
	}
	
	/*
	 * Akito
	 */
	public void onClickButton4(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.akito);
		this.finalfrom=this.finalfrom.concat("x4");
	}
	
	/*
	 * Kabuto
	 */
	public void onClickButton5(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.kabuto);
		this.finalfrom=this.finalfrom.concat("x5");

	}
	
	/*
	 * Hibiki
	 */
	public void onClickButton6(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.hibiki);
		this.finalfrom=this.finalfrom.concat("x6");
	}
	
	/*
	 * Ruki
	 */
	public void onClickButton7(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.ruki);
		this.finalfrom=this.finalfrom.concat("x7");
	}
	
	/*
	 * Kiva
	 */
	public void onClickButton8(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
			
		String bffcode = "x1x4x7x3x2x6x5x9x8";
		
		this.finalfrom=this.finalfrom.concat("x8");
		if (this.finalfrom.trim().equals(bffcode.trim()) ) {
			playSound(R.raw.ringing);
		} else {
			playSound(R.raw.kiva);
		}
	}
	
	/*
	 * Den-O
	 */
	public void onClickButton9(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.deno);
		this.finalfrom=this.finalfrom.concat("x9");
	}
	
	/*
	 * Decade
	 */
	public void onClickButton10(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.largeclick));
		
		this.finalfrom=this.finalfrom.concat("x10");		
		String ffcode = "x1x4x7x3x2x6x5x9x8x10";		

		//Toast.makeText(getApplicationContext(), this.finalfrom,Toast.LENGTH_LONG).show();
		
		if (this.finalfrom.trim().equals(ffcode.trim()) ) {
			playSound(R.raw.finalform);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x1x10")) == 0) {
			playSound(R.raw.fnxkuga);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x10")) == 0) {
			playSound(R.raw.fnxblade);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x3x10")) == 0) {
			playSound(R.raw.fnxfive);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x4x10")) == 0) {
			playSound(R.raw.fnxakito);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x5x10")) == 0) {
			playSound(R.raw.fnxkabuto);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x6x10")) == 0) {
			playSound(R.raw.fnxhibiki);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x7x10")) == 0) {
			playSound(R.raw.fnxruki);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x8x10")) == 0) {
			playSound(R.raw.fnxkiba);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x9x10")) == 0) {
			playSound(R.raw.fnxdeno);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x10x10")) == 0) {
			playSound(R.raw.fnxdecade);
		} else {
			playSound(R.raw.decade);			
		}
		
		
	}
	
	/*
	 * Finish
	 */
	public void onClickButtonFinal(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		
		if ((this.finalfrom.trim().compareTo("x1")) == 0) {
			this.finalfrom="x1xf";
			playSound(R.raw.ultimate);			
		} else if ((this.finalfrom.trim().compareTo("x4")) == 0) {
			this.finalfrom="x4xf";
			playSound(R.raw.shining);			
		} else if ((this.finalfrom.trim().compareTo("x7")) == 0) {
			playSound(R.raw.survivor);
			this.finalfrom="x7xf";
		} else if ((this.finalfrom.trim().compareTo("x3")) == 0) {
			playSound(R.raw.blaster);
			this.finalfrom="x3xf";
		} else if ((this.finalfrom.trim().compareTo("x2")) == 0) {
			playSound(R.raw.king);
			this.finalfrom="x2xf";
		} else if ((this.finalfrom.trim().compareTo("x6")) == 0) {
			playSound(R.raw.armed);
			this.finalfrom="x6xf";
		} else if ((this.finalfrom.trim().compareTo("x5")) == 0) {
			playSound(R.raw.hyper);
		} else if ((this.finalfrom.trim().compareTo("x9")) == 0) {
			playSound(R.raw.liner);
			this.finalfrom="x9xf";
		} else if ((this.finalfrom.trim().compareTo("x8")) == 0) {
			playSound(R.raw.emperor);
			this.finalfrom="x8xf";
		} else {
			playSound(R.raw.finish);			
		}
		this.finalfrom="";
	}
	
	/*
	 * Cancel
	 */
	public void onClickButtonCancel(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		// play sound click
		this.playSound(R.raw.touch);
		// clear code
		this.finalfrom = "";
	}

	/*
	 * Playsound
	 */
	public void playSound(int resources) {
		if (mMediaPlayer != null) {
			mMediaPlayer.stop();
			mMediaPlayer.release();
		}
		mMediaPlayer = MediaPlayer.create(this,resources);
		mMediaPlayer.start();       
    }

}
