package net.redlinesoft.app.ktouch;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class KtouchMobileActivity extends Activity {

	private MediaPlayer mMediaPlayer = null;
	
	private String finalfrom = "";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.number);
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		// play openning sound
		//playSound(R.raw.opening);
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		// play openning sound
		//playSound(R.raw.pull);
	}
	
	public void onClickOne(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numone);
		this.finalfrom=this.finalfrom.concat("x1");
	}
	
	public void onClickTwo(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numtwo);
		this.finalfrom=this.finalfrom.concat("x2");
	}
	
	public void onClickThree(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numthree);
		this.finalfrom=this.finalfrom.concat("x3");
	}	
	
	public void onClickFour(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numfour);
		this.finalfrom=this.finalfrom.concat("x4");
	}
	
	public void onClickFive(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numfive);
		this.finalfrom=this.finalfrom.concat("x5");
	}
	
	public void onClickSix(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numsix);
		this.finalfrom=this.finalfrom.concat("x6");
	}
	
	public void onClickSeven(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numseven);
		this.finalfrom=this.finalfrom.concat("x7");
	}
	
	public void onClickEight(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numeight);
		this.finalfrom=this.finalfrom.concat("x8");
	}
	
	public void onClickNine(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numnine);
		this.finalfrom=this.finalfrom.concat("x9");
	}
	
	public void onClickZero(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numzero);
		this.finalfrom=this.finalfrom.concat("x0");
	}
	
	public void onClickOk(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		
		if ((this.finalfrom.trim().compareTo("x2x0x0x0")) == 0) {
			playSound(R.raw.numkuga);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x1")) == 0) {
			playSound(R.raw.numakito);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x2")) == 0) {
			playSound(R.raw.numryuki);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x3")) == 0) {
			playSound(R.raw.numfize);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x4")) == 0) {
			playSound(R.raw.numblade);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x5")) == 0) {
			playSound(R.raw.numhibiki);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x6")) == 0) {
			playSound(R.raw.numkabuto);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x7")) == 0) {
			playSound(R.raw.numdeno);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x8")) == 0) {
			playSound(R.raw.numkiva);
			this.finalfrom = "";
		} else if ((this.finalfrom.trim().compareTo("x2x0x0x9")) == 0) {
			playSound(R.raw.numdecade);
			this.finalfrom = "";
		} else{
			playSound(R.raw.numcancel);
			this.finalfrom = "";
		}
		
	}
	
	public void onClickCancel(View v) {
		v.startAnimation(AnimationUtils.loadAnimation(getBaseContext(),
				R.anim.click));
		playSound(R.raw.numcancel);
		this.finalfrom="";
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