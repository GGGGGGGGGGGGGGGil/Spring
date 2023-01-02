package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("lgtv")
public class LGTV implements TV {
	
	@Autowired
	private Speaker spk;
	
	@Override
	public void powerOn() {
		System.out.println("LGTV powerOn...");
	}
	@Override
	public void powerOff() {
		System.out.println("LGTV powerOff...");
	}
	@Override
	public void ChUp() {
		System.out.println("LGTV ChUp...");
	}
	@Override
	public void ChDown() {
		System.out.println("LGTV ChDown...");
	}
	@Override
	public void SoundUp() {
		spk.soundUp();
	}
	@Override
	public void SoundDown() {
		spk.soundDown();
	}
}
